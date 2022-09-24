package com.example.fish.ui.cart

import androidx.lifecycle.ViewModel
import com.example.fish.FishApplication
import com.example.fish.logic.Repository
import com.example.fish.logic.network.model.SaveListRecord

/**
 * @author:SunShibo
 * @date:2022-09-24 16:50
 * @feature:
 */
class CartViewModel: ViewModel() {
    private val userId = FishApplication.sp.getString(FishApplication.userID, "0")

    var saveList: MutableList<SaveListRecord> = mutableListOf()

    internal var cartListener: CartListener?= null

    fun getSaveList(){
        val saveList = Repository.getSaveListInformation(userId!!.toInt())
        cartListener!!.onSaveListResponse(saveList)
    }

    fun sendData(id: String) {
        val response = Repository.postSaveGoodInformation(id ,userId!!)
        cartListener!!.onPostSaveResponse(response)
    }

}