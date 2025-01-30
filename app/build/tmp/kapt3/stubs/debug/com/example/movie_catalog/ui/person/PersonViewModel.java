package com.example.movie_catalog.ui.person;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0014J\b\u0010\u001d\u001a\u00020\u0014H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/movie_catalog/ui/person/PersonViewModel;", "Landroidx/lifecycle/ViewModel;", "dataRepository", "Lcom/example/movie_catalog/data/DataRepository;", "errorApp", "Lcom/example/movie_catalog/entity/ErrorApp;", "(Lcom/example/movie_catalog/data/DataRepository;Lcom/example/movie_catalog/entity/ErrorApp;)V", "_linkers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/movie_catalog/entity/Linker;", "linkers", "Lkotlinx/coroutines/flow/StateFlow;", "getLinkers", "()Lkotlinx/coroutines/flow/StateFlow;", "setLinkers", "(Lkotlinx/coroutines/flow/StateFlow;)V", "localPerson", "Lcom/example/movie_catalog/entity/Person;", "getPerson", "", "person", "putFilm", "film", "Lcom/example/movie_catalog/entity/Film;", "putKit", "kit", "Lcom/example/movie_catalog/entity/enumApp/Kit;", "putPerson", "takePerson", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class PersonViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.movie_catalog.data.DataRepository dataRepository;
    @org.jetbrains.annotations.NotNull()
    private final com.example.movie_catalog.entity.ErrorApp errorApp = null;
    @org.jetbrains.annotations.Nullable()
    private com.example.movie_catalog.entity.Person localPerson;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> _linkers;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> linkers;
    
    @javax.inject.Inject()
    public PersonViewModel(@org.jetbrains.annotations.NotNull()
    com.example.movie_catalog.data.DataRepository dataRepository, @org.jetbrains.annotations.NotNull()
    com.example.movie_catalog.entity.ErrorApp errorApp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.entity.Linker>> getLinkers() {
        return null;
    }
    
    public final void setLinkers(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> p0) {
    }
    
    private final void getPerson(com.example.movie_catalog.entity.Person person) {
    }
    
    private final void takePerson() {
    }
    
    public final void putPerson() {
    }
    
    public final void putFilm(@org.jetbrains.annotations.NotNull()
    com.example.movie_catalog.entity.Film film) {
    }
    
    public final void putKit(@org.jetbrains.annotations.NotNull()
    com.example.movie_catalog.entity.enumApp.Kit kit) {
    }
}