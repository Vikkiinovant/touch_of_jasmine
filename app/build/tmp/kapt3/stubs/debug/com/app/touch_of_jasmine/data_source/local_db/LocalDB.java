package com.app.touch_of_jasmine.data_source.local_db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J.\u0010\t\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0006*\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\n\u0010\f\u001a\u00020\r*\u00020\u0007J\"\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0006*\u00020\u0007J\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0007J6\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u0006*\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u00a8\u0006\u0014"}, d2 = {"Lcom/app/touch_of_jasmine/data_source/local_db/LocalDB;", "", "()V", "addToCartInDB", "Ljava/util/ArrayList;", "Lcom/app/touch_of_jasmine/data_source/local_db/ProductDataDbModel;", "Lkotlin/collections/ArrayList;", "Landroid/content/Context;", "products", "deleteCartInDb", "productEntityID", "", "deleteCartTableFromDB", "", "getAllCartListFromDB", "getDao", "Lcom/app/touch_of_jasmine/data_source/local_db/AppDatabase;", "updateCartInDb", "productID", "qty", "app_debug"})
public final class LocalDB {
    @org.jetbrains.annotations.NotNull
    public static final com.app.touch_of_jasmine.data_source.local_db.LocalDB INSTANCE = null;
    
    private LocalDB() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.touch_of_jasmine.data_source.local_db.AppDatabase getDao(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.app.touch_of_jasmine.data_source.local_db.ProductDataDbModel> addToCartInDB(@org.jetbrains.annotations.NotNull
    android.content.Context $this$addToCartInDB, @org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.data_source.local_db.ProductDataDbModel products) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.ArrayList<com.app.touch_of_jasmine.data_source.local_db.ProductDataDbModel> getAllCartListFromDB(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getAllCartListFromDB) {
        return null;
    }
    
    public final void deleteCartTableFromDB(@org.jetbrains.annotations.NotNull
    android.content.Context $this$deleteCartTableFromDB) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.app.touch_of_jasmine.data_source.local_db.ProductDataDbModel> updateCartInDb(@org.jetbrains.annotations.NotNull
    android.content.Context $this$updateCartInDb, @org.jetbrains.annotations.Nullable
    java.lang.String productID, @org.jetbrains.annotations.Nullable
    java.lang.String qty) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.ArrayList<com.app.touch_of_jasmine.data_source.local_db.ProductDataDbModel> deleteCartInDb(@org.jetbrains.annotations.NotNull
    android.content.Context $this$deleteCartInDb, @org.jetbrains.annotations.Nullable
    java.lang.String productEntityID) {
        return null;
    }
}