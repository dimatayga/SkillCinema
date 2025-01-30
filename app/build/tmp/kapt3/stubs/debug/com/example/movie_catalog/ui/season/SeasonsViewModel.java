package com.example.movie_catalog.ui.season;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/movie_catalog/ui/season/SeasonsViewModel;", "Landroidx/lifecycle/ViewModel;", "dataRepository", "Lcom/example/movie_catalog/data/DataRepository;", "(Lcom/example/movie_catalog/data/DataRepository;)V", "_listSeason", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/movie_catalog/entity/Film;", "listSeason", "Lkotlinx/coroutines/flow/StateFlow;", "getListSeason", "()Lkotlinx/coroutines/flow/StateFlow;", "setListSeason", "(Lkotlinx/coroutines/flow/StateFlow;)V", "localFilm", "getSerials", "", "film", "takeFilm", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SeasonsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.movie_catalog.data.DataRepository dataRepository;
    @org.jetbrains.annotations.Nullable()
    private com.example.movie_catalog.entity.Film localFilm;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.movie_catalog.entity.Film> _listSeason;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.StateFlow<com.example.movie_catalog.entity.Film> listSeason;
    
    @javax.inject.Inject()
    public SeasonsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.movie_catalog.data.DataRepository dataRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.movie_catalog.entity.Film> getListSeason() {
        return null;
    }
    
    public final void setListSeason(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.StateFlow<com.example.movie_catalog.entity.Film> p0) {
    }
    
    private final void getSerials(com.example.movie_catalog.entity.Film film) {
    }
    
    private final void takeFilm() {
    }
}