package com.example.fish.ui.auth

import android.util.Log
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import com.example.base.ui.activity.BaseActivity
import com.example.base.ui.kxt.hide
import com.example.base.ui.kxt.show
import com.example.base.ui.kxt.toast
import com.example.fish.FishApplication
import com.example.fish.R
import com.example.fish.databinding.ActivityLoginBinding
import com.example.fish.logic.network.model.UserResponse
import com.example.fish.ui.MainActivity
import kotlin.concurrent.thread

class LoginActivity : BaseActivity<ActivityLoginBinding>(), AuthListener {

    private val mViewModel by lazy {
        ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(UserViewModel::class.java)
    }

    override fun ActivityLoginBinding.initBindingView() {
        viewModel = mViewModel
        mViewModel.authListener = this@LoginActivity

        tvRegister.setOnClickListener {
            switch()
        }
        jumpToMain()
    }

    /**
     * Login start callback
     */
    override fun onLoginStarted() {
        binding.loginProgressBar.show()
    }

    /**
     * Login success callback
     */
    override fun onLoginSuccess(loginResult: LiveData<Result<UserResponse>>) {
        binding.loginProgressBar.hide()
        loginResult.observe(this) { result ->
            val response = result.getOrNull()
            if (response != null && response.code == 200) {
                toast(response.msg)
                thread {
                    mViewModel.saveUserData(response.data)
                }
                saveLoginStatus(response.data.id, true, true)
                MainActivity.startActivity(this@LoginActivity)
            } else {
                response?.msg?.let { toast(it) }
            }
        }
    }

    /**
     * Login failure callback
     */
    override fun onLoginFailure(msg: String) {
        binding.loginProgressBar.hide()
        toast(R.string.login_failure, msg)
    }

    /**
     * Login success callback
     */
    override fun onRegisterStarted() {
        binding.loginProgressBar.show()
    }

    /**
     * Register success callback
     */
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

    /**
     * Register failure callback
     */
    override fun onRegisterFailure(msg: String) {
        toast(R.string.login_register_failure)
        binding.loginProgressBar.hide()
    }

    /**
     * Verify success callback
     */
    override fun onVerifySuccess(sendResult: LiveData<Result<String>>) {
        sendResult.observe(this) { result ->
            if (result.isFailure) {
                Log.e("error", result.getOrThrow())
                return@observe
            }
            if (result.isSuccess) {
                val response = result.getOrNull()
                if (response != null) {
                    toast(response)
                    Log.e("verify", response)
                }
            }
        }
    }

    /**
     * Verify failure callback
     */
    override fun onVerifyFailure(msg: String) {
        toast(R.string.login_verify_failure, msg)
    }

    /**
     * Switch positive button status
     */
    private fun switch() {
        if (binding.btLogin.visibility == View.VISIBLE) {
            binding.btLogin.visibility = View.GONE
            binding.btRegister.visibility = View.VISIBLE
            binding.tvRegister.setText(R.string.login_login_button)
        } else {
            binding.btLogin.visibility = View.VISIBLE
            binding.btRegister.visibility = View.GONE
            binding.tvRegister.setText(R.string.login_register_button)
        }
    }

    /**
     * Use sp to save login status
     */
    private fun saveLoginStatus(userId: String, isLogin: Boolean, isStore: Boolean) {
        FishApplication.sp.edit().apply {
            clear()
            putString(FishApplication.userID, userId)
            putBoolean(FishApplication.isLogin, isLogin)
            putBoolean(FishApplication.isStore, isStore)
            apply()
        }
    }

    private fun jumpToMain() {
        if (!FishApplication.sp.getBoolean("isLogin", false)) return
        MainActivity.startActivity(this@LoginActivity)
        finish()
    }
}