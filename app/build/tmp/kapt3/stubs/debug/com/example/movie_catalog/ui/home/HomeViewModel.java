package com.example.movie_catalog.ui.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0002J\b\u0010\u001f\u001a\u00020+H\u0002J\b\u0010-\u001a\u00020+H\u0002J\u0011\u0010.\u001a\u00020+H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\b\u0010(\u001a\u00020+H\u0002J\b\u00100\u001a\u00020+H\u0002J\u000e\u00101\u001a\u00020+2\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u00020+2\u0006\u00105\u001a\u000206R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R&\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R&\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00067"}, d2 = {"Lcom/example/movie_catalog/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "dataRepository", "Lcom/example/movie_catalog/data/DataRepository;", "errorApp", "Lcom/example/movie_catalog/entity/ErrorApp;", "(Lcom/example/movie_catalog/data/DataRepository;Lcom/example/movie_catalog/entity/ErrorApp;)V", "_namekit", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/movie_catalog/data/api/home/getKit/SelectedKit;", "_pageTop250", "", "Lcom/example/movie_catalog/entity/Linker;", "_popularFilms", "_premieres", "_randomKit1", "_randomKit2", "_serials", "namekit", "Lkotlinx/coroutines/flow/StateFlow;", "getNamekit", "()Lkotlinx/coroutines/flow/StateFlow;", "setNamekit", "(Lkotlinx/coroutines/flow/StateFlow;)V", "pageTop250", "getPageTop250", "setPageTop250", "popularFilms", "getPopularFilms", "setPopularFilms", "premieres", "getPremieres", "setPremieres", "randomKit1", "getRandomKit1", "setRandomKit1", "randomKit2", "getRandomKit2", "setRandomKit2", "serials", "getSerials", "setSerials", "getGenres", "", "getPopular", "getRandom1", "getRandom2", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTop250", "putFilm", "film", "Lcom/example/movie_catalog/entity/Film;", "putKit", "kit", "Lcom/example/movie_catalog/entity/enumApp/Kit;", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private com.example.movie_catalog.data.DataRepository dataRepository;
    private final com.example.movie_catalog.entity.ErrorApp errorApp = null;
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.movie_catalog.data.api.home.getKit.SelectedKit> _namekit;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<com.example.movie_catalog.data.api.home.getKit.SelectedKit> namekit;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> _premieres;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> premieres;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> _popularFilms;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> popularFilms;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> _pageTop250;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> pageTop250;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> _randomKit1;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> randomKit1;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> _randomKit2;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> randomKit2;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> _serials;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> serials;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.DataRepository dataRepository, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.ErrorApp errorApp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.movie_catalog.data.api.home.getKit.SelectedKit> getNamekit() {
        return null;
    }
    
    public final void setNamekit(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<com.example.movie_catalog.data.api.home.getKit.SelectedKit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> getPremieres() {
        return null;
    }
    
    public final void setPremieres(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> getPopularFilms() {
        return null;
    }
    
    public final void setPopularFilms(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> getPageTop250() {
        return null;
    }
    
    public final void setPageTop250(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> getRandomKit1() {
        return null;
    }
    
    public final void setRandomKit1(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> getRandomKit2() {
        return null;
    }
    
    public final void setRandomKit2(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> getSerials() {
        return null;
    }
    
    public final void setSerials(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> p0) {
    }
    
    private final void getGenres() {
    }
    
    private final void getPremieres() {
    }
    
    private final void getPopular() {
    }
    
    private final void getTop250() {
    }
    
    private final void getSerials() {
    }
    
    private final void getRandom1() {
    }
    
    private final java.lang.Object getRandom2(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void putKit(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.Kit kit) {
    }
    
    public final void putFilm(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Film film) {
    }
}