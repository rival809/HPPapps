package com.example.hppapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Resep : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resep)

        val tombolNext: Button = findViewById(R.id.tombolNext)
        val tombolRemove: Button = findViewById(R.id.tombolRemove)
        val tombolAdd: Button = findViewById(R.id.buttonAdd)


        tombolNext.setOnClickListener(View.OnClickListener {
            val i = Intent(this@Resep, Barang::class.java)
            startActivity(i)
        })
        tombolRemove.setOnClickListener(View.OnClickListener {

        })
        tombolAdd.setOnClickListener(View.OnClickListener {

        })
    }
}