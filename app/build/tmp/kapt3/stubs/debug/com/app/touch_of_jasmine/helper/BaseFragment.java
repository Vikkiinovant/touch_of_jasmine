package com.app.touch_of_jasmine.helper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/app/touch_of_jasmine/helper/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "hasInitializedRootView", "", "getHasInitializedRootView", "()Z", "setHasInitializedRootView", "(Z)V", "onRequestPermissionsResult", "Lcom/app/touch_of_jasmine/helper/OnRequestPermissionsResult;", "getOnRequestPermissionsResult", "()Lcom/app/touch_of_jasmine/helper/OnRequestPermissionsResult;", "setOnRequestPermissionsResult", "(Lcom/app/touch_of_jasmine/helper/OnRequestPermissionsResult;)V", "progressDialog", "Landroid/app/Dialog;", "rootView", "Landroid/view/View;", "getPersistentView", "view", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "", "app_debug"})
public class BaseFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private android.app.Dialog progressDialog;
    @org.jetbrains.annotations.Nullable
    private com.app.touch_of_jasmine.helper.OnRequestPermissionsResult onRequestPermissionsResult;
    private boolean hasInitializedRootView = false;
    @org.jetbrains.annotations.Nullable
    private android.view.View rootView;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.app.touch_of_jasmine.helper.OnRequestPermissionsResult getOnRequestPermissionsResult() {
        return null;
    }
    
    public final void setOnRequestPermissionsResult(@org.jetbrains.annotations.Nullable
    com.app.touch_of_jasmine.helper.OnRequestPermissionsResult p0) {
    }
    
    public final boolean getHasInitializedRootView() {
        return false;
    }
    
    public final void setHasInitializedRootView(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.view.View getPersistentView(@org.jetbrains.annotations.Nullable
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onStop() {
    }
}