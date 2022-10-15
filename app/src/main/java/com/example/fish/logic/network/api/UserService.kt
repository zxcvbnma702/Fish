package com.example.fish.logic.network.api

import com.example.fish.FishApplication
import com.example.fish.logic.network.model.UserResponse
import com.example.fish.logic.network.model.VerifyResponse
import retrofit2.Call
import retrofit2.http.*

/**
 * @author:SunShibo
 * @date:2022-09-05 0:43
 * @feature:
 */
interface UserService {

    @Headers("appId: ${FishApplication.appId}", "appSecret: ${FishApplication.appSecret}")
    @GET("user/send")
    fun verify(@Query("phone") phone: String): Call<VerifyResponse>

    @Headers("appId: ${FishApplication.appId}", "appSecret: ${FishApplication.appSecret}")
    @POST("user/login")
    fun loginAccount(@Body requestBody: Map<String, String>): Call<UserResponse>

    @Headers("appId: ${FishApplication.appId}", "appSecret: ${FishApplication.appSecret}")
    @POST("user/register")
    fun registerAccount(@Body requestBody: Map<String, String>): Call<VerifyResponse>

    @Headers("appId: ${FishApplication.appId}", "appSecret: ${FishApplication.appSecret}")
    @POST("user/update")
    fun uploadAvatar(@Body requestBody: Map<String, String>): Call<VerifyResponse>
}