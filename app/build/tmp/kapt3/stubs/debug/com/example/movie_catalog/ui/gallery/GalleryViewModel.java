package com.example.movie_catalog.ui.gallery;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u0006\u0010\u0013\u001a\u00020\u0011J\b\u0010\u0014\u001a\u00020\u0011H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/movie_catalog/ui/gallery/GalleryViewModel;", "Landroidx/lifecycle/ViewModel;", "dataRepository", "Lcom/example/movie_catalog/data/DataRepository;", "(Lcom/example/movie_catalog/data/DataRepository;)V", "_gallery", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/movie_catalog/entity/Gallery;", "galleryFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getGalleryFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "setGalleryFlow", "(Lkotlinx/coroutines/flow/StateFlow;)V", "localFilm", "Lcom/example/movie_catalog/entity/Film;", "getImages", "", "film", "putFilm", "takeFilm", "app_debug"})
public final class GalleryViewModel extends androidx.lifecycle.ViewModel {
    private com.example.movie_catalog.data.DataRepository dataRepository;
    private com.example.movie_catalog.entity.Film localFilm;
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.movie_catalog.entity.Gallery> _gallery;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.StateFlow<com.example.movie_catalog.entity.Gallery> galleryFlow;
    
    @javax.inject.Inject
    public GalleryViewModel(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.DataRepository dataRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.movie_catalog.entity.Gallery> getGalleryFlow() {
        return null;
    }
    
    public final void setGalleryFlow(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<com.example.movie_catalog.entity.Gallery> p0) {
    }
    
    private final void getImages(com.example.movie_catalog.entity.Film film) {
    }
    
    private final void takeFilm() {
    }
    
    public final void putFilm() {
    }
}