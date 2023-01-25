package com.example.cookbook.data.category

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Category(
    val id: Int,
    @DrawableRes val drawableRes: Int,
    @StringRes val name: Int,
)
