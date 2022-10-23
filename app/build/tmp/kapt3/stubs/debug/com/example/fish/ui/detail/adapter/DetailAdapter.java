package com.example.fish.ui.detail.adapter;

import java.lang.System;

/**
 * @author:SunShibo
 * @date:2022-09-25 22:13
 * @feature:
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0016J$\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/fish/ui/detail/adapter/DetailAdapter;", "Lcom/example/base/ui/activity/BaseMultiTypeAdapter;", "Lcom/example/fish/logic/db/entity/Item;", "host", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getItemViewType", "", "position", "onCreateMultiViewHolder", "Landroidx/databinding/ViewDataBinding;", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "Lcom/example/base/ui/activity/BaseMultiTypeAdapter$MultiTypeViewHolder;", "holder", "item", "Companion", "app_debug"})
public final class DetailAdapter extends com.example.base.ui.activity.BaseMultiTypeAdapter<com.example.fish.logic.db.entity.Item> {
    private final android.app.Activity host = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.fish.ui.detail.adapter.DetailAdapter.Companion Companion = null;
    public static final int GALLERY = 101;
    public static final int TITLE = 102;
    public static final int CONTENT = 103;
    public static final int USER = 104;
    public static final int COMMENT = 105;
    public static final int RECOMMEND = 106;
    public static final int OTHER = 109;
    
    public DetailAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Activity host) {
        super();
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.base.ui.activity.BaseMultiTypeAdapter.MultiTypeViewHolder $this$onBindViewHolder, @org.jetbrains.annotations.NotNull()
    com.example.base.ui.activity.BaseMultiTypeAdapter.MultiTypeViewHolder holder, @org.jetbrains.annotations.NotNull()
    com.example.fish.logic.db.entity.Item item, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.databinding.ViewDataBinding onCreateMultiViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    /**
     * Item type
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/fish/ui/detail/adapter/DetailAdapter$Companion;", "", "()V", "COMMENT", "", "CONTENT", "GALLERY", "OTHER", "RECOMMEND", "TITLE", "USER", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}