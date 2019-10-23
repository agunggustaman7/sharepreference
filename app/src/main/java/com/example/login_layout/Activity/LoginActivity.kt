package com.example.login_layout.Activity


import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.login_layout.MainActivity

import com.example.login_layout.R
import com.example.login_layout.Utils.LocalStorage
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_registrasi.*
import kotlinx.android.synthetic.main.profile_registrasi.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val localStorage = LocalStorage(getActivity())

//
        btn_login.setOnClickListener {
            startActivity(Intent(getActivity(), FormRegistrationActivity::class.java))
        }

        tvRegister.setOnClickListener {
            startActivity(Intent(getActivity(), MainActivity::class.java))
        }

    }
    private fun getActivity() : Context { return this}


}
