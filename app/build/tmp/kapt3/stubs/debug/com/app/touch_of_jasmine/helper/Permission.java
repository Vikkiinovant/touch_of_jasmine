package com.app.touch_of_jasmine.helper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fJ\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fJ\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fJ\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fJ\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fJ\u0018\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020!J\u0014\u0010\"\u001a\u00020\r*\u00020#2\u0006\u0010$\u001a\u00020!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/app/touch_of_jasmine/helper/Permission;", "", "()V", "AUDIO_REQUEST_CODE", "", "BLUETOOTH_CONNECT_REQUEST_CODE", "CAMERA_AUDIO_REQUEST_CODE", "CAMERA_REQUEST_CODE", "GALLERY_REQUEST_CODE", "LOCATION_REQUEST_CODE", "NOTIFICATION_REQUEST_CODE", "STORAGE_REQUEST_CODE", "isAudioCanAccess", "", "activity", "Landroid/app/Activity;", "isBluetoothConnectCanAccess", "isCameraCanAccess", "isGalleryCanAccess", "isLocationCanAccess", "isNotificationCanAccess", "isStorageCanAccess", "requestBluetoothConnectPermission", "", "mActivity", "requestCameraAudioPermission", "requestCameraPermission", "requestGalleryPermission", "requestLocationPermission", "requestStoragePermission", "showAlertToEnablePermission", "context", "strTitle", "", "isPermissionGranted", "Landroid/content/Context;", "permission", "app_debug"})
public final class Permission {
    public static final int CAMERA_REQUEST_CODE = 2;
    public static final int GALLERY_REQUEST_CODE = 1;
    public static final int AUDIO_REQUEST_CODE = 3;
    public static final int CAMERA_AUDIO_REQUEST_CODE = 4;
    public static final int BLUETOOTH_CONNECT_REQUEST_CODE = 5;
    public static final int LOCATION_REQUEST_CODE = 101;
    public static final int STORAGE_REQUEST_CODE = 102;
    public static final int NOTIFICATION_REQUEST_CODE = 103;
    @org.jetbrains.annotations.NotNull
    public static final com.app.touch_of_jasmine.helper.Permission INSTANCE = null;
    
    private Permission() {
        super();
    }
    
    public final boolean isNotificationCanAccess(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
        return false;
    }
    
    public final boolean isCameraCanAccess(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
        return false;
    }
    
    public final boolean isAudioCanAccess(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
        return false;
    }
    
    public final boolean isGalleryCanAccess(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
        return false;
    }
    
    public final boolean isBluetoothConnectCanAccess(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
        return false;
    }
    
    public final boolean isStorageCanAccess(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
        return false;
    }
    
    public final boolean isLocationCanAccess(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
        return false;
    }
    
    public final void requestGalleryPermission(@org.jetbrains.annotations.NotNull
    android.app.Activity mActivity) {
    }
    
    public final void requestStoragePermission(@org.jetbrains.annotations.NotNull
    android.app.Activity mActivity) {
    }
    
    public final void requestCameraPermission(@org.jetbrains.annotations.NotNull
    android.app.Activity mActivity) {
    }
    
    public final void requestCameraAudioPermission(@org.jetbrains.annotations.NotNull
    android.app.Activity mActivity) {
    }
    
    public final void requestBluetoothConnectPermission(@org.jetbrains.annotations.NotNull
    android.app.Activity mActivity) {
    }
    
    public final void requestLocationPermission(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    public final void showAlertToEnablePermission(@org.jetbrains.annotations.NotNull
    android.app.Activity context, @org.jetbrains.annotations.NotNull
    java.lang.String strTitle) {
    }
    
    private final boolean isPermissionGranted(android.content.Context $this$isPermissionGranted, java.lang.String permission) {
        return false;
    }
}