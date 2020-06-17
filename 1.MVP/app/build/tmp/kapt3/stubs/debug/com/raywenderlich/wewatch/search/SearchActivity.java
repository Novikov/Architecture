package com.raywenderlich.wewatch.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0002%&B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005H\u0016J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0018H\u0014J\b\u0010!\u001a\u00020\u0018H\u0014J\b\u0010\"\u001a\u00020\u0018H\u0002J\b\u0010#\u001a\u00020\u0018H\u0002J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/raywenderlich/wewatch/search/SearchActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/raywenderlich/wewatch/search/SearchContract$ViewInterface;", "()V", "TAG", "", "adapter", "Lcom/raywenderlich/wewatch/search/SearchAdapter;", "itemListener", "Lcom/raywenderlich/wewatch/search/SearchActivity$RecyclerItemListener;", "getItemListener$app_debug", "()Lcom/raywenderlich/wewatch/search/SearchActivity$RecyclerItemListener;", "setItemListener$app_debug", "(Lcom/raywenderlich/wewatch/search/SearchActivity$RecyclerItemListener;)V", "noMoviesTextView", "Landroid/widget/TextView;", "progressBar", "Landroid/widget/ProgressBar;", "query", "searchPresenter", "Lcom/raywenderlich/wewatch/search/SearchPresenter;", "searchResultsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "displayError", "", "string", "displayResult", "tmdbResponse", "Lcom/raywenderlich/wewatch/model/TmdbResponse;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "setupPresenter", "setupViews", "showToast", "Companion", "RecyclerItemListener", "app_debug"})
public final class SearchActivity extends androidx.appcompat.app.AppCompatActivity implements com.raywenderlich.wewatch.search.SearchContract.ViewInterface {
    private final java.lang.String TAG = "SearchActivity";
    private androidx.recyclerview.widget.RecyclerView searchResultsRecyclerView;
    private com.raywenderlich.wewatch.search.SearchAdapter adapter;
    private android.widget.TextView noMoviesTextView;
    private android.widget.ProgressBar progressBar;
    private com.raywenderlich.wewatch.search.SearchPresenter searchPresenter;
    private java.lang.String query;
    
    /**
     * * Listener for clicks on tasks in the ListView.
     */
    @org.jetbrains.annotations.NotNull()
    private com.raywenderlich.wewatch.search.SearchActivity.RecyclerItemListener itemListener;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SEARCH_QUERY = "searchQuery";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_TITLE = "SearchActivity.TITLE_REPLY";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_RELEASE_DATE = "SearchActivity.RELEASE_DATE_REPLY";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_POSTER_PATH = "SearchActivity.POSTER_PATH_REPLY";
    public static final com.raywenderlich.wewatch.search.SearchActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final void setupViews() {
    }
    
    private final void setupPresenter() {
    }
    
    @java.lang.Override()
    public void displayResult(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.model.TmdbResponse tmdbResponse) {
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    @java.lang.Override()
    public void displayError(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.wewatch.search.SearchActivity.RecyclerItemListener getItemListener$app_debug() {
        return null;
    }
    
    public final void setItemListener$app_debug(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.search.SearchActivity.RecyclerItemListener p0) {
    }
    
    public SearchActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/raywenderlich/wewatch/search/SearchActivity$RecyclerItemListener;", "", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "app_debug"})
    public static abstract interface RecyclerItemListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        android.view.View view, int position);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/raywenderlich/wewatch/search/SearchActivity$Companion;", "", "()V", "EXTRA_POSTER_PATH", "", "getEXTRA_POSTER_PATH", "()Ljava/lang/String;", "EXTRA_RELEASE_DATE", "getEXTRA_RELEASE_DATE", "EXTRA_TITLE", "getEXTRA_TITLE", "SEARCH_QUERY", "getSEARCH_QUERY", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSEARCH_QUERY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXTRA_TITLE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXTRA_RELEASE_DATE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXTRA_POSTER_PATH() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}