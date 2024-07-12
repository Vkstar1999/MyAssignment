package com.example.assignment.repository;

import android.provider.ContactsContract;
import com.example.assignment.domain.MyRepository;
import com.example.assignment.models.Photo;
import com.example.assignment.networks.ApiService;
import retrofit2.Response;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/assignment/repository/PhotoRepository;", "Lcom/example/assignment/domain/MyRepository;", "apiService", "Lcom/example/assignment/networks/ApiService;", "(Lcom/example/assignment/networks/ApiService;)V", "doNetworkCal", "Lretrofit2/Response;", "", "Lcom/example/assignment/models/Photo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PhotoRepository implements com.example.assignment.domain.MyRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.assignment.networks.ApiService apiService = null;
    
    public PhotoRepository(@org.jetbrains.annotations.NotNull
    com.example.assignment.networks.ApiService apiService) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object doNetworkCal(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.example.assignment.models.Photo>>> $completion) {
        return null;
    }
}