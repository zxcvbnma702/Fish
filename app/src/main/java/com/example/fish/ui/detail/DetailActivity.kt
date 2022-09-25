package com.example.fish.ui.detail

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.base.ui.util.TabLayoutMediator2
import com.example.base.ui.util.UIUtils
import com.example.fish.R
import com.example.fish.databinding.ActivityDetailBinding
import com.example.fish.logic.db.entity.Item
import com.example.fish.logic.network.model.DetailsData
import com.example.fish.ui.detail.adapter.DetailAdapter
import com.google.android.material.tabs.TabLayout

class DetailActivity : AppCompatActivity(), DetailsListener {

    private lateinit var binding: ActivityDetailBinding
    private val viewModel by lazy {
        ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(DetailViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
        binding.viewModel = viewModel

        viewModel.detailsListener = this

        val id = intent.getStringExtra("id")
        if (id == null) viewModel.goodsId = "0" else viewModel.goodsId = id

        initView()
        setContentView(binding.root)
    }

    private fun initView() {

        binding.itemList.adapter = DetailAdapter(this@DetailActivity).also {
            it.items = getItemList()
        }

        binding.itemList.addOnScrollListener(object : RecyclerView.OnScrollListener() {
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

        val tabList = viewModel.tabList
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