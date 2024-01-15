package com.app.touch_of_jasmine.helper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u0000 -2\u00020\u0001:\u0002-.B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u001f\u001a\u00020 H\u0002J \u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0015H\u0002J \u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0015H\u0002J\u0018\u0010\'\u001a\u00020 2\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0014J\u000e\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\u0015J\u0010\u0010,\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/app/touch_of_jasmine/helper/TouchImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "last", "Landroid/graphics/PointF;", "m", "", "mScaleDetector", "Landroid/view/ScaleGestureDetector;", "matrix", "Landroid/graphics/Matrix;", "getMatrix$app_debug", "()Landroid/graphics/Matrix;", "setMatrix$app_debug", "(Landroid/graphics/Matrix;)V", "maxScale", "", "mode", "", "oldMeasuredHeight", "origHeight", "origWidth", "saveScale", "start", "viewHeight", "viewWidth", "fixTrans", "", "getFixDragTrans", "delta", "viewSize", "contentSize", "getFixTrans", "trans", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setMaxZoom", "x", "sharedConstructing", "Companion", "ScaleListener", "app_debug"})
public final class TouchImageView extends androidx.appcompat.widget.AppCompatImageView {
    @org.jetbrains.annotations.Nullable
    private android.graphics.Matrix matrix;
    private int mode = 0;
    @org.jetbrains.annotations.NotNull
    private final android.graphics.PointF last = null;
    @org.jetbrains.annotations.NotNull
    private final android.graphics.PointF start = null;
    private float maxScale = 3.0F;
    @org.jetbrains.annotations.Nullable
    private float[] m;
    private int viewWidth = 0;
    private int viewHeight = 0;
    private float saveScale = 1.0F;
    private float origWidth = 0.0F;
    private float origHeight = 0.0F;
    private int oldMeasuredHeight = 0;
    @org.jetbrains.annotations.Nullable
    private android.view.ScaleGestureDetector mScaleDetector;
    private static final int NONE = 0;
    private static final int DRAG = 1;
    private static final int ZOOM = 2;
    private static final int CLICK = 3;
    @org.jetbrains.annotations.NotNull
    public static final com.app.touch_of_jasmine.helper.TouchImageView.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.Matrix getMatrix$app_debug() {
        return null;
    }
    
    public final void setMatrix$app_debug(@org.jetbrains.annotations.Nullable
    android.graphics.Matrix p0) {
    }
    
    public TouchImageView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    public TouchImageView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    private final void sharedConstructing(android.content.Context context) {
    }
    
    public final void setMaxZoom(float x) {
    }
    
    private final void fixTrans() {
    }
    
    private final float getFixTrans(float trans, float viewSize, float contentSize) {
        return 0.0F;
    }
    
    private final float getFixDragTrans(float delta, float viewSize, float contentSize) {
        return 0.0F;
    }
    
    @java.lang.Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/app/touch_of_jasmine/helper/TouchImageView$Companion;", "", "()V", "CLICK", "", "DRAG", "NONE", "ZOOM", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/app/touch_of_jasmine/helper/TouchImageView$ScaleListener;", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "(Lcom/app/touch_of_jasmine/helper/TouchImageView;)V", "onScale", "", "detector", "Landroid/view/ScaleGestureDetector;", "onScaleBegin", "app_debug"})
    final class ScaleListener extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener {
        
        public ScaleListener() {
            super();
        }
        
        @java.lang.Override
        public boolean onScaleBegin(@org.jetbrains.annotations.NotNull
        android.view.ScaleGestureDetector detector) {
            return false;
        }
        
        @java.lang.Override
        public boolean onScale(@org.jetbrains.annotations.NotNull
        android.view.ScaleGestureDetector detector) {
            return false;
        }
    }
}