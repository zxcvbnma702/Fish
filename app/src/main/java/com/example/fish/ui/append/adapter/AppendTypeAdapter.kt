package com.example.fish.ui.append.adapter

import android.annotation.SuppressLint
import com.example.base.ui.activity.BaseAdapter
import com.example.fish.databinding.ItemAppendTypeBinding
import com.example.fish.ui.append.BottomSheetFragment

/**
 * @author:SunShibo
 * @date:2022-09-10 13:29
 * @feature:
 */
class AppendTypeAdapter(private val fragment: BottomSheetFragment) :
    BaseAdapter<String, ItemAppendTypeBinding>() {

    var selPosition = 0

    var temp = -1

    @SuppressLint("NotifyDataSetChanged")
    override fun ItemAppendTypeBinding.onBindViewHolder(bean: String, position: Int) {
        type.text = bean
        typeContainer.isSelected = position == selPosition

        typeContainer.setOnClickListener {
            it.isSelected = true
            temp = selPosition
            selPosition = position
            notifyItemChanged(temp)
            fragment.viewModel.apply {
                typeName = type.text.toString()
                typeId = (position + 1).toString()
            }
        }
    }
}