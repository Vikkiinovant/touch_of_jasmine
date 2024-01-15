// Generated by view binder compiler. Do not edit!
package com.app.touch_of_jasmine.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.app.touch_of_jasmine.R;
import com.app.touch_of_jasmine.helper.WheelView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutBottomSheetPickerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView txtCancel;

  @NonNull
  public final TextView txtDone;

  @NonNull
  public final WheelView wheelView;

  private LayoutBottomSheetPickerBinding(@NonNull LinearLayout rootView,
      @NonNull TextView txtCancel, @NonNull TextView txtDone, @NonNull WheelView wheelView) {
    this.rootView = rootView;
    this.txtCancel = txtCancel;
    this.txtDone = txtDone;
    this.wheelView = wheelView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutBottomSheetPickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutBottomSheetPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_bottom_sheet_picker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutBottomSheetPickerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.txtCancel;
      TextView txtCancel = ViewBindings.findChildViewById(rootView, id);
      if (txtCancel == null) {
        break missingId;
      }

      id = R.id.txtDone;
      TextView txtDone = ViewBindings.findChildViewById(rootView, id);
      if (txtDone == null) {
        break missingId;
      }

      id = R.id.wheelView;
      WheelView wheelView = ViewBindings.findChildViewById(rootView, id);
      if (wheelView == null) {
        break missingId;
      }

      return new LayoutBottomSheetPickerBinding((LinearLayout) rootView, txtCancel, txtDone,
          wheelView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
