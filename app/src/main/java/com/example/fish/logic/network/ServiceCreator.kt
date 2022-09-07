package com.example.fish.logic.network

import com.example.fish.FishApplication
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author:SunShibo
 * @date:2022-09-04 23:54
 * @feature:
 */
object ServiceCreator {
    private const val BASE_URL = "http://47.107.52.7:88/member/tran/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> create(serviceClass: Class<T>): T =
        retrofit.create(serviceClass)

    inline fun <reified T> create(): T = create(T::class.java)
}