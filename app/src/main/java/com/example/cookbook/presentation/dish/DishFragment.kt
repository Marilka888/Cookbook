package com.example.cookbook.presentation.dish

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.activity.addCallback
import androidx.core.os.bundleOf
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import com.example.cookbook.R
import com.example.cookbook.databinding.FragmentDishBinding
import kotlinx.coroutines.launch

class DishFragment : Fragment(R.layout.fragment_dish) {

    private val viewModel by viewModels<DishViewModel>()

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.onAttach(requireArguments().getInt(ARG_ID))
        var callback: OnBackPressedCallback? = null
        with(FragmentDishBinding.bind(view)) {
            viewLifecycleOwner.lifecycleScope.launch {
                viewModel.state.flowWithLifecycle(viewLifecycleOwner.lifecycle).collect { state ->
                    if (state != null) {
                        callback?.remove()
                        requireActivity().onBackPressedDispatcher.addCallback(
                            viewLifecycleOwner,
                            object : OnBackPressedCallback(true) {
                                override fun handleOnBackPressed() = onBack(state)
                            }.also { callback = it }
                        )
                        toolbar.setTitle(state.dish.name)
                        toolbar.setNavigationIcon(R.drawable.baseline_arrow_back_24)
                        toolbar.setNavigationOnClickListener { onBack(state) }
                        val step = state.dish.steps[state.step]
                        imageView.setImageResource(step.drawableRes)
                        titieTextView.text = if (state.step == 0) {
                            getString(R.string.dish_step_title_ingredients)
                        } else {
                            getString(R.string.dish_step_title_stage, state.step)
                        }
                        descriptionTextView.setText(step.description)
                        descriptionTextView.movementMethod = ScrollingMovementMethod()
                        stepTextView.isVisible = state.step != 0
                        stepTextView.text = "${state.step}/${state.dish.steps.lastIndex}"
                        button.setText(
                            when (state.step) {
                                0 -> R.string.dish_start_cooking
                                state.dish.steps.lastIndex -> R.string.dish_done
                                else -> R.string.dish_next
                            }
                        )
                        button.setOnClickListener {
                            if (state.step == state.dish.steps.lastIndex) {
                                parentFragmentManager.popBackStack()
                            } else {
                                viewModel.onNextClick()
                            }
                        }
                    }
                }
            }

        }
    }

    private fun onBack(state: DishViewModel.State) {
        if (state.step == 0) {
            parentFragmentManager.popBackStack()
        } else {
            viewModel.onBack()
        }
    }

    companion object {

        private const val ARG_ID = "id"
        fun newInstance(id: Int) = DishFragment().apply { arguments = bundleOf(ARG_ID to id) }
    }
}