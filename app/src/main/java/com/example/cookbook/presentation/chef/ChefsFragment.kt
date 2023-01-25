package com.example.cookbook.presentation.chef

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

class ChefsFragment : ListFragment(R.string.title_chefs) {

    private val viewModel by viewModels<ChefsViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter.onClick = {
            parentFragmentManager.commit {
                replace(
                    R.id.fragment_container_view,
                    DishesFragment.newInstance(
                        viewModel.state.value[it].name,
                        chefId = viewModel.state.value[it].id
                    )
                )
                addToBackStack(null)
            }
        }
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.state.flowWithLifecycle(viewLifecycleOwner.lifecycle).collect {
                adapter.data = it.map { chef -> Adapter.Item(chef.drawableRes, chef.name) }
            }
        }
    }
}