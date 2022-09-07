package com.example.fish.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.base.ui.util.hide
import com.example.base.ui.util.show
import com.example.base.ui.util.toast
import com.example.fish.R
import com.example.fish.databinding.ActivityLoginBinding
import com.example.fish.logic.Repository
import com.example.fish.logic.model.UserResponse
import com.example.fish.logic.model.VerifyResponse
import com.example.fish.ui.MainActivity

class LoginActivity : AppCompatActivity() , AuthListener{

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(UserViewModel::class.java)

        binding.viewModel = viewModel
        viewModel.authListener = this

        binding.tvRegister.setOnClickListener{
            switch()
        }
    }

    override fun onLoginStarted() {
        toast(R.string.login_started)
        binding.loginProgressBar.show()
    }

    override fun onLoginSuccess(loginResult: LiveData<Result<Any>>) {
        toast(R.string.login_success)
        binding.loginProgressBar.hide()
        loginResult.observe(this){result->
            val response: UserResponse = result.getOrNull() as UserResponse
            if(response.code == 200) {
                toast(response.msg)
//                TODO(保存返回的用户数据)
                MainActivity.startActivity(this@LoginActivity)
            }else{
                toast(response.msg)
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

    override fun onRegisterSuccess(registerResult: LiveData<Result<Any>>) {
        binding.loginProgressBar.hide()
        registerResult.observe(this) { result ->
            val response: String = result.getOrNull() as String
            toast(response)
            switch()
        }
    }

    override fun onRegisterFailure(msg: String) {
        toast(R.string.login_register_failure)
        binding.loginProgressBar.hide()
    }

    override fun onVerifySuccess(sendResult: LiveData<Result<Any>>) {
        sendResult.observe(this){result ->
            if(result.isFailure){
                Log.e("error", result.getOrThrow() as String)
                return@observe
            }
            if(result.isSuccess){
                val response: String = result.getOrNull() as String
                toast(response)
                Log.e("verify", response)
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
}