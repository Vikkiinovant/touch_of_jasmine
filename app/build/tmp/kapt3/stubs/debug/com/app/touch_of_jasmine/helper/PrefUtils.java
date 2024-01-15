package com.app.touch_of_jasmine.helper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0005J\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u0005J\n\u0010\b\u001a\u00020\t*\u00020\u0005J\n\u0010\n\u001a\u00020\u000b*\u00020\u0005J\n\u0010\f\u001a\u00020\u000b*\u00020\u0005J\f\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u0005J\n\u0010\u000e\u001a\u00020\u000b*\u00020\u0005J\n\u0010\u000f\u001a\u00020\u000b*\u00020\u0005J\f\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0005J\n\u0010\u0012\u001a\u00020\u000b*\u00020\u0005J\n\u0010\u0013\u001a\u00020\u000b*\u00020\u0005J\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u0005J\n\u0010\u0016\u001a\u00020\u000b*\u00020\u0005J\n\u0010\u0017\u001a\u00020\u000b*\u00020\u0005J\n\u0010\u0018\u001a\u00020\u0019*\u00020\u0005J\n\u0010\u001a\u001a\u00020\u001b*\u00020\u0005J\n\u0010\u001c\u001a\u00020\u001b*\u00020\u0005J\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007J\u0012\u0010 \u001a\u00020\u001e*\u00020\u00052\u0006\u0010!\u001a\u00020\u000bJ\u0012\u0010\"\u001a\u00020\u001e*\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0004J\u0012\u0010#\u001a\u00020\u001e*\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0011J\u0014\u0010$\u001a\u00020\u001e*\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015J\u0012\u0010%\u001a\u00020\u001e*\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0019J\u0012\u0010&\u001a\u00020\u001e*\u00020\u00052\u0006\u0010\'\u001a\u00020\u000b\u00a8\u0006("}, d2 = {"Lcom/app/touch_of_jasmine/helper/PrefUtils;", "", "()V", "getAppConfig", "Lcom/app/touch_of_jasmine/helper/helper_model/AppConfigModel;", "Landroid/content/Context;", "getDeepLink", "Lcom/app/touch_of_jasmine/helper/helper_model/DeepLinkModel;", "getDeviceModel", "Lcom/app/touch_of_jasmine/helper/helper_model/Device;", "getLoggedInEmail", "", "getLoggedInMobileNo", "getOrderId", "getPrefCurrencyAR", "getPrefCurrencyEN", "getPrefStoreData", "Lcom/app/touch_of_jasmine/helper/helper_model/StoreDataModel;", "getStore", "getStoreFlag", "getUserDataResponse", "Lcom/app/touch_of_jasmine/helper/helper_model/UserResponseModel;", "getUserId", "getUserName", "getUserRememberData", "Lcom/app/touch_of_jasmine/helper/helper_model/UserRememberDataModel;", "isEnglishLanguage", "", "isUserLoggedIn", "saveDeepLink", "", "result", "saveOrderId", "orderId", "setAppConfig", "setPrefStoreData", "setUserDataResponse", "setUserRememberData", "updateBadgeCount", "count", "app_debug"})
public final class PrefUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.app.touch_of_jasmine.helper.PrefUtils INSTANCE = null;
    
    private PrefUtils() {
        super();
    }
    
    /**
     * -----------------------      USER DATA ----------------------------------
     */
    public final void setUserDataResponse(@org.jetbrains.annotations.NotNull
    android.content.Context $this$setUserDataResponse, @org.jetbrains.annotations.Nullable
    com.app.touch_of_jasmine.helper.helper_model.UserResponseModel result) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.app.touch_of_jasmine.helper.helper_model.UserResponseModel getUserDataResponse(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getUserDataResponse) {
        return null;
    }
    
    /**
     * -----------------------      USER REMEMBER DATA ----------------------------------
     */
    public final void setUserRememberData(@org.jetbrains.annotations.NotNull
    android.content.Context $this$setUserRememberData, @org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.helper.helper_model.UserRememberDataModel result) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.touch_of_jasmine.helper.helper_model.UserRememberDataModel getUserRememberData(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getUserRememberData) {
        return null;
    }
    
    public final void saveDeepLink(@org.jetbrains.annotations.NotNull
    android.content.Context $this$saveDeepLink, @org.jetbrains.annotations.Nullable
    com.app.touch_of_jasmine.helper.helper_model.DeepLinkModel result) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.app.touch_of_jasmine.helper.helper_model.DeepLinkModel getDeepLink(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getDeepLink) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOrderId(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getOrderId) {
        return null;
    }
    
    public final void saveOrderId(@org.jetbrains.annotations.NotNull
    android.content.Context $this$saveOrderId, @org.jetbrains.annotations.NotNull
    java.lang.String orderId) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserId(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getUserId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserName(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getUserName) {
        return null;
    }
    
    public final boolean isUserLoggedIn(@org.jetbrains.annotations.NotNull
    android.content.Context $this$isUserLoggedIn) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.touch_of_jasmine.helper.helper_model.Device getDeviceModel(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getDeviceModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLoggedInEmail(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getLoggedInEmail) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLoggedInMobileNo(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getLoggedInMobileNo) {
        return null;
    }
    
    /**
     * -----------------------      STORE         ----------------------------------
     */
    public final void setPrefStoreData(@org.jetbrains.annotations.NotNull
    android.content.Context $this$setPrefStoreData, @org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.helper.helper_model.StoreDataModel result) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.app.touch_of_jasmine.helper.helper_model.StoreDataModel getPrefStoreData(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getPrefStoreData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStore(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getStore) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStoreFlag(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getStoreFlag) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPrefCurrencyEN(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getPrefCurrencyEN) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPrefCurrencyAR(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getPrefCurrencyAR) {
        return null;
    }
    
    /**
     * -----------------------      APP CONFIG         ----------------------------------
     */
    public final void setAppConfig(@org.jetbrains.annotations.NotNull
    android.content.Context $this$setAppConfig, @org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.helper.helper_model.AppConfigModel result) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.app.touch_of_jasmine.helper.helper_model.AppConfigModel getAppConfig(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getAppConfig) {
        return null;
    }
    
    public final boolean isEnglishLanguage(@org.jetbrains.annotations.NotNull
    android.content.Context $this$isEnglishLanguage) {
        return false;
    }
    
    public final void updateBadgeCount(@org.jetbrains.annotations.NotNull
    android.content.Context $this$updateBadgeCount, @org.jetbrains.annotations.NotNull
    java.lang.String count) {
    }
}