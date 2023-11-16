package com.example.gradetracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun toMENU(view: View) {
        val i = Intent(this,MainActivity::class.java)
        startActivity(i)
    }
    fun toYEARLEVEL(view: View) {
        val i = Intent(this,YearLevel::class.java)
        startActivity(i)
    }
}