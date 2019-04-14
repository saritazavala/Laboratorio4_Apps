package com.example.guatemala

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
     fun empezar(view: View){
         val boton: Button = findViewById<Button>(R.id.Empezar)
         boton.setOnClickListener{
             val intento: Intent = Intent(this, Menu::class.java)
             startActivity(intento)
         }

     }
}




