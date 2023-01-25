package com.example.cookbook.presentation.main

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.lifecycle.ViewModel
import com.example.cookbook.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    val state =
        MutableStateFlow(listOf(Section.CHEFS, Section.CATEGORIES, Section.FAVORITES)).asStateFlow()

    enum class Section(@DrawableRes val drawableRes: Int, @StringRes val title: Int) {

        CHEFS(R.drawable.img_section_chefs, R.string.section_chefs),
        CATEGORIES(R.drawable.img_section_categories, R.string.section_categories),
        FAVORITES(R.drawable.img_section_favorites, R.string.section_favorites),
    }
}