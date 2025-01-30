package com.example.movie_catalog.data.api.person;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00dd\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0003\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u000e\b\u0003\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u00c6\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00e6\u0001\u0010?\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u000e\b\u0003\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011H\u00c6\u0001\u00a2\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\u0003H\u00d6\u0001J\t\u0010E\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001aR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b(\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001a\u00a8\u0006F"}, d2 = {"Lcom/example/movie_catalog/data/api/person/PersonInfoDTO;", "", "personId", "", "webUrl", "", "nameRu", "nameEn", "sex", "posterUrl", "growth", "birthday", "death", "age", "birthplace", "deathplace", "spouses", "", "Lcom/example/movie_catalog/data/api/person/Spouses;", "hasAwards", "profession", "facts", "films", "Lcom/example/movie_catalog/data/api/person/PersonFilmDTO;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAge", "()Ljava/lang/String;", "getBirthday", "getBirthplace", "getDeath", "getDeathplace", "getFacts", "()Ljava/util/List;", "getFilms", "getGrowth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHasAwards", "getNameEn", "getNameRu", "getPersonId", "getPosterUrl", "getProfession", "getSex", "getSpouses", "getWebUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/example/movie_catalog/data/api/person/PersonInfoDTO;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class PersonInfoDTO {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer personId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String webUrl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String nameRu = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String nameEn = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String sex = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String posterUrl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer growth = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String birthday = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String death = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String age = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String birthplace = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String deathplace = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.movie_catalog.data.api.person.Spouses> spouses = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer hasAwards = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String profession = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> facts = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.movie_catalog.data.api.person.PersonFilmDTO> films = null;
    
    public PersonInfoDTO(@com.squareup.moshi.Json(name = "personId")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer personId, @com.squareup.moshi.Json(name = "webUrl")
    @org.jetbrains.annotations.Nullable()
    java.lang.String webUrl, @com.squareup.moshi.Json(name = "nameRu")
    @org.jetbrains.annotations.Nullable()
    java.lang.String nameRu, @com.squareup.moshi.Json(name = "nameEn")
    @org.jetbrains.annotations.Nullable()
    java.lang.String nameEn, @com.squareup.moshi.Json(name = "sex")
    @org.jetbrains.annotations.Nullable()
    java.lang.String sex, @com.squareup.moshi.Json(name = "posterUrl")
    @org.jetbrains.annotations.Nullable()
    java.lang.String posterUrl, @com.squareup.moshi.Json(name = "growth")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer growth, @com.squareup.moshi.Json(name = "birthday")
    @org.jetbrains.annotations.Nullable()
    java.lang.String birthday, @com.squareup.moshi.Json(name = "death")
    @org.jetbrains.annotations.Nullable()
    java.lang.String death, @com.squareup.moshi.Json(name = "age")
    @org.jetbrains.annotations.Nullable()
    java.lang.String age, @com.squareup.moshi.Json(name = "birthplace")
    @org.jetbrains.annotations.Nullable()
    java.lang.String birthplace, @com.squareup.moshi.Json(name = "deathplace")
    @org.jetbrains.annotations.Nullable()
    java.lang.String deathplace, @com.squareup.moshi.Json(name = "spouses")
    @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.movie_catalog.data.api.person.Spouses> spouses, @com.squareup.moshi.Json(name = "hasAwards")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer hasAwards, @com.squareup.moshi.Json(name = "profession")
    @org.jetbrains.annotations.Nullable()
    java.lang.String profession, @com.squareup.moshi.Json(name = "facts")
    @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> facts, @com.squareup.moshi.Json(name = "films")
    @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.movie_catalog.data.api.person.PersonFilmDTO> films) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPersonId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWebUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNameRu() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNameEn() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSex() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getGrowth() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBirthday() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAge() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBirthplace() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeathplace() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.movie_catalog.data.api.person.Spouses> getSpouses() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getHasAwards() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProfession() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getFacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.movie_catalog.data.api.person.PersonFilmDTO> getFilms() {
        return null;
    }
    
    public PersonInfoDTO() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.movie_catalog.data.api.person.Spouses> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.movie_catalog.data.api.person.PersonFilmDTO> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie_catalog.data.api.person.PersonInfoDTO copy(@com.squareup.moshi.Json(name = "personId")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer personId, @com.squareup.moshi.Json(name = "webUrl")
    @org.jetbrains.annotations.Nullable()
    java.lang.String webUrl, @com.squareup.moshi.Json(name = "nameRu")
    @org.jetbrains.annotations.Nullable()
    java.lang.String nameRu, @com.squareup.moshi.Json(name = "nameEn")
    @org.jetbrains.annotations.Nullable()
    java.lang.String nameEn, @com.squareup.moshi.Json(name = "sex")
    @org.jetbrains.annotations.Nullable()
    java.lang.String sex, @com.squareup.moshi.Json(name = "posterUrl")
    @org.jetbrains.annotations.Nullable()
    java.lang.String posterUrl, @com.squareup.moshi.Json(name = "growth")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer growth, @com.squareup.moshi.Json(name = "birthday")
    @org.jetbrains.annotations.Nullable()
    java.lang.String birthday, @com.squareup.moshi.Json(name = "death")
    @org.jetbrains.annotations.Nullable()
    java.lang.String death, @com.squareup.moshi.Json(name = "age")
    @org.jetbrains.annotations.Nullable()
    java.lang.String age, @com.squareup.moshi.Json(name = "birthplace")
    @org.jetbrains.annotations.Nullable()
    java.lang.String birthplace, @com.squareup.moshi.Json(name = "deathplace")
    @org.jetbrains.annotations.Nullable()
    java.lang.String deathplace, @com.squareup.moshi.Json(name = "spouses")
    @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.movie_catalog.data.api.person.Spouses> spouses, @com.squareup.moshi.Json(name = "hasAwards")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer hasAwards, @com.squareup.moshi.Json(name = "profession")
    @org.jetbrains.annotations.Nullable()
    java.lang.String profession, @com.squareup.moshi.Json(name = "facts")
    @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> facts, @com.squareup.moshi.Json(name = "films")
    @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.movie_catalog.data.api.person.PersonFilmDTO> films) {
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