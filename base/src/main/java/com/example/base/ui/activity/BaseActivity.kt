package com.example.base.ui.activity

import android.Manifest
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.example.base.ui.util.toast

/**
 * @author:SunShibo
 * @date:2022-08-22 23:01
 * @feature:
 */
open class BaseActivity : FragmentActivity(){
    private val requestPermissions = registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()){
            isGranted ->
        for((name, granted) in isGranted){
            if (!granted){
                toast("${name}权限请求失败")
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        initPermission()
    }

    private fun initPermission() {
        requestPermissions.launch(
            arrayOf(
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.RECORD_AUDIO,
                Manifest.permission.MANAGE_EXTERNAL_STORAGE,
                Manifest.permission.BLUETOOTH,
                Manifest.permission.FOREGROUND_SERVICE,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION
            )
        )
    }
}