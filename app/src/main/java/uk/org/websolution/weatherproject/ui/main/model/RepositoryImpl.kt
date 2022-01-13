package uk.org.websolution.weatherproject.ui.main.model

import uk.org.websolution.weatherproject.ui.main.model.Repository

class RepositoryImpl: Repository {
    override fun getWeatherFromServer(): Weather {
        TODO("Not yet implemented")
    }

    override fun getWeatherFromLocalStorage(): Weather = Weather(getDefaultCity(), 0, 0)
}