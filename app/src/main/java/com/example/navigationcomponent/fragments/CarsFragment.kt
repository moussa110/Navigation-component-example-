package com.example.navigationcomponent.fragments


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.R
import com.example.navigationcomponent.adapter.CarsRecyclerAdapter
import com.example.navigationcomponent.databinding.FragmentCarsBinding
import com.example.navigationcomponent.model.Car

class CarsFragment : Fragment(R.layout.fragment_cars) {
    private val cars = listOf(
        Car("chevrolet chevelle 1966","https://www.motorious.com/content/images/2020/04/1970-chevy-chevelle-ls6.jpeg"),
        Car("buick skylark 1972","https://photos.classiccars.com/cc-temp/listing/141/4596/22684855-1972-buick-skylark-thumb.jpg"),
        Car("Plymouth Satellite 1982","https://en.wikipedia.org/wiki/Plymouth_Satellite#/media/File:66Sat.jpg"),
        Car("Dodge Rampage 1982","https://i.pinimg.com/originals/71/36/f6/7136f6736fda903617a509d580bbe272.jpg"),
        Car("ford ranger 2018","https://weudealerimagesprd.blob.core.windows.net/nz1/news/FordRangerRaptor.jpg"),
        Car("ford mustang 1982","https://www.musclecarjungle.com/pictures/ford/mustang/1982/1982-mustang-gt-dragster-.jpg"),
        Car("chevrolet chevelle 1966","https://www.motorious.com/content/images/2020/04/1970-chevy-chevelle-ls6.jpeg"),
        Car("buick skylark 1972","https://photos.classiccars.com/cc-temp/listing/141/4596/22684855-1972-buick-skylark-thumb.jpg"),
        Car("Plymouth Satellite 1982","https://en.wikipedia.org/wiki/Plymouth_Satellite#/media/File:66Sat.jpg"),
        Car("Dodge Rampage 1982","https://i.pinimg.com/originals/71/36/f6/7136f6736fda903617a509d580bbe272.jpg"),
        Car("ford ranger 2018","https://weudealerimagesprd.blob.core.windows.net/nz1/news/FordRangerRaptor.jpg"),
        Car("ford mustang 1982","https://www.musclecarjungle.com/pictures/ford/mustang/1982/1982-mustang-gt-dragster-.jpg")
    )

    private lateinit var binding: FragmentCarsBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCarsBinding.bind(view)
        val adapter = CarsRecyclerAdapter(requireContext(),cars){car->
            val action =
                CarsFragmentDirections.actionCarsFragmentToDisplayImageFragment(
                    car.image
                )
            findNavController().navigate(action)
        }
        binding.carsRv.adapter=adapter
    }
}