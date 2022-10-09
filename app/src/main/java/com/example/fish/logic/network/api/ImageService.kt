package com.example.fish.logic.network.api

import com.example.fish.FishApplication
import com.example.fish.logic.network.model.UploadResponse
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.Headers
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

/**
 * @author:SunShibo
 * @date:2022-10-08 18:21
 * @feature:
 */
interface ImageService {

    @Multipart
    @Headers("appId: ${FishApplication.appId}", "appSecret: ${FishApplication.appSecret}")
    @POST("image/upload")
    fun uploadMoreFiles(@Part() requestBody: List<MultipartBody.Part>): Call<UploadResponse>
}