package com.example.assignment.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.assignment.models.Photo
import com.example.assignment.repository.PhotoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class PhotoViewModel @Inject constructor(private val repository: PhotoRepository) : ViewModel() {
    val photosListLiveData : MutableLiveData<Response<List<Photo>>> = MutableLiveData()



    fun getFetchPhotos(){
        viewModelScope.launch {
            Log.d("ProductFragment" , "From productViewModel")
            photosListLiveData.value = repository.doNetworkCal()
        }
    }
}
