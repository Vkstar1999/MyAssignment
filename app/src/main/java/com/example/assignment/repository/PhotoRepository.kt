package com.example.assignment.repository

import com.example.assignment.networks.ApiService

class PhotoRepository /*@Inject constructor*/(private val apiService: ApiService) {
    suspend fun getPhotos() = apiService.getPhotos()
}
