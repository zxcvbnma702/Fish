package com.example.fish.logic.network.api;

import java.lang.System;

/**
 * @author:SunShibo
 * @date:2022-10-08 18:21
 * @feature:
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/fish/logic/network/api/ImageService;", "", "uploadMoreFiles", "Lretrofit2/Call;", "Lcom/example/fish/logic/network/model/UploadResponse;", "requestBody", "", "Lokhttp3/MultipartBody$Part;", "app_debug"})
public abstract interface ImageService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "image/upload")
    @retrofit2.http.Headers(value = {"appId: 00871f090e174fb7bf20fb1a6a7f71e2", "appSecret: 863547048aa7289c0425787b4e8558bb15e68"})
    @retrofit2.http.Multipart()
    public abstract retrofit2.Call<com.example.fish.logic.network.model.UploadResponse> uploadMoreFiles(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    java.util.List<okhttp3.MultipartBody.Part> requestBody);
}