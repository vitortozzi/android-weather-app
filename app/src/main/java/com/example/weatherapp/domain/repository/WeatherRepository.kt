package com.example.weatherapp.domain.repository

import com.example.weatherapp.domain.model.WeatherModel

interface WeatherRepository {

    suspend fun getWeather(
        latitude: Double,
        longitude: Double,
    ) : WeatherModel

}