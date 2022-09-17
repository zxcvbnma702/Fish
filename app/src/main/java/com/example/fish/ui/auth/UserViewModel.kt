package com.example.fish.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.fish.logic.Repository
import com.example.fish.logic.db.entity.User
import com.example.fish.logic.network.model.Data

/**
 * @author:SunShibo
 * @date:2022-09-05 11:10
 * @feature:7 `
 */
class UserViewModel: ViewModel() {
    var phoneNumber: String? = null
    var password: String? = null
    var sms: String? = null

    private val repository = Repository

    internal var authListener: AuthListener? = null

    fun getUserData() = repository.getUserData()
    fun saveUserData(user: User) = repository.saveUserData(user)
    fun saveUserData(user: Data) = repository.saveUserData(user)

    fun onLoginButtonClick(view: View){
        authListener?.onLoginStarted()
        if(phoneNumber.isNullOrEmpty()|| sms.isNullOrEmpty()){
            authListener?.onLoginFailure("Invalid email or password")
            return
        }
        val loginResult = repository.userLogin(phoneNumber!!, sms!!)

        authListener?.onLoginSuccess(loginResult)
    }

    fun onLoginButtonVerify(view: View){
        if(phoneNumber.isNullOrEmpty()){
            authListener?.onVerifyFailure("Invalid phoneNumber")
            return
        }
        val sendResult = repository.verify(phoneNumber!!)
        authListener?.onVerifySuccess(sendResult)
    }

    fun onRegisterButtonClick(view: View){
        authListener?.onRegisterStarted()
        if(phoneNumber.isNullOrEmpty()|| sms.isNullOrEmpty()){
            authListener?.onRegisterFailure("Invalid email or password")
            return
        }
        val registerResult = repository.userRegister(phoneNumber!!, sms!!)
        authListener?.onRegisterSuccess(registerResult)
    }
}