package com.example.assignment.viewmodels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/assignment/viewmodels/PhotoViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/assignment/repository/PhotoRepository;", "(Lcom/example/assignment/repository/PhotoRepository;)V", "_photos", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/assignment/models/Photo;", "photos", "Landroidx/lifecycle/LiveData;", "getPhotos", "()Landroidx/lifecycle/LiveData;", "fetchPhotos", "", "app_debug"})
public final class PhotoViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.assignment.repository.PhotoRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.assignment.models.Photo>> _photos = null;
    
    public PhotoViewModel(@org.jetbrains.annotations.NotNull
    com.example.assignment.repository.PhotoRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.assignment.models.Photo>> getPhotos() {
        return null;
    }
    
    private final void fetchPhotos() {
    }
}