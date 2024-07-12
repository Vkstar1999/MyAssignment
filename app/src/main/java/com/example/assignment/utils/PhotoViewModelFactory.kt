package com.example.assignment.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.assignment.repository.PhotoRepository
import com.example.assignment.viewmodels.PhotoViewModel



class PhotoViewModelFactory constructor(private val repository: PhotoRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(PhotoViewModel::class.java)) {
            PhotoViewModel(this.repository) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}
