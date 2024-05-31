package com.example.movie_catalog.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0007H\u00c6\u0003J\u0015\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u0015\u00106\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\tH\u00c6\u0003J\t\u00107\u001a\u00020\u000eH\u00c6\u0003J\t\u00108\u001a\u00020\u0010H\u00c6\u0003J\t\u00109\u001a\u00020\u0012H\u00c6\u0003Jq\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u00c6\u0001J\u0013\u0010;\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010=\u001a\u00020\nH\u00d6\u0001J\t\u0010>\u001a\u00020\u0012H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010!\"\u0004\b1\u0010#\u00a8\u0006?"}, d2 = {"Lcom/example/movie_catalog/entity/SearchFilter;", "", "typeFilm", "Lcom/example/movie_catalog/entity/enumApp/TypeFilm;", "country", "Lcom/example/movie_catalog/data/api/home/getKit/CountryIdDTO;", "genre", "Lcom/example/movie_catalog/data/api/home/getKit/GenreIdDTO;", "year", "Lkotlin/Pair;", "", "rating", "", "viewed", "", "sorting", "Lcom/example/movie_catalog/entity/enumApp/SortingField;", "keyWord", "", "(Lcom/example/movie_catalog/entity/enumApp/TypeFilm;Lcom/example/movie_catalog/data/api/home/getKit/CountryIdDTO;Lcom/example/movie_catalog/data/api/home/getKit/GenreIdDTO;Lkotlin/Pair;Lkotlin/Pair;ZLcom/example/movie_catalog/entity/enumApp/SortingField;Ljava/lang/String;)V", "getCountry", "()Lcom/example/movie_catalog/data/api/home/getKit/CountryIdDTO;", "setCountry", "(Lcom/example/movie_catalog/data/api/home/getKit/CountryIdDTO;)V", "getGenre", "()Lcom/example/movie_catalog/data/api/home/getKit/GenreIdDTO;", "setGenre", "(Lcom/example/movie_catalog/data/api/home/getKit/GenreIdDTO;)V", "getKeyWord", "()Ljava/lang/String;", "setKeyWord", "(Ljava/lang/String;)V", "getRating", "()Lkotlin/Pair;", "setRating", "(Lkotlin/Pair;)V", "getSorting", "()Lcom/example/movie_catalog/entity/enumApp/SortingField;", "setSorting", "(Lcom/example/movie_catalog/entity/enumApp/SortingField;)V", "getTypeFilm", "()Lcom/example/movie_catalog/entity/enumApp/TypeFilm;", "setTypeFilm", "(Lcom/example/movie_catalog/entity/enumApp/TypeFilm;)V", "getViewed", "()Z", "setViewed", "(Z)V", "getYear", "setYear", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class SearchFilter {
    @org.jetbrains.annotations.NotNull
    private com.example.movie_catalog.entity.enumApp.TypeFilm typeFilm;
    @org.jetbrains.annotations.NotNull
    private com.example.movie_catalog.data.api.home.getKit.CountryIdDTO country;
    @org.jetbrains.annotations.NotNull
    private com.example.movie_catalog.data.api.home.getKit.GenreIdDTO genre;
    @org.jetbrains.annotations.NotNull
    private kotlin.Pair<java.lang.Integer, java.lang.Integer> year;
    @org.jetbrains.annotations.NotNull
    private kotlin.Pair<java.lang.Double, java.lang.Double> rating;
    private boolean viewed;
    @org.jetbrains.annotations.NotNull
    private com.example.movie_catalog.entity.enumApp.SortingField sorting;
    @org.jetbrains.annotations.NotNull
    private java.lang.String keyWord;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.entity.SearchFilter copy(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.TypeFilm typeFilm, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.home.getKit.CountryIdDTO country, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.home.getKit.GenreIdDTO genre, @org.jetbrains.annotations.NotNull
    kotlin.Pair<java.lang.Integer, java.lang.Integer> year, @org.jetbrains.annotations.NotNull
    kotlin.Pair<java.lang.Double, java.lang.Double> rating, boolean viewed, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.SortingField sorting, @org.jetbrains.annotations.NotNull
    java.lang.String keyWord) {
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
    
    public SearchFilter() {
        super();
    }
    
    public SearchFilter(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.TypeFilm typeFilm, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.home.getKit.CountryIdDTO country, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.home.getKit.GenreIdDTO genre, @org.jetbrains.annotations.NotNull
    kotlin.Pair<java.lang.Integer, java.lang.Integer> year, @org.jetbrains.annotations.NotNull
    kotlin.Pair<java.lang.Double, java.lang.Double> rating, boolean viewed, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.SortingField sorting, @org.jetbrains.annotations.NotNull
    java.lang.String keyWord) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.entity.enumApp.TypeFilm component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.entity.enumApp.TypeFilm getTypeFilm() {
        return null;
    }
    
    public final void setTypeFilm(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.TypeFilm p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.data.api.home.getKit.CountryIdDTO component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.data.api.home.getKit.CountryIdDTO getCountry() {
        return null;
    }
    
    public final void setCountry(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.home.getKit.CountryIdDTO p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.data.api.home.getKit.GenreIdDTO component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.data.api.home.getKit.GenreIdDTO getGenre() {
        return null;
    }
    
    public final void setGenre(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.home.getKit.GenreIdDTO p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getYear() {
        return null;
    }
    
    public final void setYear(@org.jetbrains.annotations.NotNull
    kotlin.Pair<java.lang.Integer, java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.Pair<java.lang.Double, java.lang.Double> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.Pair<java.lang.Double, java.lang.Double> getRating() {
        return null;
    }
    
    public final void setRating(@org.jetbrains.annotations.NotNull
    kotlin.Pair<java.lang.Double, java.lang.Double> p0) {
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getViewed() {
        return false;
    }
    
    public final void setViewed(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.entity.enumApp.SortingField component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.entity.enumApp.SortingField getSorting() {
        return null;
    }
    
    public final void setSorting(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.SortingField p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKeyWord() {
        return null;
    }
    
    public final void setKeyWord(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}