package com.example.fish.ui.append.adapter;

import java.lang.System;

/**
 * @author:SunShibo
 * @date:2022-09-10 13:29
 * @feature:
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0010\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\bH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/example/fish/ui/append/adapter/AppendTypeAdapter;", "Lcom/example/base/ui/activity/BaseAdapter;", "", "Lcom/example/fish/databinding/ItemAppendTypeBinding;", "fragment", "Lcom/example/fish/ui/append/BottomSheetFragment;", "(Lcom/example/fish/ui/append/BottomSheetFragment;)V", "selPosition", "", "getSelPosition", "()I", "setSelPosition", "(I)V", "temp", "getTemp", "setTemp", "onBindViewHolder", "", "bean", "position", "app_debug"})
public final class AppendTypeAdapter extends com.example.base.ui.activity.BaseAdapter<java.lang.String, com.example.fish.databinding.ItemAppendTypeBinding> {
    private final com.example.fish.ui.append.BottomSheetFragment fragment = null;
    private int selPosition = 0;
    private int temp = -1;
    
    public AppendTypeAdapter(@org.jetbrains.annotations.NotNull()
    com.example.fish.ui.append.BottomSheetFragment fragment) {
        super();
    }
    
    public final int getSelPosition() {
        return 0;
    }
    
    public final void setSelPosition(int p0) {
    }
    
    public final int getTemp() {
        return 0;
    }
    
    public final void setTemp(int p0) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.fish.databinding.ItemAppendTypeBinding $this$onBindViewHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String bean, int position) {
    }
}