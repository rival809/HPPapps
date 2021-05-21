package com.example.hppapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Bahan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bahan)

        val tombolSave: Button = findViewById(R.id.tombolSave)
        val tombolRemove: Button = findViewById(R.id.tombolRemove)

        tombolSave.setOnClickListener(View.OnClickListener {
            val i = Intent(this@Bahan, MainMenu::class.java)
            startActivity(i)
        })
        tombolRemove.setOnClickListener(View.OnClickListener {

        })
    }
}