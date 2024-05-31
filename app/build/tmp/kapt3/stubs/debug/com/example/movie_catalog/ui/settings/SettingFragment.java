package com.example.movie_catalog.ui.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0003J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0003J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0011H\u0016J\u001a\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0017J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020(H\u0002J\u0018\u0010)\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0019H\u0002J\b\u0010+\u001a\u00020\u0011H\u0003J\b\u0010,\u001a\u00020\u0011H\u0003J\b\u0010-\u001a\u00020\u0011H\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006/"}, d2 = {"Lcom/example/movie_catalog/ui/settings/SettingFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/movie_catalog/databinding/FragmentSettingsBinding;", "binding", "getBinding", "()Lcom/example/movie_catalog/databinding/FragmentSettingsBinding;", "bottomSheetDialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "viewModel", "Lcom/example/movie_catalog/ui/settings/SettingsViewModel;", "getViewModel", "()Lcom/example/movie_catalog/ui/settings/SettingsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onClickCountry", "", "country", "Lcom/example/movie_catalog/data/api/home/getKit/CountryIdDTO;", "onClickGenre", "genre", "Lcom/example/movie_catalog/data/api/home/getKit/GenreIdDTO;", "onClickYear1", "year", "", "onClickYear2", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "scrollLeft", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "scrollRight", "countItem", "showBottomSheetCountrySelect", "showBottomSheetGenreSelect", "showBottomSheetYearsSelect", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class SettingFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.movie_catalog.databinding.FragmentSettingsBinding _binding;
    private com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog;
    @org.jetbrains.annotations.NotNull
    public static final com.example.movie_catalog.ui.settings.SettingFragment.Companion Companion = null;
    
    public SettingFragment() {
        super();
    }
    
    private final com.example.movie_catalog.ui.settings.SettingsViewModel getViewModel() {
        return null;
    }
    
    private final com.example.movie_catalog.databinding.FragmentSettingsBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables", "SetTextI18n"})
    private final void showBottomSheetYearsSelect() {
    }
    
    private final void scrollLeft(androidx.recyclerview.widget.RecyclerView recycler) {
    }
    
    private final void scrollRight(androidx.recyclerview.widget.RecyclerView recycler, int countItem) {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    private final void showBottomSheetCountrySelect() {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    private final void showBottomSheetGenreSelect() {
    }
    
    private final void onClickCountry(com.example.movie_catalog.data.api.home.getKit.CountryIdDTO country) {
    }
    
    private final void onClickGenre(com.example.movie_catalog.data.api.home.getKit.GenreIdDTO genre) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void onClickYear1(int year) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void onClickYear2(int year) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/movie_catalog/ui/settings/SettingFragment$Companion;", "", "()V", "newInstance", "Lcom/example/movie_catalog/ui/home/HomeFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.movie_catalog.ui.home.HomeFragment newInstance() {
            return null;
        }
    }
}