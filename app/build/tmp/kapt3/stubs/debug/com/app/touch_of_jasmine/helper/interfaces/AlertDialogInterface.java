package com.app.touch_of_jasmine.helper.interfaces;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/app/touch_of_jasmine/helper/interfaces/AlertDialogInterface;", "", "onCloseDialog", "", "onNoClick", "onSubmitPasswordClick", "emailID", "", "view", "Landroid/view/View;", "onYesClick", "app_debug"})
public abstract interface AlertDialogInterface {
    
    public abstract void onYesClick();
    
    public abstract void onNoClick();
    
    public abstract void onCloseDialog();
    
    public abstract void onSubmitPasswordClick(@org.jetbrains.annotations.NotNull
    java.lang.String emailID, @org.jetbrains.annotations.NotNull
    android.view.View view);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        public static void onYesClick(@org.jetbrains.annotations.NotNull
        com.app.touch_of_jasmine.helper.interfaces.AlertDialogInterface $this) {
        }
        
        public static void onNoClick(@org.jetbrains.annotations.NotNull
        com.app.touch_of_jasmine.helper.interfaces.AlertDialogInterface $this) {
        }
        
        public static void onCloseDialog(@org.jetbrains.annotations.NotNull
        com.app.touch_of_jasmine.helper.interfaces.AlertDialogInterface $this) {
        }
        
        public static void onSubmitPasswordClick(@org.jetbrains.annotations.NotNull
        com.app.touch_of_jasmine.helper.interfaces.AlertDialogInterface $this, @org.jetbrains.annotations.NotNull
        java.lang.String emailID, @org.jetbrains.annotations.NotNull
        android.view.View view) {
        }
    }
}