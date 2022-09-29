package com.example.fish.ui.append.adapter

import android.annotation.SuppressLint
import com.example.base.ui.activity.BaseAdapter
import com.example.fish.FishApplication
import com.example.fish.R
import com.example.fish.databinding.ItemAppendTypeBinding
import com.example.fish.ui.append.BottomSheetFragment

/**
 * @author:SunShibo
 * @date:2022-09-10 13:29
 * @feature:
 */
class AppendRecyclerAdapter(private val fragment: BottomSheetFragment) :
    BaseAdapter<String, ItemAppendTypeBinding>() {

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun ItemAppendTypeBinding.onBindViewHolder(bean: String, position: Int) {
        type.text = bean
        type.setOnClickListener {
            type.background = FishApplication.context.resources.getDrawable(R.drawable.shape_yellow)
            type.setTextColor(FishApplication.context.resources.getColor(R.color.white))
        }
    }
}