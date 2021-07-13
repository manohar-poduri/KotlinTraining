package com.manohar.trainingcolourmoon.navFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.manohar.trainingcolourmoon.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val btnSignIn = view.findViewById<View>(R.id.btnSignIn) as Button
        btnSignIn.setOnClickListener {

            val toast = Toast. makeText(context, "Login", Toast.LENGTH_LONG)
            toast. show()
        }

        val btnForgotPassword = view.findViewById<View>(R.id.btnForgotPassword) as TextView
        btnForgotPassword.setOnClickListener {
            val fragment = ForgotPasswordFragment()
            val fragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainerView,fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        val btnSignUp = view.findViewById<View>(R.id.btnSignUpTV) as TextView
        btnSignUp.setOnClickListener {
            val fragment = SignUpFragment()
            val fragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainerView,fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        return view
    }

}