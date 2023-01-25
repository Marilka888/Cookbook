package com.example.cookbook.presentation.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.commit
import androidx.fragment.app.viewModels
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import com.example.cookbook.R
import com.example.cookbook.presentation.Adapter
import com.example.cookbook.presentation.ListFragment
import com.example.cookbook.presentation.category.CategoriesFragment
import com.example.cookbook.presentation.chef.ChefsFragment
import com.example.cookbook.presentation.dish.DishesFragment
import kotlinx.coroutines.launch

class MainFragment : ListFragment(R.string.title_main, false) {

    private val viewModel by viewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter.onClick = { position ->
            parentFragmentManager.commit {
                replace(
                    R.id.fragment_container_view,
                    when (viewModel.state.value[position]) {
                        MainViewModel.Section.CHEFS -> ChefsFragment()
                        MainViewModel.Section.CATEGORIES -> CategoriesFragment()
                        MainViewModel.Section.FAVORITES -> DishesFragment.newInstance(
                            R.string.title_favorites,
                            onlyFavorites = true
                        )
                    }
                )
                addToBackStack(null)
            }
        }
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.state.flowWithLifecycle(viewLifecycleOwner.lifecycle).collect { sections ->
                adapter.data = sections.map {
                    Adapter.Item(it.drawableRes, it.title)
                }
            }
        }
    }
}