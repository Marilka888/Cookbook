package com.example.cookbook.data.chef

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Chef(
    val id: Int,
    @DrawableRes val drawableRes: Int,
    @StringRes val name: Int,
)