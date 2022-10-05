package com.example.fish.logic.db.entity

import android.graphics.Color
import androidx.annotation.ColorInt
import com.example.fish.logic.network.model.DetailsData
import com.example.fish.logic.network.model.Record

/**
 * @author:SunShibo
 * @date:2022-09-25 22:43
 * @feature:
 */

data class TabData(
    val title: String,
    val startViewType: Int,
    val endViewType: Int
)

sealed class ItemRoot(
    open val viewType: Int,
    @ColorInt open val backgroundColor: Int = Color.TRANSPARENT,
    open val title: String? = null,
    open val height: Float = 40f,
)

data class Item(
    override val viewType: Int,
    @ColorInt override val backgroundColor: Int = Color.TRANSPARENT,
    override val title: String? = null,
    override val height: Float = 40f,
    val data: DetailsData? = null,
    val Recommend: MutableList<Record>? = null
) : ItemRoot(viewType, backgroundColor, title, height) {
}
