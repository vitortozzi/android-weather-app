package com.example.weatherapp.data.model

import com.example.weatherapp.domain.model.WeatherModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class WeatherResponse(
    val latitude: Double,
    val longitude: Double,
    val timezone: String,
    @SerialName("timezone_abbreviation")
    val timezoneAbbreviation: String,
    val elevation: Double,
    val current: CurrentResponse
)

fun WeatherResponse.toDomainObject() : WeatherModel {
    return WeatherModel(
        latitude = this.latitude,
        longitude = this.longitude,
        current = this.current.toDomainObject()
    )
}