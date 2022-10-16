package com.example.fish;

import java.lang.System;

/**
 * @author:SunShibo
 * @date:2022-08-22 22:51
 * @feature:
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/example/fish/FishApplication;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
public final class FishApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.fish.FishApplication.Companion Companion = null;
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    public static android.content.Context context;
    public static android.content.SharedPreferences sp;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String appId = "00871f090e174fb7bf20fb1a6a7f71e2";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String appSecret = "863547048aa7289c0425787b4e8558bb15e68";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String userID = "userID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String isLogin = "isLogin";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String isStore = "isStore";
    
    public FishApplication() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/fish/FishApplication$Companion;", "", "()V", "appId", "", "appSecret", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "isLogin", "isStore", "sp", "Landroid/content/SharedPreferences;", "getSp", "()Landroid/content/SharedPreferences;", "setSp", "(Landroid/content/SharedPreferences;)V", "userID", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.NotNull()
        android.content.Context p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.SharedPreferences getSp() {
            return null;
        }
        
        public final void setSp(@org.jetbrains.annotations.NotNull()
        android.content.SharedPreferences p0) {
        }
    }
}