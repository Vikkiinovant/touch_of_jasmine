package com.app.touch_of_jasmine.data_source.local_db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/app/touch_of_jasmine/data_source/local_db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "cartDao", "Lcom/app/touch_of_jasmine/data_source/local_db/CartDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.app.touch_of_jasmine.data_source.local_db.ProductDataDbModel.class}, version = 1, exportSchema = false)
@androidx.room.TypeConverters(value = {com.app.touch_of_jasmine.data_source.local_db.Converters.class})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DATABASE_NAME = "basic_setup.db";
    @org.jetbrains.annotations.Nullable
    private static com.app.touch_of_jasmine.data_source.local_db.AppDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull
    public static final com.app.touch_of_jasmine.data_source.local_db.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public abstract com.app.touch_of_jasmine.data_source.local_db.CartDao cartDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/app/touch_of_jasmine/data_source/local_db/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "INSTANCE", "Lcom/app/touch_of_jasmine/data_source/local_db/AppDatabase;", "destroyInstance", "", "getAppDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.app.touch_of_jasmine.data_source.local_db.AppDatabase getAppDatabase(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        public final void destroyInstance() {
        }
    }
}