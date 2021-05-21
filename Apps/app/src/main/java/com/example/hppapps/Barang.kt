package com.example.hppapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Barang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barang)

        val editResep: Button = findViewById(R.id.editResep)
        val editBahan: Button = findViewById(R.id.editBahan)

        editResep.setOnClickListener(View.OnClickListener {
            val i = Intent(this@Barang, Resep::class.java)
            startActivity(i)
        })
        editBahan.setOnClickListener(View.OnClickListener {
            val i = Intent(this@Barang, Bahan::class.java)
            startActivity(i)
        })
    }
}