package com.example.movie_catalog.ui.profile

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movie_catalog.R
import com.example.movie_catalog.data.DataRepository
import com.example.movie_catalog.entity.*
import com.example.movie_catalog.entity.Collection
import com.example.movie_catalog.entity.enumApp.Kit
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val dataRepository: DataRepository,
    private val errorApp: ErrorApp,
    @ApplicationContext private val context: Context
) : ViewModel() {

    //Data chanel a list viewed films
    private var _viewedFilm = MutableStateFlow(listOf<Linker>())
    var viewedFilm = _viewedFilm.asStateFlow()

    //Data chanel a list bookmark films
    private var _bookmarkFilm = MutableStateFlow(listOf<Linker>())
    var bookmarkFilm = _bookmarkFilm.asStateFlow()

    //Data chanel a list films for collection
    private var _collection = MutableStateFlow(listOf<Collection>())
    var collection = _collection.asStateFlow()

    //Requesting data when starting a fragment
    init {
        refreshView()
    }

    //Updating data on the page
    fun refreshView() {
        getViewedFilm()
        getBookmarkFilm()
        getCollections()
    }

    private fun getViewedFilm() = launchDataLoad {
        _viewedFilm.value = dataRepository.getViewedFilms(context.getString(R.string.viewed_kit))
    }

    private fun getBookmarkFilm() = launchDataLoad {
        _bookmarkFilm.value =
            dataRepository.getFilmsInCollectionName(context.getString(R.string.bookmark_kit))
    }

    private fun getCollections() = launchDataLoad {
        _collection.value =
            Convertor().fromCollectionDBtoCollection(dataRepository.getCollectionsDB())
    }

    fun putFilm(film: Film) {
        dataRepository.putFilm(film)
    }

    fun putKit(kit: Kit) {
        dataRepository.putKit(kit)
    }

    fun deleteCollection(collection: Collection) = launchDataLoad {
        dataRepository.deleteCollection(collection)
        _collection.value =
            Convertor().fromCollectionDBtoCollection(dataRepository.getCollectionsDB())
    }

    fun clearCollection(kit: Kit) = launchDataLoad {
        val nameCollection =
            context.getString(kit.nameKit).takeIf { it.isNotEmpty() } ?: kit.displayText
        dataRepository.clearCollection(nameCollection)
        getBookmarkFilm()
        getCollections()
    }

    fun clearViewed() = launchDataLoad {
        dataRepository.clearViewedFilm()
        getViewedFilm()
        getCollections()
    }

    fun newCollection(nameCollection: String) = launchDataLoad {
        dataRepository.addCollection(nameCollection)
        _collection.value =
            Convertor().fromCollectionDBtoCollection(dataRepository.getCollectionsDB())
    }

    private fun launchDataLoad(block: suspend () -> Unit) {
        viewModelScope.launch(Dispatchers.IO) {
            runCatching { block() }
                .onFailure { errorApp.errorApi(it.message!!) }
        }
    }

}