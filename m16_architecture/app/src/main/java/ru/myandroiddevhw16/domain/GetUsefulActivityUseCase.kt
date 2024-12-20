package ru.myandroiddevhw16.domain

import ru.myandroiddevhw16.data.UsefulActivitiesRepository
import ru.myandroiddevhw16.entity.UsefulActivity
import javax.inject.Inject

class GetUsefulActivityUseCase @Inject constructor(
    private val usefulActivitiesRepository: UsefulActivitiesRepository
) {
    suspend fun execute(): UsefulActivity {
        return usefulActivitiesRepository.getUsefulActivity()
    }
}