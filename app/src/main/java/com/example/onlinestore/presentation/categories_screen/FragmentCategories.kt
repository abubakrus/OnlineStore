package com.example.onlinestore.presentation.categories_screen

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onlinestore.R

class FragmentCategories : Fragment() {

    companion object {
        fun newInstance() = FragmentCategories()
    }

    private lateinit var viewModel: FragmentCategoriesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_categories, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentCategoriesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}