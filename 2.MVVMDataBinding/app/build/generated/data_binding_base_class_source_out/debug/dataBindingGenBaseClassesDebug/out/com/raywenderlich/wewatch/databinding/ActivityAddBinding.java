package com.raywenderlich.wewatch.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.raywenderlich.wewatch.viewmodel.AddViewModel;

public abstract class ActivityAddBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout addLayout;

  @NonNull
  public final Button addMovieButton;

  @NonNull
  public final ImageButton imageButton;

  @NonNull
  public final EditText titleEditText;

  @NonNull
  public final View toolbarView;

  @NonNull
  public final EditText yearEditText;

  @Bindable
  protected AddViewModel mViewModel;

  protected ActivityAddBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout addLayout, Button addMovieButton,
      ImageButton imageButton, EditText titleEditText, View toolbarView, EditText yearEditText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addLayout = addLayout;
    this.addMovieButton = addMovieButton;
    this.imageButton = imageButton;
    this.titleEditText = titleEditText;
    this.toolbarView = toolbarView;
    this.yearEditText = yearEditText;
  }

  public abstract void setViewModel(@Nullable AddViewModel viewModel);

  @Nullable
  public AddViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAddBinding>inflate(inflater, com.raywenderlich.wewatch.R.layout.activity_add, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAddBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAddBinding>inflate(inflater, com.raywenderlich.wewatch.R.layout.activity_add, null, false, component);
  }

  public static ActivityAddBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityAddBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityAddBinding)bind(component, view, com.raywenderlich.wewatch.R.layout.activity_add);
  }
}
