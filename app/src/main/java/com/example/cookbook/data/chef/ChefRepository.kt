package com.example.cookbook.data.chef

import com.example.cookbook.R
import kotlinx.coroutines.flow.flow

object ChefRepository {

    val chefs = listOf(
        Chef(0, R.drawable.img_chef_ivlev, R.string.chef_ivlev),
        Chef(1, R.drawable.img_chef_ramsay, R.string.chef_ramsay),
        Chef(2, R.drawable.img_chef_ducasse, R.string.chef_ducasse),
    )
}