package com.example.movie_catalog.data.api.home.getKit;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/example/movie_catalog/data/api/home/getKit/ListGenresDTO;", "", "genres", "", "Lcom/example/movie_catalog/data/api/home/getKit/GenreIdDTO;", "countries", "Lcom/example/movie_catalog/data/api/home/getKit/CountryIdDTO;", "(Ljava/util/List;Ljava/util/List;)V", "getCountries", "()Ljava/util/List;", "getGenres", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class ListGenresDTO {
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.example.movie_catalog.data.api.home.getKit.GenreIdDTO> genres = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.example.movie_catalog.data.api.home.getKit.CountryIdDTO> countries = null;
    
    public ListGenresDTO(@com.squareup.moshi.Json(name = "genres")
    @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.movie_catalog.data.api.home.getKit.GenreIdDTO> genres, @com.squareup.moshi.Json(name = "countries")
    @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.movie_catalog.data.api.home.getKit.CountryIdDTO> countries) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.movie_catalog.data.api.home.getKit.GenreIdDTO> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.movie_catalog.data.api.home.getKit.CountryIdDTO> getCountries() {
        return null;
    }
    
    public ListGenresDTO() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.movie_catalog.data.api.home.getKit.GenreIdDTO> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.movie_catalog.data.api.home.getKit.CountryIdDTO> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie_catalog.data.api.home.getKit.ListGenresDTO copy(@com.squareup.moshi.Json(name = "genres")
    @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.movie_catalog.data.api.home.getKit.GenreIdDTO> genres, @com.squareup.moshi.Json(name = "countries")
    @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.movie_catalog.data.api.home.getKit.CountryIdDTO> countries) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}