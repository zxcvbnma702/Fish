package com.example.base.ui.util

import android.view.View
import android.widget.ProgressBar

/**
 * @author:SunShibo
 * @date:2022-09-07 15:03
 * @feature: Some View ext
 */

fun ProgressBar.show() {
    visibility = View.VISIBLE
}


fun ProgressBar.hide() {
    visibility = View.GONE
}
