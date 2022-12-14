// Generated by data binding compiler. Do not edit!
package com.example.fish.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.fish.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemDetailTitleBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView appCompatTextView;

  @NonNull
  public final AppCompatTextView itemDetailTitleAddress;

  @NonNull
  public final AppCompatTextView itemDetailTitleContent;

  @NonNull
  public final AppCompatTextView itemDetailTitlePrice;

  @NonNull
  public final AppCompatTextView itemDetailTitleTime;

  @NonNull
  public final AppCompatTextView itemDetailTitleTimeTip;

  protected ItemDetailTitleBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatTextView appCompatTextView, AppCompatTextView itemDetailTitleAddress,
      AppCompatTextView itemDetailTitleContent, AppCompatTextView itemDetailTitlePrice,
      AppCompatTextView itemDetailTitleTime, AppCompatTextView itemDetailTitleTimeTip) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appCompatTextView = appCompatTextView;
    this.itemDetailTitleAddress = itemDetailTitleAddress;
    this.itemDetailTitleContent = itemDetailTitleContent;
    this.itemDetailTitlePrice = itemDetailTitlePrice;
    this.itemDetailTitleTime = itemDetailTitleTime;
    this.itemDetailTitleTimeTip = itemDetailTitleTimeTip;
  }

  @NonNull
  public static ItemDetailTitleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_detail_title, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemDetailTitleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemDetailTitleBinding>inflateInternal(inflater, R.layout.item_detail_title, root, attachToRoot, component);
  }

  @NonNull
  public static ItemDetailTitleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_detail_title, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemDetailTitleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemDetailTitleBinding>inflateInternal(inflater, R.layout.item_detail_title, null, false, component);
  }

  public static ItemDetailTitleBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemDetailTitleBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemDetailTitleBinding)bind(component, view, R.layout.item_detail_title);
  }
}
