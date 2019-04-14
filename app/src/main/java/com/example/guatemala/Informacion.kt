package com.example.guatemala

import android.content.Intent
import android.content.pm.ActivityInfo
import android.databinding.DataBindingUtil
import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.*
import com.example.guatemala.databinding.ActivityInformacionBinding

class Informacion : AppCompatActivity() {


//Tomado de https://medium.com/@ashdavies/leveraging-android-data-binding-with-kotlin-adfd7b73aeea
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var descripcion = intent.extras["Descripcion"]
        val binding : ActivityInformacionBinding = DataBindingUtil.setContentView(this, R.layout.activity_informacion)
        binding.run {
            setVariable(BR.Descripction, descripcion)
            executePendingBindings()
        }
    }

    fun backear(view: View) {
        val boton:Button = findViewById<Button>(R.id.back)
        val ingresdo:TextView = findViewById<TextView>(R.id.ComentarioIngresado)

            // your code to perform when the user clicks on the button
            Toast.makeText(this, ingresdo.text , Toast.LENGTH_LONG).show()
            val intento: Intent = Intent(this, Menu::class.java)
            startActivity(intento)

    }
    fun compartir(view: View){
        val ingresdo: TextView = findViewById<TextView>(R.id.ComentarioIngresado)
        val intento: Intent = Intent(this, Comentario::class.java)
        intento.putExtra(
            "Descripcion",
            Descripcion(
                "Comentario Compartido",ingresdo.text.toString() ,"Gracias por compartir!"
            )
        )
        startActivity(intento)

    }


}
