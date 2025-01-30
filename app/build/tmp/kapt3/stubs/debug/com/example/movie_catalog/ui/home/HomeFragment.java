package com.example.movie_catalog.ui.home;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0017J\b\u0010\"\u001a\u00020\u0016H\u0016J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%H\u0002J\u001a\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J4\u0010(\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000f2\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0,2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010/\u001a\u00020\u0016H\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/example/movie_catalog/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/movie_catalog/databinding/FragmentHomeBinding;", "binding", "getBinding", "()Lcom/example/movie_catalog/databinding/FragmentHomeBinding;", "homeViewModel", "Lcom/example/movie_catalog/ui/home/HomeViewModel;", "getHomeViewModel", "()Lcom/example/movie_catalog/ui/home/HomeViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "popularAdapter", "Lcom/example/movie_catalog/ui/recycler/ListFilmAdapter;", "premieresAdapter", "random1Adapter", "random2Adapter", "serialAdapter", "top250Adapter", "onClickAll", "", "kit", "Lcom/example/movie_catalog/entity/enumApp/Kit;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onItemClick", "film", "Lcom/example/movie_catalog/entity/Film;", "onViewCreated", "view", "processingView", "Lcom/example/movie_catalog/databinding/IncludeListFilmBinding;", "adapter", "flowFilms", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/example/movie_catalog/entity/Linker;", "setNameRandomKit", "Companion", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.example.movie_catalog.databinding.FragmentHomeBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy homeViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.movie_catalog.ui.recycler.ListFilmAdapter premieresAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.movie_catalog.ui.recycler.ListFilmAdapter popularAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.movie_catalog.ui.recycler.ListFilmAdapter top250Adapter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.movie_catalog.ui.recycler.ListFilmAdapter random1Adapter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.movie_catalog.ui.recycler.ListFilmAdapter random2Adapter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.movie_catalog.ui.recycler.ListFilmAdapter serialAdapter = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.movie_catalog.ui.home.HomeFragment.Companion Companion = null;
    
    public HomeFragment() {
        super();
    }
    
    private final com.example.movie_catalog.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    private final com.example.movie_catalog.ui.home.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"CutPasteId", "UseCompatLoadingForDrawables"})
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void setNameRandomKit() {
    }
    
    private final void processingView(com.example.movie_catalog.databinding.IncludeListFilmBinding view, com.example.movie_catalog.ui.recycler.ListFilmAdapter adapter, kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> flowFilms, com.example.movie_catalog.entity.enumApp.Kit kit) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void onItemClick(com.example.movie_catalog.entity.Film film) {
    }
    
    private final void onClickAll(com.example.movie_catalog.entity.enumApp.Kit kit) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/movie_catalog/ui/home/HomeFragment$Companion;", "", "()V", "newInstance", "Lcom/example/movie_catalog/ui/home/HomeFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.movie_catalog.ui.home.HomeFragment newInstance() {
            return null;
        }
    }
}