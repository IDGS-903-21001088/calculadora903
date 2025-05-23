package com.Gaytan.introkotlin903.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.Gaytan.introkotlin903.R

class resultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultado)
        val name = intent.getStringExtra("name").orEmpty()
        val tvResult = findViewById<TextView>(R.id.tvResults)
        tvResult.text = "Hola $name"

    }

    private fun enableEdgeToEdge() {
        TODO("Not yet implemented")
    }
}