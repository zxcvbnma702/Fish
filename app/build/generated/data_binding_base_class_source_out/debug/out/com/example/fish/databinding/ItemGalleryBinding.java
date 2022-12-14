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
import androidx.viewpager2.widget.ViewPager2;
import com.example.fish.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemGalleryBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView tvIndex;

  @NonNull
  public final ViewPager2 vpGallery;

  protected ItemGalleryBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatTextView tvIndex, ViewPager2 vpGallery) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvIndex = tvIndex;
    this.vpGallery = vpGallery;
  }

  @NonNull
  public static ItemGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_gallery, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemGalleryBinding>inflateInternal(inflater, R.layout.item_gallery, root, attachToRoot, component);
  }

  @NonNull
  public static ItemGalleryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_gallery, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemGalleryBinding>inflateInternal(inflater, R.layout.item_gallery, null, false, component);
  }

  public static ItemGalleryBinding bind(@NonNull View view) {
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
  public static ItemGalleryBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemGalleryBinding)bind(component, view, R.layout.item_gallery);
  }
}
