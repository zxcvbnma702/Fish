package com.example.fish.ui.home

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.util.Log
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.base.ui.activity.BaseFragment
import com.example.fish.R
import com.example.fish.databinding.FragmentHomeBinding
import com.example.fish.logic.network.model.AllData
import com.example.fish.logic.network.model.Record
import com.example.fish.logic.network.model.TypeData
import com.example.fish.ui.detail.DetailActivity
import com.example.fish.ui.home.adapter.HomeRecyclerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.coroutines.*

class HomeFragment : BaseFragment<FragmentHomeBinding>(), HomeListener,
    SwipeRefreshLayout.OnRefreshListener {

    private lateinit var myAdapter: HomeRecyclerAdapter
    private lateinit var myAdapter2: HomeRecyclerAdapter
    private val mViewModel: HomeViewModel by lazy {
        ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(HomeViewModel::class.java)
    }

    override fun FragmentHomeBinding.initBindingView() {
        binding.viewModel = mViewModel
        mViewModel.homeListener = this@HomeFragment

        mViewModel.getGoodTypes()

        myAdapter = HomeRecyclerAdapter(this@HomeFragment)
        myAdapter2 = HomeRecyclerAdapter(this@HomeFragment)

        homeRecyclerView.adapter = myAdapter

        homeTablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                mViewModel.typeId = (tab!!.tag as Int?)!!
                mViewModel.getTypeGoods()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })

        homeSwipe.apply {
            setColorSchemeColors(
                resources.getColor(R.color.main_color),
                resources.getColor(R.color.purple_200),
                resources.getColor(R.color.teal_200)
            )
            setOnRefreshListener(this@HomeFragment)
        }

        homeSearchView.apply {
            setOnSearchClickListener {
                hideSearchView(true)
            }
            setOnCloseListener {
                mViewModel.getTypeGoods()
                hideSearchView(false)
                false
            }
        }

        homeSearchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean = true

            override fun onQueryTextChange(newText: String?): Boolean {
                var queryText = ""

                if (newText != null) {
                    queryText += newText
                    mViewModel.apply {
                        searchText = queryText
                        getSearchGoods()
                    }
                }
                Log.e("search", mViewModel.searchText)
                return false
            }
        })
    }

    /**
     * Initialize tab data
     */
    override fun onGoodTypes(types: LiveData<Result<List<TypeData>>>) {
        types.observe(this){result ->
            val res = result.getOrNull()
            if (res != null) {
                for (type in res) {
                    val tab = binding.homeTablayout.newTab()
                    tab.apply {
                        text = type.type
                        tag = type.id
                    }
                    binding.homeTablayout.addTab(tab)
                }
            }
        }
    }

    /**
     * Update recyclerView data
     * */
    @SuppressLint("NotifyDataSetChanged")
    override fun onTypeGoods(data: LiveData<Result<AllData>>) {
        data.observe(this@HomeFragment) { result ->
            val goodResponse = result.getOrNull()
            if (goodResponse != null && goodResponse.total != 0) {
                myAdapter.setData(goodResponse.records)
            } else {
                myAdapter.setData(mViewModel.goodList)
                binding.homeRecyclerView.adapter?.notifyDataSetChanged()
            }
        }
    }

    override fun onSearchGoods(data: LiveData<Result<AllData>>?) {
        data?.observe(this@HomeFragment) { result ->
            val searchResponse = result.getOrNull()
            if (searchResponse != null) {
                myAdapter2.setData(searchResponse.records)
            }
        }
    }

    internal fun jumpTo(item: Record) {
        DetailActivity.startActivity(requireContext(), item.id)
    }

    /**
     * Refresh data using coroutines
     * Updating the UI in a coroutine on the main thread
     */
    override fun onRefresh() {
        mViewModel.getTypeGoods()
        val job = Job()
        CoroutineScope(job).launch {
            withContext(Dispatchers.Main) {
                delay(3000)
                binding.homeSwipe.isRefreshing = false
            }
        }
    }

    /**
     * Control view`s visibility
     */
    private fun hideSearchView(isHide: Boolean) {
        if (isHide) {
            binding.apply {
                val animRecycler =
                    ObjectAnimator.ofFloat(homeRecyclerView, "translationY", 0f, -700f)
                val animTabLayout = ObjectAnimator.ofFloat(homeCardView, "alpha", 1.0f, 0f)
                val animCardView = ObjectAnimator.ofFloat(homeTablayout, "alpha", 1.0f, 0f)

                val animSet = AnimatorSet()
                animSet.apply {
                    playTogether(animRecycler, animCardView, animTabLayout)
                    duration = 500
                    homeRecyclerView.adapter = myAdapter2
                    start()
                }

            }
        } else {
            binding.apply {
                val animRecycler = ObjectAnimator.ofFloat(homeRecyclerView, "translationY", 0f)
                val animTabLayout = ObjectAnimator.ofFloat(homeCardView, "alpha", 0f, 1f)
                val animCardView = ObjectAnimator.ofFloat(homeTablayout, "alpha", 0f, 1f)

                val animSet = AnimatorSet()
                animSet.apply {
                    playTogether(animRecycler, animCardView, animTabLayout)
                    duration = 500
                    homeRecyclerView.adapter = myAdapter
                    start()
                }
            }
        }
    }
}