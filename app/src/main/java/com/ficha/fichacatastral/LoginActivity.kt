package com.ficha.fichacatastral

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnIniciarEncuesta = findViewById<Button>(R.id.btnIniciarEncuesta);
        btnIniciarEncuesta.setOnClickListener { navigateMenu()}
    }

    private fun navigateMenu(){
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }
}