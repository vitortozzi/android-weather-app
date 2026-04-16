package com.example.weatherapp.data.model

import com.example.weatherapp.domain.model.CurrentModel
import com.google.gson.annotations.SerializedName

data class CurrentResponse(
    val time: String,
    val interval: Int,
    @SerializedName("temperature_2m")
    val temperature2m: Double
)

fun CurrentResponse.toDomainObject(): CurrentModel {
    return CurrentModel(
        time = this.time,
        temperature = this.temperature2m
    )
}