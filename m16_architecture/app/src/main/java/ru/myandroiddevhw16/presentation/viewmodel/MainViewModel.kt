package ru.myandroiddevhw16.presentation.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import ru.myandroiddevhw16.domain.GetUsefulActivityUseCase
import ru.myandroiddevhw16.entity.UsefulActivity
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getUsefulActivityUseCase: GetUsefulActivityUseCase
): ViewModel()  {

    private val _usefulActivityFlow: MutableStateFlow<UsefulActivity?> = MutableStateFlow(null)
    var usefulActivityFlow = _usefulActivityFlow.asStateFlow()

    suspend fun reloadUsefulActivity() {
        _usefulActivityFlow.value = getUsefulActivityUseCase.execute()
    }
}