package com.example.fish.ui.append;

import java.lang.System;

/**
 * @author:SunShibo
 * @date:2022-09-17 22:56
 * @feature: 添加商品界面
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0003J\u0012\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J$\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J%\u0010\u001e\u001a\u00020\u00142\u0018\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!0 H\u0016\u00f8\u0001\u0000J\u001f\u0010$\u001a\u00020\u00142\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0!0 H\u0016\u00f8\u0001\u0000J\u001f\u0010\'\u001a\u00020\u00142\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0!0 H\u0016\u00f8\u0001\u0000J\b\u0010(\u001a\u00020\u0014H\u0016J\u001f\u0010)\u001a\u00020\u00142\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0!0 H\u0016\u00f8\u0001\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/example/fish/ui/append/BottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lcom/example/fish/ui/append/AppendListener;", "()V", "aiAdapter", "Lcom/example/fish/ui/append/adapter/AppendImageAdapter;", "atAdapter", "Lcom/example/fish/ui/append/adapter/AppendTypeAdapter;", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "binding", "Lcom/example/fish/databinding/FragmentBottomSheetBinding;", "viewModel", "Lcom/example/fish/ui/append/AppendViewModel;", "getViewModel$app_debug", "()Lcom/example/fish/ui/append/AppendViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initBottomSheet", "", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onGoodTypes", "types", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "", "Lcom/example/fish/logic/network/model/TypeData;", "onSaveListener", "response", "", "onSendListener", "onStart", "onUploadComplete", "Lcom/example/fish/logic/network/model/UploadData;", "app_debug"})
public final class BottomSheetFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment implements com.example.fish.ui.append.AppendListener {
    private com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View> behavior;
    private com.example.fish.databinding.FragmentBottomSheetBinding binding;
    private com.example.fish.ui.append.adapter.AppendTypeAdapter atAdapter;
    private com.example.fish.ui.append.adapter.AppendImageAdapter aiAdapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    
    public BottomSheetFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.fish.ui.append.AppendViewModel getViewModel$app_debug() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void initView() {
    }
    
    @java.lang.Override()
    public void onSendListener(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<java.lang.String>> response) {
    }
    
    @java.lang.Override()
    public void onSaveListener(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<java.lang.String>> response) {
    }
    
    @java.lang.Override()
    public void onGoodTypes(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<java.util.List<com.example.fish.logic.network.model.TypeData>>> types) {
    }
    
    @java.lang.Override()
    public void onUploadComplete(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<kotlin.Result<com.example.fish.logic.network.model.UploadData>> response) {
    }
    
    private final void initBottomSheet() {
    }
}