package com.example.fish.logic.network.api;

import java.lang.System;

/**
 * @author:SunShibo
 * @date:2022-09-05 0:43
 * @feature:
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\'J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\'\u00a8\u0006\f"}, d2 = {"Lcom/example/fish/logic/network/api/UserService;", "", "loginAccount", "Lretrofit2/Call;", "Lcom/example/fish/logic/network/model/UserResponse;", "requestBody", "", "", "registerAccount", "Lcom/example/fish/logic/network/model/VerifyResponse;", "verify", "phone", "app_debug"})
public abstract interface UserService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "user/send")
    @retrofit2.http.Headers(value = {"appId: 00871f090e174fb7bf20fb1a6a7f71e2", "appSecret: 863547048aa7289c0425787b4e8558bb15e68"})
    public abstract retrofit2.Call<com.example.fish.logic.network.model.VerifyResponse> verify(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "phone")
    java.lang.String phone);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/login")
    @retrofit2.http.Headers(value = {"appId: 00871f090e174fb7bf20fb1a6a7f71e2", "appSecret: 863547048aa7289c0425787b4e8558bb15e68"})
    public abstract retrofit2.Call<com.example.fish.logic.network.model.UserResponse> loginAccount(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.Map<java.lang.String, java.lang.String> requestBody);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/register")
    @retrofit2.http.Headers(value = {"appId: 00871f090e174fb7bf20fb1a6a7f71e2", "appSecret: 863547048aa7289c0425787b4e8558bb15e68"})
    public abstract retrofit2.Call<com.example.fish.logic.network.model.VerifyResponse> registerAccount(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.Map<java.lang.String, java.lang.String> requestBody);
}