package com.example.navigationcomponent.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.ItemCarBinding
import com.example.navigationcomponent.model.Car

class CarsRecyclerAdapter(
    val context: Context,
    private val list: List<Car>,
    private val listener: (Car) -> Unit
) :
    RecyclerView.Adapter<CarsRecyclerAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ItemCarBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun binding(car: Car) {
            Glide.with(context)
                .load(car.image)
                .transition(DrawableTransitionOptions.withCrossFade())
                .placeholder(R.drawable.ic_baseline_image_24)
                .into(binding.imageView)

            binding.name.text = car.name
            itemView.setOnClickListener {
                listener.invoke(car)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        ItemCarBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.binding(list[position])

    override fun getItemCount(): Int = list.size
}