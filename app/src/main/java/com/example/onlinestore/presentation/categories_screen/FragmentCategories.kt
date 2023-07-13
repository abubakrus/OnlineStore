package com.example.onlinestore.presentation.categories_screen

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.onlinestore.R
import com.example.onlinestore.databinding.FragmentCategoriesBinding
import com.example.onlinestore.databinding.FragmentMainBinding
import com.example.onlinestore.presentation.categories_screen.recycler_view.CategoryEventAdapter
import com.example.onlinestore.presentation.main_screen.recycler_view.top_product.TopProductAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class FragmentCategories : Fragment() {
    private val binding: FragmentCategoriesBinding by lazy {
        FragmentCategoriesBinding.inflate(layoutInflater)
    }

    private val viewModel: FragmentCategoriesViewModel = FragmentCategoriesViewModel()

    private val categoryEventAdapter: CategoryEventAdapter by lazy {
        CategoryEventAdapter()
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
        includeCategoriesContent.recyclerViewCategories.adapter = categoryEventAdapter
    }
    private fun observeData(){
        viewModel.categoriesEventFlow.onEach {
            categoryEventAdapter.updateData(it)
        }.launchIn(lifecycleScope)
    }

}