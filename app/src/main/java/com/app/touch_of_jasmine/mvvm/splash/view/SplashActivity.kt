package com.app.touch_of_jasmine.mvvm.splash.view

import AppNavigation.navigateToHome
import AppNavigation.navigateToIntro
import android.annotation.SuppressLint
import android.os.Bundle

import androidx.databinding.DataBindingUtil
import com.app.touch_of_jasmine.R
import com.app.touch_of_jasmine.databinding.ActivitySplashBinding
import com.app.touch_of_jasmine.helper.BaseActivity
import com.app.touch_of_jasmine.helper.Extensions.handler
import com.app.touch_of_jasmine.helper.PrefUtils.isUserLoggedIn

@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity() {

    override fun onStart() {
        super.onStart()
        // Branch init
        /** after adding branch key in strings uncomment this*/
        /*Branch.sessionBuilder(this)
            .withData(this.intent.data)
            .withCallback { referringParams, error ->
                initSaveDeepLink(referringParams, error)
            }.init()*/
    }

    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        initializeFields()
    }

    private fun initializeFields() {
        handler(3000) {
            if (isUserLoggedIn()) {
                navigateToHome { finish() }
            } else {
                navigateToIntro()
                finish()
            }
        }
    }
}
