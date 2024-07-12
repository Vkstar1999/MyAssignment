package com.example.assignment.di

import com.example.assignment.domain.MyRepository
import com.example.assignment.networks.ApiService
import com.example.assignment.networks.MyRepositoryImplementation
import com.example.assignment.repository.PhotoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) //dependency will live as as the application does
object AppModule {

    private const val BASE_URL =  "https://jsonplaceholder.typicode.com"

    @Provides
    @Singleton //marks the scope of the dependency. i.e will have the single instance throughOut
    fun provideMyApi(): ApiService {
        val loggingInterceptor = HttpLoggingInterceptor().apply {
            this.level = HttpLoggingInterceptor.Level.BODY
        }
        val okHttpClient = OkHttpClient().newBuilder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .addInterceptor(loggingInterceptor)
            .build()

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }


    @Provides
    @Singleton
    fun provideMyRepository(api : ApiService) : MyRepository {
        return MyRepositoryImplementation(api)
    }

}
