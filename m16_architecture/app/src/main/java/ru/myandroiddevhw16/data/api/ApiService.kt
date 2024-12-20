package ru.myandroiddevhw16.data.api

import retrofit2.http.GET
import ru.myandroiddevhw16.data.UsefulActivityDto

interface ApiService {
    @GET("activity/")
    suspend fun getRandomUsefulActivity() : UsefulActivityDto
}