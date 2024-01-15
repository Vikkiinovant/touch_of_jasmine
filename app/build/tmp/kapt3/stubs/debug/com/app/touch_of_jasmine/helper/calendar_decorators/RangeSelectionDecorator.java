package com.app.touch_of_jasmine.helper.calendar_decorators;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/app/touch_of_jasmine/helper/calendar_decorators/RangeSelectionDecorator;", "Lcom/prolificinteractive/materialcalendarview/DayViewDecorator;", "startDate", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "endDate", "context", "Landroid/content/Context;", "(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;Landroid/content/Context;)V", "decorate", "", "view", "Lcom/prolificinteractive/materialcalendarview/DayViewFacade;", "shouldDecorate", "", "day", "app_debug"})
public final class RangeSelectionDecorator implements com.prolificinteractive.materialcalendarview.DayViewDecorator {
    @org.jetbrains.annotations.Nullable
    private com.prolificinteractive.materialcalendarview.CalendarDay startDate;
    @org.jetbrains.annotations.Nullable
    private com.prolificinteractive.materialcalendarview.CalendarDay endDate;
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    
    public RangeSelectionDecorator(@org.jetbrains.annotations.Nullable
    com.prolificinteractive.materialcalendarview.CalendarDay startDate, @org.jetbrains.annotations.Nullable
    com.prolificinteractive.materialcalendarview.CalendarDay endDate, @org.jetbrains.annotations.NotNull
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