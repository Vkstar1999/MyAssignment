package com.example.assignment.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.assignment.models.Photo
import com.example.assignment.repository.PhotoRepository
import kotlinx.coroutines.launch

class PhotoViewModel /*@Inject constructor*/(private val repository: PhotoRepository) : ViewModel() {
    private val _photos = MutableLiveData<List<Photo>>()
    val photos: LiveData<List<Photo>> get() = _photos

    init {
        fetchPhotos()
    }

    private fun fetchPhotos() {
        viewModelScope.launch {
            try {
                _photos.value = repository.getPhotos()
            } catch (e: Exception) {
                // Handle error
            }
        }
    }
}
