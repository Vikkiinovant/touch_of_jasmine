package com.app.touch_of_jasmine.helper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J8\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019J\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019J\u001c\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0#J\u001e\u0010$\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0013J#\u0010\'\u001a\u00020(*\u00020\b2\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0*\"\u00020+\u00a2\u0006\u0002\u0010,J\f\u0010-\u001a\u00020\u0019*\u0004\u0018\u00010\u0019J\n\u0010.\u001a\u00020\u001f*\u00020/J\n\u0010.\u001a\u00020\u001f*\u000200J\u0012\u00101\u001a\u00020\u001f*\u00020/2\u0006\u00102\u001a\u00020\u000eJ\u0011\u00103\u001a\u000204*\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u00105J\f\u00103\u001a\u000204*\u0004\u0018\u00010\u0019J\f\u00106\u001a\u000207*\u0004\u0018\u00010\u0019J\u0011\u00108\u001a\u00020\u000e*\u0004\u0018\u000104\u00a2\u0006\u0002\u00109J\u0011\u00108\u001a\u00020\u000e*\u0004\u0018\u000107\u00a2\u0006\u0002\u0010:J\f\u00108\u001a\u00020\u000e*\u0004\u0018\u00010\u0019J\u0011\u0010;\u001a\u00020\u0019*\u0004\u0018\u000107\u00a2\u0006\u0002\u0010<J\u0011\u0010;\u001a\u00020\u0019*\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010=J\n\u0010>\u001a\u00020\u0019*\u00020\u0019J\u0014\u0010?\u001a\u00020\u0019*\u0004\u0018\u00010\u00192\u0006\u0010@\u001a\u00020\u0019J\f\u0010A\u001a\u00020\u001f*\u0004\u0018\u00010BJ\u001c\u0010C\u001a\u00020\u0019*\u00020\u001c2\u0006\u0010D\u001a\u00020\u00192\b\b\u0002\u0010E\u001a\u00020FJ[\u0010G\u001a\u00020\u001f*\u00020\b2O\u0010\"\u001aK\u0012\u0013\u0012\u00110I\u00a2\u0006\f\bJ\u0012\b\bK\u0012\u0004\b\b(L\u0012\u0015\u0012\u0013\u0018\u00010\u0019\u00a2\u0006\f\bJ\u0012\b\bK\u0012\u0004\b\b(M\u0012\u0015\u0012\u0013\u0018\u00010\u0017\u00a2\u0006\f\bJ\u0012\b\bK\u0012\u0004\b\b(N\u0012\u0004\u0012\u00020\u001f0HJ\f\u0010O\u001a\u00020\u0015*\u0004\u0018\u00010\u0019J-\u0010P\u001a\u00020\u001f*\u00020\b2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110I\u00a2\u0006\f\bJ\u0012\b\bK\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020\u001f0QJ7\u0010R\u001a\u00020\u001f*\u00020\b2\b\b\u0002\u0010S\u001a\u00020\u00132!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110I\u00a2\u0006\f\bJ\u0012\b\bK\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020\u001f0QJ\u0014\u0010T\u001a\u0004\u0018\u00010\u0019*\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011J\f\u0010U\u001a\u00020\u0019*\u0004\u0018\u00010\u0019J1\u0010V\u001a\u0002HW\"\n\b\u0000\u0010W*\u0004\u0018\u00010X*\u00020I2\u0006\u0010Y\u001a\u00020\u00192\f\u0010Z\u001a\b\u0012\u0004\u0012\u0002HW0[\u00a2\u0006\u0002\u0010\\J\n\u0010]\u001a\u00020\u001f*\u00020+JN\u0010^\u001a\u00020\u001f*\u00020_2\u0006\u0010`\u001a\u00020\u00192\u0006\u0010a\u001a\u00020\u00192\b\b\u0002\u0010b\u001a\u00020\u000e2\b\b\u0002\u0010c\u001a\u00020\u00192\b\b\u0002\u0010d\u001a\u00020\u00132\b\b\u0002\u0010e\u001a\u00020\u00132\n\b\u0002\u0010f\u001a\u0004\u0018\u00010gJ0\u0010h\u001a\u00020\u001f*\u00020\u00112\n\b\u0002\u0010i\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010k2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0#J\n\u0010l\u001a\u00020\u0013*\u00020\u001cJ\u0012\u0010m\u001a\u00020\u000e*\u00020\u00112\u0006\u0010n\u001a\u00020\u0013J\u0012\u0010o\u001a\u00020\u001f*\u00020\u00112\u0006\u0010p\u001a\u00020\u0019J\u0014\u0010q\u001a\u00020\u001f*\u00020\u00192\b\b\u0002\u0010r\u001a\u00020\u0019JK\u0010s\u001a\u00020\u001f*\u00020\b2\b\u0010b\u001a\u0004\u0018\u00010\u00192\b\u0010t\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010u\u001a\u00020\u00132!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110v\u00a2\u0006\f\bJ\u0012\b\bK\u0012\u0004\b\b(w\u0012\u0004\u0012\u00020\u001f0QJQ\u0010x\u001a\u00020\u001f*\u00020\b2\b\u0010y\u001a\u0004\u0018\u00010I2\b\b\u0002\u0010u\u001a\u00020\u001321\u0010\"\u001a-\u0012#\u0012!\u0012\u0004\u0012\u00020v0\nj\b\u0012\u0004\u0012\u00020v`\f\u00a2\u0006\f\bJ\u0012\b\bK\u0012\u0004\b\b(w\u0012\u0004\u0012\u00020\u001f0QJ\n\u0010z\u001a\u00020\u001f*\u00020{J\n\u0010|\u001a\u00020\u001f*\u00020}J\n\u0010~\u001a\u00020\u001f*\u00020{J\u0015\u0010\u007f\u001a\u00020\u0015*\u00020\u00152\u0007\u0010\u0080\u0001\u001a\u000207H\u0002J\u0014\u0010\u0081\u0001\u001a\u00020\u001f*\u00030\u0082\u00012\u0006\u0010i\u001a\u00020+J9\u0010\u0083\u0001\u001a\u00020\u001f*\u00020/2\b\u0010\u0084\u0001\u001a\u00030\u0085\u00012\"\u0010\"\u001a\u001e\u0012\u0014\u0012\u00120\u0019\u00a2\u0006\r\bJ\u0012\t\bK\u0012\u0005\b\b(\u0086\u0001\u0012\u0004\u0012\u00020\u001f0QJ\u000b\u0010\u0087\u0001\u001a\u00020\u001f*\u00020{J\u001d\u0010\u0088\u0001\u001a\u00020\u001f*\u00020{2\u0007\u0010\u0089\u0001\u001a\u0002072\u0007\u0010\u008a\u0001\u001a\u000207JO\u0010\u008b\u0001\u001a\u00020\u001f*\u00030\u0082\u00012\u0007\u0010\u008c\u0001\u001a\u00020\u000e2\b\u0010\u008d\u0001\u001a\u00030\u008e\u00012\t\b\u0002\u0010\u008f\u0001\u001a\u00020\u000e2#\u0010\u0090\u0001\u001a\u001e\u0012\u0014\u0012\u00120\u000e\u00a2\u0006\r\bJ\u0012\t\bK\u0012\u0005\b\b(\u0091\u0001\u0012\u0004\u0012\u00020\u001f0QJ\r\u0010\u0092\u0001\u001a\u00020\u0019*\u0004\u0018\u00010\u0019J\u000b\u0010\u0093\u0001\u001a\u00020\u001f*\u00020/J\u0019\u0010\u0094\u0001\u001a\u00020\u001f*\u00020\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0#J!\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u001c*\u00020\u00192\b\b\u0002\u0010D\u001a\u00020\u00192\b\b\u0002\u0010E\u001a\u00020FJ\r\u0010\u0096\u0001\u001a\u00020\u0017*\u0004\u0018\u00010\u0019J\u000b\u0010\u0097\u0001\u001a\u00020\u001f*\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0098\u0001"}, d2 = {"Lcom/app/touch_of_jasmine/helper/Extensions;", "", "()V", "searchJob", "Lkotlinx/coroutines/Job;", "createImageFile", "Ljava/io/File;", "activity", "Landroid/app/Activity;", "getAllDatesInMonth", "Ljava/util/ArrayList;", "Lcom/app/touch_of_jasmine/helper/helper_model/CalenderDatesModel;", "Lkotlin/collections/ArrayList;", "year", "", "month", "context", "Landroid/content/Context;", "setTodaySelected", "", "getBitmapFromGallery", "Landroid/graphics/Bitmap;", "targetUri", "Landroid/net/Uri;", "getCurrentDate", "", "inputFormat", "getStringToDate", "Ljava/util/Date;", "date", "handler", "", "delay", "", "block", "Lkotlin/Function0;", "setWindowFlag", "bits", "on", "addAnimations", "Landroidx/core/app/ActivityOptionsCompat;", "args", "", "Landroid/view/View;", "(Landroid/app/Activity;[Landroid/view/View;)Landroidx/core/app/ActivityOptionsCompat;", "appendComma", "applyHintSize", "Landroid/widget/EditText;", "Landroid/widget/TextView;", "applyMaxLength", "maxLength", "asDouble", "", "(Ljava/lang/Integer;)D", "asFloat", "", "asInt", "(Ljava/lang/Double;)I", "(Ljava/lang/Float;)I", "asString", "(Ljava/lang/Float;)Ljava/lang/String;", "(Ljava/lang/Integer;)Ljava/lang/String;", "capitalizeFirstChar", "concat", "char", "dismissIfShowing", "Landroid/app/Dialog;", "formatTo", "dateFormat", "timeZone", "Ljava/util/TimeZone;", "getCameraIntent", "Lkotlin/Function3;", "Landroid/content/Intent;", "Lkotlin/ParameterName;", "name", "i", "outputPath", "outputUri", "getExifRotationInDegree", "getFilePickerIntent", "Lkotlin/Function1;", "getGalleryIntent", "isMultipleSelect", "getOriginalFileName", "getPhoneCodeWithoutPlus", "getSerializable", "T", "Ljava/io/Serializable;", "key", "m_class", "Ljava/lang/Class;", "(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;", "hideKeyboard", "init", "Lcom/app/touch_of_jasmine/databinding/LayoutEmptyBinding;", "title", "subTitle", "image", "btnLabel", "isIconVisible", "isBtnVisible", "listener", "Lcom/app/touch_of_jasmine/helper/interfaces/CommonInterfaceClickEvent;", "isInternetEnabled", "view", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "isToday", "isVisibleInvisible", "condition", "openWhatsapp", "number", "printLog", "tag", "receiveDataFromCamera", "photoURI", "isBase64Enable", "Lcom/app/touch_of_jasmine/helper/helper_model/AddImageModel;", "model", "receiveMultipleDataFromGallery", "result", "reduceDragSensitivity", "Landroidx/viewpager2/widget/ViewPager2;", "removeItemDecoration", "Landroidx/recyclerview/widget/RecyclerView;", "removeItemDecorations", "rotate", "degrees", "scrollToPosition", "Landroidx/core/widget/NestedScrollView;", "search", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "query", "setAutoScroll", "setCarouselPagerTransformation", "nextItemVisiblePx", "currentItemHorizontalMarginPx", "setPaginationListener", "pageSize", "layoutFooter", "Lcom/app/touch_of_jasmine/databinding/LvItemFooterLoadingBinding;", "currentPg", "callback", "page", "setPhoneCodeWithPlus", "showHidePassword", "then", "toDate", "toFileUri", "transparentStatusBarTheme", "app_debug"})
public final class Extensions {
    @org.jetbrains.annotations.Nullable
    private static kotlinx.coroutines.Job searchJob;
    @org.jetbrains.annotations.NotNull
    public static final com.app.touch_of_jasmine.helper.Extensions INSTANCE = null;
    
