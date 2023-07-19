package com.example.tradeapp.presentation.search_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.tradeapp.databinding.FragmentSearchBinding
import com.example.tradeapp.presentation.search_functions.CatigoriesAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class FragmentSearch : Fragment(), SearchView.OnQueryTextListener {


    private val catigoriesAdapter: CatigoriesAdapter by lazy {
        CatigoriesAdapter()
    }
    private val viewModel: FragmentSearchViewModel by viewModels()

    private val binding: FragmentSearchBinding by lazy {
        FragmentSearchBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View = binding.root


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeData()
        initViews()
    }

    private fun initViews() = with(binding) {
        includeSearchMain.recycleView.adapter = catigoriesAdapter
        includeSearchMainTop.searchView.setOnQueryTextListener(
            this@FragmentSearch
        )

    }

    private fun observeData() {
        viewModel.allCategoryFlow.onEach {
            catigoriesAdapter.updateList(it)
        }.launchIn(lifecycleScope)
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        val searchString = query ?: return false
        startSearch(searchString)
        return false
    }

    override fun onQueryTextChange(query: String?): Boolean {
        val searchString = query ?: return false
        startSearch(searchString)
        return false
    }

    private fun startSearch(
        query: String
    ) {

        if (query.isBlank()) {
            catigoriesAdapter.updateList(viewModel.allCategoryFlow.value)
            return
        }

        val sortedNoteList = viewModel.allCategoryFlow.value.filter {
            val isSort = it.title.contains(query, ignoreCase = true)
            isSort
        }
        catigoriesAdapter.updateList(sortedNoteList)
    }


}




