package com.example.login_layout.Activity


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.login_layout.R
import com.example.login_layout.Utils.LocalStorage
import kotlinx.android.synthetic.main.activity_registrasi.*
import kotlinx.android.synthetic.main.profile_registrasi.*
import java.util.prefs.Preferences


class FormRegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_registrasi)

        val localStorage = LocalStorage(getActivity())

        if (localStorage.getFullName() != null) {
            outputYourname.setText(localStorage.getFullName())
        }

        if (localStorage.getUsername() != null) {
            outputUsername.setText(localStorage.getUsername())
        }


    }
    private fun getActivity() : Context { return this}

}



