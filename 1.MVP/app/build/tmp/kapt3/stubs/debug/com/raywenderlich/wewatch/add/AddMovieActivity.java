package com.raywenderlich.wewatch.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\"\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0011J\u0012\u0010\u001a\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\fH\u0016J\u0006\u0010\u001e\u001a\u00020\fJ\u0006\u0010\u001f\u001a\u00020\fJ\u0010\u0010 \u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/raywenderlich/wewatch/add/AddMovieActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/raywenderlich/wewatch/add/AddMovieContract$ViewInterface;", "()V", "addMoviePresenter", "Lcom/raywenderlich/wewatch/add/AddMovieContract$PresenterInterface;", "movieImageView", "Landroid/widget/ImageView;", "releaseDateEditText", "Landroid/widget/EditText;", "titleEditText", "displayError", "", "string", "", "goToSearchMovieActivity", "v", "Landroid/view/View;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onClickAddMovie", "view", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "returnToMain", "setupPresenter", "setupViews", "showToast", "Companion", "app_debug"})
public final class AddMovieActivity extends androidx.appcompat.app.AppCompatActivity implements com.raywenderlich.wewatch.add.AddMovieContract.ViewInterface {
    private android.widget.EditText titleEditText;
    private android.widget.EditText releaseDateEditText;
    private android.widget.ImageView movieImageView;
    private com.raywenderlich.wewatch.add.AddMovieContract.PresenterInterface addMoviePresenter;
    public static final int SEARCH_MOVIE_ACTIVITY_REQUEST_CODE = 2;
    public static final com.raywenderlich.wewatch.add.AddMovieActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setupPresenter() {
    }
    
    public final void setupViews() {
    }
    
    public final void goToSearchMovieActivity(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public final void onClickAddMovie(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void returnToMain() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    @java.lang.Override()
    public void displayError(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    public AddMovieActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/raywenderlich/wewatch/add/AddMovieActivity$Companion;", "", "()V", "SEARCH_MOVIE_ACTIVITY_REQUEST_CODE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}