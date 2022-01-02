package com.example.navigationcomponent.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.FragmentHomeBinding

class HomeFragment: Fragment(R.layout.fragment_home) {
    lateinit var binding: FragmentHomeBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        binding.apply {
            imageView.setOnClickListener {
                val action =
                    HomeFragmentDirections.actionHomeFragmentToDisplayImageFragment(
                        null
                    )
                findNavController().navigate(action)
            }

        }
    }
}