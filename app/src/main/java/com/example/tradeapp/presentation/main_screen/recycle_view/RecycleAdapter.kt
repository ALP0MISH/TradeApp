package com.example.tradeapp.presentation.main_screen.recycle_view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tradeapp.R
import com.example.tradeapp.databinding.ItemFeaturedBinding
import com.example.tradeapp.domain.models.Featured

class RecycleAdapter: RecyclerView.Adapter<RecycleViewHolder>() {

    private val featured = mutableListOf<Featured>()

    fun updateData(newList: List<Featured>) {
        featured.clear()
        featured.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleViewHolder {
        val view = LayoutInflater
            .from(parent.context).
            inflate(R.layout.item_featured, parent, false)
        val binding = ItemFeaturedBinding.bind(view)
        return RecycleViewHolder(binding)
    }

    override fun getItemCount(): Int = featured.size


    override fun onBindViewHolder(holder: RecycleViewHolder, position: Int) {
        holder.bind(featured[position])
    }

}