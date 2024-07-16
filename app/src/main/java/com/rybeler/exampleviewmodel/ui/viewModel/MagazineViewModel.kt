package com.rybeler.exampleviewmodel.ui.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rybeler.exampleviewmodel.data.modelMagazine.ResultMagazine
import com.rybeler.exampleviewmodel.data.network.ApiClient
import kotlinx.coroutines.launch

class MagazineViewModel : ViewModel() {

    private val _magazines = MutableLiveData<List<ResultMagazine>>()
    val magazines: LiveData<List<ResultMagazine>> = _magazines

    init {
        viewModelScope.launch {
            _magazines.value = getFullListOfMagazines()
        }
    }

    private suspend fun getFullListOfMagazines(offset: Int = 0, limit: Int = 100) =
        ApiClient.magazineService.getMagazines(limit = limit, offset = offset).data.results
}