package com.example.hppapps

import android.os.Bundle
import android.support.wearable.activity.WearableActivity

class cardResep : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_resep)

        // Enables Always-on
        setAmbientEnabled()
    }
}