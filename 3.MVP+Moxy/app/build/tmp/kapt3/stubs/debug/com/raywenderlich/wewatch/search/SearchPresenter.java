package com.raywenderlich.wewatch.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR#\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00110\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/raywenderlich/wewatch/search/SearchPresenter;", "Lcom/raywenderlich/wewatch/search/SearchContract$PresenterInterface;", "viewInterface", "Lcom/raywenderlich/wewatch/search/SearchContract$ViewInterface;", "dataSource", "Lcom/raywenderlich/wewatch/model/RemoteDataSource;", "(Lcom/raywenderlich/wewatch/search/SearchContract$ViewInterface;Lcom/raywenderlich/wewatch/model/RemoteDataSource;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "observer", "Lio/reactivex/observers/DisposableObserver;", "Lcom/raywenderlich/wewatch/model/TmdbResponse;", "getObserver", "()Lio/reactivex/observers/DisposableObserver;", "searchResultsObservable", "Lkotlin/Function1;", "", "Lio/reactivex/Observable;", "getSearchResultsObservable", "()Lkotlin/jvm/functions/Function1;", "getSearchResults", "", "query", "stop", "app_debug"})
public final class SearchPresenter implements com.raywenderlich.wewatch.search.SearchContract.PresenterInterface {
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.String, io.reactivex.Observable<com.raywenderlich.wewatch.model.TmdbResponse>> searchResultsObservable = null;
    private com.raywenderlich.wewatch.search.SearchContract.ViewInterface viewInterface;
    private com.raywenderlich.wewatch.model.RemoteDataSource dataSource;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.String, io.reactivex.Observable<com.raywenderlich.wewatch.model.TmdbResponse>> getSearchResultsObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.observers.DisposableObserver<com.raywenderlich.wewatch.model.TmdbResponse> getObserver() {
        return null;
    }
    
    @java.lang.Override()
    public void getSearchResults(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    public SearchPresenter(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.search.SearchContract.ViewInterface viewInterface, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.model.RemoteDataSource dataSource) {
        super();
    }
}