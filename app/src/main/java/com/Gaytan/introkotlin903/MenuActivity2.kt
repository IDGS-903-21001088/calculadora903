package com.Gaytan.introkotlin903

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.content.ContextCompat.startActivity
import com.Gaytan.introkotlin903.practica1.saludoActivity

class MenuActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu2)

        val btnSaludo = findViewById<Button>(R.id.btn1)

        btnSaludo.setOnClickListener {navegateTosaludo() }

    }
}

        private fun navegateTosaludo(){
            val intent = Intent( packageContext: this, saludoActivity::class.java)
                startActivity(intent)
            }
        }