package com.example.fish.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u00a2\u0006\u0002\b\u0016J%\u0010\u0017\u001a\u00020\u00102\u0018\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a0\u0019H\u0016\u00f8\u0001\u0000J\b\u0010\u001d\u001a\u00020\u0010H\u0016J!\u0010\u001e\u001a\u00020\u00102\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001a\u0018\u00010\u0019H\u0016\u00f8\u0001\u0000J\u001f\u0010!\u001a\u00020\u00102\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001a0\u0019H\u0017\u00f8\u0001\u0000J\f\u0010\"\u001a\u00020\u0010*\u00020\u0002H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/example/fish/ui/home/HomeFragment;", "Lcom/example/base/ui/activity/BaseFragment;", "Lcom/example/fish/databinding/FragmentHomeBinding;", "Lcom/example/fish/ui/home/HomeListener;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "()V", "mViewModel", "Lcom/example/fish/ui/home/HomeViewModel;", "getMViewModel", "()Lcom/example/fish/ui/home/HomeViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "myAdapter", "Lcom/example/fish/ui/home/adapter/HomeRecyclerAdapter;", "myAdapter2", "hideSearchView", "", "isHide", "", "jumpTo", "item", "Lcom/example/fish/logic/network/model/Record;", "jumpTo$app_debug", "onGoodTypes", "types", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "", "Lcom/example/fish/logic/network/model/TypeData;", "onRefresh", "onSearchGoods", "data", "Lcom/example/fish/logic/network/model/AllData;", "onTypeGoods", "initBindingView", "app_debug"})
public final class HomeFragment extends com.example.base.ui.activity.BaseFragment<com.example.fish.databinding.FragmentHomeBinding> implements com.example.fish.ui.home.HomeListener, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener {
    private com.example.fish.ui.home.adapter.HomeRecyclerAdapter myAdapter;
    private com.example.fish.ui.home.adapter.HomeRecyclerAdapter myAdapter2;
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
    
    @java.lang.Override()
    public void onSearchGoods(@org.jetbrains.annotations.Nullable()
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
    
    /**
     * Control view`s visibility
     */
    private final void hideSearchView(boolean isHide) {
    }
}