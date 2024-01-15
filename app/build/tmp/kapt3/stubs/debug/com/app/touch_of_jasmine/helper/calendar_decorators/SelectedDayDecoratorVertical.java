package com.app.touch_of_jasmine.helper.calendar_decorators;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/app/touch_of_jasmine/helper/calendar_decorators/SelectedDayDecoratorVertical;", "Lcom/prolificinteractive/materialcalendarview/DayViewDecorator;", "date", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "context", "Landroid/content/Context;", "(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Landroid/content/Context;)V", "decorate", "", "view", "Lcom/prolificinteractive/materialcalendarview/DayViewFacade;", "shouldDecorate", "", "day", "app_debug"})
public final class SelectedDayDecoratorVertical implements com.prolificinteractive.materialcalendarview.DayViewDecorator {
    @org.jetbrains.annotations.Nullable
    private com.prolificinteractive.materialcalendarview.CalendarDay date;
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    
    public SelectedDayDecoratorVertical(@org.jetbrains.annotations.Nullable
    com.prolificinteractive.materialcalendarview.CalendarDay date, @org.jetbrains.annotations.NotNull
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