package com.manohar.trainingcolourmoon.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.manohar.trainingcolourmoon.R
import com.manohar.trainingcolourmoon.databinding.ActivityLoginBinding
import com.manohar.trainingcolourmoon.databinding.ActivitySignupBinding
import com.manohar.trainingcolourmoon.utils.toast

class SignupActivity : AppCompatActivity(), AuthListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivitySignupBinding = DataBindingUtil.setContentView(this,R.layout.activity_signup)
        val viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)

        binding.viewmodel = viewModel

        viewModel.authListener = this
    }

    override fun onStarted() {
        toast("SignUp Started")
    }

    override fun onSuccess() {
        toast("SignUp Success")
    }

    override fun onFailure(message: String) {
        toast(message)
    }
}