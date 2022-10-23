package com.example.fish.databinding;
import com.example.fish.R;
import com.example.fish.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMessageBindingImpl extends FragmentMessageBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.message_text_info, 1);
        sViewsWithIds.put(R.id.message_searchView, 2);
        sViewsWithIds.put(R.id.message_line_bell, 3);
        sViewsWithIds.put(R.id.message_bell, 4);
        sViewsWithIds.put(R.id.message_text_thumb_up_up, 5);
        sViewsWithIds.put(R.id.message_text_thumb_up_down, 6);
        sViewsWithIds.put(R.id.message_line_thumb_up, 7);
        sViewsWithIds.put(R.id.message_thumb_up, 8);
        sViewsWithIds.put(R.id.message_text__bell_up, 9);
        sViewsWithIds.put(R.id.message_text__bell_down, 10);
        sViewsWithIds.put(R.id.message_line_offer, 11);
        sViewsWithIds.put(R.id.message_offer, 12);
        sViewsWithIds.put(R.id.message_text__offer_up, 13);
        sViewsWithIds.put(R.id.message_text_offer_down, 14);
        sViewsWithIds.put(R.id.message_line_identity, 15);
        sViewsWithIds.put(R.id.message_identity, 16);
        sViewsWithIds.put(R.id.message_text_identity_up, 17);
        sViewsWithIds.put(R.id.message_text_identity_down, 18);
        sViewsWithIds.put(R.id.message_line_smile, 19);
        sViewsWithIds.put(R.id.message_smlie, 20);
        sViewsWithIds.put(R.id.message_text_smile_up, 21);
        sViewsWithIds.put(R.id.message_text_smile_down, 22);
        sViewsWithIds.put(R.id.message_line_anchor, 23);
        sViewsWithIds.put(R.id.message_anchor, 24);
        sViewsWithIds.put(R.id.message_text_anchor_up, 25);
        sViewsWithIds.put(R.id.message_text_anchor_down, 26);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMessageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private FragmentMessageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[16]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[23]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[3]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[15]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[11]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[19]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[7]
            , (android.widget.ImageView) bindings[12]
            , (androidx.appcompat.widget.SearchView) bindings[2]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[8]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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