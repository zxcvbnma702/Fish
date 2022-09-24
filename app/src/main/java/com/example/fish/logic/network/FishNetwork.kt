package com.example.fish.logic.network

import android.util.Log
import com.example.fish.logic.network.api.GoodsService
import com.example.fish.logic.network.api.UserService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.Query
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

    //获取商品类型
    suspend fun getGoodTypes() = goodsServer.getGoodTypes().await()
    //获取各类型商品
    suspend fun getTypeGoods(userId: Int, typeId: Int, size: Int) = goodsServer.getTypeGoods(userId, typeId, size).await()
    //暂存商品信息
    suspend fun saveGoodInformation(requestBody: Map<String, String>) = goodsServer.saveGoodInformation(requestBody).await()
    //发布商品信息
    suspend fun postGoodInformation(requestBody: Map<String, String>) = goodsServer.postGoodInformation(requestBody).await()
    //更新商品信息
    suspend fun changeGoodInformation(requestBody: Map<String, String>) = goodsServer.changeGoodInformation(requestBody).await()
    //发布草稿
    suspend fun postSaveGoodInformation(requestBody: Map<String, String>) = goodsServer.postSaveGoodInformation(requestBody).await()
    //删除商品信息
    suspend fun deleteGoodInformation(goodsId: Int, userId: Int) = goodsServer.deleteGoodInformation(goodsId, userId).await()
    //获取草稿信息
    suspend fun getSaveGoodInformation(userId: Int) = goodsServer.getSaveGoodInformation(userId).await()


    private suspend fun <T> Call<T>.await(): T{
        return suspendCoroutine { continuation ->
            enqueue(object : Callback<T>{
                override fun onResponse(call: Call<T>, response: Response<T>) {
                    val body = response.body()
//                    ToDo: delete this
                    Log.e("data", response.toString())

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