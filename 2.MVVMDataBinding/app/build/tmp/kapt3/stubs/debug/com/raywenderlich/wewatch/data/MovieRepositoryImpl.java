package com.raywenderlich.wewatch.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u001e\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/raywenderlich/wewatch/data/MovieRepositoryImpl;", "Lcom/raywenderlich/wewatch/data/MovieRepository;", "()V", "allMovies", "Landroidx/lifecycle/LiveData;", "", "Lcom/raywenderlich/wewatch/data/model/Movie;", "movieDao", "Lcom/raywenderlich/wewatch/data/db/MovieDao;", "retrofitClient", "Lcom/raywenderlich/wewatch/data/net/RetrofitClient;", "deleteMovie", "", "movie", "getSavedMovies", "saveMovie", "searchMovies", "query", "", "DeleteAsyncTask", "InsertAsyncTask", "UpdateAsyncTask", "app_debug"})
public final class MovieRepositoryImpl implements com.raywenderlich.wewatch.data.MovieRepository {
    private final com.raywenderlich.wewatch.data.db.MovieDao movieDao = null;
    private final com.raywenderlich.wewatch.data.net.RetrofitClient retrofitClient = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.wewatch.data.model.Movie>> allMovies = null;
    
    @java.lang.Override()
    public void deleteMovie(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.data.model.Movie movie) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.wewatch.data.model.Movie>> getSavedMovies() {
        return null;
    }
    
    @java.lang.Override()
    public void saveMovie(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.data.model.Movie movie) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.wewatch.data.model.Movie>> searchMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    public MovieRepositoryImpl() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\t\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/wewatch/data/MovieRepositoryImpl$InsertAsyncTask;", "Landroid/os/AsyncTask;", "Lcom/raywenderlich/wewatch/data/model/Movie;", "Ljava/lang/Void;", "dao", "Lcom/raywenderlich/wewatch/data/db/MovieDao;", "(Lcom/raywenderlich/wewatch/data/db/MovieDao;)V", "doInBackground", "params", "", "([Lcom/raywenderlich/wewatch/data/model/Movie;)Ljava/lang/Void;", "app_debug"})
    static final class InsertAsyncTask extends android.os.AsyncTask<com.raywenderlich.wewatch.data.model.Movie, java.lang.Void, java.lang.Void> {
        private final com.raywenderlich.wewatch.data.db.MovieDao dao = null;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.wewatch.data.model.Movie... params) {
            return null;
        }
        
        public InsertAsyncTask(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.wewatch.data.db.MovieDao dao) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\t\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/wewatch/data/MovieRepositoryImpl$DeleteAsyncTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "dao", "Lcom/raywenderlich/wewatch/data/db/MovieDao;", "(Lcom/raywenderlich/wewatch/data/db/MovieDao;)V", "doInBackground", "p0", "", "([Ljava/lang/Boolean;)Ljava/lang/Void;", "app_debug"})
    static final class DeleteAsyncTask extends android.os.AsyncTask<java.lang.Boolean, java.lang.Void, java.lang.Void> {
        private final com.raywenderlich.wewatch.data.db.MovieDao dao = null;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Boolean... p0) {
            return null;
        }
        
        public DeleteAsyncTask(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.wewatch.data.db.MovieDao dao) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\t\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/wewatch/data/MovieRepositoryImpl$UpdateAsyncTask;", "Landroid/os/AsyncTask;", "Lcom/raywenderlich/wewatch/data/model/Movie;", "Ljava/lang/Void;", "dao", "Lcom/raywenderlich/wewatch/data/db/MovieDao;", "(Lcom/raywenderlich/wewatch/data/db/MovieDao;)V", "doInBackground", "params", "", "([Lcom/raywenderlich/wewatch/data/model/Movie;)Ljava/lang/Void;", "app_debug"})
    static final class UpdateAsyncTask extends android.os.AsyncTask<com.raywenderlich.wewatch.data.model.Movie, java.lang.Void, java.lang.Void> {
        private final com.raywenderlich.wewatch.data.db.MovieDao dao = null;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.wewatch.data.model.Movie... params) {
            return null;
        }
        
        public UpdateAsyncTask(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.wewatch.data.db.MovieDao dao) {
            super();
        }
    }
}