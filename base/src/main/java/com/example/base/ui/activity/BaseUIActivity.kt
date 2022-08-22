package com.example.base.ui.activity

import android.graphics.Color
import android.os.Bundle
import android.view.View
import com.example.base.ui.activity.BaseActivity

/**
 * @author:SunShibo
 * @date:2022-08-22 23:01
 * @feature:
 */
open class BaseUIActivity: BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE)
        window.statusBarColor = Color.TRANSPARENT
    }
}