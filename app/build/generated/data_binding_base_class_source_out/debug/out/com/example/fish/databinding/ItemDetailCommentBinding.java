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
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemDetailCommentBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView circleImageView;

  @NonNull
  public final CircleImageView circleImageView2;

  @NonNull
  public final CircleImageView circleImageView3;

  @NonNull
  public final CircleImageView itemDetailCommentEvatar;

  @NonNull
  public final AppCompatTextView itemDetailCommentLiuyan;

  protected ItemDetailCommentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CircleImageView circleImageView, CircleImageView circleImageView2,
      CircleImageView circleImageView3, CircleImageView itemDetailCommentEvatar,
      AppCompatTextView itemDetailCommentLiuyan) {
    super(_bindingComponent, _root, _localFieldCount);
    this.circleImageView = circleImageView;
    this.circleImageView2 = circleImageView2;
    this.circleImageView3 = circleImageView3;
    this.itemDetailCommentEvatar = itemDetailCommentEvatar;
    this.itemDetailCommentLiuyan = itemDetailCommentLiuyan;
  }

  @NonNull
  public static ItemDetailCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_detail_comment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemDetailCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemDetailCommentBinding>inflateInternal(inflater, R.layout.item_detail_comment, root, attachToRoot, component);
  }

  @NonNull
  public static ItemDetailCommentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_detail_comment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemDetailCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemDetailCommentBinding>inflateInternal(inflater, R.layout.item_detail_comment, null, false, component);
  }

  public static ItemDetailCommentBinding bind(@NonNull View view) {
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
  public static ItemDetailCommentBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemDetailCommentBinding)bind(component, view, R.layout.item_detail_comment);
  }
}
