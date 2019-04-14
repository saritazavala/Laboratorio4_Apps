package com.example.guatemala

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
    }

    fun backear(view: View) {
        val boton: ImageButton = findViewById<ImageButton>(R.id.atras)
        val intento: Intent = Intent(this, Menu::class.java)
        startActivity(intento)
        }
    }


