package com.rybeler.exampleviewmodel.ui.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rybeler.exampleviewmodel.data.modelComic.ResultComic
import com.rybeler.exampleviewmodel.data.network.ApiClient
import kotlinx.coroutines.launch

class ThirdViewModel : ViewModel() {

    private val _comics = MutableLiveData<List<ResultComic>>()
    val comics: LiveData<List<ResultComic>> = _comics

    init {
        viewModelScope.launch {
            _comics.value = getFullListOfComics()
        }
    }

    private suspend fun getFullListOfComics(offset: Int = 0, limit: Int = 100) =
        ApiClient.comicsService.getComics(limit = limit, offset = offset).data.results
}