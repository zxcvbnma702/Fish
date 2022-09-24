package com.example.fish.ui.home

import android.annotation.SuppressLint
import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.base.ui.util.toast
import com.example.fish.FishApplication
import com.example.fish.R
import com.example.fish.databinding.FragmentHomeBinding
import com.example.fish.logic.network.model.AllData
import com.example.fish.logic.network.model.Record
import com.example.fish.logic.network.model.TypeData
import com.example.fish.ui.home.adapter.HomeRecyclerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.coroutines.*
import kotlin.concurrent.thread

class HomeFragment : Fragment(), HomeListener, SwipeRefreshLayout.OnRefreshListener{

    private lateinit var binding: FragmentHomeBinding
    private lateinit var myAdapter: HomeRecyclerAdapter
    private val viewModel: HomeViewModel by lazy{
        ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(HomeViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        binding.viewModel = viewModel
        viewModel.homeListener = this

        initView()
        return binding.root
    }

    private fun initView() {
        viewModel.getGoodTypes()

        myAdapter = HomeRecyclerAdapter(this, viewModel.goodList)

        binding.homeRecyclerView.apply{
            layoutManager = LinearLayoutManager(context)
            adapter = myAdapter
        }

        binding.homeTablayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewModel.typeId = (tab!!.tag as Int?)!!
                viewModel.getTypeGoods()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })

        binding.homeSwipe.apply{
            setColorSchemeColors(resources.getColor(R.color.main_color),
                resources.getColor(R.color.purple_200),
                resources.getColor(R.color.teal_200))
            setOnRefreshListener (this@HomeFragment)
        }
    }

    /**
     * Initialize tab data
     */
    override fun onGoodTypes(types: LiveData<Result<List<TypeData>>>) {
        types.observe(this){result ->
            val res = result.getOrNull()
            for(type in res!!){
                val tab = binding.homeTablayout.newTab()
                tab.text = type.type
                tab.tag = type.id
                binding.homeTablayout.addTab(tab)
            }
        }
    }

    /**
     * Update recyclerView data
     * */
    override fun onTypeGoods(data: LiveData<Result<AllData>>) {
       data.observe(this@HomeFragment){result ->
            val goodResponse = result.getOrNull()
            if (goodResponse != null && goodResponse.total != 0) {
                myAdapter.exchangeData(goodResponse.records as MutableList<Record>)
                refreshData()
            }else{
                myAdapter.exchangeData(viewModel.goodList)
                refreshData()
            }
        }
    }

    /**
     * Refresh recyclerView data
      */
    @SuppressLint("NotifyDataSetChanged")
    private fun refreshData(){
        binding.homeRecyclerView.adapter?.notifyDataSetChanged()
    }

    internal fun jumpTo(item: Record) {
        FishApplication.context.toast(item.content)
    }

    /**
     * Refresh data using coroutines
     * Updating the UI in a coroutine on the main thread
     */
    override fun onRefresh() {
        viewModel.getTypeGoods()
        val job = Job()
        CoroutineScope(job).launch {
            withContext(Dispatchers.Main){
                delay(3000)
                binding.homeSwipe.isRefreshing = false
            }
        }
    }
}