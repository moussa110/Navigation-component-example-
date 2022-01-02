package com.example.navigationcomponent.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.FragmentDeepLinkingBinding

class DeepLinkingFragment : Fragment(R.layout.fragment_deep_linking) {
    lateinit var binding: FragmentDeepLinkingBinding
    private val args: DeepLinkingFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDeepLinkingBinding.bind(view)
        binding.argsTv.text = args.arg
    }
}