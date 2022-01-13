package uk.org.websolution.weatherproject.ui.main.viewmodel

import uk.org.websolution.weatherproject.ui.main.model.Weather

sealed class AppState {
    data class Success(val weather: Weather) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
