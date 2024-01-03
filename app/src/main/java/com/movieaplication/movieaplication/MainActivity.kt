package com.movieaplication.movieaplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import  android.os.Handler
import android.content.Intent


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tiempoRecargo:Long=3000
        Handler ().postDelayed({
            val intent = Intent (this@MainActivity, MainActivity2_login::class.java)
            startActivity(intent)

            finish()
        },tiempoRecargo)
    }
}