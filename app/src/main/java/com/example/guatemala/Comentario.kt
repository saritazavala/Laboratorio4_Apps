package com.example.guatemala

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.guatemala.databinding.ActivityInformacionBinding

class Comentario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comentario)
        }

    var bundle :Bundle ?=intent.extras
    var message = bundle!!.getString("comentario") // 1
    var strUser: String = intent.getStringExtra("value") // 2



    }






