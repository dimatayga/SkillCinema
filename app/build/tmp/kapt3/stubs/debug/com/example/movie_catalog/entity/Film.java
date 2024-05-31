package com.example.movie_catalog.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\ba\b\u0086\b\u0018\u00002\u00020\u0001B\u00bf\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010%J\u0010\u0010c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\t\u0010d\u001a\u00020\u0011H\u00c6\u0003J\t\u0010e\u001a\u00020\u0011H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u000f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010NJ\u0010\u0010m\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010NJ\u000b\u0010n\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010NJ\u0010\u0010p\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0010\u0010q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0011\u0010r\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\fH\u00c6\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010w\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010NJ\u000b\u0010x\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010y\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u00c6\u0003J\u000f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u00c6\u0003J\t\u0010{\u001a\u00020\u0011H\u00c6\u0003J\u00c8\u0002\u0010|\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010}J\u0013\u0010~\u001a\u00020\u00112\b\u0010\u007f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0007\u0010\u0080\u0001\u001a\u00020\u0005J\n\u0010\u0081\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u0082\u0001\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0013\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010#\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\'\"\u0004\b3\u0010)R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010+\"\u0004\b8\u0010-R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010+\"\u0004\b:\u0010-R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010/\"\u0004\b<\u00101R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010+\"\u0004\b>\u0010-R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010/\"\u0004\b@\u00101R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010/\"\u0004\bB\u00101R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010/\"\u0004\bD\u00101R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010/\"\u0004\bF\u00101R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010/\"\u0004\bH\u00101R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010/\"\u0004\bJ\u00101R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010/\"\u0004\bL\u00101R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010Q\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010Q\u001a\u0004\bR\u0010N\"\u0004\bS\u0010PR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010Q\u001a\u0004\bT\u0010N\"\u0004\bU\u0010PR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010Q\u001a\u0004\bV\u0010N\"\u0004\bW\u0010PR\u001c\u0010$\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010/\"\u0004\bY\u00101R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00106\u001a\u0004\bZ\u00105\"\u0004\b[\u0010\\R\u001e\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00106\u001a\u0004\b]\u00105\"\u0004\b^\u0010\\R\u001a\u0010\u0012\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\'\"\u0004\b`\u0010)R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00106\u001a\u0004\ba\u00105\"\u0004\bb\u0010\\\u00a8\u0006\u0083\u0001"}, d2 = {"Lcom/example/movie_catalog/entity/Film;", "", "filmId", "", "imdbId", "", "nameRu", "nameEn", "rating", "", "posterUrlPreview", "countries", "", "Lcom/example/movie_catalog/entity/Country;", "genres", "Lcom/example/movie_catalog/entity/Genre;", "favorite", "", "viewed", "bookmark", "professionKey", "startYear", "images", "", "Lcom/example/movie_catalog/entity/filminfo/ImageFilm;", "posterUrl", "logoUrl", "nameOriginal", "ratingImdb", "ratingAwait", "ratingGoodReview", "year", "totalSeasons", "listSeasons", "Lcom/example/movie_catalog/data/api/home/seasons/SeasonDTO;", "description", "shortDescription", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getBookmark", "()Z", "setBookmark", "(Z)V", "getCountries", "()Ljava/util/List;", "setCountries", "(Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getFavorite", "setFavorite", "getFilmId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGenres", "setGenres", "getImages", "setImages", "getImdbId", "setImdbId", "getListSeasons", "setListSeasons", "getLogoUrl", "setLogoUrl", "getNameEn", "setNameEn", "getNameOriginal", "setNameOriginal", "getNameRu", "setNameRu", "getPosterUrl", "setPosterUrl", "getPosterUrlPreview", "setPosterUrlPreview", "getProfessionKey", "setProfessionKey", "getRating", "()Ljava/lang/Double;", "setRating", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getRatingAwait", "setRatingAwait", "getRatingGoodReview", "setRatingGoodReview", "getRatingImdb", "setRatingImdb", "getShortDescription", "setShortDescription", "getStartYear", "setStartYear", "(Ljava/lang/Integer;)V", "getTotalSeasons", "setTotalSeasons", "getViewed", "setViewed", "getYear", "setYear", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/example/movie_catalog/entity/Film;", "equals", "other", "genresTxt", "hashCode", "toString", "app_debug"})
public final class Film {
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer filmId = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.String imdbId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String nameRu;
    @org.jetbrains.annotations.Nullable
    private java.lang.String nameEn;
    @org.jetbrains.annotations.Nullable
    private java.lang.Double rating;
    @org.jetbrains.annotations.Nullable
    private java.lang.String posterUrlPreview;
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.example.movie_catalog.entity.Country> countries;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.movie_catalog.entity.Genre> genres;
    private boolean favorite;
    private boolean viewed;
    private boolean bookmark;
    @org.jetbrains.annotations.Nullable
    private java.lang.String professionKey;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer startYear;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.movie_catalog.entity.filminfo.ImageFilm> images;
    @org.jetbrains.annotations.Nullable
    private java.lang.String posterUrl;
    @org.jetbrains.annotations.Nullable
    private java.lang.String logoUrl;
    @org.jetbrains.annotations.Nullable
    private java.lang.String nameOriginal;
    @org.jetbrains.annotations.Nullable
    private java.lang.Double ratingImdb;
    @org.jetbrains.annotations.Nullable
    private java.lang.Double ratingAwait;
    @org.jetbrains.annotations.Nullable
    private java.lang.Double ratingGoodReview;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer year;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer totalSeasons;
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.example.movie_catalog.data.api.home.seasons.SeasonDTO> listSeasons;
    @org.jetbrains.annotations.Nullable
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable
    private java.lang.String shortDescription;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.entity.Film copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer filmId, @org.jetbrains.annotations.Nullable
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable
    java.lang.String nameRu, @org.jetbrains.annotations.Nullable
    java.lang.String nameEn, @org.jetbrains.annotations.Nullable
    java.lang.Double rating, @org.jetbrains.annotations.Nullable
    java.lang.String posterUrlPreview, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.movie_catalog.entity.Country> countries, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.entity.Genre> genres, boolean favorite, boolean viewed, boolean bookmark, @org.jetbrains.annotations.Nullable
    java.lang.String professionKey, @org.jetbrains.annotations.Nullable
    java.lang.Integer startYear, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.entity.filminfo.ImageFilm> images, @org.jetbrains.annotations.Nullable
    java.lang.String posterUrl, @org.jetbrains.annotations.Nullable
    java.lang.String logoUrl, @org.jetbrains.annotations.Nullable
    java.lang.String nameOriginal, @org.jetbrains.annotations.Nullable
    java.lang.Double ratingImdb, @org.jetbrains.annotations.Nullable
    java.lang.Double ratingAwait, @org.jetbrains.annotations.Nullable
    java.lang.Double ratingGoodReview, @org.jetbrains.annotations.Nullable
    java.lang.Integer year, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalSeasons, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.movie_catalog.data.api.home.seasons.SeasonDTO> listSeasons, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String shortDescription) {
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
    
    public Film() {
        super();
    }
    
    public Film(@org.jetbrains.annotations.Nullable
    java.lang.Integer filmId, @org.jetbrains.annotations.Nullable
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable
    java.lang.String nameRu, @org.jetbrains.annotations.Nullable
    java.lang.String nameEn, @org.jetbrains.annotations.Nullable
    java.lang.Double rating, @org.jetbrains.annotations.Nullable
    java.lang.String posterUrlPreview, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.movie_catalog.entity.Country> countries, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.entity.Genre> genres, boolean favorite, boolean viewed, boolean bookmark, @org.jetbrains.annotations.Nullable
    java.lang.String professionKey, @org.jetbrains.annotations.Nullable
    java.lang.Integer startYear, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.entity.filminfo.ImageFilm> images, @org.jetbrains.annotations.Nullable
    java.lang.String posterUrl, @org.jetbrains.annotations.Nullable
    java.lang.String logoUrl, @org.jetbrains.annotations.Nullable
    java.lang.String nameOriginal, @org.jetbrains.annotations.Nullable
    java.lang.Double ratingImdb, @org.jetbrains.annotations.Nullable
    java.lang.Double ratingAwait, @org.jetbrains.annotations.Nullable
    java.lang.Double ratingGoodReview, @org.jetbrains.annotations.Nullable
    java.lang.Integer year, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalSeasons, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.movie_catalog.data.api.home.seasons.SeasonDTO> listSeasons, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String shortDescription) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getFilmId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getImdbId() {
        return null;
    }
    
    public final void setImdbId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
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
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNameEn() {
        return null;
    }
    
    public final void setNameEn(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getRating() {
        return null;
    }
    
    public final void setRating(@org.jetbrains.annotations.Nullable
    java.lang.Double p0) {
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
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.movie_catalog.entity.Country> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.movie_catalog.entity.Country> getCountries() {
        return null;
    }
    
    public final void setCountries(@org.jetbrains.annotations.Nullable
    java.util.List<com.example.movie_catalog.entity.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.entity.Genre> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.entity.Genre> getGenres() {
        return null;
    }
    
    public final void setGenres(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.entity.Genre> p0) {
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getFavorite() {
        return false;
    }
    
    public final void setFavorite(boolean p0) {
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean getViewed() {
        return false;
    }
    
    public final void setViewed(boolean p0) {
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean getBookmark() {
        return false;
    }
    
    public final void setBookmark(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getProfessionKey() {
        return null;
    }
    
    public final void setProfessionKey(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getStartYear() {
        return null;
    }
    
    public final void setStartYear(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.entity.filminfo.ImageFilm> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.entity.filminfo.ImageFilm> getImages() {
        return null;
    }
    
    public final void setImages(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.entity.filminfo.ImageFilm> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPosterUrl() {
        return null;
    }
    
    public final void setPosterUrl(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLogoUrl() {
        return null;
    }
    
    public final void setLogoUrl(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNameOriginal() {
        return null;
    }
    
    public final void setNameOriginal(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getRatingImdb() {
        return null;
    }
    
    public final void setRatingImdb(@org.jetbrains.annotations.Nullable
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getRatingAwait() {
        return null;
    }
    
    public final void setRatingAwait(@org.jetbrains.annotations.Nullable
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getRatingGoodReview() {
        return null;
    }
    
    public final void setRatingGoodReview(@org.jetbrains.annotations.Nullable
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getYear() {
        return null;
    }
    
    public final void setYear(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalSeasons() {
        return null;
    }
    
    public final void setTotalSeasons(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.movie_catalog.data.api.home.seasons.SeasonDTO> component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.movie_catalog.data.api.home.seasons.SeasonDTO> getListSeasons() {
        return null;
    }
    
    public final void setListSeasons(@org.jetbrains.annotations.Nullable
    java.util.List<com.example.movie_catalog.data.api.home.seasons.SeasonDTO> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getShortDescription() {
        return null;
    }
    
    public final void setShortDescription(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String genresTxt() {
        return null;
    }
}