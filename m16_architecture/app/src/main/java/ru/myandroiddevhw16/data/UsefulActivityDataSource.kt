package ru.myandroiddevhw16.data

import ru.myandroiddevhw16.data.api.RetrofitBuilder
import javax.inject.Inject

class UsefulActivityDataSource @Inject constructor() {

    suspend fun loadUsefulActivity(): UsefulActivityDto {
         return RetrofitBuilder.apiService.getRandomUsefulActivity()
    }
}