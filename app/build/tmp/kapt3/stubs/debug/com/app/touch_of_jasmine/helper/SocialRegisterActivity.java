package com.app.touch_of_jasmine.helper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0002&\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014JL\u0010\u0019\u001a\u00020\u00122!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u001c\u00a2\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00120\u001b2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110!\u00a2\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00120\u001bJL\u0010#\u001a\u00020\u00122!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u001c\u00a2\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00120\u001b2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110!\u00a2\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00120\u001bJ\b\u0010%\u001a\u00020\u0012H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006("}, d2 = {"Lcom/app/touch_of_jasmine/helper/SocialRegisterActivity;", "Lcom/app/touch_of_jasmine/helper/BaseActivity;", "()V", "callbackManager", "Lcom/facebook/CallbackManager;", "mGoogleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "resultGoogleLoginLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "socialRegisterCallBack", "Lcom/app/touch_of_jasmine/helper/SocialRegisterActivity$SocialRegisterInterface;", "getSocialRegisterCallBack", "()Lcom/app/touch_of_jasmine/helper/SocialRegisterActivity$SocialRegisterInterface;", "setSocialRegisterCallBack", "(Lcom/app/touch_of_jasmine/helper/SocialRegisterActivity$SocialRegisterInterface;)V", "handleSignInResult", "", "completedTask", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFacebookLogin", "OnFacebookSuccess", "Lkotlin/Function1;", "Lcom/app/touch_of_jasmine/helper/SocialRegisterActivity$SocialRegisterData;", "Lkotlin/ParameterName;", "name", "model", "OnError", "", "msg", "onGoogleLogin", "OnGoogleSuccess", "onResume", "SocialRegisterData", "SocialRegisterInterface", "app_debug"})
public class SocialRegisterActivity extends com.app.touch_of_jasmine.helper.BaseActivity {
    @org.jetbrains.annotations.Nullable
    private com.facebook.CallbackManager callbackManager;
    private com.google.android.gms.auth.api.signin.GoogleSignInClient mGoogleSignInClient;
    public com.app.touch_of_jasmine.helper.SocialRegisterActivity.SocialRegisterInterface socialRegisterCallBack;
    @org.jetbrains.annotations.NotNull
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultGoogleLoginLauncher;
    
    public SocialRegisterActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.touch_of_jasmine.helper.SocialRegisterActivity.SocialRegisterInterface getSocialRegisterCallBack() {
        return null;
    }
    
