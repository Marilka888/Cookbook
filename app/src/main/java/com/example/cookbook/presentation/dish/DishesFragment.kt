package com.example.cookbook.presentation.dish

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.annotation.StringRes
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.fragment.app.viewModels
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import com.example.cookbook.R
import com.example.cookbook.databinding.FragmentListBinding
import com.example.cookbook.presentation.Adapter
import com.example.cookbook.presentation.ListFragment
import kotlinx.coroutines.launch

class DishesFragment : ListFragment() {

    private val viewModel by viewModels<DishesViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.onAttach(
            chefId = requireArguments().getInt(ARG_CHEF_ID, NO_ARG_VALUE)
                .let { if (it == NO_ARG_VALUE) null else it },
            categoryId = requireArguments().getInt(ARG_CATEGORY_ID, NO_ARG_VALUE)
                .let { if (it == NO_ARG_VALUE) null else it },
            onlyFavorites = requireArguments().getBoolean(ARG_ONLY_FAVORITES)
        )
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.state.flowWithLifecycle(viewLifecycleOwner.lifecycle).collect { dishes ->
                adapter.data = dishes.map { Adapter.Item(it.drawableRes, it.name, it.favorite) }
            }
        }
        adapter.onClick = { position ->
            parentFragmentManager.commit {
                replace(
                    R.id.fragment_container_view,
                    DishFragment.newInstance(viewModel.state.value[position].id)
                )
                addToBackStack(null)
            }
        }
        adapter.onFavoriteClick = viewModel::onFavoriteChange
        FragmentListBinding.bind(view).toolbar.setTitle(requireArguments().getInt(ARG_TITLE))
    }

    companion object {
        private const val ARG_TITLE = "title"
        private const val ARG_CHEF_ID = "chef_id"
        private const val ARG_CATEGORY_ID = "category_id"
        private const val ARG_ONLY_FAVORITES = "only_favorites"

        private const val NO_ARG_VALUE = Int.MIN_VALUE

        fun newInstance(
            @StringRes title: Int,
            chefId: Int? = null,
            categoryId: Int? = null,
            onlyFavorites: Boolean = false
        ) = DishesFragment().apply {
            arguments = bundleOf(
                ARG_TITLE to title,
                ARG_CHEF_ID to chefId,
                ARG_CATEGORY_ID to categoryId,
                ARG_ONLY_FAVORITES to onlyFavorites,
            )
        }
    }
}