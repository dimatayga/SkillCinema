package com.example.movie_catalog.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'J\u0016\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000bJ\u0016\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.2\u0006\u0010+\u001a\u00020\u000bJ\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001e0/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u000fJ\u000e\u0010,\u001a\u00020%2\u0006\u00103\u001a\u000204J\u0016\u0010,\u001a\u00020%2\u0006\u00105\u001a\u0002062\u0006\u00102\u001a\u00020\u000fJ\u0014\u0010,\u001a\u00020%2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000b0/J\u001e\u00107\u001a\u00020%2\u0006\u0010+\u001a\u00020\u000b2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;J\u0010\u0010<\u001a\u00020%2\u0006\u0010+\u001a\u00020\u000bH\u0002J\u0018\u0010<\u001a\u00020%2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000bH\u0002J \u0010<\u001a\u00020%2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\rH\u0002J\u0018\u0010<\u001a\u00020%2\u0006\u0010+\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000fH\u0002J\u001c\u0010?\u001a\u00020%2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020A0/2\u0006\u0010+\u001a\u00020\u000bJ\u000e\u0010B\u001a\u00020%2\u0006\u0010C\u001a\u00020DJ\u0006\u0010E\u001a\u00020%J\u000e\u0010F\u001a\u00020%2\u0006\u0010+\u001a\u00020\u000bJ\u000e\u0010G\u001a\u00020%2\u0006\u0010H\u001a\u00020\rJ\u000e\u0010I\u001a\u00020%2\u0006\u00102\u001a\u00020\u000fJ\u000e\u0010J\u001a\u00020%2\u0006\u0010=\u001a\u00020\u0011J\u000e\u0010K\u001a\u00020%2\u0006\u0010L\u001a\u00020#J\u0006\u0010M\u001a\u00020%J\b\u0010N\u001a\u0004\u0018\u00010\u000bJ\b\u0010O\u001a\u0004\u0018\u00010\rJ\b\u0010P\u001a\u0004\u0018\u00010\u000fJ\b\u0010Q\u001a\u0004\u0018\u00010\u0011J\u0006\u0010R\u001a\u00020#R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006S"}, d2 = {"Lcom/example/movie_catalog/entity/DataCentre;", "", "()V", "countries", "", "Lcom/example/movie_catalog/data/api/home/getKit/CountryIdDTO;", "getCountries", "()Ljava/util/List;", "setCountries", "(Ljava/util/List;)V", "currentFilm", "Lcom/example/movie_catalog/entity/Film;", "currentJobPerson", "", "currentKit", "Lcom/example/movie_catalog/entity/enumApp/Kit;", "currentPerson", "Lcom/example/movie_catalog/entity/Person;", "films", "getFilms", "setFilms", "genres", "Lcom/example/movie_catalog/data/api/home/getKit/GenreIdDTO;", "getGenres", "setGenres", "headers", "Ljava/util/HashMap;", "getHeaders", "()Ljava/util/HashMap;", "linkers", "Lcom/example/movie_catalog/entity/Linker;", "getLinkers", "setLinkers", "persons", "searchFilter", "Lcom/example/movie_catalog/entity/SearchFilter;", "addCountryGenres", "", "listDTO", "Lcom/example/movie_catalog/data/api/home/getKit/ListGenresDTO;", "addFilm", "filmInfo", "Lcom/example/movie_catalog/entity/filminfo/InfoFilmSeasons;", "film", "addFilms", "similar", "Lcom/example/movie_catalog/data/api/film_info/SimilarDTO;", "", "filterDTO", "Lcom/example/movie_catalog/data/api/home/filter/FilterDTO;", "kit", "listFilm", "Lcom/example/movie_catalog/data/api/home/premieres/PremieresDTO;", "topFilmsDTO", "Lcom/example/movie_catalog/data/api/home/top/TopFilmsDTO;", "addImage", "tab", "Lcom/example/movie_catalog/entity/enumApp/ImageGroup;", "filmImageDTO", "Lcom/example/movie_catalog/data/api/film_info/FilmImageDTO;", "addLinker", "person", "profKey", "addPerson", "personsDTO", "Lcom/example/movie_catalog/data/api/film_info/PersonDTO;", "addPersonInfo", "personInfo", "Lcom/example/movie_catalog/data/api/person/PersonInfoDTO;", "clearViewedFilms", "putFilm", "putJobPerson", "id", "putKit", "putPerson", "putSearchFilter", "it", "setApiKey", "takeFilm", "takeJobPerson", "takeKit", "takePerson", "takeSearchFilter", "app_debug"})
public final class DataCentre {
    @org.jetbrains.annotations.NotNull
    public static final com.example.movie_catalog.entity.DataCentre INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    private static java.util.List<com.example.movie_catalog.entity.Film> films;
    private static java.util.List<com.example.movie_catalog.entity.Person> persons;
    @org.jetbrains.annotations.NotNull
    private static java.util.List<com.example.movie_catalog.entity.Linker> linkers;
    @org.jetbrains.annotations.NotNull
    private static java.util.List<com.example.movie_catalog.data.api.home.getKit.CountryIdDTO> countries;
    @org.jetbrains.annotations.NotNull
    private static java.util.List<com.example.movie_catalog.data.api.home.getKit.GenreIdDTO> genres;
    @org.jetbrains.annotations.NotNull
    private static final java.util.HashMap<java.lang.String, java.lang.String> headers = null;
    private static java.lang.String currentJobPerson;
    private static com.example.movie_catalog.entity.enumApp.Kit currentKit;
    private static com.example.movie_catalog.entity.Film currentFilm;
    private static com.example.movie_catalog.entity.Person currentPerson;
    private static com.example.movie_catalog.entity.SearchFilter searchFilter;
    
