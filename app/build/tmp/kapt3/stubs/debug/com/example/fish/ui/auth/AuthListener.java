package com.example.fish.ui.auth;

import java.lang.System;

/**
 * @author:SunShibo
 * @date:2022-09-05 23:03
 * @feature:
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u001f\u0010\u0007\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH&\u00f8\u0001\u0000J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0003H&J\u001f\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH&\u00f8\u0001\u0000J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001f\u0010\u0011\u001a\u00020\u00032\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH&\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/fish/ui/auth/AuthListener;", "", "onLoginFailure", "", "msg", "", "onLoginStarted", "onLoginSuccess", "loginResult", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "Lcom/example/fish/logic/network/model/UserResponse;", "onRegisterFailure", "onRegisterStarted", "onRegisterSuccess", "registerResult", "onVerifyFailure", "onVerifySuccess", "sendResult", "app_debug"})
public abstract interface AuthListener {
    
    public abstract void onLoginStarted();
    
    public abstract void onLoginSuccess(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<com.example.fish.logic.network.model.UserResponse>> loginResult);
    
    public abstract void onLoginFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
    
    public abstract void onRegisterStarted();
    
    public abstract void onRegisterSuccess(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<java.lang.String>> registerResult);
    
    public abstract void onRegisterFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
    
    public abstract void onVerifySuccess(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<java.lang.String>> sendResult);
    
    public abstract void onVerifyFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
}