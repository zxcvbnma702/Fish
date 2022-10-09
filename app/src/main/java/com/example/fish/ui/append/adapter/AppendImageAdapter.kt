package com.example.fish.ui.append.adapter

import com.example.base.ui.activity.BaseAdapter
import com.example.base.ui.util.GlideEngine
import com.example.fish.FishApplication
import com.example.fish.databinding.ItemAppendImageBinding
import com.example.fish.ui.append.BottomSheetFragment
import com.luck.picture.lib.entity.LocalMedia

/**
 * @author:SunShibo
 * @date:2022-10-07 16:36
 * @feature:
 */
class AppendImageAdapter(private val fragment: BottomSheetFragment) :
    BaseAdapter<LocalMedia, ItemAppendImageBinding>() {
    override fun ItemAppendImageBinding.onBindViewHolder(bean: LocalMedia, position: Int) {
        GlideEngine.createGlideEngine()
            .loadImage(FishApplication.context, bean.availablePath, image)
    }
}