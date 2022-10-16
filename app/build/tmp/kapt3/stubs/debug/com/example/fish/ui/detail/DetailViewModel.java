package com.example.fish.ui.detail;

import java.lang.System;

/**
 * @author:SunShibo
 * @date:2022-09-25 10:04
 * @feature:
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u00a2\u0006\u0002\b\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/example/fish/ui/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "data", "Lcom/example/fish/logic/network/model/DetailsData;", "getData$app_debug", "()Lcom/example/fish/logic/network/model/DetailsData;", "setData$app_debug", "(Lcom/example/fish/logic/network/model/DetailsData;)V", "detailsListener", "Lcom/example/fish/ui/detail/DetailsListener;", "getDetailsListener$app_debug", "()Lcom/example/fish/ui/detail/DetailsListener;", "setDetailsListener$app_debug", "(Lcom/example/fish/ui/detail/DetailsListener;)V", "goodsId", "", "getGoodsId$app_debug", "()Ljava/lang/String;", "setGoodsId$app_debug", "(Ljava/lang/String;)V", "tabList", "", "Lcom/example/fish/logic/db/entity/TabData;", "getTabList$app_debug", "()Ljava/util/List;", "getDetails", "", "getItemList", "Lcom/example/fish/logic/db/entity/Item;", "getItemList$app_debug", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String goodsId;
    @org.jetbrains.annotations.Nullable()
    private com.example.fish.ui.detail.DetailsListener detailsListener;
    @org.jetbrains.annotations.Nullable()
    private com.example.fish.logic.network.model.DetailsData data;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.fish.logic.db.entity.TabData> tabList = null;
    
    public DetailViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGoodsId$app_debug() {
        return null;
    }
    
    public final void setGoodsId$app_debug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.fish.ui.detail.DetailsListener getDetailsListener$app_debug() {
        return null;
    }
    
    public final void setDetailsListener$app_debug(@org.jetbrains.annotations.Nullable()
    com.example.fish.ui.detail.DetailsListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.fish.logic.network.model.DetailsData getData$app_debug() {
        return null;
    }
    
    public final void setData$app_debug(@org.jetbrains.annotations.Nullable()
    com.example.fish.logic.network.model.DetailsData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.fish.logic.db.entity.TabData> getTabList$app_debug() {
        return null;
    }
    
    /**
     * Get details for good
     */
    public final void getDetails() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.fish.logic.db.entity.Item> getItemList$app_debug(@org.jetbrains.annotations.Nullable()
    com.example.fish.logic.network.model.DetailsData data) {
        return null;
    }
}