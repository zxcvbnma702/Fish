package com.example.fish.databinding;
import com.example.fish.R;
import com.example.fish.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPersonBindingImpl extends FragmentPersonBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView, 1);
        sViewsWithIds.put(R.id.linearLayout8, 2);
        sViewsWithIds.put(R.id.avatar, 3);
        sViewsWithIds.put(R.id.settingButton, 4);
        sViewsWithIds.put(R.id.linearLayout4, 5);
        sViewsWithIds.put(R.id.overageMoney, 6);
        sViewsWithIds.put(R.id.person_integral, 7);
        sViewsWithIds.put(R.id.linearLayout9, 8);
        sViewsWithIds.put(R.id.person_posted, 9);
        sViewsWithIds.put(R.id.person_selled, 10);
        sViewsWithIds.put(R.id.person_buyed, 11);
        sViewsWithIds.put(R.id.person_resolded, 12);
        sViewsWithIds.put(R.id.linearLayout10, 13);
        sViewsWithIds.put(R.id.linearLayout7, 14);
        sViewsWithIds.put(R.id.contact_customer_service, 15);
        sViewsWithIds.put(R.id.linearLayout6, 16);
        sViewsWithIds.put(R.id.person_address, 17);
        sViewsWithIds.put(R.id.linearLayout5, 18);
        sViewsWithIds.put(R.id.person_collection, 19);
        sViewsWithIds.put(R.id.linearLayout11, 20);
        sViewsWithIds.put(R.id.ticket_collection_center, 21);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPersonBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private FragmentPersonBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.ImageView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[21]
            );
        this.person.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}