    private Extensions() {
        super();
    }
    
    public final void printLog(@org.jetbrains.annotations.NotNull
    java.lang.String $this$printLog, @org.jetbrains.annotations.NotNull
    java.lang.String tag) {
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull
    android.view.View $this$hideKeyboard) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String capitalizeFirstChar(@org.jetbrains.annotations.NotNull
    java.lang.String $this$capitalizeFirstChar) {
        return null;
    }
    
    public final void removeItemDecorations(@org.jetbrains.annotations.NotNull
    androidx.viewpager2.widget.ViewPager2 $this$removeItemDecorations) {
    }
    
    public final void removeItemDecoration(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView $this$removeItemDecoration) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOriginalFileName(@org.jetbrains.annotations.NotNull
    android.net.Uri $this$getOriginalFileName, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    public final void applyHintSize(@org.jetbrains.annotations.NotNull
    android.widget.EditText $this$applyHintSize) {
    }
    
    public final void applyHintSize(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$applyHintSize) {
    }
    
    public final void transparentStatusBarTheme(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$transparentStatusBarTheme) {
    }
    
    public final void setWindowFlag(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, int bits, boolean on) {
    }
    
    public final void applyMaxLength(@org.jetbrains.annotations.NotNull
    android.widget.EditText $this$applyMaxLength, int maxLength) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String appendComma(@org.jetbrains.annotations.Nullable
    java.lang.String $this$appendComma) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String concat(@org.jetbrains.annotations.Nullable
    java.lang.String $this$concat, @org.jetbrains.annotations.NotNull
    java.lang.String p1_1526187) {
        return null;
    }
    
    public final void showHidePassword(@org.jetbrains.annotations.NotNull
    android.widget.EditText $this$showHidePassword) {
    }
    
    public final void setAutoScroll(@org.jetbrains.annotations.NotNull
    androidx.viewpager2.widget.ViewPager2 $this$setAutoScroll) {
    }
    
    public final void handler(long delay, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public final void getGalleryIntent(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$getGalleryIntent, boolean isMultipleSelect, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit> block) {
    }
    
    public final void getCameraIntent(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$getCameraIntent, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function3<? super android.content.Intent, ? super java.lang.String, ? super android.net.Uri, kotlin.Unit> block) {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final java.io.File createImageFile(android.app.Activity activity) throws java.io.IOException {
        return null;
    }
    
    public final void getFilePickerIntent(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$getFilePickerIntent, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit> block) {
    }
    
    public final void receiveDataFromCamera(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$receiveDataFromCamera, @org.jetbrains.annotations.Nullable
    java.lang.String image, @org.jetbrains.annotations.Nullable
    android.net.Uri photoURI, boolean isBase64Enable, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.app.touch_of_jasmine.helper.helper_model.AddImageModel, kotlin.Unit> block) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.net.Uri toFileUri(@org.jetbrains.annotations.Nullable
    java.lang.String $this$toFileUri) {
        return null;
    }
    
    public final void receiveMultipleDataFromGallery(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$receiveMultipleDataFromGallery, @org.jetbrains.annotations.Nullable
    android.content.Intent result, boolean isBase64Enable, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.app.touch_of_jasmine.helper.helper_model.AddImageModel>, kotlin.Unit> block) {
    }
    
    private final android.graphics.Bitmap getBitmapFromGallery(android.app.Activity activity, android.net.Uri targetUri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap getExifRotationInDegree(@org.jetbrains.annotations.Nullable
    java.lang.String $this$getExifRotationInDegree) {
        return null;
    }
    
    private final android.graphics.Bitmap rotate(android.graphics.Bitmap $this$rotate, float degrees) {
        return null;
    }
    
    public final void dismissIfShowing(@org.jetbrains.annotations.Nullable
    android.app.Dialog $this$dismissIfShowing) {
    }
    
    public final boolean isToday(@org.jetbrains.annotations.NotNull
    java.util.Date $this$isToday) {
        return false;
    }
    
    public final void search(@org.jetbrains.annotations.NotNull
    android.widget.EditText $this$search, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleCoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> block) {
    }
    
    public final void scrollToPosition(@org.jetbrains.annotations.NotNull
    androidx.core.widget.NestedScrollView $this$scrollToPosition, @org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    public final void reduceDragSensitivity(@org.jetbrains.annotations.NotNull
    androidx.viewpager2.widget.ViewPager2 $this$reduceDragSensitivity) {
    }
    
    public final void setCarouselPagerTransformation(@org.jetbrains.annotations.NotNull
    androidx.viewpager2.widget.ViewPager2 $this$setCarouselPagerTransformation, float nextItemVisiblePx, float currentItemHorizontalMarginPx) {
    }
    
    public final void isInternetEnabled(@org.jetbrains.annotations.NotNull
    android.content.Context $this$isInternetEnabled, @org.jetbrains.annotations.Nullable
    android.view.View view, @org.jetbrains.annotations.Nullable
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public final double asDouble(@org.jetbrains.annotations.Nullable
    java.lang.String $this$asDouble) {
        return 0.0;
    }
    
    public final double asDouble(@org.jetbrains.annotations.Nullable
    java.lang.Integer $this$asDouble) {
        return 0.0;
    }
    
    public final int asInt(@org.jetbrains.annotations.Nullable
    java.lang.String $this$asInt) {
        return 0;
    }
    
    public final float asFloat(@org.jetbrains.annotations.Nullable
    java.lang.String $this$asFloat) {
        return 0.0F;
    }
    
    public final int asInt(@org.jetbrains.annotations.Nullable
    java.lang.Double $this$asInt) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String asString(@org.jetbrains.annotations.Nullable
    java.lang.Integer $this$asString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String asString(@org.jetbrains.annotations.Nullable
    java.lang.Float $this$asString) {
        return null;
    }
    
    public final int asInt(@org.jetbrains.annotations.Nullable
    java.lang.Float $this$asInt) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String setPhoneCodeWithPlus(@org.jetbrains.annotations.Nullable
    java.lang.String $this$setPhoneCodeWithPlus) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhoneCodeWithoutPlus(@org.jetbrains.annotations.Nullable
    java.lang.String $this$getPhoneCodeWithoutPlus) {
        return null;
    }
    
    public final void then(boolean $this$then, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date toDate(@org.jetbrains.annotations.NotNull
    java.lang.String $this$toDate, @org.jetbrains.annotations.NotNull
    java.lang.String dateFormat, @org.jetbrains.annotations.NotNull
    java.util.TimeZone timeZone) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatTo(@org.jetbrains.annotations.NotNull
    java.util.Date $this$formatTo, @org.jetbrains.annotations.NotNull
    java.lang.String dateFormat, @org.jetbrains.annotations.NotNull
    java.util.TimeZone timeZone) {
        return null;
    }
    
    public final void openWhatsapp(@org.jetbrains.annotations.NotNull
    android.content.Context $this$openWhatsapp, @org.jetbrains.annotations.NotNull
    java.lang.String number) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.databinding.LayoutEmptyBinding $this$init, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String subTitle, int image, @org.jetbrains.annotations.NotNull
    java.lang.String btnLabel, boolean isIconVisible, boolean isBtnVisible, @org.jetbrains.annotations.Nullable
    com.app.touch_of_jasmine.helper.interfaces.CommonInterfaceClickEvent listener) {
    }
    
    public final <T extends java.io.Serializable>T getSerializable(@org.jetbrains.annotations.NotNull
    android.content.Intent $this$getSerializable, @org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.lang.Class<T> m_class) {
        return null;
    }
    
    public final int isVisibleInvisible(@org.jetbrains.annotations.NotNull
    android.content.Context $this$isVisibleInvisible, boolean condition) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrentDate(@org.jetbrains.annotations.NotNull
    java.lang.String inputFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date getStringToDate(@org.jetbrains.annotations.NotNull
    java.lang.String inputFormat, @org.jetbrains.annotations.NotNull
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.app.touch_of_jasmine.helper.helper_model.CalenderDatesModel> getAllDatesInMonth(int year, int month, @org.jetbrains.annotations.NotNull
    android.content.Context context, boolean setTodaySelected) {
        return null;
    }
    
    public final void setPaginationListener(@org.jetbrains.annotations.NotNull
    androidx.core.widget.NestedScrollView $this$setPaginationListener, int pageSize, @org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.databinding.LvItemFooterLoadingBinding layoutFooter, int currentPg, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.core.app.ActivityOptionsCompat addAnimations(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$addAnimations, @org.jetbrains.annotations.NotNull
    android.view.View... args) {
        return null;
    }
}