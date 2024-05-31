package com.example.movie_catalog.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0011\u0010\u0018\u001a\u00020\u000eH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0011\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/example/movie_catalog/data/api/DataSourceAPI;", "", "retrofitApi", "Lcom/example/movie_catalog/data/api/KinopoiskAPI;", "(Lcom/example/movie_catalog/data/api/KinopoiskAPI;)V", "getFilters", "", "Lcom/example/movie_catalog/entity/Linker;", "page", "", "kit", "Lcom/example/movie_catalog/entity/enumApp/Kit;", "(ILcom/example/movie_catalog/entity/enumApp/Kit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImages", "", "film", "Lcom/example/movie_catalog/entity/Film;", "(Lcom/example/movie_catalog/entity/Film;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInfoFilmSeason", "getPersonInfo", "person", "Lcom/example/movie_catalog/entity/Person;", "(Lcom/example/movie_catalog/entity/Person;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPersons", "getPremieres", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRandomKitName", "Lcom/example/movie_catalog/data/api/home/getKit/SelectedKit;", "getSimilar", "getTop", "app_debug"})
public final class DataSourceAPI {
    private final com.example.movie_catalog.data.api.KinopoiskAPI retrofitApi = null;
    
    @javax.inject.Inject
    public DataSourceAPI(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.KinopoiskAPI retrofitApi) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getRandomKitName(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.movie_catalog.data.api.home.getKit.SelectedKit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getInfoFilmSeason(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Film film, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.Object getPremieres(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getTop(int page, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.Kit kit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getFilters(int page, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.Kit kit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.movie_catalog.entity.Linker>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getSimilar(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Film film, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getImages(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Film film, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getPersons(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Film film, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getPersonInfo(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Person person, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}