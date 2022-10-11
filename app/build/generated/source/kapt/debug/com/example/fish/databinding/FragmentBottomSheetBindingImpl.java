package com.example.fish.databinding;
import com.example.fish.R;
import com.example.fish.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBottomSheetBindingImpl extends FragmentBottomSheetBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.design_bottom_sheet, 7);
        sViewsWithIds.put(R.id.relativeLayout, 8);
        sViewsWithIds.put(R.id.append_cancel, 9);
        sViewsWithIds.put(R.id.append_test, 10);
        sViewsWithIds.put(R.id.linearLayout, 11);
        sViewsWithIds.put(R.id.linearLayout2, 12);
        sViewsWithIds.put(R.id.append_pictures, 13);
        sViewsWithIds.put(R.id.append_picture_button, 14);
        sViewsWithIds.put(R.id.append_address, 15);
        sViewsWithIds.put(R.id.linearLayout3, 16);
        sViewsWithIds.put(R.id.append_type_button, 17);
        sViewsWithIds.put(R.id.append_type_exhibit, 18);
        sViewsWithIds.put(R.id.append_recycler, 19);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.EditText mboundView6;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewModelSaveAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelSendAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener appendAddAddressandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.address
            //         is viewModel.setAddress((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(appendAddAddress);
            // localize variables for thread safety
            // viewModel.address
            java.lang.String viewModelAddress = null;
            // viewModel
            com.example.fish.ui.append.AppendViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setAddress(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener appendContentandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.content
            //         is viewModel.setContent((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(appendContent);
            // localize variables for thread safety
            // viewModel.content
            java.lang.String viewModelContent = null;
            // viewModel
            com.example.fish.ui.append.AppendViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setContent(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener appendContentTitleandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.title
            //         is viewModel.setTitle((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(appendContentTitle);
            // localize variables for thread safety
            // viewModel
            com.example.fish.ui.append.AppendViewModel viewModel = mViewModel;
            // viewModel.title
            java.lang.String viewModelTitle = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setTitle(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.price
            //         is viewModel.setPrice((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewModel
            com.example.fish.ui.append.AppendViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.price
            java.lang.String viewModelPrice = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setPrice(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentBottomSheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentBottomSheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[5]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[9]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[3]
            , (android.widget.ImageView) bindings[14]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[19]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[10]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.TextView) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.RelativeLayout) bindings[8]
            );
        this.appendAddAddress.setTag(null);
        this.appendContent.setTag(null);
        this.appendContentTitle.setTag(null);
        this.appendSaveTemp.setTag(null);
        this.appendSend.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView6 = (android.widget.EditText) bindings[6];
        this.mboundView6.setTag(null);
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
            setViewModel((com.example.fish.ui.append.AppendViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.fish.ui.append.AppendViewModel ViewModel) {
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
        android.view.View.OnClickListener viewModelSaveAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelSendAndroidViewViewOnClickListener = null;
        java.lang.String viewModelPrice = null;
        java.lang.String viewModelContent = null;
        java.lang.String viewModelTitle = null;
        java.lang.String viewModelAddress = null;
        com.example.fish.ui.append.AppendViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::save
                    viewModelSaveAndroidViewViewOnClickListener = (((mViewModelSaveAndroidViewViewOnClickListener == null) ? (mViewModelSaveAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelSaveAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::send
                    viewModelSendAndroidViewViewOnClickListener = (((mViewModelSendAndroidViewViewOnClickListener == null) ? (mViewModelSendAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelSendAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel.price
                    viewModelPrice = viewModel.getPrice();
                    // read viewModel.content
                    viewModelContent = viewModel.getContent();
                    // read viewModel.title
                    viewModelTitle = viewModel.getTitle();
                    // read viewModel.address
                    viewModelAddress = viewModel.getAddress();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appendAddAddress, viewModelAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appendContent, viewModelContent);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appendContentTitle, viewModelTitle);
            this.appendSaveTemp.setOnClickListener(viewModelSaveAndroidViewViewOnClickListener);
            this.appendSend.setOnClickListener(viewModelSendAndroidViewViewOnClickListener);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelPrice);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.appendAddAddress, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, appendAddAddressandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.appendContent, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, appendContentandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.appendContentTitle, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, appendContentTitleandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.fish.ui.append.AppendViewModel value;
        public OnClickListenerImpl setValue(com.example.fish.ui.append.AppendViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.save(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.example.fish.ui.append.AppendViewModel value;
        public OnClickListenerImpl1 setValue(com.example.fish.ui.append.AppendViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.send(arg0); 
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