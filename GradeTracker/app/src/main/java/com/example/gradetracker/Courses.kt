package com.example.gradetracker

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

class Courses : AppCompatActivity() {
    private lateinit var listView: ListView
    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var editText: EditText
    private lateinit var addButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)


        val openAddCourse = findViewById<Button>(R.id.addcourse)
        openAddCourse.setOnClickListener {
            val message = "Add a Course"
            showAddCourse(message)
        }

    }
    private fun showAddCourse (message: String) {

        val dialog2 = Dialog(this)
        dialog2.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog2.setCancelable(false)
        dialog2.setContentView(R.layout.addcourseentry)
        dialog2.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val tvMessage2 = dialog2.findViewById<TextView>(R.id.tvMessage2)
        val btnaddcourse = dialog2.findViewById<Button>(R.id.btnaddcourse)
        val btnexit = dialog2.findViewById<Button>(R.id.btnexit)
        val course = dialog2.findViewById<EditText>(R.id.etCourse)
        val courselist = findViewById<ListView>(R.id.courseslist)


        tvMessage2.text = message
        dialog2.show()

        btnexit.setOnClickListener {
            dialog2.dismiss()
        }
        btnaddcourse.setOnClickListener {

        }

        btnexit.setOnClickListener {

            dialog2.dismiss()

        }

    }


        fun toMENU(view: View) {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        fun toYEARLEVEL(view: View) {
            val i = Intent(this, YearLevel::class.java)
            startActivity(i)
        }
    }
