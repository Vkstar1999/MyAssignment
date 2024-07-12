package com.example.assignment.networks;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/assignment/networks/RetrofitClient;", "", "()V", "BASE_URL", "", "getRetrofit", "Lretrofit2/Retrofit;", "app_debug"})
public final class RetrofitClient {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String BASE_URL = "https://jsonplaceholder.typicode.com";
    @org.jetbrains.annotations.NotNull
    public static final com.example.assignment.networks.RetrofitClient INSTANCE = null;
    
    private RetrofitClient() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit getRetrofit() {
        return null;
    }
}