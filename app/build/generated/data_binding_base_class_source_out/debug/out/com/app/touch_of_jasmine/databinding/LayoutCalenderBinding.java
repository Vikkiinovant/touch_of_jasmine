// Generated by data binding compiler. Do not edit!
package com.app.touch_of_jasmine.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.touch_of_jasmine.R;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutCalenderBinding extends ViewDataBinding {
  @NonNull
  public final MaterialCalendarView calendarView;

  @NonNull
  public final ConstraintLayout conCalendar;

  @NonNull
  public final ImageView ivCalendarArrow;

  @NonNull
  public final TextView txtMonth;

  @NonNull
  public final View viewDivLine;

  protected LayoutCalenderBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialCalendarView calendarView, ConstraintLayout conCalendar, ImageView ivCalendarArrow,
      TextView txtMonth, View viewDivLine) {
    super(_bindingComponent, _root, _localFieldCount);
    this.calendarView = calendarView;
    this.conCalendar = conCalendar;
    this.ivCalendarArrow = ivCalendarArrow;
    this.txtMonth = txtMonth;
    this.viewDivLine = viewDivLine;
  }

  @NonNull
  public static LayoutCalenderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_calender, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutCalenderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutCalenderBinding>inflateInternal(inflater, R.layout.layout_calender, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutCalenderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_calender, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutCalenderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutCalenderBinding>inflateInternal(inflater, R.layout.layout_calender, null, false, component);
  }

  public static LayoutCalenderBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static LayoutCalenderBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutCalenderBinding)bind(component, view, R.layout.layout_calender);
  }
}