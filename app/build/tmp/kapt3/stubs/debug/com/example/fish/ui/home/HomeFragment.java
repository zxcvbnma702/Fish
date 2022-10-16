package com.example.fish.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u00a2\u0006\u0002\b\u0012J%\u0010\u0013\u001a\u00020\u000f2\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00160\u0015H\u0016\u00f8\u0001\u0000J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\u001f\u0010\u001a\u001a\u00020\u000f2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00160\u0015H\u0017\u00f8\u0001\u0000J\f\u0010\u001d\u001a\u00020\u000f*\u00020\u0002H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/example/fish/ui/home/HomeFragment;", "Lcom/example/base/ui/activity/BaseFragment;", "Lcom/example/fish/databinding/FragmentHomeBinding;", "Lcom/example/fish/ui/home/HomeListener;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "()V", "mViewModel", "Lcom/example/fish/ui/home/HomeViewModel;", "getMViewModel", "()Lcom/example/fish/ui/home/HomeViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "myAdapter", "Lcom/example/fish/ui/home/adapter/HomeRecyclerAdapter;", "jumpTo", "", "item", "Lcom/example/fish/logic/network/model/Record;", "jumpTo$app_debug", "onGoodTypes", "types", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "", "Lcom/example/fish/logic/network/model/TypeData;", "onRefresh", "onTypeGoods", "data", "Lcom/example/fish/logic/network/model/AllData;", "initBindingView", "app_debug"})
public final class HomeFragment extends com.example.base.ui.activity.BaseFragment<com.example.fish.databinding.FragmentHomeBinding> implements com.example.fish.ui.home.HomeListener, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener {
    private com.example.fish.ui.home.adapter.HomeRecyclerAdapter myAdapter;
    private final kotlin.Lazy mViewModel$delegate = null;
    
    public HomeFragment() {
        super();
    }
    
    private final com.example.fish.ui.home.HomeViewModel getMViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void initBindingView(@org.jetbrains.annotations.NotNull()
    com.example.fish.databinding.FragmentHomeBinding $this$initBindingView) {
    }
    
    /**
     * Initialize tab data
     */
    @java.lang.Override()
    public void onGoodTypes(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<java.util.List<com.example.fish.logic.network.model.TypeData>>> types) {
    }
    
    /**
     * Update recyclerView data
     */
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void onTypeGoods(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<com.example.fish.logic.network.model.AllData>> data) {
    }
    
    public final void jumpTo$app_debug(@org.jetbrains.annotations.NotNull()
    com.example.fish.logic.network.model.Record item) {
    }
    
    /**
     * Refresh data using coroutines
     * Updating the UI in a coroutine on the main thread
     */
    @java.lang.Override()
    public void onRefresh() {
    }
}