package com.example.movie_catalog.ui.list_films;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010&\u001a\u00020\'J\u0012\u0010(\u001a\u00020\'2\b\b\u0002\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\'2\u0006\u0010,\u001a\u00020\u001eH\u0002J\u0010\u0010-\u001a\u00020\'2\u0006\u0010.\u001a\u00020\u0016H\u0002J\b\u0010/\u001a\u00020\'H\u0002J\u000e\u00100\u001a\u00020\'2\u0006\u0010.\u001a\u00020\u0016J\b\u00101\u001a\u00020\'H\u0002J\b\u00102\u001a\u00020\'H\u0002J\b\u00103\u001a\u00020\'H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0!0 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u00064"}, d2 = {"Lcom/example/movie_catalog/ui/list_films/ListFilmViewModel;", "Landroidx/lifecycle/ViewModel;", "dataRepository", "Lcom/example/movie_catalog/data/DataRepository;", "errorApp", "Lcom/example/movie_catalog/entity/ErrorApp;", "(Lcom/example/movie_catalog/data/DataRepository;Lcom/example/movie_catalog/entity/ErrorApp;)V", "_collectionFilm", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/movie_catalog/entity/Linker;", "_listLink", "collectionFilm", "Lkotlinx/coroutines/flow/StateFlow;", "getCollectionFilm", "()Lkotlinx/coroutines/flow/StateFlow;", "setCollectionFilm", "(Lkotlinx/coroutines/flow/StateFlow;)V", "listLink", "getListLink", "setListLink", "localFilm", "Lcom/example/movie_catalog/entity/Film;", "localKit", "Lcom/example/movie_catalog/entity/enumApp/Kit;", "getLocalKit", "()Lcom/example/movie_catalog/entity/enumApp/Kit;", "setLocalKit", "(Lcom/example/movie_catalog/entity/enumApp/Kit;)V", "localPerson", "Lcom/example/movie_catalog/entity/Person;", "pagedFilms", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "getPagedFilms", "()Lkotlinx/coroutines/flow/Flow;", "setPagedFilms", "(Lkotlinx/coroutines/flow/Flow;)V", "clearCollection", "", "getDataCollection", "nameCollection", "", "getListLinkerForPerson", "person", "getListLinkerForSimilar", "film", "getPremieres", "putFilm", "takeFilm", "takeKit", "takePerson", "app_debug"})
public final class ListFilmViewModel extends androidx.lifecycle.ViewModel {
    private com.example.movie_catalog.data.DataRepository dataRepository;
    private final com.example.movie_catalog.entity.ErrorApp errorApp = null;
    @org.jetbrains.annotations.Nullable
    private com.example.movie_catalog.entity.enumApp.Kit localKit;
    private com.example.movie_catalog.entity.Person localPerson;
    private com.example.movie_catalog.entity.Film localFilm;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> _listLink;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> listLink;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> _collectionFilm;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> collectionFilm;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.movie_catalog.entity.Linker>> pagedFilms;
    
    @javax.inject.Inject
    public ListFilmViewModel(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.DataRepository dataRepository, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.ErrorApp errorApp) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.entity.enumApp.Kit getLocalKit() {
        return null;
    }
    
    public final void setLocalKit(@org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.enumApp.Kit p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> getListLink() {
        return null;
    }
    
    public final void setListLink(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> getCollectionFilm() {
        return null;
    }
    
    public final void setCollectionFilm(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.movie_catalog.entity.Linker>> getPagedFilms() {
        return null;
    }
    
    public final void setPagedFilms(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.movie_catalog.entity.Linker>> p0) {
    }
    
    private final void getListLinkerForPerson(com.example.movie_catalog.entity.Person person) {
    }
    
    private final void getListLinkerForSimilar(com.example.movie_catalog.entity.Film film) {
    }
    
    private final void getDataCollection(java.lang.String nameCollection) {
    }
    
    private final void getPremieres() {
    }
    
    public final void clearCollection() {
    }
    
    public final void putFilm(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Film film) {
    }
    
    private final void takeKit() {
    }
    
    private final void takePerson() {
    }
    
    private final void takeFilm() {
    }
}