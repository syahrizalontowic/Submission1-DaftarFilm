package com.syahrizal.submission1_daftarfilm.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.syahrizal.submission1_daftarfilm.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.elevation = 0f
    }
}
