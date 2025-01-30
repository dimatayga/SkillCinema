package com.example.movie_catalog.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\rH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/example/movie_catalog/di/DatabaseModule;", "", "()V", "database", "Lcom/example/movie_catalog/data/room/AppDatabase;", "getDatabase", "()Lcom/example/movie_catalog/data/room/AppDatabase;", "setDatabase", "(Lcom/example/movie_catalog/data/room/AppDatabase;)V", "provideDataDao", "Lcom/example/movie_catalog/data/room/DataDao;", "provideDatabase", "appContext", "Landroid/content/Context;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DatabaseModule {
    public static com.example.movie_catalog.data.room.AppDatabase database;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.movie_catalog.di.DatabaseModule INSTANCE = null;
    
    private DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie_catalog.data.room.AppDatabase getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull()
    com.example.movie_catalog.data.room.AppDatabase p0) {
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie_catalog.data.room.AppDatabase provideDatabase(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context appContext) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie_catalog.data.room.DataDao provideDataDao(@org.jetbrains.annotations.NotNull()
    com.example.movie_catalog.data.room.AppDatabase database) {
        return null;
    }
}