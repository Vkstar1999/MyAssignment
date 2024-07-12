package com.example.assignment.module.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assignment.R
import com.example.assignment.adpter.PhotoAdapter
import com.example.assignment.databinding.ActivityMainBinding
import com.example.assignment.module.detail.DetailActivity
import com.example.assignment.networks.ApiService
import com.example.assignment.repository.PhotoRepository
import com.example.assignment.utils.Constant
import com.example.assignment.viewmodels.PhotoViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    val TAG="MainActivity::"
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PhotoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val viewModel: PhotoViewModel by viewModels()
        viewModel.getFetchPhotos()

        viewModel.photosListLiveData.observe(this, Observer {
            binding.idPBLoading.visibility=View.GONE
            Log.d(TAG, "This is the response list ${it.body()}")
            binding.recyclerView.layoutManager = LinearLayoutManager(this)
            adapter = PhotoAdapter { photo ->
                val intent = Intent(this, DetailActivity::class.java).apply {
                    putExtra(Constant.photo, photo)
                }
                startActivity(intent)
            }
            binding.recyclerView.adapter = adapter
            adapter.submitList(it.body())

        })

    }
}
