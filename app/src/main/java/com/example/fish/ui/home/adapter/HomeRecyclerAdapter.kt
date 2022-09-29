package com.example.fish.ui.home.adapter

import com.example.base.ui.activity.BaseAdapter
import com.example.fish.databinding.ItemHomeShopBinding
import com.example.fish.logic.network.model.Record
import com.example.fish.ui.home.HomeFragment

/**
 * @author:SunShibo
 * @date:2022-09-10 13:29
 * @feature:
 */
class HomeRecyclerAdapter(private val fragment: HomeFragment) :
    BaseAdapter<Record, ItemHomeShopBinding>() {

    override fun ItemHomeShopBinding.onBindViewHolder(bean: Record, position: Int) {
        itemShopCard.setOnClickListener {
            fragment.jumpTo(bean)
        }
        itemShopPrice.text = bean.price
        itemShopTitle.text = bean.id
        itemShopContent.text = bean.content
        // todo itemShopAvator itemShopImage
    }
}