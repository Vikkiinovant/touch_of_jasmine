package com.app.touch_of_jasmine.helper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JM\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\fJ\u001e\u0010\u0010\u001a\u00020\u0004*\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\n\u0010\u0015\u001a\u00020\u0004*\u00020\u0005J_\u0010\u0016\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\fH\u0002Jc\u0010\u001b\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fJ0\u0010\u001c\u001a\u00020\u0004*\u00020\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002\u00a8\u0006\u001f"}, d2 = {"Lcom/app/touch_of_jasmine/helper/ShareDetails;", "", "()V", "downloadFile", "", "Landroid/content/Context;", "fileUrl", "", "strTitle", "strDesc", "branchIoLink", "loading", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "initSaveDeepLink", "referringParams", "Lorg/json/JSONObject;", "error", "Lio/branch/referral/BranchError;", "performDeepLinkNavigation", "setBranchIo", "setTarget", "strImage", "strID", "strSecondaryId", "shareDetails", "shareIntent", "result", "Landroid/net/Uri;", "app_debug"})
public final class ShareDetails {
    @org.jetbrains.annotations.NotNull
    public static final com.app.touch_of_jasmine.helper.ShareDetails INSTANCE = null;
    
    private ShareDetails() {
        super();
    }
    
    /**
     * @see [performDeepLinkNavigation] function to navigate deeplink use this function from where you want to perform navigation
     * @author this function will navigate to respective target destination as per defined in when block
     */
    public final void performDeepLinkNavigation(@org.jetbrains.annotations.NotNull
    android.content.Context $this$performDeepLinkNavigation) {
    }
    
    /**
     * @param referringParams in this jsonObject will come all the deeplink parameters
     * @see [performDeepLinkNavigation] function to navigate deeplink use this function from where you want to perform navigation
     * @author this function will save triggered deeplink in App preference
     */
    public final void initSaveDeepLink(@org.jetbrains.annotations.NotNull
    android.content.Context $this$initSaveDeepLink, @org.jetbrains.annotations.Nullable
    org.json.JSONObject referringParams, @org.jetbrains.annotations.Nullable
    io.branch.referral.BranchError error) {
    }
    
    public final void shareDetails(@org.jetbrains.annotations.NotNull
    android.content.Context $this$shareDetails, @org.jetbrains.annotations.NotNull
    java.lang.String setTarget, @org.jetbrains.annotations.NotNull
    java.lang.String strTitle, @org.jetbrains.annotations.NotNull
    java.lang.String strDesc, @org.jetbrains.annotations.NotNull
    java.lang.String strImage, @org.jetbrains.annotations.NotNull
    java.lang.String strID, @org.jetbrains.annotations.NotNull
    java.lang.String strSecondaryId, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> loading) {
    }
    
    private final void setBranchIo(android.content.Context $this$setBranchIo, java.lang.String setTarget, java.lang.String strTitle, java.lang.String strDesc, java.lang.String strImage, java.lang.String strID, java.lang.String strSecondaryId, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> loading) {
    }
    
    public final void downloadFile(@org.jetbrains.annotations.NotNull
    android.content.Context $this$downloadFile, @org.jetbrains.annotations.NotNull
    java.lang.String fileUrl, @org.jetbrains.annotations.NotNull
    java.lang.String strTitle, @org.jetbrains.annotations.NotNull
    java.lang.String strDesc, @org.jetbrains.annotations.NotNull
    java.lang.String branchIoLink, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> loading) {
    }
    
    private final void shareIntent(android.content.Context $this$shareIntent, android.net.Uri result, java.lang.String strTitle, java.lang.String strDesc, java.lang.String branchIoLink) {
    }
}