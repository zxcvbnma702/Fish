package com.example.fish.logic;

import java.lang.System;

/**
 * @author:SunShibo
 * @date:2022-09-05 1:36
 * @feature:
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JU\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b\u00f8\u0001\u0000J%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0011\u00f8\u0001\u0000JQ\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u00050\u0004\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\"\u0010\u0016\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u00050\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u00042\u0006\u0010\u001c\u001a\u00020\u0011\u00f8\u0001\u0000J\u001b\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00050\u0004\u00f8\u0001\u0000J#\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001e0\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u0011\u00f8\u0001\u0000J-\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0011\u00f8\u0001\u0000J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0004JM\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b\u00f8\u0001\u0000J%\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b\u00f8\u0001\u0000JM\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b\u00f8\u0001\u0000J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020&J\u000e\u0010*\u001a\u00020-2\u0006\u0010.\u001a\u00020/J#\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00050\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001e\u00f8\u0001\u0000J%\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00050\u00042\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\b\u00f8\u0001\u0000J%\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\b\u00f8\u0001\u0000J\u001d\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u00106\u001a\u00020\b\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006:"}, d2 = {"Lcom/example/fish/logic/Repository;", "", "()V", "changeGoodInformation", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "Lcom/example/fish/logic/network/model/SaveData;", "address", "", "content", "id", "imageCode", "price", "typeId", "typeName", "userId", "deleteGoodInformation", "", "fire", "T", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;", "getDetails", "Lcom/example/fish/logic/network/model/DetailsData;", "goodsId", "getGoodTypes", "", "Lcom/example/fish/logic/network/model/TypeData;", "getSaveListInformation", "Lcom/example/fish/logic/network/model/SaveListRecord;", "getTypeGoods", "Lcom/example/fish/logic/network/model/AllData;", "size", "getUserData", "Lcom/example/fish/logic/db/entity/User;", "postGoodInformation", "postSaveGoodInformation", "saveGoodInformation", "saveUserData", "", "user", "", "data", "Lcom/example/fish/logic/network/model/Data;", "uploadMoreFiles", "Lcom/example/fish/logic/network/model/UploadData;", "requestBody", "Lokhttp3/MultipartBody$Part;", "userLogin", "Lcom/example/fish/logic/network/model/UserResponse;", "phoneNumber", "sms", "userRegister", "verify", "app_debug"})
public final class Repository {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.fish.logic.Repository INSTANCE = null;
    
    private Repository() {
        super();
    }
    
    /**
     * Login
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<java.lang.String>> verify(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<com.example.fish.logic.network.model.UserResponse>> userLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String sms) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<java.lang.String>> userRegister(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String sms) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.fish.logic.db.entity.User> getUserData() {
        return null;
    }
    
    public final long saveUserData(@org.jetbrains.annotations.NotNull()
    com.example.fish.logic.db.entity.User user) {
        return 0L;
    }
    
    public final void saveUserData(@org.jetbrains.annotations.NotNull()
    com.example.fish.logic.network.model.Data data) {
    }
    
    /**
     * Goods
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<java.util.List<com.example.fish.logic.network.model.TypeData>>> getGoodTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<com.example.fish.logic.network.model.AllData>> getTypeGoods(int userId, int typeId, int size) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<java.lang.String>> saveGoodInformation(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    java.lang.String imageCode, @org.jetbrains.annotations.NotNull()
    java.lang.String price, @org.jetbrains.annotations.NotNull()
    java.lang.String typeId, @org.jetbrains.annotations.NotNull()
    java.lang.String typeName, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<java.lang.String>> postGoodInformation(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    java.lang.String imageCode, @org.jetbrains.annotations.NotNull()
    java.lang.String price, @org.jetbrains.annotations.NotNull()
    java.lang.String typeId, @org.jetbrains.annotations.NotNull()
    java.lang.String typeName, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<com.example.fish.logic.network.model.SaveData>> changeGoodInformation(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String imageCode, @org.jetbrains.annotations.NotNull()
    java.lang.String price, @org.jetbrains.annotations.NotNull()
    java.lang.String typeId, @org.jetbrains.annotations.NotNull()
    java.lang.String typeName, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<java.lang.Integer>> postSaveGoodInformation(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<com.example.fish.logic.network.model.SaveData>> deleteGoodInformation(int id, int userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<java.util.List<com.example.fish.logic.network.model.SaveListRecord>>> getSaveListInformation(int userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<com.example.fish.logic.network.model.DetailsData>> getDetails(int goodsId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<com.example.fish.logic.network.model.UploadData>> uploadMoreFiles(@org.jetbrains.annotations.NotNull()
    java.util.List<okhttp3.MultipartBody.Part> requestBody) {
        return null;
    }
    
    private final <T extends java.lang.Object>androidx.lifecycle.LiveData<kotlin.Result<T>> fire(kotlin.coroutines.CoroutineContext context, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Result<? extends T>>, ? extends java.lang.Object> block) {
        return null;
    }
}