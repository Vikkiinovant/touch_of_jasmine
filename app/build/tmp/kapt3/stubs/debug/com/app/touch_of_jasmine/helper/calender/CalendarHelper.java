package com.app.touch_of_jasmine.helper.calender;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0015J\u0016\u0010\u0017\u001a\u00020\u0010*\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\u0018\u001a\u00020\u0010*\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/app/touch_of_jasmine/helper/calender/CalendarHelper;", "", "()V", "currentDate", "", "getCurrentDate", "()Ljava/lang/String;", "setCurrentDate", "(Ljava/lang/String;)V", "model", "Lcom/app/touch_of_jasmine/helper/calender/model/RangeDateModel;", "getModel", "()Lcom/app/touch_of_jasmine/helper/calender/model/RangeDateModel;", "monthFormatter", "Ljava/text/SimpleDateFormat;", "initCalender", "", "Lcom/app/touch_of_jasmine/databinding/LayoutCalenderBinding;", "listener", "Lcom/app/touch_of_jasmine/helper/calender/CalendarHelper$CalenderListener;", "isCurrentDateIsMinimum", "", "isRangeMode", "resetDecorators", "setCalenderMonth", "CalenderListener", "app_debug"})
public final class CalendarHelper {
    @org.jetbrains.annotations.NotNull
    private static java.lang.String currentDate = "";
    @org.jetbrains.annotations.NotNull
    private static final com.app.touch_of_jasmine.helper.calender.model.RangeDateModel model = null;
    @org.jetbrains.annotations.NotNull
    private static final java.text.SimpleDateFormat monthFormatter = null;
    @org.jetbrains.annotations.NotNull
    public static final com.app.touch_of_jasmine.helper.calender.CalendarHelper INSTANCE = null;
    
    private CalendarHelper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrentDate() {
        return null;
    }
    
    public final void setCurrentDate(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.touch_of_jasmine.helper.calender.model.RangeDateModel getModel() {
        return null;
    }
    
    public final void initCalender(@org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.databinding.LayoutCalenderBinding $this$initCalender, @org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.helper.calender.CalendarHelper.CalenderListener listener, boolean isCurrentDateIsMinimum, boolean isRangeMode) {
    }
    
    private final void resetDecorators(com.app.touch_of_jasmine.databinding.LayoutCalenderBinding $this$resetDecorators, boolean isCurrentDateIsMinimum) {
    }
    
    private final void setCalenderMonth(com.app.touch_of_jasmine.databinding.LayoutCalenderBinding $this$setCalenderMonth, boolean isCurrentDateIsMinimum) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/app/touch_of_jasmine/helper/calender/CalendarHelper$CalenderListener;", "", "onDateSelected", "", "date", "", "displayDate", "onMonthSelected", "onRangeSelected", "model", "Lcom/app/touch_of_jasmine/helper/calender/model/RangeDateModel;", "app_debug"})
    public static abstract interface CalenderListener {
        
        public abstract void onDateSelected(@org.jetbrains.annotations.NotNull
        java.lang.String date, @org.jetbrains.annotations.NotNull
        java.lang.String displayDate);
        
        public abstract void onRangeSelected(@org.jetbrains.annotations.NotNull
        com.app.touch_of_jasmine.helper.calender.model.RangeDateModel model);
        
        public abstract void onMonthSelected();
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
        public static final class DefaultImpls {
            
            public static void onDateSelected(@org.jetbrains.annotations.NotNull
            com.app.touch_of_jasmine.helper.calender.CalendarHelper.CalenderListener $this, @org.jetbrains.annotations.NotNull
            java.lang.String date, @org.jetbrains.annotations.NotNull
            java.lang.String displayDate) {
            }
            
            public static void onRangeSelected(@org.jetbrains.annotations.NotNull
            com.app.touch_of_jasmine.helper.calender.CalendarHelper.CalenderListener $this, @org.jetbrains.annotations.NotNull
            com.app.touch_of_jasmine.helper.calender.model.RangeDateModel model) {
            }
            
            public static void onMonthSelected(@org.jetbrains.annotations.NotNull
            com.app.touch_of_jasmine.helper.calender.CalendarHelper.CalenderListener $this) {
            }
        }
    }
}