package com.example.fish.ui.cart;

import java.lang.System;

/**
 * @author:SunShibo
 * @date:2022-09-24 16:50
 * @feature:
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/fish/ui/cart/CartViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "cartListener", "Lcom/example/fish/ui/cart/CartListener;", "getCartListener$app_debug", "()Lcom/example/fish/ui/cart/CartListener;", "setCartListener$app_debug", "(Lcom/example/fish/ui/cart/CartListener;)V", "saveList", "", "Lcom/example/fish/logic/network/model/SaveListRecord;", "getSaveList", "()Ljava/util/List;", "setSaveList", "(Ljava/util/List;)V", "userId", "", "", "sendData", "id", "app_debug"})
public final class CartViewModel extends androidx.lifecycle.ViewModel {
    private final java.lang.String userId = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.fish.logic.network.model.SaveListRecord> saveList;
    @org.jetbrains.annotations.Nullable()
    private com.example.fish.ui.cart.CartListener cartListener;
    
    public CartViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.fish.logic.network.model.SaveListRecord> getSaveList() {
        return null;
    }
    
    public final void setSaveList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.fish.logic.network.model.SaveListRecord> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.fish.ui.cart.CartListener getCartListener$app_debug() {
        return null;
    }
    
    public final void setCartListener$app_debug(@org.jetbrains.annotations.Nullable()
    com.example.fish.ui.cart.CartListener p0) {
    }
    
    public final void getSaveList() {
    }
    
    public final void sendData(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
}