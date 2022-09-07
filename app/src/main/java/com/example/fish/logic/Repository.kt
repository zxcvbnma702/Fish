package com.example.fish.logic

import android.database.CursorJoiner
import android.util.Log
import androidx.lifecycle.liveData
import com.example.base.ui.exception.LogException
import com.example.fish.logic.model.UserResponse
import com.example.fish.logic.network.FishNetwork
import kotlinx.coroutines.Dispatchers

/**
 * @author:SunShibo
 * @date:2022-09-05 1:36
 * @feature:
 */
object Repository {

    fun verify(phoneNumber: String) = liveData(Dispatchers.IO){
        val result = try{
            val sms = FishNetwork.verify(phoneNumber)
            run {
                Result.success(sms.msg)
            }
        }catch (e: LogException){
            Result.failure<List<LogException>>(e)
        }
        emit(result)
    }

    fun userLogin(phoneNumber: String, sms: String) = liveData(Dispatchers.IO){
        val result = try{
            val response = FishNetwork.login(phoneNumber, sms)
            run{
                Result.success(response)
            }
        }catch (e: Exception){
            Result.failure<List<Exception>>(e)
        }
        emit(result)
    }

    fun userRegister(phoneNumber: String, sms: String) = liveData(Dispatchers.IO){
        val result = try{
            val response = FishNetwork.register(phoneNumber, sms)
            run{
                Result.success(response.data)
            }
        }catch (e: Exception){
            Result.failure<List<UserResponse>>(e)
        }
        emit(result)
    }

}