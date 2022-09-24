package com.example.fish.ui.append

import androidx.lifecycle.LiveData
import com.example.fish.logic.network.model.AddData
import com.example.fish.logic.network.model.SaveData
import com.example.fish.logic.network.model.TypeData

/**
 * @author:SunShibo
 * @date:2022-09-19 20:46
 * @feature:
 */
interface AppendListener {
    fun onSendListener(response: LiveData<Result<String>>)

    fun onSaveListener(response: LiveData<Result<String>>)

    fun onGoodTypes(types: LiveData<Result<List<TypeData>>>)
}