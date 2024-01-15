package com.app.touch_of_jasmine.helper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\n\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000eJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eJ\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u001b\u0010!\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0019\u0010#\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020$H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/app/touch_of_jasmine/helper/DataStoreManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "instance", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "clearDataStore", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearRememberDataStore", "getAppConfig", "Lkotlinx/coroutines/flow/Flow;", "Lcom/app/touch_of_jasmine/helper/helper_model/AppConfigModel;", "getDeeplinkModel", "Lcom/app/touch_of_jasmine/helper/helper_model/DeepLinkModel;", "getStore", "Lcom/app/touch_of_jasmine/helper/helper_model/StoreDataModel;", "getUserData", "Lcom/app/touch_of_jasmine/helper/helper_model/UserResponseModel;", "getUserRememberData", "Lcom/app/touch_of_jasmine/helper/helper_model/UserRememberModel;", "saveAppConfig", "", "responseModel", "(Lcom/app/touch_of_jasmine/helper/helper_model/AppConfigModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveDeeplinkModel", "(Lcom/app/touch_of_jasmine/helper/helper_model/DeepLinkModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveStore", "storeDataModel", "(Lcom/app/touch_of_jasmine/helper/helper_model/StoreDataModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUserData", "(Lcom/app/touch_of_jasmine/helper/helper_model/UserResponseModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUserRememberData", "Lcom/app/touch_of_jasmine/helper/helper_model/UserRememberDataModel;", "(Lcom/app/touch_of_jasmine/helper/helper_model/UserRememberDataModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PreferencesKeys", "app_debug"})
public final class DataStoreManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> instance = null;
    
    public DataStoreManager(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveDeeplinkModel(@org.jetbrains.annotations.Nullable
    com.app.touch_of_jasmine.helper.helper_model.DeepLinkModel responseModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getDeeplinkModel(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.app.touch_of_jasmine.helper.helper_model.DeepLinkModel>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveAppConfig(@org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.helper.helper_model.AppConfigModel responseModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAppConfig(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.app.touch_of_jasmine.helper.helper_model.AppConfigModel>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveUserData(@org.jetbrains.annotations.Nullable
    com.app.touch_of_jasmine.helper.helper_model.UserResponseModel responseModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveUserRememberData(@org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.helper.helper_model.UserRememberDataModel responseModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveStore(@org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.helper.helper_model.StoreDataModel storeDataModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getStore(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.app.touch_of_jasmine.helper.helper_model.StoreDataModel>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.app.touch_of_jasmine.helper.helper_model.UserResponseModel> getUserData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.app.touch_of_jasmine.helper.helper_model.UserRememberModel> getUserRememberData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clearDataStore(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clearRememberDataStore(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/app/touch_of_jasmine/helper/DataStoreManager$PreferencesKeys;", "", "()V", "APP", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getAPP", "()Landroidx/datastore/preferences/core/Preferences$Key;", "STORE", "getSTORE", "USER_DEEPLINK_DATA", "getUSER_DEEPLINK_DATA", "USER_REMEMBER_DATA", "getUSER_REMEMBER_DATA", "USER_RESPONSE_DATA", "getUSER_RESPONSE_DATA", "app_debug"})
    static final class PreferencesKeys {
        @org.jetbrains.annotations.NotNull
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> USER_RESPONSE_DATA = null;
        @org.jetbrains.annotations.NotNull
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> USER_REMEMBER_DATA = null;
        @org.jetbrains.annotations.NotNull
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> USER_DEEPLINK_DATA = null;
        @org.jetbrains.annotations.NotNull
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> STORE = null;
        @org.jetbrains.annotations.NotNull
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> APP = null;
        @org.jetbrains.annotations.NotNull
        public static final com.app.touch_of_jasmine.helper.DataStoreManager.PreferencesKeys INSTANCE = null;
        
        private PreferencesKeys() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getUSER_RESPONSE_DATA() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getUSER_REMEMBER_DATA() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getUSER_DEEPLINK_DATA() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getSTORE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getAPP() {
            return null;
        }
    }
}