package com.example.fish.logic.network.api

import com.example.fish.FishApplication
import com.example.fish.logic.network.model.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

/**
 * @author:SunShibo
 * @date:2022-09-10 18:20
 * @feature:
 */
interface GoodsService {

    @Headers("appId: ${FishApplication.appId}", "appSecret: ${FishApplication.appSecret}")
    @GET("goods/type")
    fun getGoodTypes(): Call<GoodTypeResponse>

    @Headers("appId: ${FishApplication.appId}", "appSecret: ${FishApplication.appSecret}")
    @GET("goods/all")
    fun getTypeGoods(@Query("userId")userId: Long, @Query("typeId")typeID: Int, @Query("size")size: Int): Call<GoodAllResponse>

    @Headers("appId: ${FishApplication.appId}", "appSecret: ${FishApplication.appSecret}")
    @GET("goods/all")
    fun getSearchGoods(@Query("userId")userId: Long, @Query("keyword")keyword: String, @Query("size")size: Int): Call<GoodAllResponse>
}