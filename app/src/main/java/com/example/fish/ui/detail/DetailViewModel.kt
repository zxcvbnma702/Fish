package com.example.fish.ui.detail

import androidx.lifecycle.ViewModel
import com.example.fish.logic.Repository

/**
 * @author:SunShibo
 * @date:2022-09-25 10:04
 * @feature:
 */
class DetailViewModel : ViewModel() {

    internal var goodsId: String? = null

    internal var detailsListener: DetailsListener? = null

    /**
     * Get details for good
     */
    fun getDetails() {
        val response = Repository.getDetails(goodsId!!.toInt())
        detailsListener!!.onResponse(response)
    }
}