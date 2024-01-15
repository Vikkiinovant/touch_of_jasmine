package com.app.touch_of_jasmine.helper.interfaces;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/app/touch_of_jasmine/helper/interfaces/OnClickTime;", "", "onClick", "", "strTime", "", "onTime", "hour", "", "minute", "time", "app_debug"})
public abstract interface OnClickTime {
    
    public abstract void onClick(@org.jetbrains.annotations.NotNull
    java.lang.String strTime);
    
    public abstract void onTime(int hour, int minute, @org.jetbrains.annotations.NotNull
    java.lang.String time);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        public static void onTime(@org.jetbrains.annotations.NotNull
        com.app.touch_of_jasmine.helper.interfaces.OnClickTime $this, int hour, int minute, @org.jetbrains.annotations.NotNull
        java.lang.String time) {
        }
    }
}