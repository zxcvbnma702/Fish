package com.example.fish.ui.detail.adapter

import android.app.Activity
import com.example.base.ui.activity.BaseAdapter
import com.example.base.ui.util.GlideEngine
import com.example.fish.FishApplication
import com.example.fish.databinding.ItemGalleryPhotoBinding

/**
 * @author:SunShibo
 * @date:2022-09-25 22:14
 * @feature:
 */

class GalleryAdapter(
    private val host: Activity
) : BaseAdapter<String, ItemGalleryPhotoBinding>() {

    override fun ItemGalleryPhotoBinding.onBindViewHolder(bean: String, position: Int) {
        GlideEngine.createGlideEngine().loadImage(FishApplication.context, bean, galleryPhoto)
    }
}