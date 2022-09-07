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
        const val appId = "00871f090e174fb7bf20fb1a6a7f71e2"
        const val appSecret = "863547048aa7289c0425787b4e8558bb15e68"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}