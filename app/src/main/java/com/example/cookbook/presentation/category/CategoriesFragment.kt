package com.example.cookbook.presentation.category

import android.os.Bundle
import android.view.View
import androidx.fragment.app.commit
import androidx.fragment.app.viewModels
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import com.example.cookbook.R
import com.example.cookbook.presentation.Adapter
import com.example.cookbook.presentation.ListFragment
import com.example.cookbook.presentation.dish.DishesFragment
import kotlinx.coroutines.launch

class CategoriesFragment : ListFragment(R.string.title_categories) {

    private val viewModel by viewModels<CategoriesViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter.onClick = {
            parentFragmentManager.commit {
                replace(
                    R.id.fragment_container_view,
                    DishesFragment.newInstance(
                        viewModel.state.value[it].name,
                        categoryId = viewModel.state.value[it].id
                    )
                )
                addToBackStack(null)
            }
        }
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.state.flowWithLifecycle(viewLifecycleOwner.lifecycle).collect { categories ->
                adapter.data = categories.map { Adapter.Item(it.drawableRes, it.name) }
            }
        }
    }
}