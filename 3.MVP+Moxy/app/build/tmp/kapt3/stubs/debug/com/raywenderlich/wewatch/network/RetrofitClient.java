package com.raywenderlich.wewatch.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/raywenderlich/wewatch/network/RetrofitClient;", "", "()V", "API_KEY", "", "TMDB_BASE_URL", "TMDB_IMAGEURL", "moviesApi", "Lcom/raywenderlich/wewatch/network/RetrofitInterface;", "kotlin.jvm.PlatformType", "getMoviesApi", "()Lcom/raywenderlich/wewatch/network/RetrofitInterface;", "app_debug"})
public final class RetrofitClient {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY = "d8286c6ea2f455bd6097f6beab7c8463";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TMDB_BASE_URL = "http://api.themoviedb.org/3/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TMDB_IMAGEURL = "https://image.tmdb.org/t/p/w500/";
    private static final com.raywenderlich.wewatch.network.RetrofitInterface moviesApi = null;
    public static final com.raywenderlich.wewatch.network.RetrofitClient INSTANCE = null;
    
    public final com.raywenderlich.wewatch.network.RetrofitInterface getMoviesApi() {
        return null;
    }
    
    private RetrofitClient() {
        super();
    }
}