package com.example.fish.ui.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\u001f\u0010\u0011\u001a\u00020\f2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0016\u00f8\u0001\u0000J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\u001f\u0010\u0018\u001a\u00020\f2\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\u0013H\u0016\u00f8\u0001\u0000J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001f\u0010\u001b\u001a\u00020\f2\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\u0013H\u0016\u00f8\u0001\u0000J \u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J\b\u0010\"\u001a\u00020\fH\u0002J\f\u0010#\u001a\u00020\f*\u00020\u0002H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/example/fish/ui/auth/LoginActivity;", "Lcom/example/base/ui/activity/BaseActivity;", "Lcom/example/fish/databinding/ActivityLoginBinding;", "Lcom/example/fish/ui/auth/AuthListener;", "()V", "mViewModel", "Lcom/example/fish/ui/auth/UserViewModel;", "getMViewModel", "()Lcom/example/fish/ui/auth/UserViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "jumpToMain", "", "onLoginFailure", "msg", "", "onLoginStarted", "onLoginSuccess", "loginResult", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "Lcom/example/fish/logic/network/model/UserResponse;", "onRegisterFailure", "onRegisterStarted", "onRegisterSuccess", "registerResult", "onVerifyFailure", "onVerifySuccess", "sendResult", "saveLoginStatus", "userId", "isLogin", "", "isStore", "switch", "initBindingView", "app_debug"})
public final class LoginActivity extends com.example.base.ui.activity.BaseActivity<com.example.fish.databinding.ActivityLoginBinding> implements com.example.fish.ui.auth.AuthListener {
    private final kotlin.Lazy mViewModel$delegate = null;
    
    public LoginActivity() {
        super();
    }
    
    private final com.example.fish.ui.auth.UserViewModel getMViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void initBindingView(@org.jetbrains.annotations.NotNull()
    com.example.fish.databinding.ActivityLoginBinding $this$initBindingView) {
    }
    
    /**
     * Login start callback
     */
    @java.lang.Override()
    public void onLoginStarted() {
    }
    
    /**
     * Login success callback
     */
    @java.lang.Override()
    public void onLoginSuccess(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<com.example.fish.logic.network.model.UserResponse>> loginResult) {
    }
    
    /**
     * Login failure callback
     */
    @java.lang.Override()
    public void onLoginFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    /**
     * Login success callback
     */
    @java.lang.Override()
    public void onRegisterStarted() {
    }
    
    /**
     * Register success callback
     */
    @java.lang.Override()
    public void onRegisterSuccess(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<java.lang.String>> registerResult) {
    }
    
    /**
     * Register failure callback
     */
    @java.lang.Override()
    public void onRegisterFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    /**
     * Verify success callback
     */
    @java.lang.Override()
    public void onVerifySuccess(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<java.lang.String>> sendResult) {
    }
    
    /**
     * Verify failure callback
     */
    @java.lang.Override()
    public void onVerifyFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    /**
     * Use sp to save login status
     */
    private final void saveLoginStatus(java.lang.String userId, boolean isLogin, boolean isStore) {
    }
    
    private final void jumpToMain() {
    }
}