package com.example.citasmedicas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textCrearCuenta = findViewById<TextView>(R.id.textCrearCuenta)
        val btnIngresar = findViewById<Button>(R.id.btnIngresar)
        textCrearCuenta.setOnClickListener{
            irLogin()
        }
        btnIngresar.setOnClickListener{
            irMenuLateral()
        }
    }

    private fun irLogin(){
        val registerActivity = Intent(this, RegistroActivity::class.java)
        startActivity(registerActivity);
    }

    private fun irMenuLateral(){
        val registerActivity = Intent(this, MenuLateralActivity::class.java)
        startActivity(registerActivity);
    }
}