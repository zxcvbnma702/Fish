package com.example.fish.ui.home;

import java.lang.System;

/**
 * @author:SunShibo
 * @date:2022-09-07 21:21
 * @feature:
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020#J\u0006\u0010%\u001a\u00020#R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0013\u0010 \u001a\u0004\u0018\u00010\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018\u00a8\u0006&"}, d2 = {"Lcom/example/fish/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "goodList", "", "Lcom/example/fish/logic/network/model/Record;", "getGoodList", "()Ljava/util/List;", "setGoodList", "(Ljava/util/List;)V", "homeListener", "Lcom/example/fish/ui/home/HomeListener;", "getHomeListener$app_debug", "()Lcom/example/fish/ui/home/HomeListener;", "setHomeListener$app_debug", "(Lcom/example/fish/ui/home/HomeListener;)V", "record", "getRecord", "()Lcom/example/fish/logic/network/model/Record;", "recyclerSize", "", "searchText", "", "getSearchText", "()Ljava/lang/String;", "setSearchText", "(Ljava/lang/String;)V", "typeId", "getTypeId", "()I", "setTypeId", "(I)V", "userId", "getUserId", "getGoodTypes", "", "getSearchGoods", "getTypeGoods", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String userId = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.fish.logic.network.model.Record record = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.fish.logic.network.model.Record> goodList;
    private int typeId = 1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String searchText = "";
    private final int recyclerSize = 20;
    @org.jetbrains.annotations.Nullable()
    private com.example.fish.ui.home.HomeListener homeListener;
    
    public HomeViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.fish.logic.network.model.Record getRecord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.fish.logic.network.model.Record> getGoodList() {
        return null;
    }
    
    public final void setGoodList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.fish.logic.network.model.Record> p0) {
    }
    
    public final int getTypeId() {
        return 0;
    }
    
    public final void setTypeId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearchText() {
        return null;
    }
    
    public final void setSearchText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.fish.ui.home.HomeListener getHomeListener$app_debug() {
        return null;
    }
    
    public final void setHomeListener$app_debug(@org.jetbrains.annotations.Nullable()
    com.example.fish.ui.home.HomeListener p0) {
    }
    
    public final void getGoodTypes() {
    }
    
    public final void getTypeGoods() {
    }
    
    public final void getSearchGoods() {
    }
}