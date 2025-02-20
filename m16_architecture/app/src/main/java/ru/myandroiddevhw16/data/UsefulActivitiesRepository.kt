package ru.myandroiddevhw16.data

import javax.inject.Inject

class UsefulActivitiesRepository @Inject constructor(
    private val usefulActivityDataSource: UsefulActivityDataSource
) {
    suspend fun getUsefulActivity(): UsefulActivityDto {
        return usefulActivityDataSource.loadUsefulActivity()
    }
}