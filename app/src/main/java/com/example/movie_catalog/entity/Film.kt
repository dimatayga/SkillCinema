package com.example.movie_catalog.entity

import androidx.room.Entity
import androidx.room.TypeConverters
import com.example.movie_catalog.data.api.home.seasons.SeasonDTO
import com.example.movie_catalog.data.room.tables.ConverterForFilmDB
import com.example.movie_catalog.entity.filminfo.ImageFilm

@Entity(tableName = "films_table")
@TypeConverters(ConverterForFilmDB::class)
data class Film(
    val filmId: Int? = null,
    var imdbId: String? = null,
    var nameRu: String? = null,
    var nameEn: String? = null,
    var rating: Double? = null,
    var posterUrlPreview: String? = null,
    var countries: List<Country>? = emptyList(),
    var genres: List<Genre> = emptyList(),
    var favorite: Boolean = false,
    var viewed: Boolean = false,
    var bookmark: Boolean = false,
    var professionKey: String? = null,
    var startYear: Int? = null,
    val images: List<ImageFilm> = emptyList(),
    var posterUrl: String? = null,
    var logoUrl: String? = null,
    var nameOriginal: String? = null,
    var ratingImdb: Double? = null,
    var ratingAwait: Double? = null,
    var ratingGoodReview: Double? = null,
    var year: Int? = null,
    var totalSeasons: Int? = null,
    var listSeasons: List<SeasonDTO>? = null,
    var description: String? = null,
    var shortDescription: String? = null
) {
    fun genresTxt(): String = genres.joinToString(",") { it.genre.toString() }
}
