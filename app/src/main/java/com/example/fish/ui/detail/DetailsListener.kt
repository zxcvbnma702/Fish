package com.example.fish.ui.detail

import androidx.lifecycle.LiveData
import com.example.fish.logic.network.model.DetailsData

/**
 * @author:SunShibo
 * @date:2022-09-25 11:26
 * @feature:
 */
interface DetailsListener {
    fun onResponse(response: LiveData<Result<DetailsData>>)
}