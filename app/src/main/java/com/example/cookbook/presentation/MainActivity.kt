package com.example.cookbook.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.cookbook.R
import com.example.cookbook.presentation.main.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (supportFragmentManager.fragments.isEmpty()) {
            supportFragmentManager.commit { replace(R.id.fragment_container_view, MainFragment()) }
        }
    }
}