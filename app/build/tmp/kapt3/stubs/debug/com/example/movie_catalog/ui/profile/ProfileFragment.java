package com.example.movie_catalog.ui.profile;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0017J\b\u0010&\u001a\u00020\u0014H\u0016J\b\u0010\'\u001a\u00020\u0014H\u0016J\u001a\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J4\u0010*\u001a\u00020\u00142\u0006\u0010)\u001a\u00020+2\u0006\u0010,\u001a\u00020\t2\u0012\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0.2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u00101\u001a\u00020\u0014H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/example/movie_catalog/ui/profile/ProfileFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/movie_catalog/databinding/FragmentProfileBinding;", "binding", "getBinding", "()Lcom/example/movie_catalog/databinding/FragmentProfileBinding;", "bookmarkAdapter", "Lcom/example/movie_catalog/ui/recycler/ListFilmAdapter;", "collectionAdapter", "Lcom/example/movie_catalog/ui/recycler/SimpleAdapterAny;", "viewModel", "Lcom/example/movie_catalog/ui/profile/ProfileViewModel;", "getViewModel", "()Lcom/example/movie_catalog/ui/profile/ProfileViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewedAdapter", "onClickCleaViewed", "", "onClickClearCollection", "kit", "Lcom/example/movie_catalog/entity/enumApp/Kit;", "onClickCollection", "item", "", "onClickItem", "film", "Lcom/example/movie_catalog/entity/Film;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onStart", "onViewCreated", "view", "processingView", "Lcom/example/movie_catalog/databinding/IncludeListFilmBinding;", "adapter", "flowFilms", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/example/movie_catalog/entity/Linker;", "processingViewCollection", "app_debug"})
public final class ProfileFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.example.movie_catalog.databinding.FragmentProfileBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.movie_catalog.ui.recycler.ListFilmAdapter viewedAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.movie_catalog.ui.recycler.ListFilmAdapter bookmarkAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.movie_catalog.ui.recycler.SimpleAdapterAny collectionAdapter = null;
    
    public ProfileFragment() {
        super();
    }
    
    private final com.example.movie_catalog.databinding.FragmentProfileBinding getBinding() {
        return null;
    }
    
    private final com.example.movie_catalog.ui.profile.ProfileViewModel getViewModel() {
        return null;
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
    
    private final void processingView(com.example.movie_catalog.databinding.IncludeListFilmBinding view, com.example.movie_catalog.ui.recycler.ListFilmAdapter adapter, kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.movie_catalog.entity.Linker>> flowFilms, com.example.movie_catalog.entity.enumApp.Kit kit) {
    }
    
    private final void processingViewCollection() {
    }
    
    private final void onClickCollection(java.lang.Object item) {
    }
    
    private final void onClickItem(com.example.movie_catalog.entity.Film film) {
    }
    
    private final void onClickClearCollection(com.example.movie_catalog.entity.enumApp.Kit kit) {
    }
    
    private final void onClickCleaViewed() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}