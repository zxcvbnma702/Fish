package com.example.base.ui.util

import android.content.Context
import android.content.SharedPreferences
import android.widget.Toast

/**
 * @author:SunShibo
 * @date:2022-08-22 23:12
 * @feature: some ext func
 */

fun Context.toast(content: String) =
    Toast.makeText(this, content, Toast.LENGTH_SHORT).show()

fun Context.toast(res: Int) =
    Toast.makeText(this, getString(res), Toast.LENGTH_SHORT).show()

fun Context.toast(res: Int, vararg context: String) {
    var content: String? = null
    for (element in context){
        if(element == " "){
            continue
        }
        content += " , "
        content += element
    }
    Toast.makeText(this, getString(res) + content, Toast.LENGTH_SHORT).show()
}

fun Context.initSp(): SharedPreferences =
    this.getSharedPreferences("LoginStatus", Context.MODE_PRIVATE)




