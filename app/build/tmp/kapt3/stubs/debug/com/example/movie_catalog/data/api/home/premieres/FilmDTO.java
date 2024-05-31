package com.example.movie_catalog.data.api.home.premieres;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u00c6\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u008e\u0001\u0010-\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u0003H\u00d6\u0001J\t\u00103\u001a\u00020\u0005H\u00d6\u0001R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001a\"\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\"\u0010\u0015\u00a8\u00064"}, d2 = {"Lcom/example/movie_catalog/data/api/home/premieres/FilmDTO;", "", "kinopoiskId", "", "nameRu", "", "nameEn", "year", "posterUrl", "posterUrlPreview", "countries", "", "Lcom/example/movie_catalog/entity/Country;", "genres", "Lcom/example/movie_catalog/entity/Genre;", "duration", "premiereRu", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "getCountries", "()Ljava/util/List;", "getDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGenres", "getKinopoiskId", "getNameEn", "()Ljava/lang/String;", "getNameRu", "setNameRu", "(Ljava/lang/String;)V", "getPosterUrl", "getPosterUrlPreview", "setPosterUrlPreview", "getPremiereRu", "getYear", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)Lcom/example/movie_catalog/data/api/home/premieres/FilmDTO;", "equals", "", "other", "hashCode", "toString", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class FilmDTO {
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer kinopoiskId = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.String nameRu;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String nameEn = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer year = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String posterUrl = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.String posterUrlPreview;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.movie_catalog.entity.Country> countries = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.movie_catalog.entity.Genre> genres = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer duration = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String premiereRu = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.data.api.home.premieres.FilmDTO copy(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "kinopoiskId")
    java.lang.Integer kinopoiskId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "nameRu")
    java.lang.String nameRu, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "nameEn")
    java.lang.String nameEn, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "year")
    java.lang.Integer year, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "posterUrl")
    java.lang.String posterUrl, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "posterUrlPreview")
    java.lang.String posterUrlPreview, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "countries")
    java.util.List<com.example.movie_catalog.entity.Country> countries, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "genres")
    java.util.List<com.example.movie_catalog.entity.Genre> genres, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "duration")
    java.lang.Integer duration, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "premiereRu")
    java.lang.String premiereRu) {
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
    
    public FilmDTO() {
        super();
    }
    
    public FilmDTO(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "kinopoiskId")
    java.lang.Integer kinopoiskId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "nameRu")
    java.lang.String nameRu, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "nameEn")
    java.lang.String nameEn, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "year")
    java.lang.Integer year, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "posterUrl")
    java.lang.String posterUrl, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "posterUrlPreview")
    java.lang.String posterUrlPreview, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "countries")
    java.util.List<com.example.movie_catalog.entity.Country> countries, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "genres")
    java.util.List<com.example.movie_catalog.entity.Genre> genres, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "duration")
    java.lang.Integer duration, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "premiereRu")
    java.lang.String premiereRu) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getKinopoiskId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNameRu() {
        return null;
    }
    
    public final void setNameRu(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNameEn() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getYear() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPosterUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPosterUrlPreview() {
        return null;
    }
    
    public final void setPosterUrlPreview(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.entity.Country> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.entity.Country> getCountries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.entity.Genre> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.entity.Genre> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getDuration() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPremiereRu() {
        return null;
    }
}