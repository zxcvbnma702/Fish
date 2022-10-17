// Generated by data binding compiler. Do not edit!
package com.example.fish.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.example.fish.R;
import com.example.fish.ui.cart.CartViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCartBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView cartRecyclerView;

  @NonNull
  public final SwipeRefreshLayout cartSwipe;

  @Bindable
  protected CartViewModel mViewModel;

  protected FragmentCartBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView cartRecyclerView, SwipeRefreshLayout cartSwipe) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cartRecyclerView = cartRecyclerView;
    this.cartSwipe = cartSwipe;
  }

  public abstract void setViewModel(@Nullable CartViewModel viewModel);

  @Nullable
  public CartViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_cart, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCartBinding>inflateInternal(inflater, R.layout.fragment_cart, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_cart, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCartBinding>inflateInternal(inflater, R.layout.fragment_cart, null, false, component);
  }

  public static FragmentCartBinding bind(@NonNull View view) {
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
  public static FragmentCartBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCartBinding)bind(component, view, R.layout.fragment_cart);
  }
}