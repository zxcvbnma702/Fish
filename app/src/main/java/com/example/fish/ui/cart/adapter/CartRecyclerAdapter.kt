package com.example.fish.ui.cart.adapter

import com.example.base.ui.activity.BaseAdapter
import com.example.base.ui.util.GlideEngine
import com.example.fish.databinding.ItemCartSaveBinding
import com.example.fish.logic.network.model.SaveListRecord
import com.example.fish.ui.cart.CartFragment

/**
 * @author:SunShibo
 * @date:2022-09-24 17:37
 * @feature: cart`s recyclerAdapter
 */
class CartRecyclerAdapter(private val fragment: CartFragment) :
    BaseAdapter<SaveListRecord, ItemCartSaveBinding>() {

    override fun ItemCartSaveBinding.onBindViewHolder(bean: SaveListRecord, position: Int) {
        itemCartSend.setOnClickListener {
            fragment.mViewModel.sendData(bean.id)
        }
        itemCartPrice.text = bean.price
        itemCartTitle.text = bean.id
        itemCartUsername.text = bean.username
        if (bean.imageUrlList.isNotEmpty()) {
            GlideEngine.createGlideEngine()
                .loadImage(fragment.requireContext(), bean.imageUrlList[0], itemCartImage)
        }
        GlideEngine.createGlideEngine()
            .loadImage(fragment.requireContext(), bean.avatar, itemCartAvatar)
    }
}