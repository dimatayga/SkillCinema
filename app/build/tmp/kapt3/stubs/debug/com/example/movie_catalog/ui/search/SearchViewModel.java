package com.example.movie_catalog.ui.search;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcom/example/movie_catalog/ui/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "dataRepository", "Lcom/example/movie_catalog/data/DataRepository;", "(Lcom/example/movie_catalog/data/DataRepository;)V", "pagedFilms", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/movie_catalog/entity/Linker;", "getPagedFilms", "()Lkotlinx/coroutines/flow/Flow;", "setPagedFilms", "(Lkotlinx/coroutines/flow/Flow;)V", "putFilm", "", "film", "Lcom/example/movie_catalog/entity/Film;", "putTextSearch", "keyWord", "", "startSearch", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.movie_catalog.data.DataRepository dataRepository;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.movie_catalog.entity.Linker>> pagedFilms;
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.example.movie_catalog.data.DataRepository dataRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.movie_catalog.entity.Linker>> getPagedFilms() {
        return null;
    }
    
    public final void setPagedFilms(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.movie_catalog.entity.Linker>> p0) {
    }
    
    public final void startSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String keyWord) {
    }
    
    public final void putTextSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String keyWord) {
    }
    
    public final void putFilm(@org.jetbrains.annotations.NotNull()
    com.example.movie_catalog.entity.Film film) {
    }
}