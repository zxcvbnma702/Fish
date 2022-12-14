package com.example.fish.ui.cart

import androidx.lifecycle.LiveData
import com.example.fish.logic.network.model.SaveListRecord

/**
 * @author:SunShibo
 * @date:2022-09-24 17:32
 * @feature: Communication Interface
 */
interface CartListener {
    fun onSaveListResponse(saveList: LiveData<Result<List<SaveListRecord>>>)
    fun onPostListResponse(saveList: LiveData<Result<List<SaveListRecord>>>)
    fun onPostSaveResponse(response: LiveData<Result<Int>>)
    fun onDeletePostResponse(response: LiveData<Result<String>>)
}