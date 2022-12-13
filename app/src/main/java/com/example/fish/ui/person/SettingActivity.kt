package com.example.fish.ui.person

import android.content.Context
import android.content.Intent
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.base.ui.activity.BaseActivity
import com.example.base.ui.kxt.toast
import com.example.fish.databinding.ModifyPersonalInformationBinding
import com.example.fish.logic.network.model.UploadData
import com.example.fish.logic.network.model.VerifyResponse
import com.luck.picture.lib.basic.PictureSelector
import com.luck.picture.lib.config.SelectMimeType
import com.luck.picture.lib.entity.LocalMedia
import com.luck.picture.lib.interfaces.OnResultCallbackListener
import retrofit2.Call

class SettingActivity : BaseActivity<ModifyPersonalInformationBinding>(), SettingListener {

    internal val viewModel: SettingViewModel by lazy {
        ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(SettingViewModel::class.java)
    }

    companion object {
        fun startActivity(context: Context) {
            val intent = Intent(context, SettingActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun ModifyPersonalInformationBinding.initBindingView() {
        editInformationNoOk.setOnClickListener {
            finish()
        }
        editInformationOk.setOnClickListener {
            viewModel.uploadAvator()
        }
        headPortraitSettings.setOnClickListener {
            PictureSelector.create(this@SettingActivity)
                .openSystemGallery(SelectMimeType.ofImage())
                .forSystemResult(
                    object : OnResultCallbackListener<LocalMedia> {
                        override fun onResult(result: ArrayList<LocalMedia>?) {
                            if (result != null) {
                                for (url in result) {
                                    viewModel.imageList.add(url)
                                    Glide.with(this@SettingActivity).load(url)
                                        .into(headPortraitSettings)
                                }
                            }
                        }

                        override fun onCancel() {
                        }

                    }
                )
        }
    }

    override fun onSendListener(response: LiveData<Result<Call<VerifyResponse>>>) {
        response.observe(this) { result ->
            val res = result.getOrNull()
            if (res != null) {
                toast("头像上传成功")
                finish()
            } else {
                toast("头像上传失败")
            }
        }
    }

    override fun onUploadComplete(response: LiveData<Result<UploadData>>) {
        response.observe(this) { result ->
            val res = result.getOrNull()
            if (res != null) {
//                FishApplication.context.toast(res.imageCode)
                viewModel.imageCode = res.imageCode
            }
        }
    }
}