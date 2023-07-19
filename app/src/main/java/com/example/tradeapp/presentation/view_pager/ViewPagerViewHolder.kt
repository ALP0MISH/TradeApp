package com.example.tradeapp.presentation.view_pager

import android.provider.ContactsContract.CommonDataKinds.Event
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tradeapp.databinding.ItemResaleBinding
import com.example.tradeapp.domain.models.Resale

class ViewPagerViewHolder(
    private val binding: ItemResaleBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(event: Resale) = with(binding) {
        Glide.with(root.context)
            .load(event.imageId)
            .into(imageView)

    }
}