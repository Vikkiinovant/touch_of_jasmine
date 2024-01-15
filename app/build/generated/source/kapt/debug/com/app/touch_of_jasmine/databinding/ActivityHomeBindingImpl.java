package com.app.touch_of_jasmine.databinding;
import com.app.touch_of_jasmine.R;
import com.app.touch_of_jasmine.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHomeBindingImpl extends ActivityHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(1, 
            new String[] {"layout_toolbar"},
            new int[] {3},
            new int[] {com.app.touch_of_jasmine.R.layout.layout_toolbar});
        sIncludes.setIncludes(2, 
            new String[] {"nav_header_layout"},
            new int[] {4},
            new int[] {com.app.touch_of_jasmine.R.layout.nav_header_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bottomNavigationView, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.bottomnavigation.BottomNavigationView) bindings[5]
            , (com.app.touch_of_jasmine.databinding.NavHeaderLayoutBinding) bindings[4]
            , (com.app.touch_of_jasmine.databinding.LayoutToolbarBinding) bindings[3]
            , (com.google.android.material.navigation.NavigationView) bindings[2]
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[0]
            );
        setContainedBinding(this.headerLayout);
        setContainedBinding(this.layoutToolbar);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.navigationView.setTag(null);
        this.rootLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        layoutToolbar.invalidateAll();
        headerLayout.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (layoutToolbar.hasPendingBindings()) {
            return true;
        }
        if (headerLayout.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        layoutToolbar.setLifecycleOwner(lifecycleOwner);
        headerLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHeaderLayout((com.app.touch_of_jasmine.databinding.NavHeaderLayoutBinding) object, fieldId);
            case 1 :
                return onChangeLayoutToolbar((com.app.touch_of_jasmine.databinding.LayoutToolbarBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHeaderLayout(com.app.touch_of_jasmine.databinding.NavHeaderLayoutBinding HeaderLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutToolbar(com.app.touch_of_jasmine.databinding.LayoutToolbarBinding LayoutToolbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        executeBindingsOn(layoutToolbar);
        executeBindingsOn(headerLayout);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): headerLayout
        flag 1 (0x2L): layoutToolbar
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}