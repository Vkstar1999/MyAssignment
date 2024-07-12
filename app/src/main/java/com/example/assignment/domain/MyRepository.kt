package com.example.assignment.domain

import com.example.assignment.models.Photo
import retrofit2.Response

interface MyRepository {
    suspend fun doNetworkCal() : Response<List<Photo>>
}