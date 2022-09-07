package com.example.fish.ui.auth

import androidx.lifecycle.LiveData

/**
 * @author:SunShibo
 * @date:2022-09-05 23:03
 * @feature:
 */
interface AuthListener {
    fun onLoginStarted()
    fun onLoginSuccess(loginResult: LiveData<Result<Any>>)
    fun onLoginFailure(msg: String)

    fun onRegisterStarted()
    fun onRegisterSuccess(registerResult: LiveData<Result<Any>>)
    fun onRegisterFailure(msg: String)

    fun onVerifySuccess(sendResult: LiveData<Result<Any>>)
    fun onVerifyFailure(msg: String)
}