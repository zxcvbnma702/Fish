package com.example.fish.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fish.databinding.HomeShopItemBinding
import com.example.fish.logic.network.model.Record
import com.example.fish.ui.home.HomeFragment

/**
 * @author:SunShibo
 * @date:2022-09-10 13:29
 * @feature: 使用 databinding 简化代码
 */
class HomeRecyclerAdapter(private val fragment: HomeFragment, private var data: List<Record>): RecyclerView.Adapter<HomeRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: HomeShopItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(item: Record){
            binding.shopItemCard.setOnClickListener {
                fragment.jumpTo(item)
            }
            binding.good = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val listDataBinding = HomeShopItemBinding.inflate(inflater, parent, false)
        return ViewHolder(listDataBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    fun exchangeData(newData: MutableList<Record>){
        this.data = newData
    }
}