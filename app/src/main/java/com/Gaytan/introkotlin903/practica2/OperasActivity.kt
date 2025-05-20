package com.Gaytan.introkotlin903.practica2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.Gaytan.introkotlin903.R
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.WindowCompat

class OperasActivity : AppCompatActivity() {
    private lateinit var edt1: EditText
    private lateinit var edt2: EditText
    private lateinit var btn1: Button
    private lateinit var tv1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_operas)

        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        btn1 = findViewById(R.id.btn1)
        tv1 = findViewById(R.id.tv1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun enableEdgeToEdge() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
    }

    fun calcular(view: View) {
        val num1 = edt1.text.toString().toDouble()
        val num2 = edt2.text.toString().toDouble()
        val suma = num1 + num2
        val result1 = "Suma: $suma"
        val resta = num1 - num2
        val result2 = "Resta: $resta"
        val multiplicacion = num1 * num2
        val result3 = "Multiplicación: $multiplicacion"
        val division = num1 / num2
        val result4 = "División: $division"
        tv1.text = "$result1\n$result2\n$result3\n$result4"
    }
}
