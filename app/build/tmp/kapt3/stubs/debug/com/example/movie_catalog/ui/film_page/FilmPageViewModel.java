package com.example.movie_catalog.ui.film_page;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\nJ\u0006\u00102\u001a\u000200J\u0006\u00103\u001a\u000200J\u0006\u00104\u001a\u000200J\u0006\u0010\u001a\u001a\u000200J\u0010\u0010 \u001a\u0002002\u0006\u00105\u001a\u00020\fH\u0002J\u0017\u00106\u001a\u0002002\b\u00107\u001a\u0004\u0018\u000108H\u0002\u00a2\u0006\u0002\u00109J\u0010\u0010#\u001a\u0002002\u0006\u00105\u001a\u00020\fH\u0002J\u0010\u0010:\u001a\u0002002\u0006\u00105\u001a\u00020\fH\u0002J\u0010\u0010*\u001a\u0002002\u0006\u00105\u001a\u00020\fH\u0002J\u000e\u0010;\u001a\u0002002\u0006\u0010<\u001a\u00020=J\u0006\u0010>\u001a\u000200J\u000e\u0010>\u001a\u0002002\u0006\u00105\u001a\u00020\fJ\u000e\u0010?\u001a\u0002002\u0006\u0010@\u001a\u00020=J\u000e\u0010A\u001a\u0002002\u0006\u0010B\u001a\u00020CJ\u000e\u0010D\u001a\u0002002\u0006\u0010&\u001a\u00020EJ\b\u0010F\u001a\u000200H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u0010\u0010%\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0016\"\u0004\b(\u0010\u0018R&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0018\u00a8\u0006G"}, d2 = {"Lcom/example/movie_catalog/ui/film_page/FilmPageViewModel;", "Landroidx/lifecycle/ViewModel;", "dataRepository", "Lcom/example/movie_catalog/data/DataRepository;", "errorApp", "Lcom/example/movie_catalog/entity/ErrorApp;", "(Lcom/example/movie_catalog/data/DataRepository;Lcom/example/movie_catalog/entity/ErrorApp;)V", "_collections", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/movie_catalog/data/room/tables/CollectionDB;", "_filmInfo", "Lcom/example/movie_catalog/entity/Film;", "_images", "Lcom/example/movie_catalog/entity/filminfo/ImageFilm;", "_person", "Lcom/example/movie_catalog/entity/Linker;", "_similar", "bookmark", "Lkotlinx/coroutines/flow/StateFlow;", "", "getBookmark", "()Lkotlinx/coroutines/flow/StateFlow;", "setBookmark", "(Lkotlinx/coroutines/flow/StateFlow;)V", "collections", "getCollections", "setCollections", "favorite", "getFavorite", "setFavorite", "filmInfo", "getFilmInfo", "setFilmInfo", "images", "getImages", "setImages", "localFilm", "person", "getPerson", "setPerson", "similar", "getSimilar", "setSimilar", "viewed", "getViewed", "setViewed", "addRemoveFilmToCollection", "", "collection", "clickBookmark", "clickFavorite", "clickViewed", "film", "getFlowIcon", "id", "", "(Ljava/lang/Integer;)V", "getPersons", "newCollection", "nameCollection", "", "putFilm", "putJobPerson", "item", "putKit", "kit", "Lcom/example/movie_catalog/entity/enumApp/Kit;", "putPerson", "Lcom/example/movie_catalog/entity/Person;", "takeFilm", "app_debug"})
public final class FilmPageViewModel extends androidx.lifecycle.ViewModel {
    private com.example.movie_catalog.data.DataRepository dataRepository;
    private final com.example.movie_catalog.entity.ErrorApp errorApp = null;
    private com.example.movie_catalog.entity.Film localFilm;
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.movie_catalog.entity.Film> _filmInfo;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<com.example.movie_catalog.entity.Film> filmInfo;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> _person;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> person;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.entity.filminfo.ImageFilm>> _images;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.filminfo.ImageFilm>> images;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> _similar;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> similar;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.data.room.tables.CollectionDB>> _collections;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.data.room.tables.CollectionDB>> collections;
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> viewed;
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> favorite;
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> bookmark;
    
    @javax.inject.Inject
    public FilmPageViewModel(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.DataRepository dataRepository, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.ErrorApp errorApp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.movie_catalog.entity.Film> getFilmInfo() {
        return null;
    }
    
    public final void setFilmInfo(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<com.example.movie_catalog.entity.Film> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> getPerson() {
        return null;
    }
    
    public final void setPerson(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.entity.filminfo.ImageFilm>> getImages() {
        return null;
    }
    
    public final void setImages(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.filminfo.ImageFilm>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> getSimilar() {
        return null;
    }
    
    public final void setSimilar(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.data.room.tables.CollectionDB>> getCollections() {
        return null;
    }
    
    public final void setCollections(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.data.room.tables.CollectionDB>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getViewed() {
        return null;
    }
    
    public final void setViewed(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getFavorite() {
        return null;
    }
    
    public final void setFavorite(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getBookmark() {
        return null;
    }
    
    public final void setBookmark(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> p0) {
    }
    
    private final void getFlowIcon(java.lang.Integer id) {
    }
    
    public final void getCollections() {
    }
    
    public final void newCollection(@org.jetbrains.annotations.NotNull
    java.lang.String nameCollection) {
    }
    
    public final void addRemoveFilmToCollection(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.room.tables.CollectionDB collection) {
    }
    
    private final void getFilmInfo(com.example.movie_catalog.entity.Film film) {
    }
    
    private final void getPersons(com.example.movie_catalog.entity.Film film) {
    }
    
    private final void getImages(com.example.movie_catalog.entity.Film film) {
    }
    
    private final void getSimilar(com.example.movie_catalog.entity.Film film) {
    }
    
    private final void takeFilm() {
    }
    
    public final void clickViewed() {
    }
    
    public final void clickFavorite() {
    }
    
    public final void clickBookmark() {
    }
    
    public final void putFilm() {
    }
    
    public final void putFilm(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Film film) {
    }
    
    public final void putKit(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.Kit kit) {
    }
    
    public final void putPerson(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Person person) {
    }
    
    public final void putJobPerson(@org.jetbrains.annotations.NotNull
    java.lang.String item) {
    }
}