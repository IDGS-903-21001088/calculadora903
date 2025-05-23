package com.Gaytan.introkotlin903.cinepolis

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.Gaytan.introkotlin903.R

class CinepolisActivity : AppCompatActivity() {

    private val PRECIO_BOLETO = 12.000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cinepolis)
    }

    fun calcular(view: View) {
        val edtNombre = findViewById<EditText>(R.id.edtNombre)
        val edtCantidadCompradores = findViewById<EditText>(R.id.edtCantidadCompradores)
        val edtCantidadBoletos = findViewById<EditText>(R.id.edtCantidadBoletos)
        val rbSi = findViewById<RadioButton>(R.id.rbSi)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        if (edtCantidadCompradores.text.isEmpty() || edtCantidadBoletos.text.isEmpty()) {
            Toast.makeText(this, "Llena todos los campos", Toast.LENGTH_SHORT).show()
            return
        }

        val compradores = edtCantidadCompradores.text.toString().toInt()
        val boletos = edtCantidadBoletos.text.toString().toInt()

        if (boletos > compradores * 7) {
            Toast.makeText(this, "Máximo 7 boletos por persona", Toast.LENGTH_SHORT).show()
            return
        }

        var precio = boletos * PRECIO_BOLETO

        when {
            boletos > 5 -> precio *= 0.85
            boletos >= 3 -> precio *= 0.90
        }

        if (rbSi.isChecked) {
            precio *= 0.90  // 10% adicional
        }

        txtResultado.text = "$" + String.format("%.2f", precio)
    }
}