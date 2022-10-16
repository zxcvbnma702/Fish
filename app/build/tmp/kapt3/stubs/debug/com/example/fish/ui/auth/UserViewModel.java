package com.example.fish.ui.auth;

import java.lang.System;

/**
 * @author:SunShibo
 * @date:2022-09-05 11:10
 * @feature:7 `
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0019J\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/example/fish/ui/auth/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "authListener", "Lcom/example/fish/ui/auth/AuthListener;", "getAuthListener$app_debug", "()Lcom/example/fish/ui/auth/AuthListener;", "setAuthListener$app_debug", "(Lcom/example/fish/ui/auth/AuthListener;)V", "password", "", "getPassword", "()Ljava/lang/String;", "setPassword", "(Ljava/lang/String;)V", "phoneNumber", "getPhoneNumber", "setPhoneNumber", "repository", "Lcom/example/fish/logic/Repository;", "sms", "getSms", "setSms", "getUserData", "Landroidx/lifecycle/LiveData;", "Lcom/example/fish/logic/db/entity/User;", "onLoginButtonClick", "", "view", "Landroid/view/View;", "onLoginButtonVerify", "onRegisterButtonClick", "saveUserData", "", "user", "Lcom/example/fish/logic/network/model/Data;", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String phoneNumber;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String password;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sms;
    private final com.example.fish.logic.Repository repository = null;
    @org.jetbrains.annotations.Nullable()
    private com.example.fish.ui.auth.AuthListener authListener;
    
    public UserViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    public final void setPhoneNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSms() {
        return null;
    }
    
    public final void setSms(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.fish.ui.auth.AuthListener getAuthListener$app_debug() {
        return null;
    }
    
    public final void setAuthListener$app_debug(@org.jetbrains.annotations.Nullable()
    com.example.fish.ui.auth.AuthListener p0) {
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
    com.example.fish.logic.network.model.Data user) {
    }
    
    public final void onLoginButtonClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void onLoginButtonVerify(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void onRegisterButtonClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}