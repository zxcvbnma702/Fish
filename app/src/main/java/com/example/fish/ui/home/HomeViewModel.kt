package com.example.fish.ui.home

import androidx.lifecycle.ViewModel
import com.example.fish.logic.Repository
import com.example.fish.logic.network.model.Record

/**
 * @author:SunShibo
 * @date:2022-09-07 21:21
 * @feature:
 */
class HomeViewModel: ViewModel() {

    val record: Record?= null
    val goodList = ArrayList<Record>()

    internal var homeListener: HomeListener ?= null

    fun getGoodTypes(){
        val types = Repository.getGoodTypes()
        homeListener?.onGoodTypes(types)
    }
}