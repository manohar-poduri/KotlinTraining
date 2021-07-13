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

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)

        val btnSignUp = view.findViewById<View>(R.id.btnSignUp) as Button
        btnSignUp.setOnClickListener {
            val toast = Toast. makeText(context, "SignUp", Toast.LENGTH_LONG)
            toast. show()
        }

        val btnSignIn = view.findViewById<View>(R.id.btnSignInTV) as TextView
        btnSignIn.setOnClickListener {
            val fragment = LoginFragment()
            val fragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainerView,fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        return view
    }
}