    public final void setSocialRegisterCallBack(@org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.helper.SocialRegisterActivity.SocialRegisterInterface p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void onFacebookLogin(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.app.touch_of_jasmine.helper.SocialRegisterActivity.SocialRegisterData, kotlin.Unit> OnFacebookSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> OnError) {
    }
    
    public final void onGoogleLogin(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.app.touch_of_jasmine.helper.SocialRegisterActivity.SocialRegisterData, kotlin.Unit> OnGoogleSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> OnError) {
    }
    
    private final void handleSignInResult(com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> completedTask) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f\u00a8\u0006!"}, d2 = {"Lcom/app/touch_of_jasmine/helper/SocialRegisterActivity$SocialRegisterData;", "", "strSocialFirstName", "", "strSocialLastName", "strSocialEmail", "strSocialRegisterType", "strSocialImage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStrSocialEmail", "()Ljava/lang/String;", "setStrSocialEmail", "(Ljava/lang/String;)V", "getStrSocialFirstName", "setStrSocialFirstName", "getStrSocialImage", "setStrSocialImage", "getStrSocialLastName", "setStrSocialLastName", "getStrSocialRegisterType", "setStrSocialRegisterType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class SocialRegisterData {
        @org.jetbrains.annotations.Nullable
        private java.lang.String strSocialFirstName;
        @org.jetbrains.annotations.Nullable
        private java.lang.String strSocialLastName;
        @org.jetbrains.annotations.Nullable
        private java.lang.String strSocialEmail;
        @org.jetbrains.annotations.Nullable
        private java.lang.String strSocialRegisterType;
        @org.jetbrains.annotations.Nullable
        private java.lang.String strSocialImage;
        
        public SocialRegisterData(@org.jetbrains.annotations.Nullable
        java.lang.String strSocialFirstName, @org.jetbrains.annotations.Nullable
        java.lang.String strSocialLastName, @org.jetbrains.annotations.Nullable
        java.lang.String strSocialEmail, @org.jetbrains.annotations.Nullable
        java.lang.String strSocialRegisterType, @org.jetbrains.annotations.Nullable
        java.lang.String strSocialImage) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getStrSocialFirstName() {
            return null;
        }
        
        public final void setStrSocialFirstName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getStrSocialLastName() {
            return null;
        }
        
        public final void setStrSocialLastName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getStrSocialEmail() {
            return null;
        }
        
        public final void setStrSocialEmail(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getStrSocialRegisterType() {
            return null;
        }
        
        public final void setStrSocialRegisterType(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getStrSocialImage() {
            return null;
        }
        
        public final void setStrSocialImage(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        public SocialRegisterData() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.app.touch_of_jasmine.helper.SocialRegisterActivity.SocialRegisterData copy(@org.jetbrains.annotations.Nullable
        java.lang.String strSocialFirstName, @org.jetbrains.annotations.Nullable
        java.lang.String strSocialLastName, @org.jetbrains.annotations.Nullable
        java.lang.String strSocialEmail, @org.jetbrains.annotations.Nullable
        java.lang.String strSocialRegisterType, @org.jetbrains.annotations.Nullable
        java.lang.String strSocialImage) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00a8\u0006\r"}, d2 = {"Lcom/app/touch_of_jasmine/helper/SocialRegisterActivity$SocialRegisterInterface;", "", "fbLogin", "", "fbData", "Lcom/app/touch_of_jasmine/helper/SocialRegisterActivity$SocialRegisterData;", "googleLogin", "Data", "mGoogleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "onError", "msg", "", "app_debug"})
    public static abstract interface SocialRegisterInterface {
        
        public abstract void fbLogin(@org.jetbrains.annotations.NotNull
        com.app.touch_of_jasmine.helper.SocialRegisterActivity.SocialRegisterData fbData);
        
        public abstract void googleLogin(@org.jetbrains.annotations.NotNull
        com.app.touch_of_jasmine.helper.SocialRegisterActivity.SocialRegisterData Data);
        
        public abstract void onError(@org.jetbrains.annotations.NotNull
        java.lang.String msg);
        
        public abstract void googleLogin(@org.jetbrains.annotations.NotNull
        com.google.android.gms.auth.api.signin.GoogleSignInClient mGoogleSignInClient);
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
        public static final class DefaultImpls {
            
            public static void fbLogin(@org.jetbrains.annotations.NotNull
            com.app.touch_of_jasmine.helper.SocialRegisterActivity.SocialRegisterInterface $this, @org.jetbrains.annotations.NotNull
            com.app.touch_of_jasmine.helper.SocialRegisterActivity.SocialRegisterData fbData) {
            }
            
            public static void googleLogin(@org.jetbrains.annotations.NotNull
            com.app.touch_of_jasmine.helper.SocialRegisterActivity.SocialRegisterInterface $this, @org.jetbrains.annotations.NotNull
            com.app.touch_of_jasmine.helper.SocialRegisterActivity.SocialRegisterData Data) {
            }
            
            public static void onError(@org.jetbrains.annotations.NotNull
            com.app.touch_of_jasmine.helper.SocialRegisterActivity.SocialRegisterInterface $this, @org.jetbrains.annotations.NotNull
            java.lang.String msg) {
            }
            
            public static void googleLogin(@org.jetbrains.annotations.NotNull
            com.app.touch_of_jasmine.helper.SocialRegisterActivity.SocialRegisterInterface $this, @org.jetbrains.annotations.NotNull
            com.google.android.gms.auth.api.signin.GoogleSignInClient mGoogleSignInClient) {
            }
        }
    }
}