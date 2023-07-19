package com.example.tradeapp.presentation.main_screen.all_recycle_view

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tradeapp.databinding.ItemAllProductsBinding
import com.example.tradeapp.databinding.ItemFeaturedBinding
import com.example.tradeapp.databinding.ItemResaleBinding
import com.example.tradeapp.domain.models.AllProducts
import com.example.tradeapp.domain.models.Featured

class AllRecycleViewHolder(
    private val binding: ItemAllProductsBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(allProducts: AllProducts) = with(binding) {
       titleTextView.text = allProducts.title
        priceTextView.text = allProducts.price
        descriptionTextView.text = allProducts.description
        Glide.with(root.context)
            .load(allProducts.imageId)
            .into(imageView)

    }


}