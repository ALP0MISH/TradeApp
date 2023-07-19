package com.example.tradeapp.presentation.main_screen.all_recycle_view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tradeapp.R
import com.example.tradeapp.databinding.ItemAllProductsBinding
import com.example.tradeapp.domain.models.AllProducts
import com.example.tradeapp.domain.models.Category

class AllRecycleAdapter: RecyclerView.Adapter<AllRecycleViewHolder>() {

    private val allProducts = mutableListOf<AllProducts>()

    fun updateData(newList: List<AllProducts>) {
        allProducts.clear()
        allProducts.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllRecycleViewHolder {
        val view = LayoutInflater
            .from(parent.context).
            inflate(R.layout.item_all_products, parent, false)
        val binding = ItemAllProductsBinding.bind(view)
        return AllRecycleViewHolder(binding)
    }

    override fun getItemCount(): Int = allProducts.size


    override fun onBindViewHolder(holder: AllRecycleViewHolder, position: Int) {
        holder.bind(allProducts[position])
    }

}