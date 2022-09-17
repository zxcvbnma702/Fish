package com.example.fish.logic.network

import com.example.fish.logic.network.api.GoodsService
import com.example.fish.logic.network.api.UserService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

/**
 * @author:SunShibo
 * @date:2022-09-05 1:11
 * @feature: 统一封装接口
 */
object FishNetwork {
    private val userServer = ServiceCreator.create<UserService>()
    private val goodsServer = ServiceCreator.create<GoodsService>()

    /**
     * login
     */
    suspend fun verify(phoneNumber: String) = userServer.verify(phoneNumber).await()

    suspend fun login(requestBody: Map<String, String>) = userServer.loginAccount(requestBody).await()

    suspend fun register(requestBody: Map<String, String>) = userServer.registerAccount(requestBody).await()

    /**
     * goods
     */

    suspend fun getGoodTypes() = goodsServer.getGoodTypes().await()

//    suspend fun getTypeGoods(userId: String, )

//    suspend fun getTypeGoods() = goodsServer.getTypeGoods().await()

    private suspend fun <T> Call<T>.await(): T{
        return suspendCoroutine { continuation ->
            enqueue(object : Callback<T>{
                override fun onResponse(call: Call<T>, response: Response<T>) {
                    val body = response.body()
                    if(body != null) continuation.resume(body)
                    else continuation.resumeWithException(
                        RuntimeException("response body is null")
                    )
                }
                override fun onFailure(call: Call<T>, t: Throwable) {
                    continuation.resumeWithException(t)
                }
            })
        }
    }
}