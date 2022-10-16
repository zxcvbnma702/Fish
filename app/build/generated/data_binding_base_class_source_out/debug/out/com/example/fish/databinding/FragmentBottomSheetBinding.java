// Generated by data binding compiler. Do not edit!
package com.example.fish.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.fish.R;
import com.example.fish.ui.append.AppendViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentBottomSheetBinding extends ViewDataBinding {
  @NonNull
  public final EditText appendAddAddress;

  @NonNull
  public final TextView appendAddress;

  @NonNull
  public final TextView appendCancel;

  @NonNull
  public final EditText appendContent;

  @NonNull
  public final EditText appendContentTitle;

  @NonNull
  public final ImageView appendPictureButton;

  @NonNull
  public final RecyclerView appendPictures;

  @NonNull
  public final RecyclerView appendRecycler;

  @NonNull
  public final TextView appendSaveTemp;

  @NonNull
  public final TextView appendSend;

  @NonNull
  public final TextView appendTest;

  @NonNull
  public final LinearLayout appendTypeButton;

  @NonNull
  public final TextView appendTypeExhibit;

  @NonNull
  public final ConstraintLayout designBottomSheet;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final RelativeLayout relativeLayout;

  @Bindable
  protected AppendViewModel mViewModel;

  protected FragmentBottomSheetBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText appendAddAddress, TextView appendAddress, TextView appendCancel,
      EditText appendContent, EditText appendContentTitle, ImageView appendPictureButton,
      RecyclerView appendPictures, RecyclerView appendRecycler, TextView appendSaveTemp,
      TextView appendSend, TextView appendTest, LinearLayout appendTypeButton,
      TextView appendTypeExhibit, ConstraintLayout designBottomSheet, LinearLayout linearLayout,
      LinearLayout linearLayout2, LinearLayout linearLayout3, RelativeLayout relativeLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appendAddAddress = appendAddAddress;
    this.appendAddress = appendAddress;
    this.appendCancel = appendCancel;
    this.appendContent = appendContent;
    this.appendContentTitle = appendContentTitle;
    this.appendPictureButton = appendPictureButton;
    this.appendPictures = appendPictures;
    this.appendRecycler = appendRecycler;
    this.appendSaveTemp = appendSaveTemp;
    this.appendSend = appendSend;
    this.appendTest = appendTest;
    this.appendTypeButton = appendTypeButton;
    this.appendTypeExhibit = appendTypeExhibit;
    this.designBottomSheet = designBottomSheet;
    this.linearLayout = linearLayout;
    this.linearLayout2 = linearLayout2;
    this.linearLayout3 = linearLayout3;
    this.relativeLayout = relativeLayout;
  }

  public abstract void setViewModel(@Nullable AppendViewModel viewModel);

  @Nullable
  public AppendViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_bottom_sheet, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentBottomSheetBinding>inflateInternal(inflater, R.layout.fragment_bottom_sheet, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_bottom_sheet, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentBottomSheetBinding>inflateInternal(inflater, R.layout.fragment_bottom_sheet, null, false, component);
  }

  public static FragmentBottomSheetBinding bind(@NonNull View view) {
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
  public static FragmentBottomSheetBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentBottomSheetBinding)bind(component, view, R.layout.fragment_bottom_sheet);
  }
}
