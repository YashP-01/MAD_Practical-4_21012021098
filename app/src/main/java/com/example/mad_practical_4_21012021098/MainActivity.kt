package com.example.mad_practical_4_21012021098

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login: Button = findViewById(R.id.button);
        val signup: Button = findViewById(R.id.button2);

        login.setOnClickListener {
            Intent(this@MainActivity, LoginActivity::class.java).also{
                startActivity(it)
            }
        }

        signup.setOnClickListener {
            Intent(this@MainActivity,RegestrationActivity2::class.java).also{
                startActivity(it)
            }
        }
    }
}