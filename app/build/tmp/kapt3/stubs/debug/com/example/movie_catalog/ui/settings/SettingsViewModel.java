package com.example.movie_catalog.ui.settings;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\nJ\b\u0010 \u001a\u00020\u001dH\u0002J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&J\b\u0010\'\u001a\u00020\u001dH\u0002J\u000e\u0010\'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\fJ\u001a\u0010)\u001a\u00020\u001d2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,0+J\u000e\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/J\u001a\u00100\u001a\u00020\u001d2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002020+R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012\u00a8\u00063"}, d2 = {"Lcom/example/movie_catalog/ui/settings/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "dataRepository", "Lcom/example/movie_catalog/data/DataRepository;", "errorApp", "Lcom/example/movie_catalog/entity/ErrorApp;", "(Lcom/example/movie_catalog/data/DataRepository;Lcom/example/movie_catalog/entity/ErrorApp;)V", "_countries", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/movie_catalog/data/api/home/getKit/CountryIdDTO;", "_genres", "Lcom/example/movie_catalog/data/api/home/getKit/GenreIdDTO;", "countries", "Lkotlinx/coroutines/flow/StateFlow;", "getCountries", "()Lkotlinx/coroutines/flow/StateFlow;", "setCountries", "(Lkotlinx/coroutines/flow/StateFlow;)V", "filter", "Lcom/example/movie_catalog/entity/SearchFilter;", "getFilter", "()Lcom/example/movie_catalog/entity/SearchFilter;", "setFilter", "(Lcom/example/movie_catalog/entity/SearchFilter;)V", "genres", "getGenres", "setGenres", "takeCountries", "", "takeCountry", "country", "takeFilter", "takeFilterSorting", "sorting", "Lcom/example/movie_catalog/entity/enumApp/SortingField;", "takeFilterType", "typeFilm", "Lcom/example/movie_catalog/entity/enumApp/TypeFilm;", "takeGenres", "genre", "takeRating", "rating", "Lkotlin/Pair;", "", "takeViewed", "viewed", "", "takeYears", "year", "", "app_debug"})
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    private com.example.movie_catalog.data.DataRepository dataRepository;
    private final com.example.movie_catalog.entity.ErrorApp errorApp = null;
    @org.jetbrains.annotations.NotNull
    private com.example.movie_catalog.entity.SearchFilter filter;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.data.api.home.getKit.CountryIdDTO>> _countries;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.data.api.home.getKit.CountryIdDTO>> countries;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.data.api.home.getKit.GenreIdDTO>> _genres;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.data.api.home.getKit.GenreIdDTO>> genres;
    
    @javax.inject.Inject
    public SettingsViewModel(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.DataRepository dataRepository, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.ErrorApp errorApp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.entity.SearchFilter getFilter() {
        return null;
    }
    
    public final void setFilter(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.SearchFilter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.data.api.home.getKit.CountryIdDTO>> getCountries() {
        return null;
    }
    
    public final void setCountries(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.data.api.home.getKit.CountryIdDTO>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.data.api.home.getKit.GenreIdDTO>> getGenres() {
        return null;
    }
    
    public final void setGenres(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.data.api.home.getKit.GenreIdDTO>> p0) {
    }
    
    private final void takeFilter() {
    }
    
    private final void takeCountries() {
    }
    
    private final void takeGenres() {
    }
    
    public final void takeFilterType(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.TypeFilm typeFilm) {
    }
    
    public final void takeFilterSorting(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.SortingField sorting) {
    }
    
    public final void takeViewed(boolean viewed) {
    }
    
    public final void takeRating(@org.jetbrains.annotations.NotNull
    kotlin.Pair<java.lang.Double, java.lang.Double> rating) {
    }
    
    public final void takeYears(@org.jetbrains.annotations.NotNull
    kotlin.Pair<java.lang.Integer, java.lang.Integer> year) {
    }
    
    public final void takeCountry(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.home.getKit.CountryIdDTO country) {
    }
    
    public final void takeGenres(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.home.getKit.GenreIdDTO genre) {
    }
}