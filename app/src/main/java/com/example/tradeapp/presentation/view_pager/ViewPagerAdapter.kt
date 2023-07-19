package com.example.tradeapp.presentation.view_pager

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tradeapp.R
import com.example.tradeapp.databinding.ItemResaleBinding
import com.example.tradeapp.domain.models.Resale

class ViewPagerAdapter: RecyclerView.Adapter<ViewPagerViewHolder>() {

    private val events = mutableListOf<Resale>()

    fun updateData(newList: List<Resale>) {
        events.clear()
        events.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater
            .from(parent.context).
            inflate(R.layout.item_resale, parent, false)
        val binding = ItemResaleBinding.bind(view)
        return ViewPagerViewHolder(binding)
    }

    override fun getItemCount(): Int = events.size


    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        holder.bind(events[position])
    }

}