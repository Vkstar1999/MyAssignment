package com.example.assignment.networks

import com.example.assignment.domain.MyRepository
import com.example.assignment.models.Photo
import com.example.assignment.repository.PhotoRepository
import retrofit2.Response

class MyRepositoryImplementation(
    private val api : ApiService
): MyRepository {
    override suspend fun doNetworkCal() : Response<List<Photo>> {
        return api.getPhotos()
    }
}