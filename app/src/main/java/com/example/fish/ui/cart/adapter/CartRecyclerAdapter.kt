package com.example.fish.ui.cart.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fish.databinding.CartSaveItemBinding
import com.example.fish.logic.network.model.SaveListRecord
import com.example.fish.ui.cart.CartFragment

/**
 * @author:SunShibo
 * @date:2022-09-24 17:37
 * @feature: cart`s recyclerAdapter
 */
class CartRecyclerAdapter(private val fragment: CartFragment) :
    RecyclerView.Adapter<CartRecyclerAdapter.ViewHolder>() {

    internal var data: List<SaveListRecord> = emptyList()
        set(value) {
            field = value
            notifyItemRangeChanged(0, data.size - 1)
        }

    inner class ViewHolder(private val binding: CartSaveItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: SaveListRecord) {
            binding.good = item
            binding.cartItemSend.setOnClickListener {
                fragment.viewModel.sendData(item.id)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val listDataBinding = CartSaveItemBinding.inflate(inflater, parent, false)
        return ViewHolder(listDataBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size
}