package com.app.touch_of_jasmine.data_source.local_db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00a7\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012 \b\u0003\u0010\u0011\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u0001`\u0014\u00a2\u0006\u0002\u0010\u0015J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u00102\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u0001`\u0014H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u00c8\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052 \b\u0003\u0010\u0011\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u0001`\u0014H\u00c6\u0001\u00a2\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010@\u001a\u00020\u0003H\u00d6\u0001J\t\u0010A\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R.\u0010\u0011\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u0001`\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\"\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0017R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0017\u00a8\u0006B"}, d2 = {"Lcom/app/touch_of_jasmine/data_source/local_db/ProductDataDbModel;", "", "id", "", "productID", "", "entityID", "categoryID", "name", "brand", "sku", "image", "quantity", "finalPrice", "regularPrice", "discount", "remainingQuantity", "configOptions", "Ljava/util/ArrayList;", "Lcom/app/touch_of_jasmine/data_source/local_db/DBConfigurableOptionModel;", "Lkotlin/collections/ArrayList;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getBrand", "()Ljava/lang/String;", "getCategoryID", "getConfigOptions", "()Ljava/util/ArrayList;", "getDiscount", "getEntityID", "getFinalPrice", "getId", "()I", "setId", "(I)V", "getImage", "getName", "getProductID", "getQuantity", "()Ljava/lang/Integer;", "setQuantity", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRegularPrice", "getRemainingQuantity", "getSku", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Lcom/app/touch_of_jasmine/data_source/local_db/ProductDataDbModel;", "equals", "", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity
public final class ProductDataDbModel {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @androidx.room.ColumnInfo(name = "productID")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String productID = null;
    @androidx.room.ColumnInfo(name = "entityID")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String entityID = null;
    @androidx.room.ColumnInfo(name = "categoryID")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String categoryID = null;
    @androidx.room.ColumnInfo(name = "productName")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String name = null;
    @androidx.room.ColumnInfo(name = "brandName")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String brand = null;
    @androidx.room.ColumnInfo(name = "sku")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String sku = null;
    @androidx.room.ColumnInfo(name = "image")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String image = null;
    @androidx.room.ColumnInfo(name = "quantity")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer quantity;
    @androidx.room.ColumnInfo(name = "finalPrice")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String finalPrice = null;
    @androidx.room.ColumnInfo(name = "regularPrice")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String regularPrice = null;
    @androidx.room.ColumnInfo(name = "discount")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String discount = null;
    @androidx.room.ColumnInfo(name = "remainingQuantity")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String remainingQuantity = null;
    @androidx.room.ColumnInfo(name = "configOptions")
    @org.jetbrains.annotations.Nullable
    private final java.util.ArrayList<com.app.touch_of_jasmine.data_source.local_db.DBConfigurableOptionModel> configOptions = null;
    
    public ProductDataDbModel(int id, @org.jetbrains.annotations.NotNull
    java.lang.String productID, @org.jetbrains.annotations.Nullable
    java.lang.String entityID, @org.jetbrains.annotations.Nullable
    java.lang.String categoryID, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String brand, @org.jetbrains.annotations.Nullable
    java.lang.String sku, @org.jetbrains.annotations.Nullable
    java.lang.String image, @org.jetbrains.annotations.Nullable
    java.lang.Integer quantity, @org.jetbrains.annotations.Nullable
    java.lang.String finalPrice, @org.jetbrains.annotations.Nullable
    java.lang.String regularPrice, @org.jetbrains.annotations.Nullable
    java.lang.String discount, @org.jetbrains.annotations.Nullable
    java.lang.String remainingQuantity, @androidx.room.TypeConverters(value = {com.app.touch_of_jasmine.data_source.local_db.Converters.class})
    @org.jetbrains.annotations.Nullable
    java.util.ArrayList<com.app.touch_of_jasmine.data_source.local_db.DBConfigurableOptionModel> configOptions) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProductID() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEntityID() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCategoryID() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBrand() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSku() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getQuantity() {
        return null;
    }
    
    public final void setQuantity(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFinalPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRegularPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDiscount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRemainingQuantity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.ArrayList<com.app.touch_of_jasmine.data_source.local_db.DBConfigurableOptionModel> getConfigOptions() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.ArrayList<com.app.touch_of_jasmine.data_source.local_db.DBConfigurableOptionModel> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.touch_of_jasmine.data_source.local_db.ProductDataDbModel copy(int id, @org.jetbrains.annotations.NotNull
    java.lang.String productID, @org.jetbrains.annotations.Nullable
    java.lang.String entityID, @org.jetbrains.annotations.Nullable
    java.lang.String categoryID, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String brand, @org.jetbrains.annotations.Nullable
    java.lang.String sku, @org.jetbrains.annotations.Nullable
    java.lang.String image, @org.jetbrains.annotations.Nullable
    java.lang.Integer quantity, @org.jetbrains.annotations.Nullable
    java.lang.String finalPrice, @org.jetbrains.annotations.Nullable
    java.lang.String regularPrice, @org.jetbrains.annotations.Nullable
    java.lang.String discount, @org.jetbrains.annotations.Nullable
    java.lang.String remainingQuantity, @androidx.room.TypeConverters(value = {com.app.touch_of_jasmine.data_source.local_db.Converters.class})
    @org.jetbrains.annotations.Nullable
    java.util.ArrayList<com.app.touch_of_jasmine.data_source.local_db.DBConfigurableOptionModel> configOptions) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}