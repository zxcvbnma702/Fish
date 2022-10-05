package com.example.mylibrary.resource

import android.graphics.Bitmap
import android.util.Log

/**
 * @author:SunShibo
 * @date:2022-09-29 22:24
 * @feature:
 */
class Value {
    private val TAG = Value::class.java.simpleName;

    private lateinit var bitmap: Bitmap

    private lateinit var valueCallback: ValueCallback

    private var count = 0

    fun useAction() {
        if (bitmap == null) throw RuntimeException("Bitmap can`t be null")

        if (bitmap.isRecycled) {
            Log.d(TAG, "useAction: count: $count")
            return
        }
        count++
    }

    fun nonUseAction() {
        if (count-- <= 0) {

        }
    }

}