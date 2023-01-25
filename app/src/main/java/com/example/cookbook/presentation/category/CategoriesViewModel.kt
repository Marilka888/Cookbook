package com.example.cookbook.presentation.category

import androidx.lifecycle.ViewModel
import com.example.cookbook.data.category.CategoryRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CategoriesViewModel : ViewModel() {

    val state = MutableStateFlow(CategoryRepository.categories).asStateFlow()
}