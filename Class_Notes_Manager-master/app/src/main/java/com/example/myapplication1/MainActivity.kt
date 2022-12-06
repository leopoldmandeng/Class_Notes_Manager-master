package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val connect = findViewById<Button>(R.id.button)
        val teacher = findViewById<EditText>(R.id.editTextTextPersonName2)
        val classe = findViewById<EditText>(R.id.editTextTextPersonName5)
        val periode = findViewById<EditText>(R.id.editTextTextPersonName6)
        val yeare = findViewById<EditText>(R.id.editTextTextPersonName7)

        connect.setOnClickListener {
            val txtteacher = teacher.text.toString()
            val txtclasse = classe.text.toString()
            val txtperiode = periode.text.toString()
            val txtyeare = yeare.text.toString()
          if (txtteacher.trim().isEmpty() || txtclasse.trim().isEmpty() || txtperiode.trim().isEmpty() || txtyeare.trim().isEmpty()) {
                Toast.makeText(this, "The space cannot be empty!", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Teacher : $txtteacher - Class = $txtclasse - period : $txtperiode - year : $txtyeare", Toast.LENGTH_LONG).show()

              // Intent explicit
              val intentToStudentManager = Intent(this,Student_Manager::class.java)
              startActivity(intentToStudentManager)
            }
        }
    }
}




