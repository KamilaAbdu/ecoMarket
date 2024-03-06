package com.projects.ecomarket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projects.ecomarket.databinding.ActivityLoginUserBinding
import com.projects.ecomarket.databinding.ActivityStartBinding

private lateinit var binding: ActivityLoginUserBinding

class LoginUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goSingUpUser.setOnClickListener {
            val intent = Intent(this@LoginUserActivity, SignUpUserActivity::class.java)
            startActivity(intent)
        }

            binding.button.setOnClickListener{
                val intent = Intent ( this@LoginUserActivity, MainActivity :: class.java)
                startActivity (intent)
            finish()

        }
    }
}
