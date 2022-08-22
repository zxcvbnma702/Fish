package com.example.fish

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * @author:SunShibo
 * @date:2022-08-22 22:51
 * @feature:
 */
class FishApplication : Application(){
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}