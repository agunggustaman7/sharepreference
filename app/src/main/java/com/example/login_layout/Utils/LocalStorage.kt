package com.example.login_layout.Utils

import android.content.Context
import android.content.SharedPreferences


class LocalStorage (private val context: Context) {

    private val key = "com.example.login_layout.Utils"
    private val private = 0

    private val fullName = "fullName"
    private val username = "Username"
    private val job = "job"

    fun saveFullName(string: String){
        val  sharedPreferences : SharedPreferences = context.getSharedPreferences(key, private)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString(fullName, string)
        editor.apply()
    }

    fun getFullName(): String {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences(key, private)
        return sharedPreferences.getString(fullName, "")!!
    }

    fun saveUsername(string: String){
        val  sharedPreferences : SharedPreferences = context.getSharedPreferences(key, private)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString(username, string)
        editor.apply()
    }

    fun getUsername(): String {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences(key, private)
        return sharedPreferences.getString(username, "")!!
    }

    fun saveJob(int: Int){
        val sharedPreferences: SharedPreferences = context.getSharedPreferences(key, private)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putInt(job, int)
    }

    fun getJob() : Int {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences(key, private)
        return sharedPreferences.getInt(job, -1)
    }






}