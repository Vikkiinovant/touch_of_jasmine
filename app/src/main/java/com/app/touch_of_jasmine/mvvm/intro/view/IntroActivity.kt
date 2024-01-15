package com.app.touch_of_jasmine.mvvm.intro.view

import AppNavigation.navigateToLogin
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.app.touch_of_jasmine.R
import com.app.touch_of_jasmine.databinding.ActivityIntroBinding
import com.app.touch_of_jasmine.helper.AppController

class IntroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_intro)

        onClickListeners()
    }

    private fun onClickListeners(){
        binding.btnEnglish.setOnClickListener {
            AppController.instance.englishLanguage()
            navigateToLogin()
        }
        binding.btnArabic.setOnClickListener {
            AppController.instance.arabicLanguage()
            navigateToLogin()
        }
    }
}