    private DataCentre() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.entity.Film> getFilms() {
        return null;
    }
    
    public final void setFilms(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.entity.Film> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.entity.Linker> getLinkers() {
        return null;
    }
    
    public final void setLinkers(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.entity.Linker> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.data.api.home.getKit.CountryIdDTO> getCountries() {
        return null;
    }
    
    public final void setCountries(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.data.api.home.getKit.CountryIdDTO> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.data.api.home.getKit.GenreIdDTO> getGenres() {
        return null;
    }
    
    public final void setGenres(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.data.api.home.getKit.GenreIdDTO> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.HashMap<java.lang.String, java.lang.String> getHeaders() {
        return null;
    }
    
    public final void setApiKey() {
    }
    
    public final void addFilms(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.entity.Film> listFilm) {
    }
    
    public final void addFilms(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.home.premieres.PremieresDTO listFilm) {
    }
    
    public final void addFilms(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.home.top.TopFilmsDTO topFilmsDTO, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.Kit kit) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.movie_catalog.entity.Linker> addFilms(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.home.filter.FilterDTO filterDTO, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.Kit kit) {
        return null;
    }
    
    public final void addFilms(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.film_info.SimilarDTO similar, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Film film) {
    }
    
    public final void addFilm(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.filminfo.InfoFilmSeasons filmInfo, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Film film) {
    }
    
    public final void addPerson(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.movie_catalog.data.api.film_info.PersonDTO> personsDTO, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Film film) {
    }
    
    public final void addImage(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Film film, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.ImageGroup tab, @org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.film_info.FilmImageDTO filmImageDTO) {
    }
    
    public final void addPersonInfo(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.person.PersonInfoDTO personInfo) {
    }
    
    private final void addLinker(com.example.movie_catalog.entity.Film film) {
    }
    
    private final void addLinker(com.example.movie_catalog.entity.Film film, com.example.movie_catalog.entity.enumApp.Kit kit) {
    }
    
    private final void addLinker(com.example.movie_catalog.entity.Film film, com.example.movie_catalog.entity.Film similar) {
    }
    
    private final void addLinker(com.example.movie_catalog.entity.Film film, com.example.movie_catalog.entity.Person person, java.lang.String profKey) {
    }
    
    public final void clearViewedFilms() {
    }
    
    public final void addCountryGenres(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.data.api.home.getKit.ListGenresDTO listDTO) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.entity.Film takeFilm() {
        return null;
    }
    
    public final void putFilm(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Film film) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.entity.Person takePerson() {
        return null;
    }
    
    public final void putPerson(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.Person person) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.movie_catalog.entity.enumApp.Kit takeKit() {
        return null;
    }
    
    public final void putKit(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.enumApp.Kit kit) {
    }
    
    public final void putSearchFilter(@org.jetbrains.annotations.NotNull
    com.example.movie_catalog.entity.SearchFilter it) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.movie_catalog.entity.SearchFilter takeSearchFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String takeJobPerson() {
        return null;
    }
    
    public final void putJobPerson(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
    }
}