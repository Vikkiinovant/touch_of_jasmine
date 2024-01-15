package com.app.touch_of_jasmine.helper.interfaces

import android.view.View

interface AlertDialogInterface {
    fun onYesClick() {}
    fun onNoClick() {}
    fun onCloseDialog() {}
    fun onSubmitPasswordClick(emailID: String, view: View) {}
}