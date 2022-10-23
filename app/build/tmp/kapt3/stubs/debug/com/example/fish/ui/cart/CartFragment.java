package com.example.fish.ui.cart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0017\u00f8\u0001\u0000J%\u0010\u0016\u001a\u00020\u00112\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00140\u0013H\u0016\u00f8\u0001\u0000J\u001f\u0010\u001a\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00140\u0013H\u0017\u00f8\u0001\u0000J\b\u0010\u001c\u001a\u00020\u0011H\u0016J%\u0010\u001d\u001a\u00020\u00112\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00140\u0013H\u0016\u00f8\u0001\u0000J\f\u0010\u001e\u001a\u00020\u0011*\u00020\u0002H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/example/fish/ui/cart/CartFragment;", "Lcom/example/base/ui/activity/BaseFragment;", "Lcom/example/fish/databinding/FragmentCartBinding;", "Lcom/example/fish/ui/cart/CartListener;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "()V", "mViewModel", "Lcom/example/fish/ui/cart/CartViewModel;", "getMViewModel$app_debug", "()Lcom/example/fish/ui/cart/CartViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "myAdapter", "Lcom/example/fish/ui/cart/adapter/CartSaveRecyclerAdapter;", "myAdapter2", "Lcom/example/fish/ui/cart/adapter/CartPostRecyclerAdapter;", "onDeletePostResponse", "", "response", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "", "onPostListResponse", "saveList", "", "Lcom/example/fish/logic/network/model/SaveListRecord;", "onPostSaveResponse", "", "onRefresh", "onSaveListResponse", "initBindingView", "app_debug"})
public final class CartFragment extends com.example.base.ui.activity.BaseFragment<com.example.fish.databinding.FragmentCartBinding> implements com.example.fish.ui.cart.CartListener, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener {
    private com.example.fish.ui.cart.adapter.CartSaveRecyclerAdapter myAdapter;
    private com.example.fish.ui.cart.adapter.CartPostRecyclerAdapter myAdapter2;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mViewModel$delegate = null;
    
    public CartFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.fish.ui.cart.CartViewModel getMViewModel$app_debug() {
        return null;
    }
    
    @java.lang.Override()
    public void initBindingView(@org.jetbrains.annotations.NotNull()
    com.example.fish.databinding.FragmentCartBinding $this$initBindingView) {
    }
    
    /**
     * Update recyclerview data
     */
    @java.lang.Override()
    public void onSaveListResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<java.util.List<com.example.fish.logic.network.model.SaveListRecord>>> saveList) {
    }
    
    @java.lang.Override()
    public void onPostListResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<java.util.List<com.example.fish.logic.network.model.SaveListRecord>>> saveList) {
    }
    
    /**
     * Send saved data
     */
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void onPostSaveResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<java.lang.Integer>> response) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void onDeletePostResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<java.lang.String>> response) {
    }
    
    /**
     * Refresh data using coroutines
     * Updating the UI in a coroutine on the main thread
     */
    @java.lang.Override()
    public void onRefresh() {
    }
}