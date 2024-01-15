// Generated by data binding compiler. Do not edit!
package com.app.touch_of_jasmine.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.touch_of_jasmine.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutCustomAlertBinding extends ViewDataBinding {
  @NonNull
  public final TextView btnAlertNegative;

  @NonNull
  public final TextView btnAlertPositive;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final ConstraintLayout conAlert;

  @NonNull
  public final ImageView ivAlert;

  @NonNull
  public final TextView txtAlertMessage;

  @NonNull
  public final TextView txtAlertTitle;

  protected LayoutCustomAlertBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView btnAlertNegative, TextView btnAlertPositive, CardView cardView,
      ConstraintLayout conAlert, ImageView ivAlert, TextView txtAlertMessage,
      TextView txtAlertTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnAlertNegative = btnAlertNegative;
    this.btnAlertPositive = btnAlertPositive;
    this.cardView = cardView;
    this.conAlert = conAlert;
    this.ivAlert = ivAlert;
    this.txtAlertMessage = txtAlertMessage;
    this.txtAlertTitle = txtAlertTitle;
  }

  @NonNull
  public static LayoutCustomAlertBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_custom_alert, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutCustomAlertBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutCustomAlertBinding>inflateInternal(inflater, R.layout.layout_custom_alert, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutCustomAlertBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_custom_alert, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutCustomAlertBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutCustomAlertBinding>inflateInternal(inflater, R.layout.layout_custom_alert, null, false, component);
  }

  public static LayoutCustomAlertBinding bind(@NonNull View view) {
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
  public static LayoutCustomAlertBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutCustomAlertBinding)bind(component, view, R.layout.layout_custom_alert);
  }
}