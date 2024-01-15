package com.app.touch_of_jasmine.helper.interfaces;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/app/touch_of_jasmine/helper/interfaces/CommonInterfaceClickEvent;", "", "onChildItemClick", "", "type", "", "parentPosition", "", "position", "onEmptyLayoutClick", "clickFrom", "onFailure", "onItemClick", "onResultLocation", "isLatLngSaved", "", "onToolBarListener", "app_debug"})
public abstract interface CommonInterfaceClickEvent {
    
    public abstract void onItemClick(@org.jetbrains.annotations.NotNull
    java.lang.String type, int position);
    
    public abstract void onChildItemClick(@org.jetbrains.annotations.NotNull
    java.lang.String type, int parentPosition, int position);
    
    public abstract void onResultLocation(boolean isLatLngSaved);
    
    public abstract void onToolBarListener(@org.jetbrains.annotations.NotNull
    java.lang.String type);
    
    public abstract void onFailure();
    
    public abstract void onEmptyLayoutClick(@org.jetbrains.annotations.NotNull
    java.lang.String clickFrom);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        public static void onItemClick(@org.jetbrains.annotations.NotNull
        com.app.touch_of_jasmine.helper.interfaces.CommonInterfaceClickEvent $this, @org.jetbrains.annotations.NotNull
        java.lang.String type, int position) {
        }
        
        public static void onChildItemClick(@org.jetbrains.annotations.NotNull
        com.app.touch_of_jasmine.helper.interfaces.CommonInterfaceClickEvent $this, @org.jetbrains.annotations.NotNull
        java.lang.String type, int parentPosition, int position) {
        }
        
        public static void onResultLocation(@org.jetbrains.annotations.NotNull
        com.app.touch_of_jasmine.helper.interfaces.CommonInterfaceClickEvent $this, boolean isLatLngSaved) {
        }
        
        public static void onToolBarListener(@org.jetbrains.annotations.NotNull
        com.app.touch_of_jasmine.helper.interfaces.CommonInterfaceClickEvent $this, @org.jetbrains.annotations.NotNull
        java.lang.String type) {
        }
        
        public static void onFailure(@org.jetbrains.annotations.NotNull
        com.app.touch_of_jasmine.helper.interfaces.CommonInterfaceClickEvent $this) {
        }
        
        public static void onEmptyLayoutClick(@org.jetbrains.annotations.NotNull
        com.app.touch_of_jasmine.helper.interfaces.CommonInterfaceClickEvent $this, @org.jetbrains.annotations.NotNull
        java.lang.String clickFrom) {
        }
    }
}