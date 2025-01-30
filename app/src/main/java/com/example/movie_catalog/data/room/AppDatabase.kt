package com.example.movie_catalog.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.movie_catalog.data.room.tables.CollectionDB
import com.example.movie_catalog.data.room.tables.ConverterForFilmDB
import com.example.movie_catalog.data.room.tables.CrossFC
import com.example.movie_catalog.data.room.tables.FilmDB
import com.example.movie_catalog.entity.Film

@Database(entities = [
    FilmDB::class,
    CollectionDB::class,
    CrossFC::class], version = 1, exportSchema = false)
@TypeConverters(ConverterForFilmDB::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dataDao(): DataDao
}
