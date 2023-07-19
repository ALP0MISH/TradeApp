package com.example.tradeapp.presentation.search_functions

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tradeapp.databinding.ItemSearchCategoriesBinding
import com.example.tradeapp.domain.models.Category

class AllNotesViewHolder(
    private val binding: ItemSearchCategoriesBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(category: Category) = with(binding) {
            descriptionTextView.text = category.description
            Glide.with(root.context)
                .load(category.imageId)
                .into(imageView)

        }

}