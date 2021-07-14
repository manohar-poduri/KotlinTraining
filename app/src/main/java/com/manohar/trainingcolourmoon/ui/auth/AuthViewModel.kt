package com.manohar.trainingcolourmoon.ui.auth

import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {

    var username: String? = null
    var email: String? = null
    var password: String? = null
    var confirmPassword: String? = null


    var authListener: AuthListener? = null

    fun onLoginButtonClick(view: View){

        //empty fields
        if (email.isNullOrEmpty()){
            authListener?.onFailure("Invalid email")
            return
        }
        if (password.isNullOrEmpty()){
            authListener?.onFailure("Invalid Password")
            return
        }

        //success
        authListener?.onSuccess()



    }

    fun onSignUpButtonClick(view: View){

        //empty details
        if(username.isNullOrEmpty()){
            authListener?.onFailure("Please enter the Username")
            return
        }
        if(email.isNullOrEmpty()){
            authListener?.onFailure("Please enter the Email")
            return
        }
        if(password.isNullOrEmpty()){
            authListener?.onFailure("Please enter the Password")
            return
        }
        if(confirmPassword.isNullOrEmpty() || confirmPassword != password){
            authListener?.onFailure("Please Confirm the Password")
            return
        }

        //success

        authListener?.onSuccess()
    }

    fun onChangePassword(view: View){

        //empty fields
        if(password.isNullOrEmpty()){
            authListener?.onFailure("Please enter the Password")
            return
        }
        if(confirmPassword.isNullOrEmpty() || confirmPassword != password){
            authListener?.onFailure("Please Confirm the Password")
            return
        }

        //success

        authListener?.onSuccess()
        Intent(view.context, LoginActivity::class.java).let {
            view.context.startActivity(it)
        }
    }

    fun navigateToSignUpActivity(view: View) {
        Intent(view.context, SignupActivity::class.java).let {
            view.context.startActivity(it)
        }
    }

    fun navigateToSignInActivity(view: View) {
        Intent(view.context, LoginActivity::class.java).let {
            view.context.startActivity(it)
        }
    }

    fun navigateToForgotPassword(view:View){
        Intent(view.context, ForgotPasswordActivity::class.java).let {
            view.context.startActivity(it)
        }
    }
}