package com.example.movie_catalog.data.room.tables;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0018\u0010\u001c\u001a\u00020\u001b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007J\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0018\u0010\u001f\u001a\u00020\u001b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005H\u0007J\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0018\u0010!\u001a\u00020\u001b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005H\u0007J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0018\u0010#\u001a\u00020\u001b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/example/movie_catalog/data/room/tables/ConverterForFilmDB;", "", "()V", "countryAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/example/movie_catalog/entity/Country;", "episodeAdapter", "Lcom/example/movie_catalog/data/api/home/seasons/EpisodeDTO;", "genreAdapter", "Lcom/example/movie_catalog/entity/Genre;", "imageAdapter", "Lcom/example/movie_catalog/entity/filminfo/ImageFilm;", "moshi", "Lcom/squareup/moshi/Moshi;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "seasonAdapter", "Lcom/example/movie_catalog/data/api/home/seasons/SeasonDTO;", "typeListCountry", "Ljava/lang/reflect/ParameterizedType;", "typeListEpisode", "typeListGenre", "typeListImage", "typeListSeason", "countryFromJSON", "sourceStr", "", "countryToJSON", "source", "genreFromJSON", "genreToJSON", "imageFromJSON", "imageToJSON", "seasonFromJSON", "seasonToJSON", "app_debug"})
public final class ConverterForFilmDB {
    @org.jetbrains.annotations.NotNull
    private final com.squareup.moshi.Moshi moshi = null;
    private final java.lang.reflect.ParameterizedType typeListCountry = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.example.movie_catalog.entity.Country>> countryAdapter = null;
    private final java.lang.reflect.ParameterizedType typeListGenre = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.example.movie_catalog.entity.Genre>> genreAdapter = null;
    private final java.lang.reflect.ParameterizedType typeListImage = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.example.movie_catalog.entity.filminfo.ImageFilm>> imageAdapter = null;
    private final java.lang.reflect.ParameterizedType typeListSeason = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.example.movie_catalog.data.api.home.seasons.SeasonDTO>> seasonAdapter = null;
    private final java.lang.reflect.ParameterizedType typeListEpisode = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.example.movie_catalog.data.api.home.seasons.EpisodeDTO>> episodeAdapter = null;
    
    public ConverterForFilmDB() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.squareup.moshi.Moshi getMoshi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.lang.String countryToJSON(@org.jetbrains.annotations.Nullable
    java.util.List<com.example.movie_catalog.entity.Country> source) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.List<com.example.movie_catalog.entity.Country> countryFromJSON(@org.jetbrains.annotations.NotNull
    java.lang.String sourceStr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.lang.String genreToJSON(@org.jetbrains.annotations.Nullable
    java.util.List<com.example.movie_catalog.entity.Genre> source) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.List<com.example.movie_catalog.entity.Genre> genreFromJSON(@org.jetbrains.annotations.NotNull
    java.lang.String sourceStr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.lang.String imageToJSON(@org.jetbrains.annotations.Nullable
    java.util.List<com.example.movie_catalog.entity.filminfo.ImageFilm> source) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.List<com.example.movie_catalog.entity.filminfo.ImageFilm> imageFromJSON(@org.jetbrains.annotations.NotNull
    java.lang.String sourceStr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.lang.String seasonToJSON(@org.jetbrains.annotations.Nullable
    java.util.List<com.example.movie_catalog.data.api.home.seasons.SeasonDTO> source) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.List<com.example.movie_catalog.data.api.home.seasons.SeasonDTO> seasonFromJSON(@org.jetbrains.annotations.NotNull
    java.lang.String sourceStr) {
        return null;
    }
}