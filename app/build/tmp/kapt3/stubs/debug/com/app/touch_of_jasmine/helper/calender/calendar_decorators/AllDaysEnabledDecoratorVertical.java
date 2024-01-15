package com.app.touch_of_jasmine.helper.calender.calendar_decorators;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/app/touch_of_jasmine/helper/calender/calendar_decorators/AllDaysEnabledDecoratorVertical;", "Lcom/prolificinteractive/materialcalendarview/DayViewDecorator;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "decorate", "", "view", "Lcom/prolificinteractive/materialcalendarview/DayViewFacade;", "shouldDecorate", "", "day", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "app_debug"})
public final class AllDaysEnabledDecoratorVertical implements com.prolificinteractive.materialcalendarview.DayViewDecorator {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    
    public AllDaysEnabledDecoratorVertical(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override
    public boolean shouldDecorate(@org.jetbrains.annotations.NotNull
    com.prolificinteractive.materialcalendarview.CalendarDay day) {
        return false;
    }
    
    @java.lang.Override
    public void decorate(@org.jetbrains.annotations.NotNull
    com.prolificinteractive.materialcalendarview.DayViewFacade view) {
    }
}