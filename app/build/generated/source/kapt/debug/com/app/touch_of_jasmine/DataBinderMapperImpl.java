package com.app.touch_of_jasmine;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.app.touch_of_jasmine.databinding.ActivityHomeBindingImpl;
import com.app.touch_of_jasmine.databinding.ActivityIntroBindingImpl;
import com.app.touch_of_jasmine.databinding.ActivityLoginBindingImpl;
import com.app.touch_of_jasmine.databinding.ActivitySplashBindingImpl;
import com.app.touch_of_jasmine.databinding.LayoutCalenderBindingImpl;
import com.app.touch_of_jasmine.databinding.LayoutCustomAlertBindingImpl;
import com.app.touch_of_jasmine.databinding.LayoutEmptyBindingImpl;
import com.app.touch_of_jasmine.databinding.LayoutImagePickerBindingImpl;
import com.app.touch_of_jasmine.databinding.LayoutSnackBarBindingImpl;
import com.app.touch_of_jasmine.databinding.LayoutToolbarBindingImpl;
import com.app.touch_of_jasmine.databinding.LvItemFooterLoadingBindingImpl;
import com.app.touch_of_jasmine.databinding.NavHeaderLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYHOME = 1;

  private static final int LAYOUT_ACTIVITYINTRO = 2;

  private static final int LAYOUT_ACTIVITYLOGIN = 3;

  private static final int LAYOUT_ACTIVITYSPLASH = 4;

  private static final int LAYOUT_LAYOUTCALENDER = 5;

  private static final int LAYOUT_LAYOUTCUSTOMALERT = 6;

  private static final int LAYOUT_LAYOUTEMPTY = 7;

  private static final int LAYOUT_LAYOUTIMAGEPICKER = 8;

  private static final int LAYOUT_LAYOUTSNACKBAR = 9;

  private static final int LAYOUT_LAYOUTTOOLBAR = 10;

  private static final int LAYOUT_LVITEMFOOTERLOADING = 11;

  private static final int LAYOUT_NAVHEADERLAYOUT = 12;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(12);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.touch_of_jasmine.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.touch_of_jasmine.R.layout.activity_intro, LAYOUT_ACTIVITYINTRO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.touch_of_jasmine.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.touch_of_jasmine.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.touch_of_jasmine.R.layout.layout_calender, LAYOUT_LAYOUTCALENDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.touch_of_jasmine.R.layout.layout_custom_alert, LAYOUT_LAYOUTCUSTOMALERT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.touch_of_jasmine.R.layout.layout_empty, LAYOUT_LAYOUTEMPTY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.touch_of_jasmine.R.layout.layout_image_picker, LAYOUT_LAYOUTIMAGEPICKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.touch_of_jasmine.R.layout.layout_snack_bar, LAYOUT_LAYOUTSNACKBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.touch_of_jasmine.R.layout.layout_toolbar, LAYOUT_LAYOUTTOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.touch_of_jasmine.R.layout.lv_item_footer_loading, LAYOUT_LVITEMFOOTERLOADING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.touch_of_jasmine.R.layout.nav_header_layout, LAYOUT_NAVHEADERLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYINTRO: {
          if ("layout/activity_intro_0".equals(tag)) {
            return new ActivityIntroBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_intro is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTCALENDER: {
          if ("layout/layout_calender_0".equals(tag)) {
            return new LayoutCalenderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_calender is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTCUSTOMALERT: {
          if ("layout/layout_custom_alert_0".equals(tag)) {
            return new LayoutCustomAlertBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_custom_alert is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTEMPTY: {
          if ("layout/layout_empty_0".equals(tag)) {
            return new LayoutEmptyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_empty is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTIMAGEPICKER: {
          if ("layout/layout_image_picker_0".equals(tag)) {
            return new LayoutImagePickerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_image_picker is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSNACKBAR: {
          if ("layout/layout_snack_bar_0".equals(tag)) {
            return new LayoutSnackBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_snack_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTTOOLBAR: {
          if ("layout/layout_toolbar_0".equals(tag)) {
            return new LayoutToolbarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_toolbar is invalid. Received: " + tag);
        }
        case  LAYOUT_LVITEMFOOTERLOADING: {
          if ("layout/lv_item_footer_loading_0".equals(tag)) {
            return new LvItemFooterLoadingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for lv_item_footer_loading is invalid. Received: " + tag);
        }
        case  LAYOUT_NAVHEADERLAYOUT: {
          if ("layout/nav_header_layout_0".equals(tag)) {
            return new NavHeaderLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for nav_header_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(12);

    static {
      sKeys.put("layout/activity_home_0", com.app.touch_of_jasmine.R.layout.activity_home);
      sKeys.put("layout/activity_intro_0", com.app.touch_of_jasmine.R.layout.activity_intro);
      sKeys.put("layout/activity_login_0", com.app.touch_of_jasmine.R.layout.activity_login);
      sKeys.put("layout/activity_splash_0", com.app.touch_of_jasmine.R.layout.activity_splash);
      sKeys.put("layout/layout_calender_0", com.app.touch_of_jasmine.R.layout.layout_calender);
      sKeys.put("layout/layout_custom_alert_0", com.app.touch_of_jasmine.R.layout.layout_custom_alert);
      sKeys.put("layout/layout_empty_0", com.app.touch_of_jasmine.R.layout.layout_empty);
      sKeys.put("layout/layout_image_picker_0", com.app.touch_of_jasmine.R.layout.layout_image_picker);
      sKeys.put("layout/layout_snack_bar_0", com.app.touch_of_jasmine.R.layout.layout_snack_bar);
      sKeys.put("layout/layout_toolbar_0", com.app.touch_of_jasmine.R.layout.layout_toolbar);
      sKeys.put("layout/lv_item_footer_loading_0", com.app.touch_of_jasmine.R.layout.lv_item_footer_loading);
      sKeys.put("layout/nav_header_layout_0", com.app.touch_of_jasmine.R.layout.nav_header_layout);
    }
  }
}
