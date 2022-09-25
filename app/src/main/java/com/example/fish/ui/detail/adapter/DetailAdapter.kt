package com.example.fish.ui.detail.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.base.ui.util.UIUtils
import com.example.fish.R
import com.example.fish.databinding.ItemGalleryBinding
import com.example.fish.databinding.ItemNoramlBinding
import com.example.fish.logic.db.entity.Item

/**
 * @author:SunShibo
 * @date:2022-09-25 22:13
 * @feature:
 */
class DetailAdapter(private val host: Activity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    internal var items: List<Item> = emptyList()
        set(value) {
            field = value
            notifyItemRangeChanged(0, items.size - 1)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == GALLERY) {
            GalleryViewHolder(host, ItemGalleryBinding.inflate(host.layoutInflater, parent, false))
        } else {
            NormalViewHolder(ItemNoramlBinding.inflate(host.layoutInflater, parent, false))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is NormalViewHolder -> {
                holder.bind(items[position])
            }
            is GalleryViewHolder -> {
                //
            }
            else -> throw IllegalArgumentException("Not support")
        }
    }

    override fun getItemViewType(position: Int): Int = items[position].viewType

    override fun getItemCount(): Int = items.size

    class NormalViewHolder(
        private val binding: ItemNoramlBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Item) {
            binding.text.apply {
                layoutParams.height = UIUtils.dpToPx(item.height)
                text = item.title
                setBackgroundColor(item.backgroundColor)
            }
        }
    }

    class GalleryViewHolder(
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
}