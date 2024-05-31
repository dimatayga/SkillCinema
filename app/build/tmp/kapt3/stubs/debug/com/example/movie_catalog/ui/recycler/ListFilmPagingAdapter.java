package com.example.movie_catalog.ui.recycler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0017J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/movie_catalog/ui/recycler/ListFilmPagingAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/movie_catalog/entity/Linker;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mode", "Lcom/example/movie_catalog/entity/enumApp/ModeViewer;", "onClick", "Lkotlin/Function1;", "Lcom/example/movie_catalog/entity/Film;", "", "(Lcom/example/movie_catalog/entity/enumApp/ModeViewer;Lkotlin/jvm/functions/Function1;)V", "contextClass", "Landroid/content/Context;", "getItemViewType", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class ListFilmPagingAdapter extends androidx.paging.PagingDataAdapter<com.example.movie_catalog.entity.Linker, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.example.movie_catalog.entity.enumApp.ModeViewer mode = null;
    private final kotlin.jvm.functions.Function1<com.example.movie_catalog.entity.Film, kotlin.Unit> onClick = null;
    private android.content.Context contextClass;
    
    @javax.inject.Inject
    public ListFilmPagingAdapter(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.ModeViewer mode, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.movie_catalog.entity.Film, kotlin.Unit> onClick) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables", "SetTextI18n"})
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
}