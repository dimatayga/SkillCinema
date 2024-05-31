package com.example.movie_catalog.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\nH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/movie_catalog/entity/ErrorApp;", "", "dataRepository", "Lcom/example/movie_catalog/data/DataRepository;", "cont", "Landroid/content/Context;", "(Lcom/example/movie_catalog/data/DataRepository;Landroid/content/Context;)V", "getCont", "()Landroid/content/Context;", "errorApi", "", "errorMessage", "", "setNewKeyApi", "app_debug"})
public final class ErrorApp {
    private com.example.movie_catalog.data.DataRepository dataRepository;
    @org.jetbrains.annotations.NotNull
    private final android.content.Context cont = null;
    
    @javax.inject.Inject
    public ErrorApp(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.DataRepository dataRepository, @org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context cont) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getCont() {
        return null;
    }
    
    public final void errorApi(@org.jetbrains.annotations.NotNull
    java.lang.String errorMessage) {
    }
    
    private final void setNewKeyApi() {
    }
}