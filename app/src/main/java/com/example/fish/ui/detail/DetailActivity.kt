package com.example.fish.ui.detail

import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.base.ui.activity.BaseActivity
import com.example.base.ui.util.TabLayoutMediator2
import com.example.base.ui.util.UIUtils
import com.example.fish.databinding.ActivityDetailBinding
import com.example.fish.logic.db.entity.Item
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

    override fun ActivityDetailBinding.initBindingView() {
        viewModel = mViewModel
        mViewModel.detailsListener = this@DetailActivity

        val id = intent.getStringExtra("id")
        if (id == null) mViewModel.goodsId = "0" else mViewModel.goodsId = id

        itemList.adapter = DetailAdapter(this@DetailActivity).also {
            it.items = getItemList()
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

    }

    private fun getItemList(): List<Item> = mutableListOf(
        Item(DetailAdapter.GALLERY),
        Item(DetailAdapter.TITLE, Color.BLUE, "title", 100f),
        Item(DetailAdapter.CONTENT, Color.YELLOW, "content", 200f),
        Item(DetailAdapter.USER, Color.WHITE, "user", 100f),
        Item(DetailAdapter.COMMENT, Color.GREEN, "comment", 200f),
        Item(DetailAdapter.RECOMMEND, Color.LTGRAY, "recommend", 100f),
        Item(DetailAdapter.OTHER, Color.BLUE, "other", 100f),
    ).apply {
        repeat(20) {
            add(Item(DetailAdapter.OTHER, Color.BLUE, "OTHER", 40f))
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