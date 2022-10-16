package com.example.fish.ui.cart;

import java.lang.System;

/**
 * @author:SunShibo
 * @date:2022-09-24 17:32
 * @feature: Communication Interface
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&\u00f8\u0001\u0000J%\u0010\b\u001a\u00020\u00032\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00060\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/fish/ui/cart/CartListener;", "", "onPostSaveResponse", "", "response", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "", "onSaveListResponse", "saveList", "", "Lcom/example/fish/logic/network/model/SaveListRecord;", "app_debug"})
public abstract interface CartListener {
    
    public abstract void onSaveListResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<java.util.List<com.example.fish.logic.network.model.SaveListRecord>>> saveList);
    
    public abstract void onPostSaveResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<java.lang.Integer>> response);
}