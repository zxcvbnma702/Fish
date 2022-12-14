// Generated by data binding compiler. Do not edit!
package com.example.fish.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.fish.R;
import com.google.android.material.card.MaterialCardView;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemHomeShopBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView itemShopAvator;

  @NonNull
  public final MaterialCardView itemShopCard;

  @NonNull
  public final TextView itemShopContent;

  @NonNull
  public final AppCompatImageView itemShopImage;

  @NonNull
  public final TextView itemShopPrice;

  @NonNull
  public final TextView itemShopTitle;

  protected ItemHomeShopBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CircleImageView itemShopAvator, MaterialCardView itemShopCard, TextView itemShopContent,
      AppCompatImageView itemShopImage, TextView itemShopPrice, TextView itemShopTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.itemShopAvator = itemShopAvator;
    this.itemShopCard = itemShopCard;
    this.itemShopContent = itemShopContent;
    this.itemShopImage = itemShopImage;
    this.itemShopPrice = itemShopPrice;
    this.itemShopTitle = itemShopTitle;
  }

  @NonNull
  public static ItemHomeShopBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_home_shop, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemHomeShopBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemHomeShopBinding>inflateInternal(inflater, R.layout.item_home_shop, root, attachToRoot, component);
  }

  @NonNull
  public static ItemHomeShopBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_home_shop, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemHomeShopBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemHomeShopBinding>inflateInternal(inflater, R.layout.item_home_shop, null, false, component);
  }

  public static ItemHomeShopBinding bind(@NonNull View view) {
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
  public static ItemHomeShopBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemHomeShopBinding)bind(component, view, R.layout.item_home_shop);
  }
}
