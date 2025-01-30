package com.example.movie_catalog.data.room.tables;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007J\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u00040\u000b\"\u0006\b\u0000\u0010\f\u0018\u0001H\u0082\bJ\u001a\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010\u000f\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004H\u0007J\u001a\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010\u0012\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004H\u0007J\u001a\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010\u0015\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0004H\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/example/movie_catalog/data/room/tables/ConverterForFilmDB;", "", "()V", "countryFromJSON", "", "Lcom/example/movie_catalog/entity/Country;", "sourceStr", "", "countryToJSON", "source", "createAdapter", "Lcom/squareup/moshi/JsonAdapter;", "T", "genreFromJSON", "Lcom/example/movie_catalog/entity/Genre;", "genreToJSON", "imageFromJSON", "Lcom/example/movie_catalog/entity/filminfo/ImageFilm;", "imageToJSON", "seasonFromJSON", "Lcom/example/movie_catalog/data/api/home/seasons/SeasonDTO;", "seasonToJSON", "Companion", "app_debug"})
public final class ConverterForFilmDB {
    @org.jetbrains.annotations.NotNull()
    private static com.squareup.moshi.Moshi moshi;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.movie_catalog.data.room.tables.ConverterForFilmDB.Companion Companion = null;
    
    public ConverterForFilmDB() {
        super();
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String countryToJSON(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.movie_catalog.entity.Country> source) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.movie_catalog.entity.Country> countryFromJSON(@org.jetbrains.annotations.Nullable()
    java.lang.String sourceStr) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String genreToJSON(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.movie_catalog.entity.Genre> source) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.movie_catalog.entity.Genre> genreFromJSON(@org.jetbrains.annotations.Nullable()
    java.lang.String sourceStr) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String imageToJSON(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.movie_catalog.entity.filminfo.ImageFilm> source) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.movie_catalog.entity.filminfo.ImageFilm> imageFromJSON(@org.jetbrains.annotations.Nullable()
    java.lang.String sourceStr) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String seasonToJSON(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.movie_catalog.data.api.home.seasons.SeasonDTO> source) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.movie_catalog.data.api.home.seasons.SeasonDTO> seasonFromJSON(@org.jetbrains.annotations.Nullable()
    java.lang.String sourceStr) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/movie_catalog/data/room/tables/ConverterForFilmDB$Companion;", "", "()V", "moshi", "Lcom/squareup/moshi/Moshi;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}