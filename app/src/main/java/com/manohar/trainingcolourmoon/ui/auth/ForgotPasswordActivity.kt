package com.manohar.trainingcolourmoon.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.manohar.trainingcolourmoon.R
import com.manohar.trainingcolourmoon.databinding.ActivityForgotPasswordBinding
import com.manohar.trainingcolourmoon.databinding.ActivityLoginBinding
import com.manohar.trainingcolourmoon.utils.toast

class ForgotPasswordActivity : AppCompatActivity(),AuthListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding : ActivityForgotPasswordBinding = DataBindingUtil.setContentView(this,R.layout.activity_forgot_password)
        val viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)

        binding.viewmodel = viewModel

        viewModel.authListener = this
    }

    override fun onStarted() {
        toast("Change the Password")
    }

    override fun onSuccess() {
        toast("Password Changed")
    }

    override fun onFailure(message: String) {
        toast(message)
    }
}