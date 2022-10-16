package com.example.fish.logic.db.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u00c6\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\t\u0010&\u001a\u00020\u0006H\u00d6\u0001R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012\u00a8\u0006\'"}, d2 = {"Lcom/example/fish/logic/db/entity/Item;", "Lcom/example/fish/logic/db/entity/ItemRoot;", "viewType", "", "backgroundColor", "title", "", "height", "", "data", "Lcom/example/fish/logic/network/model/DetailsData;", "Recommend", "", "Lcom/example/fish/logic/network/model/Record;", "(IILjava/lang/String;FLcom/example/fish/logic/network/model/DetailsData;Ljava/util/List;)V", "getRecommend", "()Ljava/util/List;", "getBackgroundColor", "()I", "getData", "()Lcom/example/fish/logic/network/model/DetailsData;", "getHeight", "()F", "getTitle", "()Ljava/lang/String;", "getViewType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class Item extends com.example.fish.logic.db.entity.ItemRoot {
    private final int viewType = 0;
    private final int backgroundColor = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    private final float height = 0.0F;
    @org.jetbrains.annotations.Nullable()
    private final com.example.fish.logic.network.model.DetailsData data = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.example.fish.logic.network.model.Record> Recommend = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.fish.logic.db.entity.Item copy(int viewType, @androidx.annotation.ColorInt()
    int backgroundColor, @org.jetbrains.annotations.Nullable()
    java.lang.String title, float height, @org.jetbrains.annotations.Nullable()
    com.example.fish.logic.network.model.DetailsData data, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.fish.logic.network.model.Record> Recommend) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Item(int viewType, @androidx.annotation.ColorInt()
    int backgroundColor, @org.jetbrains.annotations.Nullable()
    java.lang.String title, float height, @org.jetbrains.annotations.Nullable()
    com.example.fish.logic.network.model.DetailsData data, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.fish.logic.network.model.Record> Recommend) {
        super(0, 0, null, 0.0F);
    }
    
    public final int component1() {
        return 0;
    }
    
    @java.lang.Override()
    public int getViewType() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    @java.lang.Override()
    public int getBackgroundColor() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    public final float component4() {
        return 0.0F;
    }
    
    @java.lang.Override()
    public float getHeight() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.fish.logic.network.model.DetailsData component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.fish.logic.network.model.DetailsData getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.fish.logic.network.model.Record> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.fish.logic.network.model.Record> getRecommend() {
        return null;
    }
}