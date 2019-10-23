package com.example.login_layout


import android.content.Context
import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.login_layout.Activity.LoginActivity
import com.example.login_layout.Utils.LocalStorage
import kotlinx.android.synthetic.main.activity_registrasi.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)


//        supportActionBar!!.title = "Registertrasi"
//        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        val localStorage = LocalStorage(getActivity())
        val list: ArrayList<String> = ArrayList()
        list.add("Mahasiswa")
        list.add("Karyawan")
        list.add("Pengangguran")
        list.add("Lain-lain")

        val adapter: ArrayAdapter<String> =
            ArrayAdapter(getActivity(), android.R.layout.simple_spinner_dropdown_item, list)
        spList.adapter = adapter

        if (localStorage.getJob() != -1) {
            spList.setSelection(localStorage.getJob())
        }

        if (localStorage.getFullName() != null) {
            etYourname.setText(localStorage.getFullName())
        }

        if (localStorage.getUsername() != null) {
            etUsername.setText(localStorage.getUsername())
        }


        etYourname.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                Log.e ("afterTextChanged", p0!!.toString())
            }

            override fun beforeTextChanged(p0: CharSequence?, start: Int, count: Int, after: Int) {
                Log.e("beforeTextChanged", p0!!.toString())
            }

            override fun onTextChanged(p0: CharSequence?, start: Int, before: Int, count: Int) {
                Toast.makeText(applicationContext,"Data Tersimpan", Toast.LENGTH_SHORT).show()
            }
        })



        btmRegister.setOnClickListener {
            if (etYourname.text.isNotEmpty()) {
                localStorage.saveFullName(etYourname.text.toString())
            }
            localStorage.saveUsername(etUsername.text.toString())

            localStorage.saveJob(spList.selectedItemPosition)
            startActivity(Intent(getActivity(), LoginActivity::class.java))
        }
    }
    private fun getActivity() : Context { return this }



}






