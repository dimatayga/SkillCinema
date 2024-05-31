package com.example.movie_catalog.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f\u00a2\u0006\u0002\u0010\u0013J\u0010\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00a6\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010A\u001a\u00020\u0003H\u00d6\u0001J\t\u0010B\u001a\u00020\u0005H\u00d6\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b&\u0010\u001e\"\u0004\b\'\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0015R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001c\u00a8\u0006C"}, d2 = {"Lcom/example/movie_catalog/entity/Person;", "", "personId", "", "nameRu", "", "nameEn", "posterUrl", "age", "hasAwards", "profession", "professionKey", "professionText", "description", "tabs", "", "Lcom/example/movie_catalog/entity/enumApp/ProfKey;", "films", "Lcom/example/movie_catalog/entity/Film;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAge", "()Ljava/lang/String;", "setAge", "(Ljava/lang/String;)V", "getDescription", "getFilms", "()Ljava/util/List;", "setFilms", "(Ljava/util/List;)V", "getHasAwards", "()Ljava/lang/Integer;", "setHasAwards", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getNameEn", "setNameEn", "getNameRu", "setNameRu", "getPersonId", "setPersonId", "getPosterUrl", "setPosterUrl", "getProfession", "setProfession", "getProfessionKey", "getProfessionText", "getTabs", "setTabs", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/example/movie_catalog/entity/Person;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Person {
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer personId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String nameRu;
    @org.jetbrains.annotations.Nullable
    private java.lang.String nameEn;
    @org.jetbrains.annotations.Nullable
    private java.lang.String posterUrl;
    @org.jetbrains.annotations.Nullable
    private java.lang.String age;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer hasAwards;
    @org.jetbrains.annotations.Nullable
    private java.lang.String profession;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String professionKey = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String professionText = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.movie_catalog.entity.enumApp.ProfKey> tabs;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.movie_catalog.entity.Film> films;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.entity.Person copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer personId, @org.jetbrains.annotations.Nullable
    java.lang.String nameRu, @org.jetbrains.annotations.Nullable
    java.lang.String nameEn, @org.jetbrains.annotations.Nullable
    java.lang.String posterUrl, @org.jetbrains.annotations.Nullable
    java.lang.String age, @org.jetbrains.annotations.Nullable
    java.lang.Integer hasAwards, @org.jetbrains.annotations.Nullable
    java.lang.String profession, @org.jetbrains.annotations.Nullable
    java.lang.String professionKey, @org.jetbrains.annotations.Nullable
    java.lang.String professionText, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.entity.enumApp.ProfKey> tabs, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.entity.Film> films) {
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
    
    public Person() {
        super();
    }
    
    public Person(@org.jetbrains.annotations.Nullable
    java.lang.Integer personId, @org.jetbrains.annotations.Nullable
    java.lang.String nameRu, @org.jetbrains.annotations.Nullable
    java.lang.String nameEn, @org.jetbrains.annotations.Nullable
    java.lang.String posterUrl, @org.jetbrains.annotations.Nullable
    java.lang.String age, @org.jetbrains.annotations.Nullable
    java.lang.Integer hasAwards, @org.jetbrains.annotations.Nullable
    java.lang.String profession, @org.jetbrains.annotations.Nullable
    java.lang.String professionKey, @org.jetbrains.annotations.Nullable
    java.lang.String professionText, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.entity.enumApp.ProfKey> tabs, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.entity.Film> films) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPersonId() {
        return null;
    }
    
    public final void setPersonId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNameRu() {
        return null;
    }
    
    public final void setNameRu(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNameEn() {
        return null;
    }
    
    public final void setNameEn(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPosterUrl() {
        return null;
    }
    
    public final void setPosterUrl(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAge() {
        return null;
    }
    
    public final void setAge(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getHasAwards() {
        return null;
    }
    
    public final void setHasAwards(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getProfession() {
        return null;
    }
    
    public final void setProfession(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getProfessionKey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getProfessionText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.entity.enumApp.ProfKey> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.entity.enumApp.ProfKey> getTabs() {
        return null;
    }
    
    public final void setTabs(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.entity.enumApp.ProfKey> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.entity.Film> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.entity.Film> getFilms() {
        return null;
    }
    
    public final void setFilms(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.entity.Film> p0) {
    }
}