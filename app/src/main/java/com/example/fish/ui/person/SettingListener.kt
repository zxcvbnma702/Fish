package com.example.fish.ui.person

import androidx.lifecycle.LiveData
import com.example.fish.logic.network.model.UploadData
import com.example.fish.logic.network.model.VerifyResponse
import retrofit2.Call

/**
 * @author:SunShibo
 * @date:2022-12-13 10:59
 * @feature:
 */
interface SettingListener {
    fun onSendListener(response: LiveData<Result<Call<VerifyResponse>>>)
    fun onUploadComplete(response: LiveData<Result<UploadData>>)
}