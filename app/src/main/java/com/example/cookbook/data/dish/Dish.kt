package com.example.cookbook.data.dish

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Dish(
    val id: Int,
    @DrawableRes val drawableRes: Int,
    @StringRes val name: Int,
    val chefId: Int,
    val categoryId: Int,
    val steps: List<Step>,
    val favorite: Boolean,
) {

    data class Step(
        @DrawableRes val drawableRes: Int,
        @StringRes val description: Int,
    )
}