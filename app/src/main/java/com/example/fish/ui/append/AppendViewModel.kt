package com.example.fish.ui.append

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.base.ui.kxt.toast
import com.example.fish.FishApplication
import com.example.fish.logic.Repository
import com.luck.picture.lib.entity.LocalMedia
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * @author:SunShibo
 * @date:2022-09-17 23:00
 * @feature:
 */
class AppendViewModel: ViewModel() {

    private val userId = FishApplication.sp.getString(FishApplication.userID, "0")

    var types: MutableList<String> = mutableListOf()

    var title: String ?= null
    var content: String ?= null
    var address: String ?= null
    var price: String ?= null
    var typeId: String ?= null
    var typeName: String? = null
    var imageCode: String? = null

    var currentType = false

    internal var appendListener: AppendListener ?= null

    var imageList: MutableList<LocalMedia> = mutableListOf()

    fun send(view: View){
        if(checkNull()) {
            uploadFile()
            if (imageCode == null) {
                FishApplication.context.toast("图片上传中...")
                return
            }
            val response = Repository.postGoodInformation(
                address!!,
                title!! + "\n" + content!!,
                imageCode!!,
                price!!,
                typeId!!,
                typeName!!,
                userId!!
            )
            appendListener?.onSendListener(response)
        }else{
            FishApplication.context.toast("请将商品信息填写完整")
        }
    }

    fun save(view: View){
        if(checkNull()) {
            uploadFile()
            if (imageCode == null) {
                FishApplication.context.toast("图片上传中...")
                return
            }
            val response = Repository.saveGoodInformation(
                address!!,
                title!! + "\n" + content!!,
                imageCode!!,
                price!!,
                typeId!!,
                typeName!!,
                userId!!
            )
            appendListener?.onSaveListener(response)
        }else{
            FishApplication.context.toast("请将商品信息填写完整")
        }
    }

    fun getGoodTypes() {
        val types = Repository.getGoodTypes()
        appendListener?.onGoodTypes(types)
    }

    private fun checkNull(): Boolean {
        return !(title == null || content == null || address == null || price == null || typeId == null || typeName == null)
    }

    private fun uploadFile() {
        val partList = createList()
        val response = Repository.uploadMoreFiles(partList)
        appendListener?.onUploadComplete(response)
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