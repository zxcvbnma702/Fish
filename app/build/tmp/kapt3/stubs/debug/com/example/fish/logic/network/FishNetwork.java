package com.example.fish.logic.network;

import java.lang.System;

/**
 * @author:SunShibo
 * @date:2022-09-05 1:11
 * @feature: 统一封装接口
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J%\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J)\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J%\u0010!\u001a\u00020\"2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ%\u0010#\u001a\u00020$2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ%\u0010%\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ%\u0010&\u001a\u00020\'2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ%\u0010(\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010)\u001a\u00020*2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020,0+H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u0019\u0010.\u001a\u00020\'2\u0006\u0010/\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J!\u00101\u001a\u0002H2\"\u0004\b\u0000\u00102*\b\u0012\u0004\u0012\u0002H203H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00065"}, d2 = {"Lcom/example/fish/logic/network/FishNetwork;", "", "()V", "goodsServer", "Lcom/example/fish/logic/network/api/GoodsService;", "imageServer", "Lcom/example/fish/logic/network/api/ImageService;", "userServer", "Lcom/example/fish/logic/network/api/UserService;", "changeGoodInformation", "Lcom/example/fish/logic/network/model/SaveResponse;", "requestBody", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteGoodInformation", "goodsId", "", "userId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetails", "Lcom/example/fish/logic/network/model/DetailsResponse;", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGoodTypes", "Lcom/example/fish/logic/network/model/GoodTypeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSaveGoodInformation", "Lcom/example/fish/logic/network/model/SaveListResponse;", "getTypeGoods", "Lcom/example/fish/logic/network/model/GoodAllResponse;", "typeId", "size", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/example/fish/logic/network/model/UserResponse;", "postGoodInformation", "Lcom/example/fish/logic/network/model/AddResponse;", "postSaveGoodInformation", "register", "Lcom/example/fish/logic/network/model/VerifyResponse;", "saveGoodInformation", "uploadFiles", "Lcom/example/fish/logic/network/model/UploadResponse;", "", "Lokhttp3/MultipartBody$Part;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verify", "phoneNumber", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "await", "T", "Lretrofit2/Call;", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FishNetwork {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.fish.logic.network.FishNetwork INSTANCE = null;
    private static final com.example.fish.logic.network.api.UserService userServer = null;
    private static final com.example.fish.logic.network.api.GoodsService goodsServer = null;
    private static final com.example.fish.logic.network.api.ImageService imageServer = null;
    
    private FishNetwork() {
        super();
    }
    
    /**
     * login
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object verify(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.fish.logic.network.model.VerifyResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.fish.logic.network.model.UserResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object register(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.fish.logic.network.model.VerifyResponse> continuation) {
        return null;
    }
    
    /**
     * goods
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getGoodTypes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.fish.logic.network.model.GoodTypeResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTypeGoods(int userId, int typeId, int size, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.fish.logic.network.model.GoodAllResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveGoodInformation(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.fish.logic.network.model.SaveResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postGoodInformation(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.fish.logic.network.model.AddResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object changeGoodInformation(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.fish.logic.network.model.SaveResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postSaveGoodInformation(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.fish.logic.network.model.SaveResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteGoodInformation(int goodsId, int userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.fish.logic.network.model.SaveResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSaveGoodInformation(int userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.fish.logic.network.model.SaveListResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDetails(int goodsId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.fish.logic.network.model.DetailsResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadFiles(@org.jetbrains.annotations.NotNull()
    java.util.List<okhttp3.MultipartBody.Part> requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.fish.logic.network.model.UploadResponse> continuation) {
        return null;
    }
    
    private final <T extends java.lang.Object>java.lang.Object await(retrofit2.Call<T> $this$await, kotlin.coroutines.Continuation<? super T> p1) {
        return null;
    }
}