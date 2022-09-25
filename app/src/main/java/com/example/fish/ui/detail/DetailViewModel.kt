package com.example.fish.ui.detail

import androidx.lifecycle.ViewModel
import com.example.fish.logic.Repository
import com.example.fish.logic.db.entity.TabData
import com.example.fish.ui.detail.adapter.DetailAdapter

/**
 * @author:SunShibo
 * @date:2022-09-25 10:04
 * @feature:
 */
class DetailViewModel : ViewModel() {

    internal var goodsId: String? = null

    internal var detailsListener: DetailsListener? = null

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
}