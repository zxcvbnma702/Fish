package com.example.fish.ui.cart.adapter

import android.annotation.SuppressLint
import com.example.base.ui.activity.BaseAdapter
import com.example.base.ui.util.GlideEngine
import com.example.fish.databinding.ItemCartSaveBinding
import com.example.fish.logic.network.model.SaveListRecord
import com.example.fish.ui.cart.CartFragment

/**
 * @author:SunShibo
 * @date:2022-10-15 22:10
 * @feature:
 */
class CartPostRecyclerAdapter(private val fragment: CartFragment) :
    BaseAdapter<SaveListRecord, ItemCartSaveBinding>() {

    @SuppressLint("NotifyDataSetChanged")
    override fun ItemCartSaveBinding.onBindViewHolder(bean: SaveListRecord, position: Int) {
        itemCartSend.setOnClickListener {
            fragment.mViewModel.deleteData(bean.id)
            notifyDataSetChanged()
        }
        itemCartSend.text = "删除"
        itemCartPrice.text = bean.price
        itemCartTitle.text = bean.id + bean.typeName
        itemCartUsername.text = bean.username
        try {
            if (bean.imageUrlList.isNotEmpty()) {
                GlideEngine.createGlideEngine()
                    .loadImage(fragment.requireContext(), bean.imageUrlList[0], itemCartImage)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
//            FishApplication.context.toast("服务器错误")
        }

        GlideEngine.createGlideEngine()
            .loadImage(fragment.requireContext(), bean.avatar, itemCartAvatar)
    }

}