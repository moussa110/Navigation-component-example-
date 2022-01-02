package com.example.navigationcomponent.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Car(
    val name:String,
    val image: String
):Parcelable
