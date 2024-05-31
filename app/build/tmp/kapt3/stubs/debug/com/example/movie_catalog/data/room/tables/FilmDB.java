package com.example.movie_catalog.data.room.tables;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.movie_catalog.data.room.tables.ConverterForFilmDB.class})
@androidx.room.Entity(tableName = "films")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lcom/example/movie_catalog/data/room/tables/FilmDB;", "", "idFilm", "", "msg", "", "film", "Lcom/example/movie_catalog/entity/Film;", "(ILjava/lang/String;Lcom/example/movie_catalog/entity/Film;)V", "getFilm", "()Lcom/example/movie_catalog/entity/Film;", "setFilm", "(Lcom/example/movie_catalog/entity/Film;)V", "getIdFilm", "()I", "setIdFilm", "(I)V", "getMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class FilmDB {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int idFilm;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String msg = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.Embedded
    private com.example.movie_catalog.entity.Film film;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.data.room.tables.FilmDB copy(int idFilm, @org.jetbrains.annotations.NotNull
    java.lang.String msg, @org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.Film film) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public FilmDB(int idFilm, @org.jetbrains.annotations.NotNull
    java.lang.String msg, @org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.Film film) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getIdFilm() {
        return 0;
    }
    
    public final void setIdFilm(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMsg() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.entity.Film component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.entity.Film getFilm() {
        return null;
    }
    
    public final void setFilm(@org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.Film p0) {
    }
}