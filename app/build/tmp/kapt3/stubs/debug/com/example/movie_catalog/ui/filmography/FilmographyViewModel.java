package com.example.movie_catalog.ui.filmography;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lcom/example/movie_catalog/ui/filmography/FilmographyViewModel;", "Landroidx/lifecycle/ViewModel;", "dataRepository", "Lcom/example/movie_catalog/data/DataRepository;", "(Lcom/example/movie_catalog/data/DataRepository;)V", "_person", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/movie_catalog/entity/FilmographyData;", "localPerson", "Lcom/example/movie_catalog/entity/Person;", "person", "Lkotlinx/coroutines/flow/StateFlow;", "getPerson", "()Lkotlinx/coroutines/flow/StateFlow;", "setPerson", "(Lkotlinx/coroutines/flow/StateFlow;)V", "getImages", "", "putFilm", "film", "Lcom/example/movie_catalog/entity/Film;", "takePerson", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class FilmographyViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.movie_catalog.data.DataRepository dataRepository;
    @org.jetbrains.annotations.Nullable()
    private com.example.movie_catalog.entity.Person localPerson;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.movie_catalog.entity.FilmographyData> _person;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.StateFlow<com.example.movie_catalog.entity.FilmographyData> person;
    
    @javax.inject.Inject()
    public FilmographyViewModel(@org.jetbrains.annotations.NotNull()
    com.example.movie_catalog.data.DataRepository dataRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.movie_catalog.entity.FilmographyData> getPerson() {
        return null;
    }
    
    public final void setPerson(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.StateFlow<com.example.movie_catalog.entity.FilmographyData> p0) {
    }
    
    private final void getImages(com.example.movie_catalog.entity.Person localPerson) {
    }
    
    public final void putFilm(@org.jetbrains.annotations.NotNull()
    com.example.movie_catalog.entity.Film film) {
    }
    
    private final void takePerson() {
    }
}