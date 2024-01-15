package com.app.touch_of_jasmine.helper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002Jk\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\r\u00a2\u0006\u0002\u0010 J \u0010!\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006%"}, d2 = {"Lcom/app/touch_of_jasmine/helper/Dialogs;", "", "()V", "bottomSheetContinueShopping", "Landroid/app/Dialog;", "getBottomSheetContinueShopping", "()Landroid/app/Dialog;", "setBottomSheetContinueShopping", "(Landroid/app/Dialog;)V", "customDialog", "getCustomDialog", "setCustomDialog", "dialogInterface", "Lcom/app/touch_of_jasmine/helper/interfaces/AlertDialogInterface;", "getDialogInterface", "()Lcom/app/touch_of_jasmine/helper/interfaces/AlertDialogInterface;", "showCustomAlert", "", "activity", "Landroid/content/Context;", "title", "", "msg", "img", "", "yesBtn", "noBtn", "singleBtn", "", "isCancellable", "reverseFont", "alertDialogInterface", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/app/touch_of_jasmine/helper/interfaces/AlertDialogInterface;)V", "showImagePickerDialog", "imagePickerDialogInterface", "Lcom/app/touch_of_jasmine/helper/interfaces/ImagePickerDialogInterface;", "isFileEnabled", "app_debug"})
public final class Dialogs {
    @org.jetbrains.annotations.Nullable
    private static android.app.Dialog customDialog;
    @org.jetbrains.annotations.Nullable
    private static android.app.Dialog bottomSheetContinueShopping;
    @org.jetbrains.annotations.NotNull
    private static final com.app.touch_of_jasmine.helper.interfaces.AlertDialogInterface dialogInterface = null;
    @org.jetbrains.annotations.NotNull
    public static final com.app.touch_of_jasmine.helper.Dialogs INSTANCE = null;
    
    private Dialogs() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.app.Dialog getCustomDialog() {
        return null;
    }
    
    public final void setCustomDialog(@org.jetbrains.annotations.Nullable
    android.app.Dialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.app.Dialog getBottomSheetContinueShopping() {
        return null;
    }
    
    public final void setBottomSheetContinueShopping(@org.jetbrains.annotations.Nullable
    android.app.Dialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.touch_of_jasmine.helper.interfaces.AlertDialogInterface getDialogInterface() {
        return null;
    }
    
    public final void showCustomAlert(@org.jetbrains.annotations.NotNull
    android.content.Context activity, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String msg, int img, @org.jetbrains.annotations.NotNull
    java.lang.String yesBtn, @org.jetbrains.annotations.NotNull
    java.lang.String noBtn, boolean singleBtn, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isCancellable, @org.jetbrains.annotations.Nullable
    java.lang.Boolean reverseFont, @org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.helper.interfaces.AlertDialogInterface alertDialogInterface) {
    }
    
    public final void showImagePickerDialog(@org.jetbrains.annotations.NotNull
    android.content.Context activity, @org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.helper.interfaces.ImagePickerDialogInterface imagePickerDialogInterface, boolean isFileEnabled) {
    }
}