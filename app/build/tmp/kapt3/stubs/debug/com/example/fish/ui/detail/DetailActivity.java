package com.example.fish.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0016\u00f8\u0001\u0000J\f\u0010\u0016\u001a\u00020\u0011*\u00020\u0002H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/example/fish/ui/detail/DetailActivity;", "Lcom/example/base/ui/activity/BaseActivity;", "Lcom/example/fish/databinding/ActivityDetailBinding;", "Lcom/example/fish/ui/detail/DetailsListener;", "()V", "adapter", "Lcom/example/fish/ui/detail/adapter/DetailAdapter;", "getAdapter", "()Lcom/example/fish/ui/detail/adapter/DetailAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "mViewModel", "Lcom/example/fish/ui/detail/DetailViewModel;", "getMViewModel", "()Lcom/example/fish/ui/detail/DetailViewModel;", "mViewModel$delegate", "onResponse", "", "response", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "Lcom/example/fish/logic/network/model/DetailsData;", "initBindingView", "Companion", "app_debug"})
public final class DetailActivity extends com.example.base.ui.activity.BaseActivity<com.example.fish.databinding.ActivityDetailBinding> implements com.example.fish.ui.detail.DetailsListener {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy adapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.fish.ui.detail.DetailActivity.Companion Companion = null;
    
    public DetailActivity() {
        super();
    }
    
    private final com.example.fish.ui.detail.DetailViewModel getMViewModel() {
        return null;
    }
    
    private final com.example.fish.ui.detail.adapter.DetailAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void initBindingView(@org.jetbrains.annotations.NotNull()
    com.example.fish.databinding.ActivityDetailBinding $this$initBindingView) {
    }
    
    @java.lang.Override()
    public void onResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<com.example.fish.logic.network.model.DetailsData>> response) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/example/fish/ui/detail/DetailActivity$Companion;", "", "()V", "startActivity", "", "context", "Landroid/content/Context;", "id", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void startActivity(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String id) {
        }
    }
}