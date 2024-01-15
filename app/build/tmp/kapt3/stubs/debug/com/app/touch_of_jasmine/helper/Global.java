package com.app.touch_of_jasmine.helper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0010J\u001e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004J0\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0003J\u0018\u0010 \u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004J\b\u0010!\u001a\u00020\u001fH\u0003J\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J \u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u0018\u0010&\u001a\u00020\'2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0004H\u0007J\u000e\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004J\u0018\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0016\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010.\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010/\u001a\u0002002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u000200J\u0012\u00101\u001a\u0004\u0018\u0001022\b\u0010*\u001a\u0004\u0018\u00010\u0004J\u0010\u00103\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004J\u0016\u00104\u001a\u0002052\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0004J\u0018\u00107\u001a\u000205*\u00020\b2\f\u00108\u001a\b\u0012\u0004\u0012\u00020509J\u001a\u0010:\u001a\u000205*\u00020;2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u0014J%\u0010=\u001a\u000205*\u00020;2\b\u0010>\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010@J\u0014\u0010A\u001a\u00020\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0012J\u0014\u0010B\u001a\u00020\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0012J\u0014\u0010C\u001a\u00020\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010D\u001a\u00020\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010E\u001a\u000205*\u00020\u00062\u0006\u0010F\u001a\u00020\u0004J\u0012\u0010G\u001a\u000205*\u00020\u00122\u0006\u00106\u001a\u00020\u0004J2\u0010G\u001a\u000205*\u0004\u0018\u00010H2\u0006\u00106\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\b2\b\b\u0002\u0010J\u001a\u00020\u00142\b\b\u0002\u0010K\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006L"}, d2 = {"Lcom/app/touch_of_jasmine/helper/Global;", "", "()V", "INSTABUG_KEY_DEBUG", "", "context", "Landroid/content/Context;", "isTestModeEnabled", "", "amPmEnglishToArabic", "strValue", "arabicToEnglish", "strGetNumber", "currentDate", "Ljava/util/Date;", "getDeviceWidthInDouble", "", "activity", "Landroid/app/Activity;", "getDimension", "", "size", "getDurationBetweenCurrentDateTime", "inputFormat", "strDate", "getFormattedDate", "outputFormat", "value", "zone", "getIsTodayFromDate", "getKuwaitZoneOffSet", "Ljava/time/ZoneOffset;", "getLocalTimeZoneDate", "getLocalZoneOffSet", "getTimeConvertKuwaitToLocal", "aDate", "getTimeConvertLocalToKuwait", "getTimeConvertToUTC", "getTypeFace", "Landroid/graphics/Typeface;", "fontStyle", "getWebViewData", "strData", "monthListEnglishToArabic", "mMonth", "monthShortEnglishToArabic", "monthsEnglishToArabic", "setFontSize", "", "setHtmlTextView", "Landroid/text/Spanned;", "setTextViewData", "showCustomToast", "", "strMsg", "isEnabled", "block", "Lkotlin/Function0;", "loadGifUsingCoil", "Landroid/widget/ImageView;", "gif", "loadImagesUsingCoil", "strUrl", "errorImage", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;)V", "setOnlyPrice", "setOnlyPriceWithTwoDecimal", "setPriceWithCurrency", "setPriceWithCurrencyEnd", "showMessage", "message", "showSnackBar", "Landroid/view/View;", "showBelowStatus", "duration", "gravity", "app_debug"})
@android.annotation.SuppressLint(value = {"StaticFieldLeak"})
public final class Global {
    
    /**
     * set to false when latest build uploading on play store
     */
    public static final boolean isTestModeEnabled = true;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INSTABUG_KEY_DEBUG = "77d14f56b5ac2a9fe470162c71b47b15";
    private static android.content.Context context;
    @org.jetbrains.annotations.NotNull
    public static final com.app.touch_of_jasmine.helper.Global INSTANCE = null;
    
    private Global() {
        super();
    }
    
