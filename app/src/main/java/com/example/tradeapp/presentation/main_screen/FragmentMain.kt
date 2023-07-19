package com.example.tradeapp.presentation.main_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.tradeapp.R
import com.example.tradeapp.databinding.FragmentMainBinding
import com.example.tradeapp.presentation.main_screen.all_recycle_view.AllRecycleAdapter
import com.example.tradeapp.presentation.main_screen.recycle_view.RecycleAdapter
import com.example.tradeapp.presentation.view_pager.ViewPagerAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class FragmentMain : Fragment() {

    private val binding: FragmentMainBinding by lazy {
        FragmentMainBinding.inflate(layoutInflater)
    }


    private val viewModel:FragmentMainViewModel by viewModels()

    private val viewPagerAdapter: ViewPagerAdapter by lazy {
        ViewPagerAdapter()
    }

    private val recycleAdapter: RecycleAdapter by lazy {
        RecycleAdapter()
    }

    private val allRecycleAdapter : AllRecycleAdapter by lazy {
        AllRecycleAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = binding.root


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.mainContent.searchView.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMain_to_fragmentSearch)
        }
        initViews()
        observeData()
    }

      private fun initViews() = with(binding){
        mainContent.viewPager.adapter = viewPagerAdapter
        mainContent.recycleView.adapter = recycleAdapter
        mainBottom.recycleView.adapter =allRecycleAdapter
    }

    private fun observeData(){
        viewModel.resaleFlow.onEach {
            viewPagerAdapter.updateData(it)

        }.launchIn(lifecycleScope)

        viewModel.featuredFlow.onEach {
            recycleAdapter.updateData(it)
        }.launchIn(lifecycleScope)

        viewModel.allProductsFlow.onEach {
            allRecycleAdapter.updateData(it)
        }.launchIn(lifecycleScope)


    }
}