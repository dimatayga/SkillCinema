package com.example.movie_catalog.data.room.tables;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/example/movie_catalog/data/room/tables/CollectionDB;", "", "idCollection", "", "collection", "Lcom/example/movie_catalog/entity/Collection;", "(ILcom/example/movie_catalog/entity/Collection;)V", "getCollection", "()Lcom/example/movie_catalog/entity/Collection;", "setCollection", "(Lcom/example/movie_catalog/entity/Collection;)V", "getIdCollection", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
@androidx.room.Entity(tableName = "collections", indices = {@androidx.room.Index(value = {"name"}, unique = true)})
public final class CollectionDB {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int idCollection = 0;
    @androidx.room.Embedded()
    @org.jetbrains.annotations.Nullable()
    private com.example.movie_catalog.entity.Collection collection;
    
    public CollectionDB(int idCollection, @org.jetbrains.annotations.Nullable()
    com.example.movie_catalog.entity.Collection collection) {
        super();
    }
    
    public final int getIdCollection() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.movie_catalog.entity.Collection getCollection() {
        return null;
    }
    
    public final void setCollection(@org.jetbrains.annotations.Nullable()
    com.example.movie_catalog.entity.Collection p0) {
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.movie_catalog.entity.Collection component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie_catalog.data.room.tables.CollectionDB copy(int idCollection, @org.jetbrains.annotations.Nullable()
    com.example.movie_catalog.entity.Collection collection) {
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