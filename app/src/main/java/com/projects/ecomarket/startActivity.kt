package com.projects.ecomarket

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.appcompat.widget.AppCompatButton
import com.projects.ecomarket.databinding.ActivityStartBinding

class startActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goUserLoginBtn.setOnClickListener{
            val intent = Intent (this@startActivity, LoginUserActivity :: class.java)
            startActivity(intent)
            finish()
        }


             }
    }
