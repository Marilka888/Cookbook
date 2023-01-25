package com.example.cookbook.presentation.chef

import androidx.lifecycle.ViewModel
import com.example.cookbook.data.chef.ChefRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ChefsViewModel : ViewModel() {

    val state = MutableStateFlow(ChefRepository.chefs).asStateFlow()
}