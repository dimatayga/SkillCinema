package com.example.movie_catalog.data.room.tables

import androidx.room.TypeConverter
import com.example.movie_catalog.data.api.home.seasons.SeasonDTO
import com.example.movie_catalog.entity.Country
import com.example.movie_catalog.entity.Genre
import com.example.movie_catalog.entity.filminfo.ImageFilm
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import java.lang.reflect.ParameterizedType

/*
Converter class for adding the FILE class to the database table: FilmDB
*/
class ConverterForFilmDB {

    companion object {
        private var moshi: Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
    }

    private inline fun <reified T> createAdapter(): JsonAdapter<List<T>> {
        val type: ParameterizedType = Types.newParameterizedType(List::class.java, T::class.java)
        return moshi.adapter(type)
    }

    @TypeConverter
    fun countryToJSON(source: List<Country>?): String = createAdapter<Country>().toJson(source)

    @TypeConverter
    fun countryFromJSON(sourceStr: String?): List<Country>? =
        if (sourceStr == null) null else createAdapter<Country>().fromJson(sourceStr)

    @TypeConverter
    fun genreToJSON(source: List<Genre>?): String = createAdapter<Genre>().toJson(source)

    @TypeConverter
    fun genreFromJSON(sourceStr: String?): List<Genre>? =
        if (sourceStr == null) null else createAdapter<Genre>().fromJson(sourceStr)

    @TypeConverter
    fun imageToJSON(source: List<ImageFilm>?): String = createAdapter<ImageFilm>().toJson(source)

    @TypeConverter
    fun imageFromJSON(sourceStr: String?): List<ImageFilm>? =
        if (sourceStr == null) null else createAdapter<ImageFilm>().fromJson(sourceStr)

    @TypeConverter
    fun seasonToJSON(source: List<SeasonDTO>?): String = createAdapter<SeasonDTO>().toJson(source)

    @TypeConverter
    fun seasonFromJSON(sourceStr: String?): List<SeasonDTO>? =
        if (sourceStr == null) null else createAdapter<SeasonDTO>().fromJson(sourceStr)
}