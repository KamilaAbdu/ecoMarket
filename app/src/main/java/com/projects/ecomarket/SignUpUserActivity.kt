package com.projects.ecomarket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projects.ecomarket.databinding.ActivitySignUpUserBinding

private lateinit var binding: ActivitySignUpUserBinding

class SignUpUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goLoginUserPage.setOnClickListener {
            val intent = Intent(this@SignUpUserActivity, LoginUserActivity::class.java)
            startActivity(intent)
        }


        binding.goSignUpBtn.setOnClickListener{
            val intent = Intent ( this@SignUpUserActivity, LocationActivity :: class.java)
            startActivity(intent)
            finish()
        }
    }
}