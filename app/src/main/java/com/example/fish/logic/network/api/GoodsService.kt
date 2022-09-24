package com.example.fish.logic.network.api

import com.example.fish.FishApplication
import com.example.fish.logic.network.model.*
import retrofit2.Call
import retrofit2.http.*
import java.io.File
import java.util.ArrayList

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
    fun getTypeGoods(@Query("userId")userId: Int, @Query("typeId")typeId: Int, @Query("size")size: Int): Call<GoodAllResponse>

    @Headers("appId: ${FishApplication.appId}", "appSecret: ${FishApplication.appSecret}")
    @GET("goods/all")
    fun getSearchGoods(@Query("userId")userId: Int, @Query("keyword")keyword: String, @Query("size")size: Int): Call<GoodAllResponse>

    @Headers("appId: ${FishApplication.appId}", "appSecret: ${FishApplication.appSecret}")
    @POST("goods/save")
    fun saveGoodInformation(@Body requestBody: Map<String, String>): Call<SaveResponse>

    @Headers("appId: ${FishApplication.appId}", "appSecret: ${FishApplication.appSecret}")
    @POST("goods/add")
    fun postGoodInformation(@Body requestBody: Map<String, String>): Call<AddResponse>

    @Headers("appId: ${FishApplication.appId}", "appSecret: ${FishApplication.appSecret}")
    @POST("goods/change")
    fun changeGoodInformation(@Body requestBody: Map<String, String>): Call<SaveResponse>

    @Headers("appId: ${FishApplication.appId}", "appSecret: ${FishApplication.appSecret}")
    @POST("goods/change")
    fun postSaveGoodInformation(@Body requestBody: Map<String, String>): Call<SaveResponse>

    @Headers("appId: ${FishApplication.appId}", "appSecret: ${FishApplication.appSecret}")
    @POST("goods/delete")
    fun deleteGoodInformation(@Query("goodsId")goodsId: Int, @Query("userId")userId: Int): Call<SaveResponse>

    @Multipart
    @Headers("appId: ${FishApplication.appId}", "appSecret: ${FishApplication.appSecret}")
    @POST("goods/upload")
    fun uploadFile(@Part list: ArrayList<File>): Call<UploadResponse>

    @Headers("appId: ${FishApplication.appId}", "appSecret: ${FishApplication.appSecret}")
    @GET("goods/save")
    fun getSaveGoodInformation(@Query("userId")userId: Int): Call<SaveListResponse>


}