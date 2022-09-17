package com.example.fish.logic

import androidx.lifecycle.liveData
import com.example.fish.FishApplication
import com.example.fish.logic.db.AppDatabase
import com.example.fish.logic.db.entity.User
import com.example.fish.logic.network.FishNetwork
import com.example.fish.logic.network.model.Data
import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

/**
 * @author:SunShibo
 * @date:2022-09-05 1:36
 * @feature:
 */
object Repository{

    /**
     * Login
     */
    fun verify(phoneNumber: String) = fire(Dispatchers.IO){
        val sms = FishNetwork.verify(phoneNumber)
        run {
            Result.success(sms.msg)
        }
    }

    fun userLogin(phoneNumber: String, sms: String) = fire(Dispatchers.IO){
        val request = mapOf("code" to sms, "phone" to phoneNumber)
        val response = FishNetwork.login(request)
        run{
            Result.success(response)
        }
    }

    fun userRegister(phoneNumber: String, sms: String) = fire(Dispatchers.IO){
        val request = mapOf("code" to sms, "phone" to phoneNumber)
        val response = FishNetwork.register(request)
        run{
            Result.success(response.msg)
        }
    }

    fun getUserData() = AppDatabase.invoke(FishApplication.context).getUserDao().getUser()
    fun saveUserData(user: User) = AppDatabase.invoke(FishApplication.context).getUserDao().upsert(user)

    fun saveUserData(data: Data) {
        val user: User = User()
        user.apply {
            id = data.id
            appKey = data.appKey
            avatar = data.avatar
            money = data.money
            username = data.username
        }
        AppDatabase.invoke(FishApplication.context).getUserDao().upsert(user)
    }


    /**
     * Goods
     */

    fun getGoodTypes() = fire(Dispatchers.IO){
        val types = FishNetwork.getGoodTypes()
        run {
            Result.success(types.data)
        }
    }

    fun getTypeGoods(userId: Long, typeId: Int, size: Int) = fire(Dispatchers.IO){
        val list = FishNetwork.getTypeGoods(userId, typeId, size)
        run{
            Result.success(list.data)
        }
    }

    private fun <T> fire(context: CoroutineContext, block: suspend () -> Result<T>) =
        liveData<Result<T>>(context) {
            val result = try{
                block()
            }catch (e: Exception){
                Result.failure<T>(e)
            }
            emit(result)
        }
}