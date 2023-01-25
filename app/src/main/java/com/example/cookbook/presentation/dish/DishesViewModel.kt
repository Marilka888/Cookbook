package com.example.cookbook.presentation.dish

import androidx.lifecycle.ViewModel
import com.example.cookbook.data.dish.Dish
import com.example.cookbook.data.dish.DishRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class DishesViewModel : ViewModel() {

    private val _state = MutableStateFlow(emptyList<Dish>())
    val state = _state.asStateFlow()

    private var chefId: Int? = null
    private var categoryId: Int? = null
    private var onlyFavorites: Boolean = false

    fun onAttach(chefId: Int?, categoryId: Int?, onlyFavorites: Boolean) {
        this.chefId = chefId
        this.categoryId = categoryId
        this.onlyFavorites = onlyFavorites
        loadDishes()
    }

    private fun loadDishes() {
        _state.value = DishRepository.dishes.filter {
            (if (chefId != null) it.chefId == chefId else true) &&
                    (if (categoryId != null) it.categoryId == categoryId else true) &&
                    (if (onlyFavorites) it.favorite else true)
        }
    }

    fun onFavoriteChange(position: Int) {
        DishRepository.changeFavorite(state.value[position].id)
        loadDishes()
    }
}