package com.example.movie_catalog.ui.recycler;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Ba\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b\u0012!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0017J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0004H\u0016J\u0016\u0010$\u001a\u00020\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/example/movie_catalog/ui/recycler/ListFilmAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "quantityItem", "", "mode", "Lcom/example/movie_catalog/entity/enumApp/ModeViewer;", "onClick", "Lkotlin/Function1;", "Lcom/example/movie_catalog/entity/Film;", "Lkotlin/ParameterName;", "name", "film", "", "onClickLast", "Lcom/example/movie_catalog/entity/enumApp/Kit;", "kit", "(ILcom/example/movie_catalog/entity/enumApp/ModeViewer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "contextClass", "Landroid/content/Context;", "getContextClass", "()Landroid/content/Context;", "setContextClass", "(Landroid/content/Context;)V", "linkers", "", "Lcom/example/movie_catalog/entity/Linker;", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setListFilm", "listLinker", "app_debug"})
public final class ListFilmAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final int quantityItem = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.movie_catalog.entity.enumApp.ModeViewer mode = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.example.movie_catalog.entity.Film, kotlin.Unit> onClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.example.movie_catalog.entity.enumApp.Kit, kotlin.Unit> onClickLast = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.movie_catalog.entity.Linker> linkers;
    public android.content.Context contextClass;
    
    @javax.inject.Inject()
    public ListFilmAdapter(int quantityItem, @org.jetbrains.annotations.NotNull()
    com.example.movie_catalog.entity.enumApp.ModeViewer mode, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.movie_catalog.entity.Film, kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.movie_catalog.entity.enumApp.Kit, kotlin.Unit> onClickLast) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContextClass() {
        return null;
    }
    
    public final void setContextClass(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setListFilm(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.movie_catalog.entity.Linker> listLinker) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables", "SetTextI18n"})
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
}