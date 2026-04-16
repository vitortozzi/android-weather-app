package com.example.weatherapp.data.datasource

import com.example.weatherapp.data.WeatherApiService
import com.example.weatherapp.data.model.toDomainObject
import com.example.weatherapp.domain.model.WeatherModel
import com.example.weatherapp.domain.repository.WeatherRepository
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val apiService: WeatherApiService
) : WeatherRepository {
    override suspend fun getWeather(
        latitude: Double,
        longitude: Double
    ): WeatherModel {
        return apiService.getWeather(latitude, longitude).toDomainObject()
    }
}