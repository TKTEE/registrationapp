package com.example.simplenavigationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity<Button : View?> : AppCompatActivity() {
    var create : Button = TODO()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnhome = findViewById<Button>(R.id.btnhome)
        val btnabout = findViewById<Button>(R.id.btnabout)
        val btnservices = findViewById<Button>(R.id.btnservices)
        val btncontacts = findViewById<Button>(R.id.btncontacts)
        val btnlogin = findViewById<Button>(R.id.btnlogin)

        if (btnhome != null) {
            btnhome.setOnClickListener{
                val intent = Intent(this, Homeactivity::class.java)
                startActivity(intent)
            }
        }
        if (btnabout != null) {
            btnabout.setOnClickListener{
                val intent = Intent(this, Aboutactivity::class.java)
                startActivity(intent)
            }
        }
        if (btnservices != null) {
            btnservices.setOnClickListener{
                val intent = Intent(this, Servicesactivity::class.java)
                startActivity(intent)
            }
        }
        if (btncontacts != null) {
            btncontacts.setOnClickListener{
                val intent = Intent(this, Contactsactivity::class.java)
                startActivity(intent)
            }
        }
        if (btnlogin != null) {
            btnlogin.setOnClickListener{
                val intent = Intent(this, Loginactivity::class.java)
                startActivity(intent)
            }
        }
    }
}




