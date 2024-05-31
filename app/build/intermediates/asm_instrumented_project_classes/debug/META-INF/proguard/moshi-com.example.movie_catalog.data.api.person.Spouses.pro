-if class com.example.movie_catalog.data.api.person.Spouses
-keepnames class com.example.movie_catalog.data.api.person.Spouses
-if class com.example.movie_catalog.data.api.person.Spouses
-keep class com.example.movie_catalog.data.api.person.SpousesJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.example.movie_catalog.data.api.person.Spouses
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.example.movie_catalog.data.api.person.Spouses
-keepclassmembers class com.example.movie_catalog.data.api.person.Spouses {
    public synthetic <init>(java.lang.Integer,java.lang.String,java.lang.Boolean,java.lang.String,java.lang.String,java.lang.Integer,java.lang.String,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
