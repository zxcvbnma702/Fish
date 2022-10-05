package com.example.fish.ui.detail.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.base.ui.activity.BaseMultiTypeAdapter
import com.example.fish.R
import com.example.fish.databinding.*
import com.example.fish.logic.db.entity.Item

/**
 * @author:SunShibo
 * @date:2022-09-25 22:13
 * @feature:
 */
class DetailAdapter(private val host: Activity) : BaseMultiTypeAdapter<Item>() {


//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        return if (viewType == GALLERY) {
//            GalleryViewHolder(host, ItemGalleryBinding.inflate(host.layoutInflater, parent, false))
//        } else {
//            NormalViewHolder(ItemNoramlBinding.inflate(host.layoutInflater, parent, false))
//        }
//    }
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        when (holder) {
//            is NormalViewHolder -> {
//                holder.bind(items[position])
//            }
//            is GalleryViewHolder -> {
//                //
//            }
//            else -> throw IllegalArgumentException("Not support")
//        }
//    }


    /**
     * Item type
     */
    companion object {
        const val GALLERY = 101
        const val TITLE = 102
        const val CONTENT = 103
        const val USER = 104
        const val COMMENT = 105
        const val RECOMMEND = 106
        const val OTHER = 109
    }

    override fun MultiTypeViewHolder.onBindViewHolder(
        holder: MultiTypeViewHolder,
        item: Item,
        position: Int
    ) {
        when (holder.binding) {
            is ItemGalleryBinding -> {
                GalleryViewHolder(host, this.binding as ItemGalleryBinding)
            }

            is ItemDetailTitleBinding -> {
                val binding = this.binding as ItemDetailTitleBinding
                binding.apply {
                    itemDetailTitleAddress.text = item.data?.addr
                    itemDetailTitleContent.text = item.data?.content
                    itemDetailTitlePrice.text = item.data?.price.toString()
                    itemDetailTitleTime.text = item.data?.createTime
                }
            }

            is ItemDetailUserBinding -> {
                val binding = this.binding as ItemDetailUserBinding
                binding.apply {
                    itemDetailTitleUsername.text = item.data?.username
                    itemDetailUserAddress.text = item.data?.addr
//                    todo itemDetailUserEvatar
                }
            }

            is ItemDetailCommentBinding -> {
                val binding = this.binding as ItemDetailCommentBinding
                binding.apply {
//                    todo itemDetailCommentEvatar
                }
            }

            is ItemDetailContentBinding -> {
                val binding = this.binding as ItemDetailContentBinding
                binding.itemDetailCommentContainer.apply {
//                    todo addView
                }
            }

            is ItemDetailRecommendBinding -> {}

            is ItemHomeShopBinding -> {
//                NormalViewHolder(this.binding as ItemNoramlBinding).bind(item)
                val binding = this.binding as ItemHomeShopBinding

            }
        }
    }

    override fun onCreateMultiViewHolder(parent: ViewGroup, viewType: Int): ViewDataBinding {
        return when (viewType) {
            GALLERY -> loadLayout(ItemGalleryBinding::class.java, parent)
            TITLE -> loadLayout(ItemDetailTitleBinding::class.java, parent)
            CONTENT -> loadLayout(ItemDetailContentBinding::class.java, parent)
            USER -> loadLayout(ItemDetailUserBinding::class.java, parent)
            COMMENT -> loadLayout(ItemDetailCommentBinding::class.java, parent)
            RECOMMEND -> loadLayout(ItemDetailRecommendBinding::class.java, parent)
            OTHER -> loadLayout(ItemHomeShopBinding::class.java, parent)
            else -> loadLayout(ItemNoramlBinding::class.java, parent)
        }
    }

    override fun getItemViewType(position: Int): Int = getData()[position].viewType

    inner class GalleryViewHolder(
        private val host: Activity,
        private val binding: ItemGalleryBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        init {
            val galleryList = listOf(R.drawable.a, R.drawable.b)
            val gallerySize = galleryList.size
            binding.vpGallery.apply {
                registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                    @SuppressLint("SetTextI18n")
                    override fun onPageSelected(position: Int) {
                        binding.tvIndex.text = "${(position + 1)} / $gallerySize"
                    }
                })
                adapter = GalleryAdapter(host).apply {
                    items = galleryList
                }
            }
        }
    }
}