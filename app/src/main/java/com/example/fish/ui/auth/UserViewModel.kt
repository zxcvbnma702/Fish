package com.example.fish.ui.auth

import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.fish.logic.Repository

/**
 * @author:SunShibo
 * @date:2022-09-05 11:10
 * @feature:7 `
 */
class UserViewModel: ViewModel() {
    var phoneNumber: String? = null
    var password: String? = null
    var sms: String? = null

    var authListener: AuthListener? = null

    //验证码
//    private val verifyLiveData = MutableLiveData<String>()
//
//    val smsLiveData = Transformations.switchMap(verifyLiveData){
//        Repository.verify(it)
//    }
//
//    fun verify(phoneNumber: String){
//        verifyLiveData.value = phoneNumber
//    }

    fun onLoginButtonClick(view: View){
        authListener?.onLoginStarted()
        if(phoneNumber.isNullOrEmpty()|| sms.isNullOrEmpty()){
            authListener?.onLoginFailure("Invalid email or password")
            return
        }
        val loginResult = Repository.userLogin(phoneNumber!!, sms!!)
        authListener?.onLoginSuccess(loginResult)
    }

    fun onLoginButtonVerify(view: View){
        if(phoneNumber.isNullOrEmpty()){
            authListener?.onVerifyFailure("Invalid phoneNumber")
            return
        }
        val sendResult = Repository.verify(phoneNumber!!)
        authListener?.onVerifySuccess(sendResult)
    }

    fun onRegisterButtonClick(view: View){
        authListener?.onRegisterStarted()
        if(phoneNumber.isNullOrEmpty()|| sms.isNullOrEmpty()){
            authListener?.onRegisterFailure("Invalid email or password")
            return
        }
        val registerResult = Repository.userRegister(phoneNumber!!, sms!!)
        authListener?.onRegisterSuccess(registerResult)
    }
}