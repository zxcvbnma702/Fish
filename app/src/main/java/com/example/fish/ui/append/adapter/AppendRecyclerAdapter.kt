package com.example.fish.ui.append.adapter

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.widget.DrawableUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.fish.FishApplication
import com.example.fish.R
import com.example.fish.databinding.DialogTypeBinding
import com.example.fish.logic.network.model.Record
import com.example.fish.ui.append.BottomSheetFragment

/**
 * @author:SunShibo
 * @date:2022-09-10 13:29
 * @feature: 使用 databinding 简化代码
 */
class AppendRecyclerAdapter(private val fragment: BottomSheetFragment, private var data: List<String>): RecyclerView.Adapter<AppendRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: DialogTypeBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: String){
            binding.type.text = item
            binding.type.setOnClickListener {
                binding.type.background = FishApplication.context.resources.getDrawable(R.drawable.shape_yellow)
                binding.type.setTextColor(FishApplication.context.resources.getColor(R.color.white))
            }
        }
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val listDataBinding = DialogTypeBinding.inflate(inflater, parent, false)
        return ViewHolder(listDataBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    fun exchangeData(newData: MutableList<String>){
        this.data = newData
    }
}