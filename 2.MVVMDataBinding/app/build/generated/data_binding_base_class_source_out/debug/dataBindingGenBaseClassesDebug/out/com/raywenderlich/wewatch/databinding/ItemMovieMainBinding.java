package com.raywenderlich.wewatch.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.raywenderlich.wewatch.data.model.Movie;

public abstract class ItemMovieMainBinding extends ViewDataBinding {
  @NonNull
  public final CheckBox checkbox;

  @NonNull
  public final ImageView movieImageView;

  @NonNull
  public final TextView movieReleaseDateTextView;

  @NonNull
  public final TextView movieTitleTextView;

  @Bindable
  protected Movie mMovie;

  protected ItemMovieMainBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, CheckBox checkbox, ImageView movieImageView,
      TextView movieReleaseDateTextView, TextView movieTitleTextView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.checkbox = checkbox;
    this.movieImageView = movieImageView;
    this.movieReleaseDateTextView = movieReleaseDateTextView;
    this.movieTitleTextView = movieTitleTextView;
  }

  public abstract void setMovie(@Nullable Movie movie);

  @Nullable
  public Movie getMovie() {
    return mMovie;
  }

  @NonNull
  public static ItemMovieMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemMovieMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemMovieMainBinding>inflate(inflater, com.raywenderlich.wewatch.R.layout.item_movie_main, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMovieMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemMovieMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemMovieMainBinding>inflate(inflater, com.raywenderlich.wewatch.R.layout.item_movie_main, null, false, component);
  }

  public static ItemMovieMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemMovieMainBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemMovieMainBinding)bind(component, view, com.raywenderlich.wewatch.R.layout.item_movie_main);
  }
}
