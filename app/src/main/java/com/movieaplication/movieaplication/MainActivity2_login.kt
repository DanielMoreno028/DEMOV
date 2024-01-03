package com.movieaplication.movieaplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun Registro (view:View){
        val textview=findViewById<TextView>(R.id.Register)
        val intent = Intent(this,Activity_CrearCuenta::class.java).apply{

        }
        startActivity(intent)
    }

    fun ButtonLogin (view:View){
        val button=findViewById<TextView>(R.id.btLogin)
        val intent = Intent(this,Activity_home::class.java).apply{

        }
        startActivity(intent)
    }
}