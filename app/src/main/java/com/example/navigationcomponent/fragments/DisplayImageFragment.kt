package com.example.navigationcomponent.fragments


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.FragmentDisplayImageBinding

class DisplayImageFragment : Fragment(R.layout.fragment_display_image) {
    private lateinit var binding: FragmentDisplayImageBinding
    private val args: DisplayImageFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDisplayImageBinding.bind(view)
        args.car?.let {
            Glide.with(requireContext())
                .load(args.car)
                .into(binding.imageView)
        }
    }
}