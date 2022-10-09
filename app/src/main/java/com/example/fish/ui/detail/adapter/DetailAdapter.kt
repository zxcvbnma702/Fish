package com.example.fish.ui.detail.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.Color
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.base.ui.activity.BaseMultiTypeAdapter
import com.example.base.ui.util.GlideEngine
import com.example.fish.FishApplication
import com.example.fish.databinding.*
import com.example.fish.logic.db.entity.Item
import com.example.fish.logic.network.model.DetailsData

/**
 * @author:SunShibo
 * @date:2022-09-25 22:13
 * @feature:
 */
class DetailAdapter(private val host: Activity) : BaseMultiTypeAdapter<Item>() {

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
                GalleryViewHolder(item.data, host, this.binding as ItemGalleryBinding)
            }

            is ItemDetailTitleBinding -> {
                val binding = this.binding as ItemDetailTitleBinding
                binding.apply {
                    Log.e("imageH", item.data.toString())
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
                    GlideEngine.createGlideEngine()
                        .loadImage(host.applicationContext, item.data?.avatar, itemDetailUserEvatar)
                }
            }

            is ItemDetailCommentBinding -> {
                val binding = this.binding as ItemDetailCommentBinding
                binding.apply {
                    GlideEngine.createGlideEngine().loadImage(
                        host.applicationContext,
                        item.data?.avatar,
                        itemDetailCommentEvatar
                    )
                }
            }

            is ItemDetailContentBinding -> {
                val binding = this.binding as ItemDetailContentBinding
                binding.itemDetailCommentContainer.apply {
                    if (item.data?.imageUrlList != null) {
                        for (url in item.data.imageUrlList) {
                            val newImage = ImageView(FishApplication.context)
                            val lp = LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                            )
                            lp.setMargins(0, 5, 0, 5)
                            newImage.apply {
                                layoutParams = lp
                                GlideEngine.createGlideEngine()
                                    .loadImage(host.applicationContext, url, this)
                                setBackgroundColor(Color.YELLOW)
                            }
                            addView(newImage)
                        }
                    } else {
                        binding.itemDetailCommentContent.apply {
                            visibility = View.VISIBLE
                        }
                    }
                }
            }

            is ItemDetailRecommendBinding -> {}

            is ItemHomeShopBinding -> {
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
        item: DetailsData?,
        private val host: Activity,
        private val binding: ItemGalleryBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        init {
            var galleryList = mutableListOf<String>()
            if (item != null) {
                galleryList =
                    when (item.imageUrlList.size) {
                        1 -> mutableListOf(item.imageUrlList[0])
                        else -> mutableListOf(item.imageUrlList[0], item.imageUrlList[1])
                    }
            }
            val gallerySize = galleryList.size
            binding.vpGallery.apply {
                registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                    @SuppressLint("SetTextI18n")
                    override fun onPageSelected(position: Int) {
                        binding.tvIndex.text = "${(position + 1)} / $gallerySize"
                    }
                })
                adapter = GalleryAdapter(host).apply {
                    setData(galleryList)
                }
            }
        }
    }
}