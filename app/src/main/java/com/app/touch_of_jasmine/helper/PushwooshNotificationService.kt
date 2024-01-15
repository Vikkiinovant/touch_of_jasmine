package com.app.touch_of_jasmine.helper

import android.content.Intent
import androidx.annotation.MainThread
import com.app.touch_of_jasmine.helper.Extensions.printLog
import com.app.touch_of_jasmine.mvvm.home.view.HomeActivity
import com.pushwoosh.Pushwoosh
import com.pushwoosh.notification.NotificationServiceExtension
import com.pushwoosh.notification.PushMessage

class PushwooshNotificationService : NotificationServiceExtension() {

    override fun startActivityForPushMessage(message: PushMessage) {
        handlePush(message)
    }

    @MainThread
    private fun handlePush(message: PushMessage) {
        message.toJson().toString().printLog("Pushwoosh Msg")
        val launchIntent = Intent(applicationContext, HomeActivity::class.java)
        launchIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        launchIntent.putExtra("isFromPush", "yes")
        launchIntent.putExtra(Pushwoosh.PUSH_RECEIVE_EVENT, message.toJson().toString())
        applicationContext?.startActivity(launchIntent)
    }
}