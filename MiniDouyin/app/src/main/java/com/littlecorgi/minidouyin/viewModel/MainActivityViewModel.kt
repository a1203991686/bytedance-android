package com.littlecorgi.minidouyin.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.littlecorgi.minidouyin.Event
import com.littlecorgi.minidouyin.Result
import com.littlecorgi.minidouyin.bean.ongoingmovies.OngoingMovieRepository
import com.littlecorgi.minidouyin.bean.ongoingmovies.OngoingMovies
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 *
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-12 14:16
 */
class MainActivityViewModel(
        private val ongoingMovieRepository: OngoingMovieRepository
) : ViewModel() {

    private val _movies = MutableLiveData<OngoingMovies>()
    val movies: LiveData<OngoingMovies> = _movies

    private val _recyclerEvent = MutableLiveData<Event<Unit>>()
    val recyclerEvent: LiveData<Event<Unit>> = _recyclerEvent

    private val _errorToastText = MutableLiveData<String>()
    val errorToastText: LiveData<String> = _errorToastText

    fun requestMovies() {
        viewModelScope.launch {
            Log.d("MainActivity", "0")
            val result = withContext(Dispatchers.IO) {
                Log.d("MainActivity", "MainActivityViewModel.requestMovies().withContext 1")
                ongoingMovieRepository.getOngoingMovies()
            }
            Log.d("MainActivity", "MainActivityViewModel.requestMovies().withContext 2")
            if (result is Result.Success) {
                Log.d("MainActivity", "1")
                onMovieLoaded(result.data)
                Log.d("MainActivity", "requestMovies(): ${result.data.ms!![0].commonSpecial!!}")
            } else if (result is Result.Error) {
                onDataNotAvailable(result.exception.message)
            }
        }
    }

    private fun onDataNotAvailable(message: String?) {
        _errorToastText.value = message
        Log.d("MainActivity", "onDataNotAvailable(message): ${_errorToastText.value}")
    }

    private fun onMovieLoaded(ongoingMovies: OngoingMovies) {
        _movies.value = ongoingMovies
    }

}