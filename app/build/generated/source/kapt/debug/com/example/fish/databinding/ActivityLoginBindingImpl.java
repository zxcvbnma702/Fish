package com.example.fish.databinding;
import com.example.fish.R;
import com.example.fish.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.login_imgView_logo, 6);
        sViewsWithIds.put(R.id.login_imgView_logo_rays, 7);
        sViewsWithIds.put(R.id.login_imgView_cloudLeft, 8);
        sViewsWithIds.put(R.id.login_imgView_cloudRight, 9);
        sViewsWithIds.put(R.id.login_inputs, 10);
        sViewsWithIds.put(R.id.tv_forgotPassword, 11);
        sViewsWithIds.put(R.id.tv_register, 12);
        sViewsWithIds.put(R.id.login_progress_bar, 13);
    }
    // views
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.Button mboundView3;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewModelOnLoginButtonClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelOnRegisterButtonClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewModelOnLoginButtonVerifyAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener loginVerifyandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.sms
            //         is viewModel.setSms((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(loginVerify);
            // localize variables for thread safety
            // viewModel.sms
            java.lang.String viewModelSms = null;
            // viewModel
            com.example.fish.ui.auth.UserViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setSms(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.phoneNumber
            //         is viewModel.setPhoneNumber((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewModel.phoneNumber
            java.lang.String viewModelPhoneNumber = null;
            // viewModel
            com.example.fish.ui.auth.UserViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setPhoneNumber(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[5]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.ProgressBar) bindings[13]
            , (androidx.constraintlayout.motion.widget.MotionLayout) bindings[0]
            , (android.widget.EditText) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            );
        this.btLogin.setTag(null);
        this.btRegister.setTag(null);
        this.loginRootLayout.setTag(null);
        this.loginVerify.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.fish.ui.auth.UserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.fish.ui.auth.UserViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelSms = null;
        java.lang.String viewModelPhoneNumber = null;
        android.view.View.OnClickListener viewModelOnLoginButtonClickAndroidViewViewOnClickListener = null;
        com.example.fish.ui.auth.UserViewModel viewModel = mViewModel;
        android.view.View.OnClickListener viewModelOnRegisterButtonClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelOnLoginButtonVerifyAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.sms
                    viewModelSms = viewModel.getSms();
                    // read viewModel.phoneNumber
                    viewModelPhoneNumber = viewModel.getPhoneNumber();
                    // read viewModel::onLoginButtonClick
                    viewModelOnLoginButtonClickAndroidViewViewOnClickListener = (((mViewModelOnLoginButtonClickAndroidViewViewOnClickListener == null) ? (mViewModelOnLoginButtonClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelOnLoginButtonClickAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::onRegisterButtonClick
                    viewModelOnRegisterButtonClickAndroidViewViewOnClickListener = (((mViewModelOnRegisterButtonClickAndroidViewViewOnClickListener == null) ? (mViewModelOnRegisterButtonClickAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelOnRegisterButtonClickAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::onLoginButtonVerify
                    viewModelOnLoginButtonVerifyAndroidViewViewOnClickListener = (((mViewModelOnLoginButtonVerifyAndroidViewViewOnClickListener == null) ? (mViewModelOnLoginButtonVerifyAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelOnLoginButtonVerifyAndroidViewViewOnClickListener).setValue(viewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.btLogin.setOnClickListener(viewModelOnLoginButtonClickAndroidViewViewOnClickListener);
            this.btRegister.setOnClickListener(viewModelOnRegisterButtonClickAndroidViewViewOnClickListener);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.loginVerify, viewModelSms);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelPhoneNumber);
            this.mboundView3.setOnClickListener(viewModelOnLoginButtonVerifyAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.loginVerify, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, loginVerifyandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.fish.ui.auth.UserViewModel value;
        public OnClickListenerImpl setValue(com.example.fish.ui.auth.UserViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onLoginButtonClick(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.example.fish.ui.auth.UserViewModel value;
        public OnClickListenerImpl1 setValue(com.example.fish.ui.auth.UserViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onRegisterButtonClick(arg0); 
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private com.example.fish.ui.auth.UserViewModel value;
        public OnClickListenerImpl2 setValue(com.example.fish.ui.auth.UserViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onLoginButtonVerify(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}