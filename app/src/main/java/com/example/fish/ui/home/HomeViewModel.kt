package com.example.fish.ui.home

import androidx.lifecycle.ViewModel
import com.example.fish.FishApplication
import com.example.fish.logic.Repository
import com.example.fish.logic.network.model.Record

/**
 * @author:SunShibo
 * @date:2022-09-07 21:21
 * @feature:
 */
class HomeViewModel: ViewModel() {

    val id = FishApplication.sp.getString(FishApplication.userID, "0")
    val record: Record?= null
    var goodList :MutableList<Record> = mutableListOf(
            Record("1", "1","1","测试用例", 1, 1, 22, null, 11, 11, 11, 11, 11,"ss", "aa"),
            Record("1", "1","1","测试用例", 1, 2, 22, null, 22, 11, 11, 11, 11,"ss", "aa"),
            Record("1", "1","1","测试用例", 1, 3, 22, null, 33, 11, 11, 11, 11,"ss", "aa"),
            Record("1", "1","1","测试用例", 1, 4, 22, null, 44, 11, 11, 11, 11,"ss", "aa")
        )

    var typeId = 0

    private val recyclerSize = 20

    internal var homeListener: HomeListener ?= null

    fun getGoodTypes(){
        val types = Repository.getGoodTypes()
        homeListener?.onGoodTypes(types)
    }

    fun getTypeGoods(){
        val data = Repository.getTypeGoods(id!!.toLong(), typeId, recyclerSize)
        homeListener?.onTypeGoods(data)
    }


}