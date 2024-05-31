package com.example.movie_catalog.data.api.home.seasons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J,\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/example/movie_catalog/data/api/home/seasons/SeasonDTO;", "", "number", "", "episodes", "", "Lcom/example/movie_catalog/data/api/home/seasons/EpisodeDTO;", "(Ljava/lang/Integer;Ljava/util/List;)V", "getEpisodes", "()Ljava/util/List;", "getNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/example/movie_catalog/data/api/home/seasons/SeasonDTO;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class SeasonDTO {
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer number = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.example.movie_catalog.data.api.home.seasons.EpisodeDTO> episodes = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.data.api.home.seasons.SeasonDTO copy(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "number")
    java.lang.Integer number, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "episodes")
    java.util.List<com.example.movie_catalog.data.api.home.seasons.EpisodeDTO> episodes) {
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
    
    public SeasonDTO() {
        super();
    }
    
    public SeasonDTO(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "number")
    java.lang.Integer number, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "episodes")
    java.util.List<com.example.movie_catalog.data.api.home.seasons.EpisodeDTO> episodes) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.movie_catalog.data.api.home.seasons.EpisodeDTO> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.movie_catalog.data.api.home.seasons.EpisodeDTO> getEpisodes() {
        return null;
    }
}