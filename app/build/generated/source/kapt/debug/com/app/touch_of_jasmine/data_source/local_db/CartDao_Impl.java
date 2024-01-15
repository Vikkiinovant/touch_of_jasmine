package com.app.touch_of_jasmine.data_source.local_db;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class CartDao_Impl implements CartDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ProductDataDbModel> __insertionAdapterOfProductDataDbModel;

  private final SharedSQLiteStatement __preparedStmtOfUpdateProductsInCart;

  private final SharedSQLiteStatement __preparedStmtOfUpdateProductsInCartOffline;

  private final SharedSQLiteStatement __preparedStmtOfDeleteProductFromCart;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCartTable;

  public CartDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProductDataDbModel = new EntityInsertionAdapter<ProductDataDbModel>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `ProductDataDbModel` (`id`,`productID`,`entityID`,`categoryID`,`productName`,`brandName`,`sku`,`image`,`quantity`,`finalPrice`,`regularPrice`,`discount`,`remainingQuantity`,`configOptions`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ProductDataDbModel entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getProductID() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getProductID());
        }
        if (entity.getEntityID() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getEntityID());
        }
        if (entity.getCategoryID() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getCategoryID());
        }
        if (entity.getName() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getName());
        }
        if (entity.getBrand() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getBrand());
        }
        if (entity.getSku() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getSku());
        }
        if (entity.getImage() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getImage());
        }
        if (entity.getQuantity() == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, entity.getQuantity());
        }
        if (entity.getFinalPrice() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getFinalPrice());
        }
        if (entity.getRegularPrice() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getRegularPrice());
        }
        if (entity.getDiscount() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getDiscount());
        }
        if (entity.getRemainingQuantity() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getRemainingQuantity());
        }
        final String _tmp = Converters.fromArrayList(entity.getConfigOptions());
        if (_tmp == null) {
          statement.bindNull(14);
        } else {
          statement.bindString(14, _tmp);
        }
      }
    };
    this.__preparedStmtOfUpdateProductsInCart = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE ProductDataDbModel SET quantity =? WHERE entityID = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateProductsInCartOffline = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE ProductDataDbModel SET quantity =?,productID =?,entityID =?,configOptions =? WHERE entityID = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteProductFromCart = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE from ProductDataDbModel where entityID=?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteCartTable = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM ProductDataDbModel";
        return _query;
      }
    };
  }

  @Override
  public void addProductToCart(final ProductDataDbModel... products) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfProductDataDbModel.insert(products);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateProductsInCart(final Integer strQty, final String productEntityID) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateProductsInCart.acquire();
    int _argIndex = 1;
    if (strQty == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindLong(_argIndex, strQty);
    }
    _argIndex = 2;
    if (productEntityID == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, productEntityID);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateProductsInCart.release(_stmt);
    }
  }

  @Override
  public void updateProductsInCartOffline(final String strQty, final String productID,
      final String productEntityID,
      final ArrayList<DBConfigurableOptionModel> configurableOptionModel) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateProductsInCartOffline.acquire();
    int _argIndex = 1;
    if (strQty == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, strQty);
    }
    _argIndex = 2;
    if (productID == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, productID);
    }
    _argIndex = 3;
    if (productEntityID == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, productEntityID);
    }
    _argIndex = 4;
    final String _tmp = Converters.fromArrayList(configurableOptionModel);
    if (_tmp == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, _tmp);
    }
    _argIndex = 5;
    if (productEntityID == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, productEntityID);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateProductsInCartOffline.release(_stmt);
    }
  }

  @Override
  public void deleteProductFromCart(final String productEntityID) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteProductFromCart.acquire();
    int _argIndex = 1;
    if (productEntityID == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, productEntityID);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteProductFromCart.release(_stmt);
    }
  }

  @Override
  public void deleteCartTable() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCartTable.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteCartTable.release(_stmt);
    }
  }

  @Override
  public int getQtyInCart(final String productEntityID) {
    final String _sql = "SELECT DISTINCT quantity FROM ProductDataDbModel WHERE entityID IN (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (productEntityID == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productEntityID);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ProductDataDbModel> getTotalCartProductCount() {
    final String _sql = "SELECT * FROM ProductDataDbModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfProductID = CursorUtil.getColumnIndexOrThrow(_cursor, "productID");
      final int _cursorIndexOfEntityID = CursorUtil.getColumnIndexOrThrow(_cursor, "entityID");
      final int _cursorIndexOfCategoryID = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryID");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "productName");
      final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brandName");
      final int _cursorIndexOfSku = CursorUtil.getColumnIndexOrThrow(_cursor, "sku");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
      final int _cursorIndexOfFinalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "finalPrice");
      final int _cursorIndexOfRegularPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "regularPrice");
      final int _cursorIndexOfDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount");
      final int _cursorIndexOfRemainingQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "remainingQuantity");
      final int _cursorIndexOfConfigOptions = CursorUtil.getColumnIndexOrThrow(_cursor, "configOptions");
      final List<ProductDataDbModel> _result = new ArrayList<ProductDataDbModel>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final ProductDataDbModel _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpProductID;
        if (_cursor.isNull(_cursorIndexOfProductID)) {
          _tmpProductID = null;
        } else {
          _tmpProductID = _cursor.getString(_cursorIndexOfProductID);
        }
        final String _tmpEntityID;
        if (_cursor.isNull(_cursorIndexOfEntityID)) {
          _tmpEntityID = null;
        } else {
          _tmpEntityID = _cursor.getString(_cursorIndexOfEntityID);
        }
        final String _tmpCategoryID;
        if (_cursor.isNull(_cursorIndexOfCategoryID)) {
          _tmpCategoryID = null;
        } else {
          _tmpCategoryID = _cursor.getString(_cursorIndexOfCategoryID);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpBrand;
        if (_cursor.isNull(_cursorIndexOfBrand)) {
          _tmpBrand = null;
        } else {
          _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
        }
        final String _tmpSku;
        if (_cursor.isNull(_cursorIndexOfSku)) {
          _tmpSku = null;
        } else {
          _tmpSku = _cursor.getString(_cursorIndexOfSku);
        }
        final String _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getString(_cursorIndexOfImage);
        }
        final Integer _tmpQuantity;
        if (_cursor.isNull(_cursorIndexOfQuantity)) {
          _tmpQuantity = null;
        } else {
          _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
        }
        final String _tmpFinalPrice;
        if (_cursor.isNull(_cursorIndexOfFinalPrice)) {
          _tmpFinalPrice = null;
        } else {
          _tmpFinalPrice = _cursor.getString(_cursorIndexOfFinalPrice);
        }
        final String _tmpRegularPrice;
        if (_cursor.isNull(_cursorIndexOfRegularPrice)) {
          _tmpRegularPrice = null;
        } else {
          _tmpRegularPrice = _cursor.getString(_cursorIndexOfRegularPrice);
        }
        final String _tmpDiscount;
        if (_cursor.isNull(_cursorIndexOfDiscount)) {
          _tmpDiscount = null;
        } else {
          _tmpDiscount = _cursor.getString(_cursorIndexOfDiscount);
        }
        final String _tmpRemainingQuantity;
        if (_cursor.isNull(_cursorIndexOfRemainingQuantity)) {
          _tmpRemainingQuantity = null;
        } else {
          _tmpRemainingQuantity = _cursor.getString(_cursorIndexOfRemainingQuantity);
        }
        final ArrayList<DBConfigurableOptionModel> _tmpConfigOptions;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfConfigOptions)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfConfigOptions);
        }
        _tmpConfigOptions = Converters.fromString(_tmp);
        _item = new ProductDataDbModel(_tmpId,_tmpProductID,_tmpEntityID,_tmpCategoryID,_tmpName,_tmpBrand,_tmpSku,_tmpImage,_tmpQuantity,_tmpFinalPrice,_tmpRegularPrice,_tmpDiscount,_tmpRemainingQuantity,_tmpConfigOptions);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public boolean isProductPresentInCart(final String productEntityID) {
    final String _sql = "SELECT entityID FROM ProductDataDbModel WHERE entityID=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (productEntityID == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productEntityID);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if (_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ProductDataDbModel> getAllCartProducts() {
    final String _sql = "SELECT * FROM ProductDataDbModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfProductID = CursorUtil.getColumnIndexOrThrow(_cursor, "productID");
      final int _cursorIndexOfEntityID = CursorUtil.getColumnIndexOrThrow(_cursor, "entityID");
      final int _cursorIndexOfCategoryID = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryID");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "productName");
      final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brandName");
      final int _cursorIndexOfSku = CursorUtil.getColumnIndexOrThrow(_cursor, "sku");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
      final int _cursorIndexOfFinalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "finalPrice");
      final int _cursorIndexOfRegularPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "regularPrice");
      final int _cursorIndexOfDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount");
      final int _cursorIndexOfRemainingQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "remainingQuantity");
      final int _cursorIndexOfConfigOptions = CursorUtil.getColumnIndexOrThrow(_cursor, "configOptions");
      final List<ProductDataDbModel> _result = new ArrayList<ProductDataDbModel>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final ProductDataDbModel _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpProductID;
        if (_cursor.isNull(_cursorIndexOfProductID)) {
          _tmpProductID = null;
        } else {
          _tmpProductID = _cursor.getString(_cursorIndexOfProductID);
        }
        final String _tmpEntityID;
        if (_cursor.isNull(_cursorIndexOfEntityID)) {
          _tmpEntityID = null;
        } else {
          _tmpEntityID = _cursor.getString(_cursorIndexOfEntityID);
        }
        final String _tmpCategoryID;
        if (_cursor.isNull(_cursorIndexOfCategoryID)) {
          _tmpCategoryID = null;
        } else {
          _tmpCategoryID = _cursor.getString(_cursorIndexOfCategoryID);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpBrand;
        if (_cursor.isNull(_cursorIndexOfBrand)) {
          _tmpBrand = null;
        } else {
          _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
        }
        final String _tmpSku;
        if (_cursor.isNull(_cursorIndexOfSku)) {
          _tmpSku = null;
        } else {
          _tmpSku = _cursor.getString(_cursorIndexOfSku);
        }
        final String _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getString(_cursorIndexOfImage);
        }
        final Integer _tmpQuantity;
        if (_cursor.isNull(_cursorIndexOfQuantity)) {
          _tmpQuantity = null;
        } else {
          _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
        }
        final String _tmpFinalPrice;
        if (_cursor.isNull(_cursorIndexOfFinalPrice)) {
          _tmpFinalPrice = null;
        } else {
          _tmpFinalPrice = _cursor.getString(_cursorIndexOfFinalPrice);
        }
        final String _tmpRegularPrice;
        if (_cursor.isNull(_cursorIndexOfRegularPrice)) {
          _tmpRegularPrice = null;
        } else {
          _tmpRegularPrice = _cursor.getString(_cursorIndexOfRegularPrice);
        }
        final String _tmpDiscount;
        if (_cursor.isNull(_cursorIndexOfDiscount)) {
          _tmpDiscount = null;
        } else {
          _tmpDiscount = _cursor.getString(_cursorIndexOfDiscount);
        }
        final String _tmpRemainingQuantity;
        if (_cursor.isNull(_cursorIndexOfRemainingQuantity)) {
          _tmpRemainingQuantity = null;
        } else {
          _tmpRemainingQuantity = _cursor.getString(_cursorIndexOfRemainingQuantity);
        }
        final ArrayList<DBConfigurableOptionModel> _tmpConfigOptions;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfConfigOptions)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfConfigOptions);
        }
        _tmpConfigOptions = Converters.fromString(_tmp);
        _item = new ProductDataDbModel(_tmpId,_tmpProductID,_tmpEntityID,_tmpCategoryID,_tmpName,_tmpBrand,_tmpSku,_tmpImage,_tmpQuantity,_tmpFinalPrice,_tmpRegularPrice,_tmpDiscount,_tmpRemainingQuantity,_tmpConfigOptions);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
