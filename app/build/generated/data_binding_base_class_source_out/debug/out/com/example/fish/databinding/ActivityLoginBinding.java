// Generated by data binding compiler. Do not edit!
package com.example.fish.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.fish.R;
import com.example.fish.ui.auth.UserViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLoginBinding extends ViewDataBinding {
  @NonNull
  public final Button btLogin;

  @NonNull
  public final Button btRegister;

  @NonNull
  public final ImageView loginImgViewCloudLeft;

  @NonNull
  public final ImageView loginImgViewCloudRight;

  @NonNull
  public final ImageView loginImgViewLogo;

  @NonNull
  public final ImageView loginImgViewLogoRays;

  @NonNull
  public final LinearLayout loginInputs;

  @NonNull
  public final ProgressBar loginProgressBar;

  @NonNull
  public final MotionLayout loginRootLayout;

  @NonNull
  public final EditText loginVerify;

  @NonNull
  public final TextView tvForgotPassword;

  @NonNull
  public final TextView tvRegister;

  @Bindable
  protected UserViewModel mViewModel;

  protected ActivityLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btLogin, Button btRegister, ImageView loginImgViewCloudLeft,
      ImageView loginImgViewCloudRight, ImageView loginImgViewLogo, ImageView loginImgViewLogoRays,
      LinearLayout loginInputs, ProgressBar loginProgressBar, MotionLayout loginRootLayout,
      EditText loginVerify, TextView tvForgotPassword, TextView tvRegister) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btLogin = btLogin;
    this.btRegister = btRegister;
    this.loginImgViewCloudLeft = loginImgViewCloudLeft;
    this.loginImgViewCloudRight = loginImgViewCloudRight;
    this.loginImgViewLogo = loginImgViewLogo;
    this.loginImgViewLogoRays = loginImgViewLogoRays;
    this.loginInputs = loginInputs;
    this.loginProgressBar = loginProgressBar;
    this.loginRootLayout = loginRootLayout;
    this.loginVerify = loginVerify;
    this.tvForgotPassword = tvForgotPassword;
    this.tvRegister = tvRegister;
  }

  public abstract void setViewModel(@Nullable UserViewModel viewModel);

  @Nullable
  public UserViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, R.layout.activity_login, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, R.layout.activity_login, null, false, component);
  }

  public static ActivityLoginBinding bind(@NonNull View view) {
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
  public static ActivityLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityLoginBinding)bind(component, view, R.layout.activity_login);
  }
}
