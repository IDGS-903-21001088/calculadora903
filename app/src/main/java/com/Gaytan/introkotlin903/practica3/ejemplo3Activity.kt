package com.Gaytan.introkotlin903.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.ViewCompat
import com.Gaytan.introkotlin903.R

class Ejemplo3Activity : AppCompatActivity() {

    private lateinit var tv1: TextView
    private lateinit var edt1: EditText
    private lateinit var button: Button  // 'button' en minúscula por convención
    private var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejemplo3)

        edt1 = findViewById(R.id.edt1)
        button = findViewById(R.id.button)

        num = (Math.random() * 100001).toInt()
        val cadena = num.toString()
        val notificacion = Toast.makeText(this, cadena, Toast.LENGTH_LONG)
        notificacion.show()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            // Aquí iría la lógica para manejar los insets
            insets
        }
    }

    fun controlar(view: android.view.View) {
        val valorIngresado: String = edt1.text.toString()
        // Aquí iría la lógica para procesar el valor ingresado
    }
}