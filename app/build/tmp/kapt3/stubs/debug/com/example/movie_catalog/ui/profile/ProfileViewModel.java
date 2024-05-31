package com.example.movie_catalog.ui.profile;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001dJ\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u000eJ\b\u0010\u0012\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010\u001a\u001a\u00020\u001dH\u0002J.\u0010#\u001a\u00020\u001d2\u001c\u0010$\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0&\u0012\u0006\u0012\u0004\u0018\u00010\'0%H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u000e\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u00100\u001a\u00020\u001dR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00061"}, d2 = {"Lcom/example/movie_catalog/ui/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "dataRepository", "Lcom/example/movie_catalog/data/DataRepository;", "errorApp", "Lcom/example/movie_catalog/entity/ErrorApp;", "context", "Landroid/content/Context;", "(Lcom/example/movie_catalog/data/DataRepository;Lcom/example/movie_catalog/entity/ErrorApp;Landroid/content/Context;)V", "_bookmarkFilm", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/movie_catalog/entity/Linker;", "_collection", "Lcom/example/movie_catalog/entity/Collection;", "_viewedFilm", "bookmarkFilm", "Lkotlinx/coroutines/flow/StateFlow;", "getBookmarkFilm", "()Lkotlinx/coroutines/flow/StateFlow;", "setBookmarkFilm", "(Lkotlinx/coroutines/flow/StateFlow;)V", "collection", "getCollection", "setCollection", "viewedFilm", "getViewedFilm", "setViewedFilm", "clearCollection", "", "kit", "Lcom/example/movie_catalog/entity/enumApp/Kit;", "clearViewed", "deleteCollection", "getCollections", "launchDataLoad", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)V", "newCollection", "nameCollection", "", "putFilm", "film", "Lcom/example/movie_catalog/entity/Film;", "putKit", "refreshView", "app_debug"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.movie_catalog.data.DataRepository dataRepository = null;
    private final com.example.movie_catalog.entity.ErrorApp errorApp = null;
    private final android.content.Context context = null;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> _viewedFilm;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> viewedFilm;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> _bookmarkFilm;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> bookmarkFilm;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.entity.Collection>> _collection;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Collection>> collection;
    
    @javax.inject.Inject
    public ProfileViewModel(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.DataRepository dataRepository, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.ErrorApp errorApp, @org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> getViewedFilm() {
        return null;
    }
    
    public final void setViewedFilm(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> getBookmarkFilm() {
        return null;
    }
    
    public final void setBookmarkFilm(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.entity.Collection>> getCollection() {
        return null;
    }
    
    public final void setCollection(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Collection>> p0) {
    }
    
    public final void refreshView() {
    }
    
    private final void getViewedFilm() {
    }
    
    private final void getBookmarkFilm() {
    }
    
    private final void getCollections() {
    }
    
    public final void putFilm(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Film film) {
    }
    
    public final void putKit(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.Kit kit) {
    }
    
    public final void deleteCollection(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Collection collection) {
    }
    
    public final void clearCollection(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.Kit kit) {
    }
    
    public final void clearViewed() {
    }
    
    public final void newCollection(@org.jetbrains.annotations.NotNull
    java.lang.String nameCollection) {
    }
    
    private final void launchDataLoad(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
    }
}