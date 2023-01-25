package com.example.cookbook.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.cookbook.R
import com.example.cookbook.databinding.FragmentListBinding

abstract class ListFragment(
    private val titleRes: Int? = null,
    private val showBackButton: Boolean = true,
) : Fragment(R.layout.fragment_list) {

    protected val adapter = Adapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(FragmentListBinding.bind(view)) {
            recyclerView.adapter = adapter
            if (titleRes != null) toolbar.setTitle(titleRes)
            if (showBackButton) {
                toolbar.setNavigationIcon(R.drawable.baseline_arrow_back_24)
                toolbar.setNavigationOnClickListener { parentFragmentManager.popBackStack() }
            }
        }
    }
}