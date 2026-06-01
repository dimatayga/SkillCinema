package com.example.movie_catalog.data

import com.example.movie_catalog.R
import com.example.movie_catalog.data.api.DataSourceAPI
import com.example.movie_catalog.data.room.DataSourceDB
import com.example.movie_catalog.data.room.tables.CollectionDB
import com.example.movie_catalog.data.room.tables.FilmDB
import com.example.movie_catalog.entity.*
import com.example.movie_catalog.entity.Collection
import com.example.movie_catalog.entity.enumApp.Kit
import com.example.movie_catalog.entity.enumApp.ProfKey
import com.example.movie_catalog.entity.filminfo.ImageFilm
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DataRepository @Inject constructor(
    private var dataSourceDB: DataSourceDB,
    private var dataSourceAPI: DataSourceAPI
) {

    // home  fragment
    // Request a list of countries and genres. Randomly selecting two pairs of country-genre
    suspend fun getRandomKitName() = dataSourceAPI.getRandomKitName()

    // Film page and kit_list fragment
    //Select the list of similar films
    suspend fun getListLinkerForSimilar(film: Film): List<Linker> {
        //Checking the availability of data in DataCenter
        var listFilm = DataCentre.linkers.filter { it.similarFilm == film && it.film != null }
        if (listFilm.isEmpty()) {
            //If not, we make a request for a resource
            dataSourceAPI.getSimilar(film)
            // Select the list of similar films
            listFilm = DataCentre.linkers.filter { it.similarFilm == film && it.film != null }
        }
        return listFilm
    }

    //Request additional information about the film and seasons
    suspend fun getInfoFilmSeason(film: Film): Film? {
        //If the movie has an uploaded posterUrl, then there has already been a request for
        // full information about the seasons. Otherwise, we make a request.
        if (film.posterUrl == null) dataSourceAPI.getInfoFilmSeason(film)
        //Choosing the necessary movie
        val result = DataCentre.films.find { it.filmId == film.filmId }
        // Проверяем, нашли ли мы фильм
        if (result == null) {
            // Если фильм не найден, возвращаем null или выбрасываем исключение
            // return null
            throw Exception("Failed to load info for film: ${film.filmId}")
        }
        return result
    }

    //Request for a list of persons
    suspend fun getPersons(film: Film, job: String? = null): List<Linker> {
        //If there are records about the characters related to the movie in DataCenter,
        // then we do not make a request, otherwise we make a request.
        if (DataCentre.linkers.count { it.person != null && it.film == film } <= 1) {
            dataSourceAPI.getPersons(film)
        }
        //Forming a list of persons
        val listPerson = if (job == null) {
            DataCentre.linkers.filter { it.person != null && it.film == film }
        } else {
            //Forming a list of persons = ACTOR
            if (job == ProfKey.ACTOR.name) {
                DataCentre.linkers.filter {
                    it.person != null && it.film == film &&
                            it.profKey?.name == ProfKey.ACTOR.name
                }
            } else {//Forming a list of persons = Not ACTOR
                DataCentre.linkers.filter {
                    it.person != null && it.film == film &&
                            it.profKey?.name != ProfKey.ACTOR.name
                }
            }
        }
        return listPerson
    }

    //Get a list of photos for the movie
    suspend fun getImages(film: Film): List<ImageFilm> {
        //If the list of images in DataCenter is empty, we make a request
        if (film.images.isEmpty()) {
            dataSourceAPI.getImages(film)
        }
        val result = DataCentre.films.find { it == film }
        if (result == null) {
            throw Exception("Failed to load images for film: ${film.filmId}")
        }
        return result.images
    }

    //Person fragment
    //Request for additional information on a person
    suspend fun getPersonInfo(person: Person): List<Linker> {
        //If the list of films for person in DataCenter is empty, we make a request
        var listLink = DataCentre.linkers.filter { it.person == person }
        if (listLink.count() <= 1) {
            dataSourceAPI.getPersonInfo(person)
            listLink = DataCentre.linkers.filter { it.person == person }
            // Проверяем, появились ли данные после запроса
            if (listLink.isEmpty()) {
                // Если данных нет, возвращаем пустой список или выбрасываем исключение
                // return emptyList()
                throw Exception("Failed to load info for person: ${person.personId}")
            }
        }
        //Requesting a poster
        listLink.forEach { link ->
            link.film?.let { film ->
                if (film.posterUrlPreview == null) dataSourceAPI.getInfoFilmSeason(film)
            }
        }
        return listLink
    }

    //Generating data for filmography
    fun getFilmographyData(person: Person): FilmographyData {
        //Choosing movies by person
        val linkers = DataCentre.linkers.filter { it.person == person && it.film != null }
        //grouping by profession
        val tabsKey = linkers.groupingBy { it.profKey }.eachCount().toList()
        return FilmographyData(linkers, tabsKey)
    }

    //Kit fragment
    //Controls the choice of procedure depending on the selection of films for paging adapter
    suspend fun routerGetPagingApi(page: Int, kit: Kit): List<Linker> {
        return when (kit) {
            Kit.POPULAR -> getTop(page, Kit.POPULAR)
            Kit.TOP250 -> getTop(page, Kit.TOP250)
            Kit.SERIALS -> getFilters(page, Kit.SERIALS)
            Kit.RANDOM1 -> getFilters(page, Kit.RANDOM1)
            Kit.RANDOM2 -> getFilters(page, Kit.RANDOM2)
            Kit.SEARCH -> getFilters(page, Kit.SEARCH)
            else -> emptyList()
        }
    }

    //Selecting data to display the full list
    fun getListLinkerForPerson(person: Person): List<Linker> {
        return DataCentre.linkers.filter { it.person == person && it.film != null }
    }

    //Creating an array of data to display premieres
    suspend fun getPremieres(): List<Linker> {
        //Checking the availability of data in DataCenter
        var linkers = DataCentre.linkers.filter { it.kit == Kit.PREMIERES }
        if (linkers.isEmpty()) {
            //If not, we make a request for a resource
            dataSourceAPI.getPremieres()
            // Select the list of premieres
            linkers = DataCentre.linkers.filter { it.kit == Kit.PREMIERES }
            // Проверяем, появились ли данные после запроса
            if (linkers.isEmpty()) {
                // Если данных нет, возвращаем пустой список или выбрасываем исключение
                // return emptyList()
                throw Exception("Failed to load premieres")
            }
        }
        return linkers

    }

    //Select the list of top films
    suspend fun getTop(page: Int, kit: Kit): List<Linker> {
        //Checking the availability of data in DataCenter
        var listBinder = DataCentre.linkers.filter { it.kit == kit }
        if (listBinder.isEmpty()) {
            //If not, we make a request for a resource
            dataSourceAPI.getTop(page, kit)
            // Select the list of top movies
            listBinder = DataCentre.linkers.filter { it.kit == kit }
            // Проверяем, появились ли данные после запроса
            if (listBinder.isEmpty()) {
                // Если данных нет, возвращаем пустой список или выбрасываем исключение
                // return emptyList()
                throw Exception("Failed to load top movies for kit: $kit")
            }
        }
        return listBinder

    }

    //Getting a list of movies by filter
    suspend fun getFilters(page: Int, kit: Kit): List<Linker> {
        return dataSourceAPI.getFilters(page, kit)
    }

    //List person fragment, images fragment
    //Selecting image for gallery fragment
    fun getGallery(film: Film): Gallery {
        return Gallery(
            images = film.images,
            tabs = film.images.groupingBy { it.imageGroup }.eachCount().toList()
        )
    }

    //Selecting image for start fragment
    fun getImageStart(): List<ImageStart> {
        return listOf(
            ImageStart(
                imageResource = R.drawable.ic_start1, signature = R.string.signature1,
                imageIndicator = R.drawable.indicator_start_fragment_1
            ),
            ImageStart(
                imageResource = R.drawable.ic_start2, signature = R.string.signature2,
                imageIndicator = R.drawable.indicator_start_fragment_2
            ),
            ImageStart(
                imageResource = R.drawable.ic_start3, signature = R.string.signature3,
                imageIndicator = R.drawable.indicator_start_fragment_3
            ),
            ImageStart(
                imageResource = R.drawable.ic_start1, signature = R.string.signature4,
                imageIndicator = R.drawable.indicator_start_fragment_3
            ),
        )
    }

    //Getting a list of genres from DataCenter
    fun getGenres() = DataCentre.genres

    //Getting a list of countries from DataCenter
    fun getCountries() = DataCentre.countries

    //Get a movie from the time stack
    fun takeFilm() = DataCentre.takeFilm()

    //Save a movie to a temporary stack
    fun putFilm(film: Film) {
        DataCentre.putFilm(film)
    }

    //Save a person to a temporary stack
    fun putPerson(person: Person) {
        DataCentre.putPerson(person)
    }                // film info, list person fragment

    //Get a person from the time stack
    fun takePerson() = DataCentre.takePerson()

    //Get a kit from the time stack
    fun takeKit() = DataCentre.takeKit()

    //Save a kit to a temporary stack
    fun putKit(item: Kit) {
        DataCentre.putKit(item)
    }

    fun getKitParams(kit: Kit) = DataCentre.getKitParams(kit)

    //Get a search filter from the time stack
    fun takeSearchFilter() = DataCentre.takeSearchFilter()

    //Save a search filter to a temporary stack
    fun putSearchFilter(searchFilter: SearchFilter) {
        DataCentre.putSearchFilter(searchFilter)
    }

    //Get a job person from the time stack
    fun takeJobPerson() = DataCentre.takeJobPerson()

    //Save a job person to a temporary stack
    fun putJobPerson(item: String) {
        DataCentre.putJobPerson(item)
    }

    //Install a new api key
    fun setApiKey() {
        DataCentre.setApiKey()
    }

    //Synchronization of the database and DataCenter when the application is launched
    fun synchronizationDataCenterAndDB() {
        val listFilmDB = dataSourceDB.getFilms()
        if (listFilmDB != null) {
            val listFilm = Convertor().fromListFilmDBtoFilm(listFilmDB)
            DataCentre.addFilms(listFilm)
        }
        setApiKey()
    }


    // FUNCTION DB #################################################

    //Changing the viewed state to the opposite
    fun changeViewed(film: Film) {
        dataSourceDB.setViewed(film)
        film.viewed = !film.viewed
    }

    //Changing the favorite state to the opposite
    fun changeFavorite(film: Film) {
        dataSourceDB.addRemoveFilmToCollection(film, 1)
        film.favorite = !film.favorite
    }

    //Changing the bookmark state to the opposite
    fun changeBookmark(film: Film) {
        dataSourceDB.addRemoveFilmToCollection(film, 2)
        film.bookmark = !film.bookmark
    }

    //Adding (deleting) a movie to (from) a collection
    fun addFilmToCollection(collection: CollectionDB, film: Film) {
        if (dataSourceDB.getFilm(film) == null) {
            //Add new record to the table films
            dataSourceDB.addFilm(FilmDB(idFilm = film.filmId!!, msg = "", film))
        }
        addRemoveFilmToCollection(collection, film)
    }

    //We request a list of collections, calculate the number of films in each of them,
    // and mark which collection a particular film is included in
    fun getCollectionsFilm(filmId: Int): List<CollectionDB> {
        val listCollectionFilmDB = dataSourceDB.getCollections()
        if (listCollectionFilmDB.isNotEmpty()) {
            listCollectionFilmDB.forEach {
                // Проверяем, не равен ли it.collection null
                it.collection?.let { collection ->
                    //Selecting a count of movies added to the collection
                    collection.count = dataSourceDB.getCountFilmCollection(it.idCollection).count()
                    //There is a movie in this collection
                    collection.included = dataSourceDB.getFilmInCollection(filmId, it.idCollection)
                }
            }
        }
        return listCollectionFilmDB
    }

    //We select all collections with the number of films
    fun getCollectionsDB(): List<CollectionDB> {
        return dataSourceDB.getCollections().also { listCollectionFilmDB ->
            listCollectionFilmDB.forEach {
                it.collection = it.collection?.apply {
                    count = dataSourceDB.getCountFilmCollection(it.idCollection).count()
                } ?: Collection(name = "Unknown").apply { count = 0 }
            }
        }
    }

    //Adding a new collection
    fun addCollection(nameCollection: String): CollectionDB? {
        return dataSourceDB.getCollectionRecord(nameCollection) ?: run {
            dataSourceDB.addCollection(CollectionDB(collection = Collection(name = nameCollection)))
            dataSourceDB.getCollectionRecord(nameCollection)
        }
    }

    //Deleting collection by name collection
    fun deleteCollection(collection: Collection) {
        dataSourceDB.deleteCollection(collection.name)
    }

    //Adding (deleting) a movie to (from) a collection
    fun addRemoveFilmToCollection(collection: CollectionDB, film: Film): List<CollectionDB> {
        dataSourceDB.addRemoveFilmToCollection(film, collection.idCollection)
        return getCollectionsFilm(film.filmId!!)
    }

    //Forming a selection of viewed movies
    fun getViewedFilms(nameCollection: String = ""): List<Linker> {
        val kit = Kit.COLLECTION
        getKitParams(kit).displayText = nameCollection
        return dataSourceDB.getViewedFilmsId().mapNotNull { filmId ->
            DataCentre.films.find { it.filmId == filmId }?.let { Linker(film = it, kit = kit) }
        } + Linker(Film(), null, null, null, kit)
    }

    //Get a list of movies from the collection
    fun getFilmsInCollectionName(nameCollection: String = ""): List<Linker> {
        val kit = Kit.COLLECTION
        val idCollect =
            dataSourceDB.getCollectionRecord(nameCollection)?.idCollection ?: return listOf(
                Linker(Film(), null, null, null, kit.also { getKitParams(it).displayText = nameCollection })
            )
        getKitParams(kit).displayText = nameCollection
        return dataSourceDB.getListFilmsIdInCollection(idCollect).map { filmId ->
            Linker(film = DataCentre.films.find { it.filmId == filmId }, kit = kit)
        } + Linker(Film(), null, null, null, kit)
    }

    //Mark all movies not viewed
    fun clearViewedFilm() {
        dataSourceDB.clearViewedFilm()
        DataCentre.clearViewedFilms()
    }

    //Mark all movies not bookmark
    fun clearBookmarkFilm() {
        dataSourceDB.clearBookmarkFilm()
    }

    //Clear collection
    fun clearCollection(nameCollection: String) {
        dataSourceDB.clearCollection(nameCollection)
    }

    //Get a stream to change the viewed parameter
    fun viewedFlow(id: Int): Flow<Boolean> = dataSourceDB.viewedFlow(id)

    //Get a stream to change the bookmark parameter
    fun bookmarkFlow(id: Int): Flow<Boolean> = dataSourceDB.bookmarkFlow(id)

    //Get a stream to change the favorite parameter
    fun favoriteFlow(id: Int): Flow<Boolean> = dataSourceDB.favoriteFlow(id)
}