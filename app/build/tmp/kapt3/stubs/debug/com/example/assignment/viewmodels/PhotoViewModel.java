package com.example.assignment.viewmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.assignment.models.Photo;
import com.example.assignment.repository.PhotoRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import retrofit2.Response;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/assignment/viewmodels/PhotoViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/assignment/repository/PhotoRepository;", "(Lcom/example/assignment/repository/PhotoRepository;)V", "photosListLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lretrofit2/Response;", "", "Lcom/example/assignment/models/Photo;", "getPhotosListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getFetchPhotos", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class PhotoViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.assignment.repository.PhotoRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<java.util.List<com.example.assignment.models.Photo>>> photosListLiveData = null;
    
    @javax.inject.Inject
    public PhotoViewModel(@org.jetbrains.annotations.NotNull
    com.example.assignment.repository.PhotoRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<java.util.List<com.example.assignment.models.Photo>>> getPhotosListLiveData() {
        return null;
    }
    
    public final void getFetchPhotos() {
    }
}