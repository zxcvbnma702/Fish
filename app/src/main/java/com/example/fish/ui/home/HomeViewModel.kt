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

    val userId = FishApplication.sp.getString(FishApplication.userID, "0")
    val record: Record?= null
    var goodList :MutableList<Record> = mutableListOf(
            Record(
                "1",
                0,
                "1",
                "https://static.leetcode.cn/cn-mono-assets/production/assets/logo-dark-cn.c42314a8.svg",
                "这个分类没有商品,看看其他分类吧!",
                "1663588311823",
                "35",
                "22",
                listOf("https://static.leetcode.cn/cn-mono-assets/production/assets/logo-dark-cn.c42314a8.svg"),
                11.toString(),
                11,
                "11",
                "11",
                11,
                "ss",
                "aa"
            ),
        Record(
            "1",
            0,
            "1",
            "https://static.leetcode.cn/cn-mono-assets/production/assets/logo-dark-cn.c42314a8.svg",
            "这个分类没有商品,看看其他分类吧!",
            "1663588311823",
            "35",
            "22",
            listOf("https://static.leetcode.cn/cn-mono-assets/production/assets/logo-dark-cn.c42314a8.svg"),
            11.toString(),
            11,
            "11",
            "11",
            11,
            "ss",
            "aa"
        ),
        Record(
            "1",
            0,
            "1",
            "https://static.leetcode.cn/cn-mono-assets/production/assets/logo-dark-cn.c42314a8.svg",
            "这个分类没有商品,看看其他分类吧!",
            "1663588311823",
            "35",
            "22",
            listOf("https://static.leetcode.cn/cn-mono-assets/production/assets/logo-dark-cn.c42314a8.svg"),
            11.toString(),
            11,
            "11",
            "11",
            11,
            "ss",
            "aa"
        )
    )

    var typeId = 1

    var searchText: String = ""

    private val recyclerSize = 20

    internal var homeListener: HomeListener? = null

    fun getGoodTypes() {
        val types = Repository.getGoodTypes()
        homeListener?.onGoodTypes(types)
    }

    fun getTypeGoods() {
        val data = Repository.getTypeGoods(userId!!.toInt(), typeId, recyclerSize)
        homeListener?.onTypeGoods(data)
    }

    fun getSearchGoods() {
        val data = searchText?.let { Repository.getSearchGoods(userId!!.toInt(), it, recyclerSize) }
        homeListener?.onSearchGoods(data)
    }

}