package com.projects.ecomarket

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatButton
import com.projects.ecomarket.databinding.ActivityLocationBinding

class LocationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLocationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val countryList = arrayOf("Кыргызстан", "Казахстан", "Узбекстан")
        val adapter = ArrayAdapter( this@LocationActivity, android.R.layout.simple_list_item_1, countryList)

        binding.locationList.setAdapter(adapter)

        binding.locationList.setOnItemClickListener { parent, view, position, id ->

            val selectedLocation = parent.getItemAtPosition(position) as String
            showDialogAtPosition(selectedLocation)

        }


    }

    @SuppressLint("MissingInflatedId")
    fun showDialogAtPosition(location : String){
        val dialogView = layoutInflater.inflate(R.layout.alert_dialog, null)

        val dialogBuilder = AlertDialog.Builder(this@LocationActivity)

        dialogBuilder.setView(dialogView)

        val dialog = dialogBuilder.create()

        dialogView.findViewById<AppCompatButton>(R.id.btn_yes).setOnClickListener{
            startActivityWithLocation(location)
            dialog.dismiss()
        }

        dialog.findViewById<AppCompatButton>(R.id.btn_consel)?.setOnClickListener{
            dialog.dismiss()
        }

        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()

    }

    private fun startActivityWithLocation(location: String) {
        TODO("Not yet implemented")
        val  intent = Intent(this@LocationActivity, MainActivity :: class.java)
        intent.putExtra("location", location)
        startActivity(intent)
        finish()
    }
}