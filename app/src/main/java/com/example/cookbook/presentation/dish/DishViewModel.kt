package com.example.cookbook.presentation.dish

import androidx.lifecycle.ViewModel
import com.example.cookbook.data.dish.Dish
import com.example.cookbook.data.dish.DishRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class DishViewModel : ViewModel() {

    private val _state = MutableStateFlow<State?>(null)
    val state = _state.asStateFlow()


    fun onAttach(id: Int) {
        _state.value = State(DishRepository.dishes.first { it.id == id }, 0)
    }

    fun onNextClick() {
        _state.update { it!!.copy(step = it.step + 1) }
    }

    fun onBack() {
        _state.update { it!!.copy(step = it.step - 1) }
    }


    data class State(val dish: Dish, val step: Int)

}