package com.example.movie_catalog.data.api.film_info;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J,\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/example/movie_catalog/data/api/film_info/SimilarDTO;", "", "total", "", "items", "", "Lcom/example/movie_catalog/data/api/film_info/SimilarItemDTO;", "(Ljava/lang/Integer;Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "getTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/example/movie_catalog/data/api/film_info/SimilarDTO;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class SimilarDTO {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer total = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.example.movie_catalog.data.api.film_info.SimilarItemDTO> items = null;
    
    public SimilarDTO(@com.squareup.moshi.Json(name = "total")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer total, @com.squareup.moshi.Json(name = "items")
    @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.movie_catalog.data.api.film_info.SimilarItemDTO> items) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.movie_catalog.data.api.film_info.SimilarItemDTO> getItems() {
        return null;
    }
    
    public SimilarDTO() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.movie_catalog.data.api.film_info.SimilarItemDTO> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie_catalog.data.api.film_info.SimilarDTO copy(@com.squareup.moshi.Json(name = "total")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer total, @com.squareup.moshi.Json(name = "items")
    @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.movie_catalog.data.api.film_info.SimilarItemDTO> items) {
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