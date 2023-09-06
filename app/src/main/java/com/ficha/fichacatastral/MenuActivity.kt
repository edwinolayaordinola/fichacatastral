package com.ficha.fichacatastral

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnFormRegistrarFicha = findViewById<Button>(R.id.btnFormRegistrarFicha);
        btnFormRegistrarFicha.setOnClickListener { navigateFormRegistrarFicha()}

        val btnFormReport = findViewById<Button>(R.id.btnFormReport);
        btnFormReport.setOnClickListener { navigateFormReport()}
    }

    private fun navigateFormRegistrarFicha(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun navigateFormReport(){
        val intent = Intent(this, FormReportActivity::class.java)
        startActivity(intent)
    }
}