
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\"\u0010\n\u001a\u00020\u0004*\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fJ\n\u0010\u0010\u001a\u00020\u0004*\u00020\u000bJ\u0014\u0010\u0011\u001a\u00020\u0004*\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u00a8\u0006\u0014"}, d2 = {"LAppNavigation;", "", "()V", "backStackWithIntent", "", "Landroid/app/Activity;", "intent", "Landroid/content/Intent;", "resultCode", "", "navigateToHome", "Landroid/content/Context;", "msg", "", "block", "Lkotlin/Function0;", "navigateToIntro", "navigateToLogin", "clearBackStack", "", "app_debug"})
public final class AppNavigation {
    @org.jetbrains.annotations.NotNull
    public static final AppNavigation INSTANCE = null;
    
    private AppNavigation() {
        super();
    }
    
    public final void navigateToHome(@org.jetbrains.annotations.NotNull
    android.content.Context $this$navigateToHome, @org.jetbrains.annotations.NotNull
    java.lang.String msg, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public final void navigateToLogin(@org.jetbrains.annotations.NotNull
    android.content.Context $this$navigateToLogin, boolean clearBackStack) {
    }
    
    public final void navigateToIntro(@org.jetbrains.annotations.NotNull
    android.content.Context $this$navigateToIntro) {
    }
    
    public final void backStackWithIntent(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$backStackWithIntent, @org.jetbrains.annotations.NotNull
    android.content.Intent intent, int resultCode) {
    }
}