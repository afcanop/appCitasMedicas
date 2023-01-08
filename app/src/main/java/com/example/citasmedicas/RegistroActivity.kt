package com.example.citasmedicas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val textlogin = findViewById<TextView>(R.id.textlogin)

        textlogin.setOnClickListener{
            irLogin()
        }

    }

    private fun irLogin(){
        val registerActivity = Intent(this, MainActivity::class.java)
        startActivity(registerActivity);
    }

}