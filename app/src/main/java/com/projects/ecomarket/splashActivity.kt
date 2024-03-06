package com.projects.ecomarket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
           val intent = Intent( this@splashActivity, startActivity :: class.java)
            startActivity (intent)
            finish()
        }, 3000)
    }
}