package com.example.fish.logic.db.entity

import android.graphics.Color
import androidx.annotation.ColorInt

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

data class Item(
    val viewType: Int,
    @ColorInt val backgroundColor: Int = Color.TRANSPARENT,
    val title: String? = null,
    val height: Float = 40f
)