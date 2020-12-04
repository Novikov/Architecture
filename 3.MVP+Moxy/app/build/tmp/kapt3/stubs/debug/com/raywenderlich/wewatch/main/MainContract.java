package com.raywenderlich.wewatch.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/raywenderlich/wewatch/main/MainContract;", "", "()V", "PresenterInterface", "ViewInterface", "app_debug"})
public final class MainContract {
    
    public MainContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/raywenderlich/wewatch/main/MainContract$PresenterInterface;", "", "getMyMoviesList", "", "onDeleteTapped", "selectedMovies", "Ljava/util/HashSet;", "Lcom/raywenderlich/wewatch/model/Movie;", "stop", "app_debug"})
    public static abstract interface PresenterInterface {
        
        public abstract void getMyMoviesList();
        
        public abstract void onDeleteTapped(@org.jetbrains.annotations.NotNull()
        java.util.HashSet<com.raywenderlich.wewatch.model.Movie> selectedMovies);
        
        public abstract void stop();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\f"}, d2 = {"Lcom/raywenderlich/wewatch/main/MainContract$ViewInterface;", "", "displayError", "", "string", "", "displayMovies", "movieList", "", "Lcom/raywenderlich/wewatch/model/Movie;", "displayNoMovies", "showToast", "app_debug"})
    public static abstract interface ViewInterface {
        
        public abstract void displayMovies(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.raywenderlich.wewatch.model.Movie> movieList);
        
        public abstract void displayNoMovies();
        
        public abstract void showToast(@org.jetbrains.annotations.NotNull()
        java.lang.String string);
        
        public abstract void displayError(@org.jetbrains.annotations.NotNull()
        java.lang.String string);
    }
}