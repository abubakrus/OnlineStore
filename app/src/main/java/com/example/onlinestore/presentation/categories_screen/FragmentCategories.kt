package com.example.onlinestore.presentation.categories_screen

import android.app.DownloadManager.Query
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.onlinestore.data.fake_data.FakeData
import com.example.onlinestore.databinding.FragmentCategoriesBinding
import com.example.onlinestore.presentation.categories_screen.recycler_view.CategoryEventAdapter
import com.example.onlinestore.presentation.categories_screen.search.CategoriesAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class FragmentCategories : Fragment(), SearchView.OnQueryTextListener {
    private val binding: FragmentCategoriesBinding by lazy {
        FragmentCategoriesBinding.inflate(layoutInflater)
    }

    private val viewModel: FragmentCategoriesViewModel by viewModels()

    private val categoryAdapter: CategoriesAdapter by lazy {
        CategoriesAdapter()
    }
    private val allList by lazy {
        FakeData()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        observeData()
    }

    private fun initViews() = with(binding){
        includeCategoriesContent.recyclerViewCategories.adapter = categoryAdapter
        includeCategoriesTopContent.searchView.setOnQueryTextListener(
            this@FragmentCategories
        )
    }
    private fun observeData(){
        viewModel.categoriesEventFlow.onEach {
            categoryAdapter.updateList(it)
        }.launchIn(lifecycleScope)
    }

    override fun onQueryTextSubmit(query:String?): Boolean {
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
            categoryAdapter.updateList(viewModel.categoriesEventFlow.value)
            return
        }

        val sortedNoteList = viewModel.categoriesEventFlow.value.filter {
            val isSort = it.title.contains(query, ignoreCase = true)
            isSort
        }
        categoryAdapter.updateList(sortedNoteList)
    }



}