package com.app.touch_of_jasmine.databinding;
import com.app.touch_of_jasmine.R;
import com.app.touch_of_jasmine.BR;
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
        sViewsWithIds.put(R.id.scrollView, 3);
        sViewsWithIds.put(R.id.txtLoginHeader, 4);
        sViewsWithIds.put(R.id.ivPasswordEye, 5);
        sViewsWithIds.put(R.id.linRememberMe, 6);
        sViewsWithIds.put(R.id.ivRememberMeCheck, 7);
        sViewsWithIds.put(R.id.txtRememberMe, 8);
        sViewsWithIds.put(R.id.btnLogin, 9);
        sViewsWithIds.put(R.id.conContinueWith, 10);
        sViewsWithIds.put(R.id.viewLeft, 11);
        sViewsWithIds.put(R.id.txtContinueWith, 12);
        sViewsWithIds.put(R.id.viewRight, 13);
        sViewsWithIds.put(R.id.linSocials, 14);
        sViewsWithIds.put(R.id.conFbLogin, 15);
        sViewsWithIds.put(R.id.ivFacebook, 16);
        sViewsWithIds.put(R.id.btnFb, 17);
        sViewsWithIds.put(R.id.conGoogle, 18);
        sViewsWithIds.put(R.id.ivGoogle, 19);
        sViewsWithIds.put(R.id.linCreateNew, 20);
        sViewsWithIds.put(R.id.txtDontHaveAccount, 21);
        sViewsWithIds.put(R.id.txtCreateNew, 22);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.objLogin.strEmail
            //         is viewModel.objLogin.setStrEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtEmail);
            // localize variables for thread safety
            // viewModel.objLogin != null
            boolean viewModelObjLoginJavaLangObjectNull = false;
            // viewModel.objLogin
            com.app.touch_of_jasmine.mvvm.login.view_model.LoginObj viewModelObjLogin = null;
            // viewModel.objLogin.strEmail
            java.lang.String viewModelObjLoginStrEmail = null;
            // viewModel
            com.app.touch_of_jasmine.mvvm.login.view_model.LoginViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObjLogin = viewModel.getObjLogin();

                viewModelObjLoginJavaLangObjectNull = (viewModelObjLogin) != (null);
                if (viewModelObjLoginJavaLangObjectNull) {




                    viewModelObjLogin.setStrEmail(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edtPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.objLogin.strPassword
            //         is viewModel.objLogin.setStrPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtPassword);
            // localize variables for thread safety
            // viewModel.objLogin.strPassword
            java.lang.String viewModelObjLoginStrPassword = null;
            // viewModel.objLogin != null
            boolean viewModelObjLoginJavaLangObjectNull = false;
            // viewModel.objLogin
            com.app.touch_of_jasmine.mvvm.login.view_model.LoginObj viewModelObjLogin = null;
            // viewModel
            com.app.touch_of_jasmine.mvvm.login.view_model.LoginViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObjLogin = viewModel.getObjLogin();

                viewModelObjLoginJavaLangObjectNull = (viewModelObjLogin) != (null);
                if (viewModelObjLoginJavaLangObjectNull) {




                    viewModelObjLogin.setStrPassword(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.facebook.login.widget.LoginButton) bindings[17]
            , (android.widget.TextView) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageButton) bindings[7]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.ScrollView) bindings[3]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[13]
            );
        this.edtEmail.setTag(null);
        this.edtPassword.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
            setViewModel((com.app.touch_of_jasmine.mvvm.login.view_model.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.app.touch_of_jasmine.mvvm.login.view_model.LoginViewModel ViewModel) {
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
        java.lang.String viewModelObjLoginStrPassword = null;
        java.lang.String viewModelObjLoginStrEmail = null;
        com.app.touch_of_jasmine.mvvm.login.view_model.LoginObj viewModelObjLogin = null;
        com.app.touch_of_jasmine.mvvm.login.view_model.LoginViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.objLogin
                    viewModelObjLogin = viewModel.getObjLogin();
                }


                if (viewModelObjLogin != null) {
                    // read viewModel.objLogin.strPassword
                    viewModelObjLoginStrPassword = viewModelObjLogin.getStrPassword();
                    // read viewModel.objLogin.strEmail
                    viewModelObjLoginStrEmail = viewModelObjLogin.getStrEmail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtEmail, viewModelObjLoginStrEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtPassword, viewModelObjLoginStrPassword);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtEmailandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtPasswordandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}