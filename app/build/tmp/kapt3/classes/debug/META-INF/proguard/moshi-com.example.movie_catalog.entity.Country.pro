-if class com.example.movie_catalog.entity.Country
-keepnames class com.example.movie_catalog.entity.Country
-if class com.example.movie_catalog.entity.Country
-keep class com.example.movie_catalog.entity.CountryJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.example.movie_catalog.entity.Country
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.example.movie_catalog.entity.Country
-keepclassmembers class com.example.movie_catalog.entity.Country {
    public synthetic <init>(java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
