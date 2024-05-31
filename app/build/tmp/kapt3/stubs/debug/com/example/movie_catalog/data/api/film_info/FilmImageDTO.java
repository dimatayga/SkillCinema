package com.example.movie_catalog.data.api.film_info;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J6\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lcom/example/movie_catalog/data/api/film_info/FilmImageDTO;", "", "total", "", "totalPages", "items", "", "Lcom/example/movie_catalog/data/api/film_info/FilmImageUrlDTO;", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalPages", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/example/movie_catalog/data/api/film_info/FilmImageDTO;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class FilmImageDTO {
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer total = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer totalPages = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.movie_catalog.data.api.film_info.FilmImageUrlDTO> items;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.data.api.film_info.FilmImageDTO copy(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "total")
    java.lang.Integer total, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "totalPages")
    java.lang.Integer totalPages, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "items")
    java.util.List<com.example.movie_catalog.data.api.film_info.FilmImageUrlDTO> items) {
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
    
    public FilmImageDTO() {
        super();
    }
    
    public FilmImageDTO(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "total")
    java.lang.Integer total, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "totalPages")
    java.lang.Integer totalPages, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "items")
    java.util.List<com.example.movie_catalog.data.api.film_info.FilmImageUrlDTO> items) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalPages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.data.api.film_info.FilmImageUrlDTO> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.data.api.film_info.FilmImageUrlDTO> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.data.api.film_info.FilmImageUrlDTO> p0) {
    }
}