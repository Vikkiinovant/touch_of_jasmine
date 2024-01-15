package com.app.touch_of_jasmine.helper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0006\u0010\r\u001a\u00020\nJ\u0014\u0010\u000e\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010J\u0014\u0010\u0012\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0015J+\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016\u00a2\u0006\u0002\u0010\u001dJB\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u001a2\b\b\u0002\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\"\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&J\u0010\u0010\'\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\u001aR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/app/touch_of_jasmine/helper/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "layoutToolbarBinding", "Lcom/app/touch_of_jasmine/databinding/LayoutToolbarBinding;", "onRequestPermissionsResult", "Lcom/app/touch_of_jasmine/helper/OnRequestPermissionsResult;", "progressDialog", "Landroid/app/Dialog;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "hideProgressDialog", "ifCameraIsEnabled", "block", "Lkotlin/Function0;", "ifGalleryIsEnabled", "ifStoragePermissionIsEnabled", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "setUpToolbar", "binding", "title", "iconOne", "iconTwo", "isBackArrow", "", "toolbarClickListener", "Lcom/app/touch_of_jasmine/helper/interfaces/CommonInterfaceClickEvent;", "showProgressDialog", "type", "app_debug"})
public class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable
    private android.app.Dialog progressDialog;
    @org.jetbrains.annotations.Nullable
    private com.app.touch_of_jasmine.helper.OnRequestPermissionsResult onRequestPermissionsResult;
    @org.jetbrains.annotations.Nullable
    private com.app.touch_of_jasmine.databinding.LayoutToolbarBinding layoutToolbarBinding;
    
    public BaseActivity() {
        super();
    }
    
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"SourceLockedOrientationActivity"})
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull
    android.content.Context newBase) {
    }
    
    public final void showProgressDialog(@org.jetbrains.annotations.NotNull
    java.lang.String type) {
    }
    
    public final void hideProgressDialog() {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    public final void ifCameraIsEnabled(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public final void ifGalleryIsEnabled(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public final void ifStoragePermissionIsEnabled(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public final void setUpToolbar(@org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.databinding.LayoutToolbarBinding binding, @org.jetbrains.annotations.NotNull
    java.lang.String title, int iconOne, int iconTwo, boolean isBackArrow, @org.jetbrains.annotations.Nullable
    com.app.touch_of_jasmine.helper.interfaces.CommonInterfaceClickEvent toolbarClickListener) {
    }
}