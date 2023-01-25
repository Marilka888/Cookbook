package com.example.cookbook.presentation

import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.core.view.isVisible
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.cookbook.R
import com.example.cookbook.databinding.ItemMenuBinding

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {

    private val differ = AsyncListDiffer(this, object : DiffUtil.ItemCallback<Item>() {

        override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean =
            oldItem.title == newItem.title

        override fun areContentsTheSame(oldItem: Item, newItem: Item) = oldItem == newItem
    })

    var onClick: ((Int) -> Unit)? = null
    var onFavoriteClick: ((Int) -> Unit)? = null

    var data: List<Item>
        get() = differ.currentList
        set(value) = differ.submitList(value)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(ItemMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        with(holder.binding) {
            imageView.setImageResource(item.drawableRes)
            textView.setText(item.title)
            root.setOnClickListener { onClick?.invoke(position) }
            favoriteButton.apply {
                isVisible = item.favorite != null
                setImageResource(
                    if (item.favorite == true) {
                        R.drawable.baseline_thumb_up_alt_24
                    } else {
                        R.drawable.baseline_thumb_up_off_alt_24
                    }
                )
                setOnClickListener { onFavoriteClick?.invoke(position) }
            }
        }
    }

    class ViewHolder(val binding: ItemMenuBinding) : RecyclerView.ViewHolder(binding.root)

    data class Item(
        @DrawableRes val drawableRes: Int,
        @StringRes val title: Int,
        val favorite: Boolean? = null
    )
}