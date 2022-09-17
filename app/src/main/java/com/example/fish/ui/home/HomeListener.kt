package com.example.fish.ui.home

import androidx.lifecycle.LiveData
import com.example.fish.logic.network.model.AllData
import com.example.fish.logic.network.model.TypeData

/**
 * @author:SunShibo
 * @date:2022-09-10 21:15
 * @feature:
 */
interface HomeListener {
    fun onGoodTypes(types: LiveData<Result<List<TypeData>>>)
    fun onTypeGoods(data: LiveData<Result<AllData>>)
}