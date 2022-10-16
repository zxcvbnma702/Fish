package com.example.fish.ui.detail

import android.content.Context
import android.content.Intent
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.base.ui.activity.BaseActivity
import com.example.base.ui.kxt.toast
import com.example.base.ui.util.TabLayoutMediator2
import com.example.base.ui.util.UIUtils
import com.example.fish.R
import com.example.fish.databinding.ActivityDetailBinding
import com.example.fish.logic.network.model.DetailsData
import com.example.fish.ui.detail.adapter.DetailAdapter
import com.google.android.material.tabs.TabLayout

class DetailActivity : BaseActivity<ActivityDetailBinding>(), DetailsListener {

    private val mViewModel by lazy {
        ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(DetailViewModel::class.java)
    }

    private val adapter by lazy {
        DetailAdapter(this@DetailActivity)
    }

    override fun ActivityDetailBinding.initBindingView() {
        viewModel = mViewModel
        mViewModel.detailsListener = this@DetailActivity

        val id = intent.getStringExtra("id")
        if (id == null) mViewModel.goodsId = "0" else mViewModel.goodsId = id

        mViewModel.getDetails()

        itemList.adapter = adapter.also {
            it.setData(mViewModel.getItemList(mViewModel.data))
        }

        detailBuy.setOnClickListener {
            toast(R.string.detail_buy_text)
        }

        detailSame.setOnClickListener {
            toast(R.string.detail_same_text)
        }

        itemList.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            var totalDy = 0
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                totalDy += dy
                val firstCompleteVisiblePosition =
                    (recyclerView.layoutManager as? LinearLayoutManager)?.findFirstCompletelyVisibleItemPosition()
                if (firstCompleteVisiblePosition == 0) {
                    totalDy = 0
                }
                binding.tabLayout.alpha = totalDy / 800f
            }
        })

        val tabList = mViewModel.tabList
        TabLayoutMediator2(
            tabLayout = binding.tabLayout,
            recyclerView = binding.itemList,
            tabCount = tabList.size,
            offset = UIUtils.dpToPx(40f),
            tabConfigurationStrategy = object : TabLayoutMediator2.TabConfigurationStrategy {
                override fun onConfigureTab(tab: TabLayout.Tab, position: Int): IntArray {
                    tabList[position].apply {
                        tab.text = title
                        return intArrayOf(startViewType, endViewType)
                    }
                }
            }
        ).attach()
    }

    override fun onResponse(response: LiveData<Result<DetailsData>>) {
        response.observe(this) { result ->
            val data = result.getOrNull()
            mViewModel.data = data
            adapter.also {
                it.setData(mViewModel.getItemList(mViewModel.data))
            }
        }
    }

    companion object {
        fun startActivity(context: Context, id: String) {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("id", id)
            context.startActivity(intent)
        }
    }
}