    public final void isEnabled(boolean $this$isEnabled, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public final void showCustomToast(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String strMsg) {
    }
    
    public final double getDeviceWidthInDouble(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
        return 0.0;
    }
    
    public final int getDimension(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, double size) {
        return 0;
    }
    
    public final float setFontSize(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, float value) {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.text.Spanned setHtmlTextView(@org.jetbrains.annotations.Nullable
    java.lang.String strData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String setTextViewData(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
        return null;
    }
    
    public final void showMessage(@org.jetbrains.annotations.NotNull
    android.content.Context $this$showMessage, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String setPriceWithCurrency(@org.jetbrains.annotations.Nullable
    java.lang.String $this$setPriceWithCurrency, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String setPriceWithCurrencyEnd(@org.jetbrains.annotations.Nullable
    java.lang.String $this$setPriceWithCurrencyEnd, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String setOnlyPrice(@org.jetbrains.annotations.Nullable
    java.lang.String $this$setOnlyPrice, @org.jetbrains.annotations.NotNull
    android.app.Activity context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String setOnlyPriceWithTwoDecimal(@org.jetbrains.annotations.Nullable
    java.lang.String $this$setOnlyPriceWithTwoDecimal, @org.jetbrains.annotations.NotNull
    android.app.Activity context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String arabicToEnglish(@org.jetbrains.annotations.Nullable
    java.lang.String strGetNumber, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    public final int getIsTodayFromDate(@org.jetbrains.annotations.NotNull
    android.content.Context activity, @org.jetbrains.annotations.NotNull
    java.lang.String inputFormat, @org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTimeConvertKuwaitToLocal(@org.jetbrains.annotations.NotNull
    java.lang.String aDate, @org.jetbrains.annotations.NotNull
    java.lang.String inputFormat) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTimeConvertLocalToKuwait(@org.jetbrains.annotations.NotNull
    java.lang.String aDate, @org.jetbrains.annotations.NotNull
    java.lang.String inputFormat) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final java.time.ZoneOffset getLocalZoneOffSet() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final java.time.ZoneOffset getKuwaitZoneOffSet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String monthShortEnglishToArabic(@org.jetbrains.annotations.NotNull
    java.lang.String mMonth, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String monthsEnglishToArabic(@org.jetbrains.annotations.NotNull
    java.lang.String mMonth, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    private final java.lang.String monthListEnglishToArabic(java.lang.String mMonth, android.content.Context context) {
        return null;
    }
    
    private final java.lang.String amPmEnglishToArabic(java.lang.String strValue, android.content.Context context) {
        return null;
    }
    
    private final java.util.Date currentDate() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFormattedDate(@org.jetbrains.annotations.NotNull
    java.lang.String inputFormat, @org.jetbrains.annotations.NotNull
    java.lang.String outputFormat, @org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.NotNull
    java.lang.String zone, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTimeConvertToUTC(@org.jetbrains.annotations.NotNull
    java.lang.String aDate, @org.jetbrains.annotations.NotNull
    java.lang.String inputFormat, @org.jetbrains.annotations.NotNull
    java.lang.String zone) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDurationBetweenCurrentDateTime(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    java.lang.String inputFormat, @org.jetbrains.annotations.NotNull
    java.lang.String strDate) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date getLocalTimeZoneDate(@org.jetbrains.annotations.NotNull
    java.lang.String inputFormat, @org.jetbrains.annotations.NotNull
    java.lang.String strDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWebViewData(@org.jetbrains.annotations.NotNull
    java.lang.String strData) {
        return null;
    }
    
    public final void loadImagesUsingCoil(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$loadImagesUsingCoil, @org.jetbrains.annotations.Nullable
    java.lang.String strUrl, @org.jetbrains.annotations.Nullable
    java.lang.Integer errorImage) {
    }
    
    public final void loadGifUsingCoil(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$loadGifUsingCoil, @org.jetbrains.annotations.NotNull
    android.app.Activity context, int gif) {
    }
    
    public final void showSnackBar(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$showSnackBar, @org.jetbrains.annotations.NotNull
    java.lang.String strMsg) {
    }
    
    public final void showSnackBar(@org.jetbrains.annotations.Nullable
    android.view.View $this$showSnackBar, @org.jetbrains.annotations.NotNull
    java.lang.String strMsg, boolean showBelowStatus, int duration, int gravity) {
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Typeface getTypeFace(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String fontStyle) {
        return null;
    }
}