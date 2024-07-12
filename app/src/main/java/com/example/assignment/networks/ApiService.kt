package com.example.assignment.networks

import com.example.assignment.models.Photo
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {
    @GET("/photos")
    suspend fun getPhotos(): Response<List<Photo>>

}