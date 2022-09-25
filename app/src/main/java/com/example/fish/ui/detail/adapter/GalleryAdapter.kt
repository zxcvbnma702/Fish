package com.example.fish.ui.detail.adapter

import android.app.Activity
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.RecyclerView
import com.example.fish.databinding.ItemGalleryPhotoBinding

/**
 * @author:SunShibo
 * @date:2022-09-25 22:14
 * @feature:
 */

class GalleryAdapter(
    private val host: Activity
) : RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {

    internal var items: List<Int> = emptyList()
        set(value) {
            field = value
            notifyItemRangeChanged(0, items.size - 1)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemGalleryPhotoBinding.inflate(host.layoutInflater, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(private val binding: ItemGalleryPhotoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(@DrawableRes resource: Int) {
            binding.galleryPhoto.setImageResource(resource)
        }
    }
}