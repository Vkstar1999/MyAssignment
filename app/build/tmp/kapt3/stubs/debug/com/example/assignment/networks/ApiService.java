package com.example.assignment.networks;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/example/assignment/networks/ApiService;", "", "getPhotos", "", "Lcom/example/assignment/models/Photo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface ApiService {
    @org.jetbrains.annotations.NotNull
    public static final com.example.assignment.networks.ApiService.Companion Companion = null;
    
    @retrofit2.http.GET(value = "/photos")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPhotos(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.assignment.models.Photo>> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/example/assignment/networks/ApiService$Companion;", "", "()V", "retrofitService", "Lcom/example/assignment/networks/ApiService;", "getRetrofitService", "()Lcom/example/assignment/networks/ApiService;", "setRetrofitService", "(Lcom/example/assignment/networks/ApiService;)V", "getInstance", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.Nullable
        private static com.example.assignment.networks.ApiService retrofitService;
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.example.assignment.networks.ApiService getRetrofitService() {
            return null;
        }
        
        public final void setRetrofitService(@org.jetbrains.annotations.Nullable
        com.example.assignment.networks.ApiService p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.assignment.networks.ApiService getInstance() {
            return null;
        }
    }
}