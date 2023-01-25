package com.example.cookbook.presentation

import android.content.Context
import android.content.SharedPreferences

class Application : android.app.Application() {


    override fun onCreate() {
        super.onCreate()
        favoritePreferences = getSharedPreferences("favorite", Context.MODE_PRIVATE)
    }

    companion object {
        lateinit var favoritePreferences: SharedPreferences
    }
}