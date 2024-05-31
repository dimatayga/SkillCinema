package com.example.movie_catalog.ui.film_page;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0003J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0002J$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0017J\b\u0010)\u001a\u00020\u0018H\u0016J\b\u0010*\u001a\u00020\u0018H\u0002J\u0010\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u001aH\u0002J\u001a\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020\"2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u00102\u001a\u00020\u0018H\u0003J\b\u00103\u001a\u00020\u0018H\u0003J\b\u00104\u001a\u00020\u0018H\u0003J\u0010\u00105\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u001aH\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u00067"}, d2 = {"Lcom/example/movie_catalog/ui/film_page/FilmPageFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/movie_catalog/databinding/FragmentFilmPageBinding;", "actorAdapter", "Lcom/example/movie_catalog/ui/recycler/PersonsAdapter;", "binding", "getBinding", "()Lcom/example/movie_catalog/databinding/FragmentFilmPageBinding;", "galleryAdapter", "Lcom/example/movie_catalog/ui/recycler/SimpleAdapterAny;", "isCollapsed", "", "similarAdapter", "Lcom/example/movie_catalog/ui/recycler/ListFilmAdapter;", "staffAdapter", "viewModel", "Lcom/example/movie_catalog/ui/film_page/FilmPageViewModel;", "getViewModel", "()Lcom/example/movie_catalog/ui/film_page/FilmPageViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "fillPage", "", "filmInfo", "Lcom/example/movie_catalog/entity/Film;", "onClickAll", "kit", "Lcom/example/movie_catalog/entity/enumApp/Kit;", "onClickChecked", "collection", "Lcom/example/movie_catalog/data/room/tables/CollectionDB;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onImageClick", "onPersonClick", "person", "Lcom/example/movie_catalog/entity/Person;", "onSimilarClick", "film", "onViewCreated", "view", "processingGallery", "processingPerson", "processingSimilar", "showBottomSheetDialog", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class FilmPageFragment extends androidx.fragment.app.Fragment {
    private com.example.movie_catalog.databinding.FragmentFilmPageBinding _binding;
    private final com.example.movie_catalog.ui.recycler.PersonsAdapter actorAdapter = null;
    private final com.example.movie_catalog.ui.recycler.PersonsAdapter staffAdapter = null;
    private final com.example.movie_catalog.ui.recycler.SimpleAdapterAny galleryAdapter = null;
    private final com.example.movie_catalog.ui.recycler.ListFilmAdapter similarAdapter = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean isCollapsed = false;
    @org.jetbrains.annotations.NotNull
    public static final com.example.movie_catalog.ui.film_page.FilmPageFragment.Companion Companion = null;
    
    public FilmPageFragment() {
        super();
    }
    
    private final com.example.movie_catalog.databinding.FragmentFilmPageBinding getBinding() {
        return null;
    }
    
    private final com.example.movie_catalog.ui.film_page.FilmPageViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"CutPasteId", "UseCompatLoadingForDrawables"})
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n", "ResourceType"})
    private final void fillPage(com.example.movie_catalog.entity.Film filmInfo) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void processingPerson() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void processingGallery() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void processingSimilar() {
    }
    
    private final void onPersonClick(com.example.movie_catalog.entity.Person person) {
    }
    
    private final void onImageClick() {
    }
    
    private final void onSimilarClick(com.example.movie_catalog.entity.Film film) {
    }
    
    private final void onClickAll(com.example.movie_catalog.entity.enumApp.Kit kit) {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    private final void showBottomSheetDialog(com.example.movie_catalog.entity.Film film) {
    }
    
    private final void onClickChecked(com.example.movie_catalog.data.room.tables.CollectionDB collection) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/movie_catalog/ui/film_page/FilmPageFragment$Companion;", "", "()V", "newInstance", "Lcom/example/movie_catalog/ui/film_page/FilmPageFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.movie_catalog.ui.film_page.FilmPageFragment newInstance() {
            return null;
        }
    }
}