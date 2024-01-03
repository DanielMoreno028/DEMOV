package com.movieaplication.movieaplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Activity_CrearCuenta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_cuenta)

    }

    fun Devolver (view: View){
        val imageview=findViewById<ImageView>(R.id.flecha)
        val intent = Intent(this,MainActivity2_login::class.java).apply{
        }
        startActivity(intent)
    }

    fun CCLogin (view: View){
        val ccaceptar=findViewById<ImageView>(R.id.btEnter)
        val intent = Intent(this,MainActivity2_login::class.java).apply{
        }
        startActivity(intent)

    }
}
