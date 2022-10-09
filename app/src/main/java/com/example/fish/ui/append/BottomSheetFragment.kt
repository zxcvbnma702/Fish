package com.example.fish.ui.append

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import com.example.base.ui.kxt.toast
import com.example.fish.FishApplication
import com.example.fish.R
import com.example.fish.databinding.FragmentBottomSheetBinding
import com.example.fish.logic.network.model.TypeData
import com.example.fish.logic.network.model.UploadData
import com.example.fish.ui.append.adapter.AppendImageAdapter
import com.example.fish.ui.append.adapter.AppendTypeAdapter
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.luck.picture.lib.basic.PictureSelector
import com.luck.picture.lib.config.SelectMimeType
import com.luck.picture.lib.entity.LocalMedia
import com.luck.picture.lib.interfaces.OnResultCallbackListener


/**
 * @author:SunShibo
 * @date:2022-09-17 22:56
 * @feature: 添加商品界面
 */

class BottomSheetFragment : BottomSheetDialogFragment(), AppendListener {

    private lateinit var behavior: BottomSheetBehavior<View>
    private lateinit var binding: FragmentBottomSheetBinding
    private lateinit var atAdapter: AppendTypeAdapter
    private lateinit var aiAdapter: AppendImageAdapter
    internal val viewModel: AppendViewModel by lazy {
        ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(AppendViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.BottomSheetDialogBg)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBottomSheetBinding.inflate(inflater)
        binding.viewModel = viewModel
        viewModel.appendListener = this

        initView()
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        initBottomSheet()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun initView() {
        viewModel.getGoodTypes()

        atAdapter = AppendTypeAdapter(this)
        aiAdapter = AppendImageAdapter(this)

        binding.appendRecycler.apply {
            adapter = atAdapter
        }

        binding.appendPictures.apply {
            adapter = aiAdapter
        }

        binding.appendCancel.setOnClickListener {
            behavior.state = BottomSheetBehavior.STATE_HIDDEN
        }

        binding.appendPictureButton.setOnClickListener {
            PictureSelector.create(this)
                .openSystemGallery(SelectMimeType.ofImage())
                .forSystemResult(
                    object : OnResultCallbackListener<LocalMedia> {
                        override fun onResult(result: ArrayList<LocalMedia>?) {
                            if (result != null) {
                                for (url in result) {
                                    viewModel.imageList.add(url)
                                }
                                if (viewModel.imageList.size >= 9) {
                                    for (i in viewModel.imageList.size - 9 until 0) {
                                        viewModel.imageList.removeLast()
                                    }
                                    binding.appendPictureButton.visibility = View.GONE
                                }
                                aiAdapter.also {
                                    it.setData(viewModel.imageList)
                                    it.notifyDataSetChanged()
                                }
                            }
                        }

                        override fun onCancel() {

                        }
                    }
                )
        }

        binding.appendTypeButton.setOnClickListener {
            atAdapter.setData(viewModel.types)

            if (binding.appendRecycler.isVisible) {
                binding.appendRecycler.visibility = View.GONE
                val text =
                    getText(R.string.append_more_value).toString() + " : ${viewModel.typeName}"
                binding.appendTypeExhibit.text = text
            } else {
                binding.appendRecycler.visibility = View.VISIBLE
                val text = getText(R.string.append_more_value).toString()
                binding.appendTypeExhibit.text = text
            }
        }

//        binding.appendTest.setOnClickListener {
//            viewModel.uploadFile()
//        }
    }

    override fun onSendListener(response: LiveData<Result<String>>) {
        response.observe(this){result->
            val msg = result.getOrNull()
            if(msg.equals("成功")){
                FishApplication.context.toast(R.string.append_send_toast_success)
                behavior.state = BottomSheetBehavior.STATE_HIDDEN
            }else{
                FishApplication.context.toast(R.string.append_send_toast_failure)
            }
        }
    }

    override fun onSaveListener(response: LiveData<Result<String>>) {
        response.observe(this){result->
            val msg = result.getOrNull()
            if(msg.equals("成功")){
                FishApplication.context.toast(R.string.append_save_toast_success)
                behavior.state = BottomSheetBehavior.STATE_HIDDEN
            } else {
                FishApplication.context.toast(R.string.append_save_toast_failure)
            }
        }
    }

    override fun onGoodTypes(types: LiveData<Result<List<TypeData>>>) {
        types.observe(this) { result ->
            val res = result.getOrNull()
            if (res != null) {
                for (type in res) {
                    viewModel.types.add(type.type)
                }
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

    private fun initBottomSheet() {
        val view: View = dialog?.findViewById(R.id.design_bottom_sheet)!!
        view.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT

        behavior = BottomSheetBehavior.from(view)
        behavior.apply {
            state = BottomSheetBehavior.STATE_EXPANDED
            isDraggable = false
        }
    }
}