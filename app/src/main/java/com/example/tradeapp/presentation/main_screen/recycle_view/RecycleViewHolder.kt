package com.example.tradeapp.presentation.main_screen.recycle_view

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tradeapp.databinding.ItemFeaturedBinding
import com.example.tradeapp.domain.models.Featured

class RecycleViewHolder(
    private val binding: ItemFeaturedBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(featured: Featured) = with(binding) {
       recycleTextView.text = featured.title
        recycleTextPriseView.text = featured.price
        Glide.with(root.context)
            .load(featured.imageId)
            .into(recycleView)

    }


}