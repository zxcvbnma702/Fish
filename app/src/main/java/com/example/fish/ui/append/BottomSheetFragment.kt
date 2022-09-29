package com.example.fish.ui.append

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.base.ui.kxt.toast
import com.example.fish.FishApplication
import com.example.fish.R
import com.example.fish.databinding.FragmentBottomSheetBinding
import com.example.fish.logic.network.model.TypeData
import com.example.fish.ui.append.adapter.AppendRecyclerAdapter
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

/**
 * @author:SunShibo
 * @date:2022-09-17 22:56
 * @feature: 添加商品界面
 */

class BottomSheetFragment: BottomSheetDialogFragment(), AppendListener{

    private lateinit var behavior: BottomSheetBehavior<View>
    private lateinit var binding: FragmentBottomSheetBinding
    private lateinit var myAdapter: AppendRecyclerAdapter
    internal val viewModel: AppendViewModel by lazy{
        ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(AppendViewModel::class.java)
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

        val view: View = dialog?.findViewById(R.id.design_bottom_sheet)!!
        view.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT

        behavior = BottomSheetBehavior.from(view)
        behavior.apply {
            state = BottomSheetBehavior.STATE_EXPANDED
            isDraggable = false
        }
    }

    private fun initView() {
        viewModel.getGoodTypes()

        myAdapter = AppendRecyclerAdapter(this)

        binding.appendRecycler.apply{
            adapter = myAdapter
            layoutManager = GridLayoutManager(FishApplication.context, 4)
        }

        binding.appendCancel.setOnClickListener {
            behavior.state = BottomSheetBehavior.STATE_HIDDEN
        }

        binding.appendPicture.setOnClickListener {
        }

        binding.appendType.setOnClickListener {
            myAdapter.setData(viewModel.types)

            if(binding.appendRecycler.isVisible){
                binding.appendRecycler.visibility = View.GONE
            }else{
                binding.appendRecycler.visibility = View.VISIBLE
            }
        }
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
            }else{
                FishApplication.context.toast(R.string.append_save_toast_failure)
            }
        }
    }

    override fun onGoodTypes(types: LiveData<Result<List<TypeData>>>) {
        types.observe(this){result ->
            val res = result.getOrNull()
            for(type in res!!){
                Log.e("ff", type.type)
                viewModel.types.add(type.type)
            }
        }
    }
}