package com.app.touch_of_jasmine.data_source.local_db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\'\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\'J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\'J\u0010\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\rH\'J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\'J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\'J!\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\'\u00a2\u0006\u0002\u0010\u0015JB\u0010\u0016\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u001a\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019j\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a`\u001bH\'\u00a8\u0006\u001c"}, d2 = {"Lcom/app/touch_of_jasmine/data_source/local_db/CartDao;", "", "addProductToCart", "", "products", "", "Lcom/app/touch_of_jasmine/data_source/local_db/ProductDataDbModel;", "([Lcom/app/touch_of_jasmine/data_source/local_db/ProductDataDbModel;)V", "deleteCartTable", "deleteProductFromCart", "productEntityID", "", "getAllCartProducts", "", "getQtyInCart", "", "getTotalCartProductCount", "isProductPresentInCart", "", "updateProductsInCart", "strQty", "(Ljava/lang/Integer;Ljava/lang/String;)V", "updateProductsInCartOffline", "productID", "configurableOptionModel", "Ljava/util/ArrayList;", "Lcom/app/touch_of_jasmine/data_source/local_db/DBConfigurableOptionModel;", "Lkotlin/collections/ArrayList;", "app_debug"})
@androidx.room.Dao
public abstract interface CartDao {
    
    @androidx.room.Insert
    public abstract void addProductToCart(@org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.data_source.local_db.ProductDataDbModel... products);
    
    @androidx.room.Query(value = "UPDATE ProductDataDbModel SET quantity =:strQty WHERE entityID = :productEntityID")
    public abstract void updateProductsInCart(@org.jetbrains.annotations.Nullable
    java.lang.Integer strQty, @org.jetbrains.annotations.Nullable
    java.lang.String productEntityID);
    
    @androidx.room.Query(value = "UPDATE ProductDataDbModel SET quantity =:strQty,productID =:productID,entityID =:productEntityID,configOptions =:configurableOptionModel WHERE entityID = :productEntityID")
    public abstract void updateProductsInCartOffline(@org.jetbrains.annotations.Nullable
    java.lang.String strQty, @org.jetbrains.annotations.Nullable
    java.lang.String productID, @org.jetbrains.annotations.Nullable
    java.lang.String productEntityID, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.app.touch_of_jasmine.data_source.local_db.DBConfigurableOptionModel> configurableOptionModel);
    
    @androidx.room.Query(value = "DELETE from ProductDataDbModel where entityID=:productEntityID")
    public abstract void deleteProductFromCart(@org.jetbrains.annotations.Nullable
    java.lang.String productEntityID);
    
    @androidx.room.Query(value = "SELECT DISTINCT quantity FROM ProductDataDbModel WHERE entityID IN (:productEntityID)")
    public abstract int getQtyInCart(@org.jetbrains.annotations.Nullable
    java.lang.String productEntityID);
    
    @androidx.room.Query(value = "SELECT * FROM ProductDataDbModel")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.app.touch_of_jasmine.data_source.local_db.ProductDataDbModel> getTotalCartProductCount();
    
    @androidx.room.Query(value = "SELECT entityID FROM ProductDataDbModel WHERE entityID=:productEntityID")
    public abstract boolean isProductPresentInCart(@org.jetbrains.annotations.Nullable
    java.lang.String productEntityID);
    
    @androidx.room.Query(value = "SELECT * FROM ProductDataDbModel")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.app.touch_of_jasmine.data_source.local_db.ProductDataDbModel> getAllCartProducts();
    
    @androidx.room.Query(value = "DELETE FROM ProductDataDbModel")
    public abstract void deleteCartTable();
}