package com.example.fish.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import com.example.base.ui.util.hide
import com.example.base.ui.util.show
import com.example.base.ui.util.toast
import com.example.fish.FishApplication
import com.example.fish.R
import com.example.fish.databinding.ActivityLoginBinding
import com.example.fish.logic.network.model.UserResponse
import com.example.fish.ui.MainActivity
import kotlin.concurrent.thread

class LoginActivity : AppCompatActivity() , AuthListener{

    private lateinit var binding: ActivityLoginBinding
    private val viewModel by lazy{
        ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(UserViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        binding.viewModel = viewModel
        viewModel.authListener = this

        binding.tvRegister.setOnClickListener{
            switch()
        }
        if(FishApplication.sp.getBoolean("isLogin", false)){
            MainActivity.startActivity(this@LoginActivity)
        }
    }

    override fun onLoginStarted() {
//        toast(R.string.login_started)
        binding.loginProgressBar.show()
    }

    override fun onLoginSuccess(loginResult: LiveData<Result<UserResponse>>) {
        binding.loginProgressBar.hide()
        loginResult.observe(this){result->
            val response = result.getOrNull()
            if(response != null && response.code == 200){
                toast(response.msg)
                thread {
                    viewModel.saveUserData(response.data)
                }
                saveLoginStatus(response.data.id,true, true)
                MainActivity.startActivity(this@LoginActivity)
            }else{
                response?.msg?.let { toast(it) }
            }
        }
    }

    override fun onLoginFailure(msg: String) {
        binding.loginProgressBar.hide()
        toast(R.string.login_failure, msg)
    }

    override fun onRegisterStarted() {
        binding.loginProgressBar.show()
    }

    override fun onRegisterSuccess(registerResult: LiveData<Result<String>>) {
        binding.loginProgressBar.hide()
        registerResult.observe(this) { result ->
            val response = result.getOrNull()
            if (response != null) {
                toast(response)
            }
            switch()
        }
    }

    override fun onRegisterFailure(msg: String) {
        toast(R.string.login_register_failure)
        binding.loginProgressBar.hide()
    }

    override fun onVerifySuccess(sendResult: LiveData<Result<String>>) {
        sendResult.observe(this){result ->
            if(result.isFailure){
                Log.e("error", result.getOrThrow())
                return@observe
            }
            if(result.isSuccess){
                val response = result.getOrNull()
                if (response != null) {
                    toast(response)
                    Log.e("verify", response)
                }
            }
        }
    }

    override fun onVerifyFailure(msg: String) {
        toast(R.string.login_verify_failure, msg)
    }

    private fun switch(){
        if(binding.btLogin.visibility == View.VISIBLE){
            binding.btLogin.visibility = View.GONE
            binding.btRegister.visibility = View.VISIBLE
            binding.tvRegister.setText(R.string.login_login_button)
        }else{
            binding.btLogin.visibility = View.VISIBLE
            binding.btRegister.visibility = View.GONE
            binding.tvRegister.setText(R.string.login_register_button)
        }
    }

    private fun saveLoginStatus(userId: String, isLogin: Boolean, isStore: Boolean) {
        FishApplication.sp.edit().apply{
            clear()
            putString("userID", userId)
            putBoolean("isLogin", isLogin)
            putBoolean("isStore", isStore)
            apply()
        }
    }
}