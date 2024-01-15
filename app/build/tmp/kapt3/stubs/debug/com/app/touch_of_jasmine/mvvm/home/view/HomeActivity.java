package com.app.touch_of_jasmine.mvvm.home.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\u0006\u0010\u001c\u001a\u00020\u0017J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\u0012\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u0017H\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\b\u0010(\u001a\u00020\u0017H\u0014J\b\u0010)\u001a\u00020\u0017H\u0014J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006-"}, d2 = {"Lcom/app/touch_of_jasmine/mvvm/home/view/HomeActivity;", "Lcom/app/touch_of_jasmine/helper/BaseActivity;", "()V", "binding", "Lcom/app/touch_of_jasmine/databinding/ActivityHomeBinding;", "getBinding", "()Lcom/app/touch_of_jasmine/databinding/ActivityHomeBinding;", "setBinding", "(Lcom/app/touch_of_jasmine/databinding/ActivityHomeBinding;)V", "currentMenuItemId", "", "Ljava/lang/Integer;", "headerLayout", "Lcom/app/touch_of_jasmine/databinding/NavHeaderLayoutBinding;", "isBackPressed", "", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "navController$delegate", "Lkotlin/Lazy;", "getIntentData", "", "initBottomTabs", "initLeftNavMenuDrawer", "initializeFields", "initializeToolbar", "onBackPressedCallback", "onBottomNavigationItemClickListener", "onClickListeners", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLeftNavMenuDrawerClickListener", "onNavigateUp", "", "onNewIntent", "intent", "Landroid/content/Intent;", "onResume", "onStart", "toolbarInit", "title", "", "app_debug"})
public final class HomeActivity extends com.app.touch_of_jasmine.helper.BaseActivity {
    public com.app.touch_of_jasmine.databinding.ActivityHomeBinding binding;
    private com.app.touch_of_jasmine.databinding.NavHeaderLayoutBinding headerLayout;
    private long isBackPressed = 0L;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer currentMenuItemId = 0;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy navController$delegate = null;
    
    public HomeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.touch_of_jasmine.databinding.ActivityHomeBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.databinding.ActivityHomeBinding p0) {
    }
    
    private final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    @java.lang.Override
    protected void onNewIntent(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initLeftNavMenuDrawer() {
    }
    
    private final void onLeftNavMenuDrawerClickListener() {
    }
    
    private final void initBottomTabs() {
    }
    
    @java.lang.Override
    public boolean onNavigateUp() {
        return false;
    }
    
    private final void onClickListeners() {
    }
    
    private final void initializeToolbar() {
    }
    
    private final void initializeFields() {
    }
    
    private final void getIntentData() {
    }
    
    public final void onBackPressedCallback() {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    private final void toolbarInit(java.lang.String title) {
    }
    
    private final void onBottomNavigationItemClickListener() {
    }
}