package com.example.fish.ui.auth

import androidx.lifecycle.LiveData
import com.example.fish.logic.network.model.UserResponse

/**
 * @author:SunShibo
 * @date:2022-09-05 23:03
 * @feature:
 */
interface AuthListener {
    fun onLoginStarted()
    fun onLoginSuccess(loginResult: LiveData<Result<UserResponse>>)
    fun onLoginFailure(msg: String)

    fun onRegisterStarted()
    fun onRegisterSuccess(registerResult: LiveData<Result<String>>)
    fun onRegisterFailure(msg: String)

    fun onVerifySuccess(sendResult: LiveData<Result<String>>)
    fun onVerifyFailure(msg: String)
}