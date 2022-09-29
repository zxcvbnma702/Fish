package com.example.fish.ui.append

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.base.ui.kxt.toast
import com.example.fish.FishApplication
import com.example.fish.logic.Repository

/**
 * @author:SunShibo
 * @date:2022-09-17 23:00
 * @feature:
 */
class AppendViewModel: ViewModel() {
    private val userId = FishApplication.sp.getString(FishApplication.userID, "0")

    var types: MutableList<String> = mutableListOf()

    var title: String ?= null
    var content: String ?= null
    var address: String ?= null
    var price: String ?= null
    var typeId: String ?= null
    var typeName: String ?= null
    var imageCode: String = "0"

    var currentType = false

    internal var appendListener: AppendListener ?= null


    fun send(view: View){
        if(checkNull()){
            val response = Repository.postGoodInformation(address!!, content!!, imageCode, price!!, typeId!!, typeName!!, userId!!)
            appendListener?.onSendListener(response)
        }else{
            FishApplication.context.toast("请将商品信息填写完整")
        }
    }

    fun save(view: View){
        if(checkNull()){
            val response = Repository.saveGoodInformation(address!! , content!!, imageCode, price!!, typeId!!, typeName!!, userId!!)
            appendListener?.onSaveListener(response)
        }else{
            FishApplication.context.toast("请将商品信息填写完整")
        }
    }

    fun getGoodTypes(){
        val types = Repository.getGoodTypes()
        appendListener?.onGoodTypes(types)
    }

    private fun checkNull(): Boolean{
        return !(title == null || content == null || address == null || price == null || typeId == null || typeName == null)
    }
}