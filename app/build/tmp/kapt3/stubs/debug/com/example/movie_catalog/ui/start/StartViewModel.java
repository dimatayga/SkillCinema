package com.example.movie_catalog.ui.start;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/example/movie_catalog/ui/start/StartViewModel;", "Landroidx/lifecycle/ViewModel;", "dataRepository", "Lcom/example/movie_catalog/data/DataRepository;", "errorApp", "Lcom/example/movie_catalog/entity/ErrorApp;", "(Lcom/example/movie_catalog/data/DataRepository;Lcom/example/movie_catalog/entity/ErrorApp;)V", "_listImage", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/movie_catalog/entity/ImageStart;", "listImage", "Lkotlinx/coroutines/flow/StateFlow;", "getListImage", "()Lkotlinx/coroutines/flow/StateFlow;", "setListImage", "(Lkotlinx/coroutines/flow/StateFlow;)V", "getImages", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class StartViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.movie_catalog.data.DataRepository dataRepository;
    @org.jetbrains.annotations.NotNull()
    private final com.example.movie_catalog.entity.ErrorApp errorApp = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.movie_catalog.entity.ImageStart>> _listImage;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.ImageStart>> listImage;
    
    @javax.inject.Inject()
    public StartViewModel(@org.jetbrains.annotations.NotNull()
    com.example.movie_catalog.data.DataRepository dataRepository, @org.jetbrains.annotations.NotNull()
    com.example.movie_catalog.entity.ErrorApp errorApp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.movie_catalog.entity.ImageStart>> getListImage() {
        return null;
    }
    
    public final void setListImage(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.ImageStart>> p0) {
    }
    
    private final void getImages() {
    }
}