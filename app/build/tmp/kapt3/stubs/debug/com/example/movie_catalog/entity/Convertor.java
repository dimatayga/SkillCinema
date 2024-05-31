package com.example.movie_catalog.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rJ\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001d\u00a8\u0006\u001e"}, d2 = {"Lcom/example/movie_catalog/entity/Convertor;", "", "()V", "fromCollectionDBtoCollection", "", "Lcom/example/movie_catalog/entity/Collection;", "source", "Lcom/example/movie_catalog/data/room/tables/CollectionDB;", "fromFilmDTOtoFilm", "Lcom/example/movie_catalog/entity/Film;", "filmDTO", "Lcom/example/movie_catalog/data/api/home/premieres/FilmDTO;", "fromFilterFilmDTOtoFilm", "Lcom/example/movie_catalog/data/api/home/filter/FilterFilmDTO;", "fromListFilmDBtoFilm", "listfilmDB", "Lcom/example/movie_catalog/data/room/tables/FilmDB;", "fromPersonDTOtoPerson", "Lcom/example/movie_catalog/entity/Person;", "personDTO", "Lcom/example/movie_catalog/data/api/film_info/PersonDTO;", "fromPersonInfoDTOtoPerson", "personInfo", "Lcom/example/movie_catalog/data/api/person/PersonInfoDTO;", "fromSimilarFilmDTOtoFilm", "filmSimilar", "Lcom/example/movie_catalog/data/api/film_info/SimilarItemDTO;", "fromTopFilmDTOtoFilm", "topfilm", "Lcom/example/movie_catalog/data/api/home/top/TopFilmDTO;", "app_debug"})
public final class Convertor {
    
    public Convertor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.entity.Collection> fromCollectionDBtoCollection(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.data.room.tables.CollectionDB> source) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.entity.Film fromFilmDTOtoFilm(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.home.premieres.FilmDTO filmDTO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.entity.Film fromTopFilmDTOtoFilm(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.home.top.TopFilmDTO topfilm) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.entity.Film fromFilterFilmDTOtoFilm(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.home.filter.FilterFilmDTO filmDTO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.entity.Film fromSimilarFilmDTOtoFilm(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.film_info.SimilarItemDTO filmSimilar) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.entity.Person fromPersonDTOtoPerson(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.film_info.PersonDTO personDTO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.entity.Person fromPersonInfoDTOtoPerson(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.person.PersonInfoDTO personInfo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.entity.Film> fromListFilmDBtoFilm(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.data.room.tables.FilmDB> listfilmDB) {
        return null;
    }
}