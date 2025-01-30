package com.example.movie_catalog.data.api.person;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Jn\u0010#\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001J\t\u0010(\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015\u00a8\u0006)"}, d2 = {"Lcom/example/movie_catalog/data/api/person/Spouses;", "", "personId", "", "name", "", "divorced", "", "divorcedReason", "sex", "children", "webUrl", "relation", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getChildren", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDivorced", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDivorcedReason", "()Ljava/lang/String;", "getName", "getPersonId", "getRelation", "getSex", "getWebUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/example/movie_catalog/data/api/person/Spouses;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Spouses {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer personId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean divorced = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String divorcedReason = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String sex = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer children = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String webUrl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String relation = null;
    
    public Spouses(@com.squareup.moshi.Json(name = "personId")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer personId, @com.squareup.moshi.Json(name = "name")
    @org.jetbrains.annotations.Nullable()
    java.lang.String name, @com.squareup.moshi.Json(name = "divorced")
    @org.jetbrains.annotations.Nullable()
    java.lang.Boolean divorced, @com.squareup.moshi.Json(name = "divorcedReason")
    @org.jetbrains.annotations.Nullable()
    java.lang.String divorcedReason, @com.squareup.moshi.Json(name = "sex")
    @org.jetbrains.annotations.Nullable()
    java.lang.String sex, @com.squareup.moshi.Json(name = "children")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer children, @com.squareup.moshi.Json(name = "webUrl")
    @org.jetbrains.annotations.Nullable()
    java.lang.String webUrl, @com.squareup.moshi.Json(name = "relation")
    @org.jetbrains.annotations.Nullable()
    java.lang.String relation) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPersonId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getDivorced() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDivorcedReason() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSex() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getChildren() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWebUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRelation() {
        return null;
    }
    
    public Spouses() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
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
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie_catalog.data.api.person.Spouses copy(@com.squareup.moshi.Json(name = "personId")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer personId, @com.squareup.moshi.Json(name = "name")
    @org.jetbrains.annotations.Nullable()
    java.lang.String name, @com.squareup.moshi.Json(name = "divorced")
    @org.jetbrains.annotations.Nullable()
    java.lang.Boolean divorced, @com.squareup.moshi.Json(name = "divorcedReason")
    @org.jetbrains.annotations.Nullable()
    java.lang.String divorcedReason, @com.squareup.moshi.Json(name = "sex")
    @org.jetbrains.annotations.Nullable()
    java.lang.String sex, @com.squareup.moshi.Json(name = "children")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer children, @com.squareup.moshi.Json(name = "webUrl")
    @org.jetbrains.annotations.Nullable()
    java.lang.String webUrl, @com.squareup.moshi.Json(name = "relation")
    @org.jetbrains.annotations.Nullable()
    java.lang.String relation) {
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