package com.example.fish.ui.detail;

import java.lang.System;

/**
 * @author:SunShibo
 * @date:2022-09-25 11:26
 * @feature:
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/example/fish/ui/detail/DetailsListener;", "", "onResponse", "", "response", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "Lcom/example/fish/logic/network/model/DetailsData;", "app_debug"})
public abstract interface DetailsListener {
    
    public abstract void onResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<com.example.fish.logic.network.model.DetailsData>> response);
}