package com.example.movie_catalog.data.room;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\'J\b\u0010\f\u001a\u00020\rH\'J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\'J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\'J\u0010\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014H\'J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\u001a\u001a\u00020\u0005H\'J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\"\u001a\u00020\nH\'J!\u0010#\u001a\u00020\u00032\u0012\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100%\"\u00020\u0010H\'\u00a2\u0006\u0002\u0010&J!\u0010#\u001a\u00020\u00032\u0012\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160%\"\u00020\u0016H\'\u00a2\u0006\u0002\u0010\'J!\u0010#\u001a\u00020\u00032\u0012\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0%\"\u00020\rH\'\u00a2\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u0003H\'J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\nH\'J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0-2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0-2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0-2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u00100\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0016H\'J\u0010\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\rH\'\u00a8\u00062"}, d2 = {"Lcom/example/movie_catalog/data/room/DataDao;", "", "clearByCollectionIdCrossFC", "", "id", "", "deleteByIdCollection", "deleteByIdCrossFC", "deleteByIdFilmDB", "existFilmInCollections", "", "filmId", "getAll", "Lcom/example/movie_catalog/data/room/tables/FilmDB;", "getBookmark", "getCollectionRecord", "Lcom/example/movie_catalog/data/room/tables/CollectionDB;", "collectionName", "", "getCollections", "", "getCountFilmCollection", "Lcom/example/movie_catalog/data/room/tables/CrossFC;", "getFavorite", "getFilm", "getFilmInCollection", "collectionId", "(II)Ljava/lang/Integer;", "getFilmInList", "listId", "getFilms", "getListFilmsInCollection", "getViewed", "getViewedFilms", "viewed", "insert", "data", "", "([Lcom/example/movie_catalog/data/room/tables/CollectionDB;)V", "([Lcom/example/movie_catalog/data/room/tables/CrossFC;)V", "([Lcom/example/movie_catalog/data/room/tables/FilmDB;)V", "nukeTable", "setAllViewed", "value", "setBookmarkFlow", "Lkotlinx/coroutines/flow/Flow;", "setFavoriteFlow", "setViewedFlow", "update", "film", "app_debug"})
public abstract interface DataDao {
    
    @androidx.room.Insert(entity = com.example.movie_catalog.data.room.tables.FilmDB.class)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.room.tables.FilmDB... data);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.room.tables.FilmDB film);
    
    @androidx.room.Query(value = "DELETE FROM films")
    public abstract void nukeTable();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM films ORDER BY idFilm DESC")
    public abstract com.example.movie_catalog.data.room.tables.FilmDB getAll();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM films WHERE idFilm = :id")
    public abstract com.example.movie_catalog.data.room.tables.FilmDB getFilm(int id);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM films")
    public abstract java.util.List<com.example.movie_catalog.data.room.tables.FilmDB> getFilms();
    
    @androidx.room.Query(value = "SELECT viewed FROM films WHERE idFilm = :id")
    public abstract boolean getViewed(int id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT filmId FROM films WHERE viewed = :viewed")
    public abstract java.util.List<java.lang.Integer> getViewedFilms(boolean viewed);
    
    @androidx.room.Query(value = "UPDATE films SET viewed = :value ")
    public abstract void setAllViewed(boolean value);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT viewed FROM films WHERE idFilm = :id")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Boolean> setViewedFlow(int id);
    
    @androidx.room.Query(value = "DELETE FROM films WHERE idFilm = :id")
    public abstract void deleteByIdFilmDB(int id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM films WHERE idFilm = :listId")
    public abstract java.util.List<com.example.movie_catalog.data.room.tables.FilmDB> getFilmInList(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> listId);
    
    @androidx.room.Insert(entity = com.example.movie_catalog.data.room.tables.CollectionDB.class)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.room.tables.CollectionDB... data);
    
    @androidx.room.Query(value = "DELETE FROM collections WHERE idCollection = :id")
    public abstract void deleteByIdCollection(int id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM collections ")
    public abstract java.util.List<com.example.movie_catalog.data.room.tables.CollectionDB> getCollections();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM collections WHERE name = :collectionName ")
    public abstract com.example.movie_catalog.data.room.tables.CollectionDB getCollectionRecord(@org.jetbrains.annotations.NotNull
    java.lang.String collectionName);
    
    @androidx.room.Insert(entity = com.example.movie_catalog.data.room.tables.CrossFC.class, onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.room.tables.CrossFC... data);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.room.tables.CrossFC data);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT value FROM crossFC WHERE collection_id = \'1\' AND film_id = :id")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Boolean> setFavoriteFlow(int id);
    
    @androidx.room.Query(value = "SELECT value FROM crossFC WHERE collection_id = \'1\' AND film_id = :id")
    public abstract boolean getFavorite(int id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT value FROM crossFC WHERE collection_id = \'2\' AND film_id = :id")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Boolean> setBookmarkFlow(int id);
    
    @androidx.room.Query(value = "SELECT value FROM crossFC WHERE collection_id = \'2\' AND film_id = :id")
    public abstract boolean getBookmark(int id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM crossFC WHERE collection_id = :id")
    public abstract java.util.List<com.example.movie_catalog.data.room.tables.CrossFC> getCountFilmCollection(int id);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT id FROM crossFC WHERE collection_id = :collectionId AND film_id = :filmId")
    public abstract java.lang.Integer getFilmInCollection(int filmId, int collectionId);
    
    @androidx.room.Query(value = "SELECT 1 FROM crossFC WHERE film_id = :filmId")
    public abstract boolean existFilmInCollections(int filmId);
    
    @androidx.room.Query(value = "DELETE FROM crossFC WHERE id = :id")
    public abstract void deleteByIdCrossFC(int id);
    
    @androidx.room.Query(value = "DELETE FROM crossFC WHERE collection_id = :id")
    public abstract void clearByCollectionIdCrossFC(int id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT film_id FROM crossFC WHERE collection_id = :collectionId")
    public abstract java.util.List<java.lang.Integer> getListFilmsInCollection(int collectionId);
}