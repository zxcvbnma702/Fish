package com.example.base.ui.util

import android.content.Context
import android.widget.Toast

/**
 * @author:SunShibo
 * @date:2022-08-22 23:12
 * @feature:
 */
fun Context.toast(content: String) =
    Toast.makeText(this, content, Toast.LENGTH_SHORT).show()
