package com.example.fish.ui.detail

import android.graphics.Color
import androidx.lifecycle.ViewModel
import com.example.fish.logic.Repository
import com.example.fish.logic.db.entity.Item
import com.example.fish.logic.db.entity.TabData
import com.example.fish.logic.network.model.DetailsData
import com.example.fish.ui.detail.adapter.DetailAdapter

/**
 * @author:SunShibo
 * @date:2022-09-25 10:04
 * @feature:
 */
class DetailViewModel : ViewModel() {

    internal var goodsId: String? = null

    internal var detailsListener: DetailsListener? = null

    internal var data: DetailsData? = null

    internal val tabList = listOf<TabData>(
        TabData("Gallery", DetailAdapter.GALLERY, DetailAdapter.CONTENT),
        TabData("REVIEWS", DetailAdapter.USER, DetailAdapter.COMMENT),
        TabData("Recommend", DetailAdapter.RECOMMEND, DetailAdapter.OTHER)
    )

    /**
     * Get details for good
     */
    fun getDetails() {
        val response = Repository.getDetails(goodsId!!.toInt())
        detailsListener!!.onResponse(response)
    }

    internal fun getItemList(data: DetailsData?): List<Item> = mutableListOf(
        Item(DetailAdapter.GALLERY),
        Item(DetailAdapter.TITLE, Color.BLUE, "title", 100f, data),
        Item(DetailAdapter.CONTENT, Color.YELLOW, "content", 200f, data),
        Item(DetailAdapter.USER, Color.WHITE, "user", 100f, data),
        Item(DetailAdapter.COMMENT, Color.GREEN, "comment", 200f, data),
        Item(DetailAdapter.RECOMMEND, Color.LTGRAY, "recommend", 100f, data)
    ).apply {
        repeat(20) {
            add(Item(DetailAdapter.OTHER, Color.BLUE, "OTHER", 100f, data))
        }
    }
}