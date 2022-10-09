package com.example.fish.ui.append

import androidx.lifecycle.LiveData
import com.example.fish.logic.network.model.TypeData
import com.example.fish.logic.network.model.UploadData

/**
 * @author:SunShibo
 * @date:2022-09-19 20:46
 * @feature:
 */
interface AppendListener {
    fun onSendListener(response: LiveData<Result<String>>)

    fun onSaveListener(response: LiveData<Result<String>>)

    fun onGoodTypes(types: LiveData<Result<List<TypeData>>>)

    fun onUploadComplete(response: LiveData<Result<UploadData>>)
}