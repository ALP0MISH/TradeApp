package com.example.tradeapp.presentation.search_functions

import  android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tradeapp.R

import com.example.tradeapp.databinding.ItemSearchCategoriesBinding
import com.example.tradeapp.domain.models.Category

class CatigoriesAdapter: RecyclerView.Adapter<AllNotesViewHolder>() {

    private val category = mutableListOf<Category>()

    fun updateList(newList: List<Category>) {
        category.clear()
        category.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllNotesViewHolder {
        val view = LayoutInflater
            .from(parent.context).
            inflate(R.layout.item_search_categories, parent, false)
        val binding = ItemSearchCategoriesBinding.bind(view)
        return AllNotesViewHolder(binding)
    }

    override fun getItemCount(): Int = category.size


    override fun onBindViewHolder(holder: AllNotesViewHolder, position: Int) {
        holder.bind(category[position])
    }



}

