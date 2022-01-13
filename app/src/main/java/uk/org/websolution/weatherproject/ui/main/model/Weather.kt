package uk.org.websolution.weatherproject.ui.main.model

data class Weather(
    val city: City = getDefaultCity(),
    val temperature: Int = 0,
    val feelsLike: Int = 0
)

fun getDefaultCity(): City = City("London", 51.509865, -0.118092)
