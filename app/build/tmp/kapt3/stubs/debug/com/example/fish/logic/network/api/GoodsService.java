package com.example.fish.logic.network.api;

import java.lang.System;

/**
 * @author:SunShibo
 * @date:2022-09-10 18:20
 * @feature: request interface
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\'J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\'J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u000b\u001a\u00020\nH\'J,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0014\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\nH\'J,\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0017\u001a\u00020\n2\b\b\u0001\u0010\u0015\u001a\u00020\nH\'J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\'J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\'J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\'\u00a8\u0006\u001c"}, d2 = {"Lcom/example/fish/logic/network/api/GoodsService;", "", "changeGoodInformation", "Lretrofit2/Call;", "Lcom/example/fish/logic/network/model/SaveResponse;", "requestBody", "", "", "deleteGoodInformation", "goodsId", "", "userId", "getDetails", "Lcom/example/fish/logic/network/model/DetailsResponse;", "getGoodTypes", "Lcom/example/fish/logic/network/model/GoodTypeResponse;", "getSaveGoodInformation", "Lcom/example/fish/logic/network/model/SaveListResponse;", "getSearchGoods", "Lcom/example/fish/logic/network/model/GoodAllResponse;", "keyword", "size", "getTypeGoods", "typeId", "postGoodInformation", "Lcom/example/fish/logic/network/model/AddResponse;", "postSaveGoodInformation", "saveGoodInformation", "app_debug"})
public abstract interface GoodsService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "goods/type")
    @retrofit2.http.Headers(value = {"appId: 00871f090e174fb7bf20fb1a6a7f71e2", "appSecret: 863547048aa7289c0425787b4e8558bb15e68"})
    public abstract retrofit2.Call<com.example.fish.logic.network.model.GoodTypeResponse> getGoodTypes();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "goods/all")
    @retrofit2.http.Headers(value = {"appId: 00871f090e174fb7bf20fb1a6a7f71e2", "appSecret: 863547048aa7289c0425787b4e8558bb15e68"})
    public abstract retrofit2.Call<com.example.fish.logic.network.model.GoodAllResponse> getTypeGoods(@retrofit2.http.Query(value = "userId")
    int userId, @retrofit2.http.Query(value = "typeId")
    int typeId, @retrofit2.http.Query(value = "size")
    int size);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "goods/all")
    @retrofit2.http.Headers(value = {"appId: 00871f090e174fb7bf20fb1a6a7f71e2", "appSecret: 863547048aa7289c0425787b4e8558bb15e68"})
    public abstract retrofit2.Call<com.example.fish.logic.network.model.GoodAllResponse> getSearchGoods(@retrofit2.http.Query(value = "userId")
    int userId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "keyword")
    java.lang.String keyword, @retrofit2.http.Query(value = "size")
    int size);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "goods/save")
    @retrofit2.http.Headers(value = {"appId: 00871f090e174fb7bf20fb1a6a7f71e2", "appSecret: 863547048aa7289c0425787b4e8558bb15e68"})
    public abstract retrofit2.Call<com.example.fish.logic.network.model.SaveResponse> saveGoodInformation(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.Map<java.lang.String, java.lang.String> requestBody);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "goods/add")
    @retrofit2.http.Headers(value = {"appId: 00871f090e174fb7bf20fb1a6a7f71e2", "appSecret: 863547048aa7289c0425787b4e8558bb15e68"})
    public abstract retrofit2.Call<com.example.fish.logic.network.model.AddResponse> postGoodInformation(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.Map<java.lang.String, java.lang.String> requestBody);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "goods/change")
    @retrofit2.http.Headers(value = {"appId: 00871f090e174fb7bf20fb1a6a7f71e2", "appSecret: 863547048aa7289c0425787b4e8558bb15e68"})
    public abstract retrofit2.Call<com.example.fish.logic.network.model.SaveResponse> changeGoodInformation(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.Map<java.lang.String, java.lang.String> requestBody);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "goods/change")
    @retrofit2.http.Headers(value = {"appId: 00871f090e174fb7bf20fb1a6a7f71e2", "appSecret: 863547048aa7289c0425787b4e8558bb15e68"})
    public abstract retrofit2.Call<com.example.fish.logic.network.model.SaveResponse> postSaveGoodInformation(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.Map<java.lang.String, java.lang.String> requestBody);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "goods/delete")
    @retrofit2.http.Headers(value = {"appId: 00871f090e174fb7bf20fb1a6a7f71e2", "appSecret: 863547048aa7289c0425787b4e8558bb15e68"})
    public abstract retrofit2.Call<com.example.fish.logic.network.model.SaveResponse> deleteGoodInformation(@retrofit2.http.Query(value = "goodsId")
    int goodsId, @retrofit2.http.Query(value = "userId")
    int userId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "goods/save")
    @retrofit2.http.Headers(value = {"appId: 00871f090e174fb7bf20fb1a6a7f71e2", "appSecret: 863547048aa7289c0425787b4e8558bb15e68"})
    public abstract retrofit2.Call<com.example.fish.logic.network.model.SaveListResponse> getSaveGoodInformation(@retrofit2.http.Query(value = "userId")
    int userId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "goods/details")
    @retrofit2.http.Headers(value = {"appId: 00871f090e174fb7bf20fb1a6a7f71e2", "appSecret: 863547048aa7289c0425787b4e8558bb15e68"})
    public abstract retrofit2.Call<com.example.fish.logic.network.model.DetailsResponse> getDetails(@retrofit2.http.Query(value = "goodsId")
    int goodsId);
}