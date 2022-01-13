package uk.org.websolution.weatherproject.ui.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import uk.org.websolution.weatherproject.ui.main.model.Repository
import uk.org.websolution.weatherproject.ui.main.model.RepositoryImpl
import java.lang.Exception
import kotlin.random.Random

class MainViewModel : ViewModel() {
    private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData()
    private val repository: Repository = RepositoryImpl()
    val liveData: LiveData<AppState> = liveDataToObserve

    fun getWeatherFromServer() = getDataFromLocalSource()
    fun getWeatherFromLocalStorage() = getDataFromLocalSource()

    private fun getDataFromLocalSource() {
        liveDataToObserve.value = AppState.Loading
        Thread {
            Thread.sleep(3000)
            if (Random.nextBoolean()) {
                liveDataToObserve.postValue(AppState.Success(repository.getWeatherFromLocalStorage()))
            } else {
                liveDataToObserve.postValue(AppState.Error(Exception("Couldn't load the data")))
            }

        }.start()
    }
}