package com.example.cookbook.data.category

import com.example.cookbook.R

object CategoryRepository {

    val categories = listOf(
        Category(0, R.drawable.img_category_salads, R.string.category_salads),
        Category(1, R.drawable.img_category_hot_meals, R.string.category_hot_meals),
        Category(2, R.drawable.img_category_desserts, R.string.category_dessets),
    )
}