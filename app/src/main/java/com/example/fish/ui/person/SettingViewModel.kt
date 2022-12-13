package com.example.fish.ui.person

import androidx.lifecycle.ViewModel
import com.example.fish.FishApplication
import com.example.fish.logic.Repository
import com.luck.picture.lib.entity.LocalMedia
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * @author:SunShibo
 * @date:2022-12-13 10:58
 * @feature:
 */
class SettingViewModel : ViewModel() {

    private val userId = FishApplication.sp.getString(FishApplication.userID, "0")

    var imageCode: String? = null
    private var settingListener: SettingListener? = null
    var imageList: MutableList<LocalMedia> = mutableListOf()

    internal fun uploadAvator() {
        uploadFile()
        if (imageCode != null) {
            val ava = mapOf(
                "avatar" to imageCode,
                "userId" to userId
            )
            val response = Repository.uploadAvatar(ava as Map<String, String>)
            settingListener?.onSendListener(response)
        }

    }

    private fun uploadFile() {
        val partList = createList()
        val response = Repository.uploadMoreFiles(partList)
        settingListener?.onUploadComplete(response)
    }

    private fun createList(): List<MultipartBody.Part> {
        val parts: MutableList<MultipartBody.Part> = mutableListOf()
        for (url in imageList) {
            val file = File(url.realPath)
            val body = RequestBody.create(MediaType.parse("multipart/form-data"), file)
            val part = MultipartBody.Part.createFormData("fileList", file.name, body)
            parts.add(part)
        }
        return parts
    }
}