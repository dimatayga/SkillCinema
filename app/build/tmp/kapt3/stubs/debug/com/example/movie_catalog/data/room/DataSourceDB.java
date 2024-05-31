package com.example.movie_catalog.data.room;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0010J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u001aJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0 J\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0 2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010#\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010$\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010 J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100 2\u0006\u0010\u000f\u001a\u00020\u0010J\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00100 J\u000e\u0010(\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/example/movie_catalog/data/room/DataSourceDB;", "", "dataDao", "Lcom/example/movie_catalog/data/room/DataDao;", "(Lcom/example/movie_catalog/data/room/DataDao;)V", "addCollection", "", "collection", "Lcom/example/movie_catalog/data/room/tables/CollectionDB;", "addFilm", "filmDB", "Lcom/example/movie_catalog/data/room/tables/FilmDB;", "addRemoveFilmToCollection", "film", "Lcom/example/movie_catalog/entity/Film;", "collectionId", "", "bookmarkFlow", "Lkotlinx/coroutines/flow/Flow;", "", "id", "checkFilmInCollection", "filmId", "clearBookmarkFilm", "clearCollection", "nameCollection", "", "clearViewedFilm", "deleteCollection", "favoriteFlow", "getCollectionRecord", "getCollections", "", "getCountFilmCollection", "Lcom/example/movie_catalog/data/room/tables/CrossFC;", "getFilm", "getFilmInCollection", "getFilms", "getListFilmsIdInCollection", "getViewedFilmsId", "setViewed", "viewedFlow", "app_debug"})
@javax.inject.Singleton
public class DataSourceDB {
    private final com.example.movie_catalog.data.room.DataDao dataDao = null;
    
    @javax.inject.Inject
    public DataSourceDB(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.room.DataDao dataDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.data.room.tables.FilmDB getFilm(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Film film) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.movie_catalog.data.room.tables.FilmDB> getFilms() {
        return null;
    }
    
    private final void checkFilmInCollection(com.example.movie_catalog.entity.Film film) {
    }
    
    private final void checkFilmInCollection(int filmId) {
    }
    
    public final void addFilm(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.room.tables.FilmDB filmDB) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> viewedFlow(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> bookmarkFlow(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> favoriteFlow(int id) {
        return null;
    }
    
    public final void setViewed(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Film film) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.data.room.tables.CollectionDB> getCollections() {
        return null;
    }
    
    public final void addCollection(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.room.tables.CollectionDB collection) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.data.room.tables.CrossFC> getCountFilmCollection(int collectionId) {
        return null;
    }
    
    public final void addRemoveFilmToCollection(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Film film, int collectionId) {
    }
    
    public final boolean getFilmInCollection(int filmId, int collectionId) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.data.room.tables.CollectionDB getCollectionRecord(@org.jetbrains.annotations.NotNull
    java.lang.String nameCollection) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getViewedFilmsId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getListFilmsIdInCollection(int collectionId) {
        return null;
    }
    
    public final void clearViewedFilm() {
    }
    
    public final void clearCollection(@org.jetbrains.annotations.NotNull
    java.lang.String nameCollection) {
    }
    
    public final void clearBookmarkFilm() {
    }
    
    public final void deleteCollection(@org.jetbrains.annotations.NotNull
    java.lang.String nameCollection) {
    }
}