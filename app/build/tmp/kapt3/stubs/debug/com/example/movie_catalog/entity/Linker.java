package com.example.movie_catalog.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nH\u00c6\u0003JE\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020*H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f\u00a8\u0006+"}, d2 = {"Lcom/example/movie_catalog/entity/Linker;", "", "film", "Lcom/example/movie_catalog/entity/Film;", "similarFilm", "person", "Lcom/example/movie_catalog/entity/Person;", "profKey", "Lcom/example/movie_catalog/entity/enumApp/ProfKey;", "kit", "Lcom/example/movie_catalog/entity/enumApp/Kit;", "(Lcom/example/movie_catalog/entity/Film;Lcom/example/movie_catalog/entity/Film;Lcom/example/movie_catalog/entity/Person;Lcom/example/movie_catalog/entity/enumApp/ProfKey;Lcom/example/movie_catalog/entity/enumApp/Kit;)V", "getFilm", "()Lcom/example/movie_catalog/entity/Film;", "setFilm", "(Lcom/example/movie_catalog/entity/Film;)V", "getKit", "()Lcom/example/movie_catalog/entity/enumApp/Kit;", "setKit", "(Lcom/example/movie_catalog/entity/enumApp/Kit;)V", "getPerson", "()Lcom/example/movie_catalog/entity/Person;", "setPerson", "(Lcom/example/movie_catalog/entity/Person;)V", "getProfKey", "()Lcom/example/movie_catalog/entity/enumApp/ProfKey;", "setProfKey", "(Lcom/example/movie_catalog/entity/enumApp/ProfKey;)V", "getSimilarFilm", "setSimilarFilm", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class Linker {
    @org.jetbrains.annotations.Nullable
    private com.example.movie_catalog.entity.Film film;
    @org.jetbrains.annotations.Nullable
    private com.example.movie_catalog.entity.Film similarFilm;
    @org.jetbrains.annotations.Nullable
    private com.example.movie_catalog.entity.Person person;
    @org.jetbrains.annotations.Nullable
    private com.example.movie_catalog.entity.enumApp.ProfKey profKey;
    @org.jetbrains.annotations.Nullable
    private com.example.movie_catalog.entity.enumApp.Kit kit;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.entity.Linker copy(@org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.Film film, @org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.Film similarFilm, @org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.Person person, @org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.enumApp.ProfKey profKey, @org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.enumApp.Kit kit) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Linker() {
        super();
    }
    
    public Linker(@org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.Film film, @org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.Film similarFilm, @org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.Person person, @org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.enumApp.ProfKey profKey, @org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.enumApp.Kit kit) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.entity.Film component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.entity.Film getFilm() {
        return null;
    }
    
    public final void setFilm(@org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.Film p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.entity.Film component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.entity.Film getSimilarFilm() {
        return null;
    }
    
    public final void setSimilarFilm(@org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.Film p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.entity.Person component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.entity.Person getPerson() {
        return null;
    }
    
    public final void setPerson(@org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.Person p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.entity.enumApp.ProfKey component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.entity.enumApp.ProfKey getProfKey() {
        return null;
    }
    
    public final void setProfKey(@org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.enumApp.ProfKey p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.entity.enumApp.Kit component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.entity.enumApp.Kit getKit() {
        return null;
    }
    
    public final void setKit(@org.jetbrains.annotations.Nullable
    com.example.movie_catalog.entity.enumApp.Kit p0) {
    }
}