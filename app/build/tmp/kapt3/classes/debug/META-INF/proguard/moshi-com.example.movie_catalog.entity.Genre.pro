-if class com.example.movie_catalog.entity.Genre
-keepnames class com.example.movie_catalog.entity.Genre
-if class com.example.movie_catalog.entity.Genre
-keep class com.example.movie_catalog.entity.GenreJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.example.movie_catalog.entity.Genre
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.example.movie_catalog.entity.Genre
-keepclassmembers class com.example.movie_catalog.entity.Genre {
    public synthetic <init>(java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
