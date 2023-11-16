package com.example.gradetracker

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.TextView

class YearLevel : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_year_level)

        val openSem1 = findViewById<Button>(R.id.firstyear)
        val openSem2 = findViewById<Button>(R.id.secondyear)
        val openSem3 = findViewById<Button>(R.id.thirdyear)
        val openSem4 = findViewById<Button>(R.id.fourthyr)

        openSem1.setOnClickListener {
            val message = "Choose a Semester"
            showSem1(message)
        }
        openSem2.setOnClickListener {
            val message = "Choose a Semester"
            showSem1(message)
        }
        openSem3.setOnClickListener {
            val message = "Choose a Semester"
            showSem1(message)
        }
        openSem4.setOnClickListener {
            val message = "Choose a Semester"
            showSem1(message)
        }
    }
    private fun showSem1 (message: String) {

        val dialog2 = Dialog(this)
        dialog2.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog2.setCancelable(false)
        dialog2.setContentView(R.layout.semesterbox)
        dialog2.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val tvMessage2 = dialog2.findViewById<TextView>(R.id.tvMessage2)
        val btnfirstsem = dialog2.findViewById<Button>(R.id.btnfirstsem)
        val btnsecondsem = dialog2.findViewById<Button>(R.id.btnsecondsem)
        val btnexit = dialog2.findViewById<Button>(R.id.btnexit)


        tvMessage2.text = message
        dialog2.show()

        btnexit.setOnClickListener {
            dialog2.dismiss()
        }
        btnfirstsem.setOnClickListener {
                val i = Intent(this,Courses::class.java)
                startActivity(i)

        }
        btnsecondsem.setOnClickListener {

                val i = Intent(this,Courses::class.java)
                startActivity(i)

        }

    }

    fun toMENU(view: View) {
        val i = Intent(this,MainActivity::class.java)
        startActivity(i)
    }



}