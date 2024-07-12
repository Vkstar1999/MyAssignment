package com.example.assignment.repository

import com.example.assignment.domain.MyRepository
import com.example.assignment.models.Photo
import com.example.assignment.networks.ApiService
import retrofit2.Response
import javax.inject.Inject


class PhotoRepository @Inject constructor(private val apiService: ApiService): MyRepository {
    override suspend fun doNetworkCal(): Response<List<Photo>> {
        return apiService.getPhotos()
    }

}
