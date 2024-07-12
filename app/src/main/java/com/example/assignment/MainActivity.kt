package com.example.assignment

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assignment.adpter.PhotoAdapter
import com.example.assignment.databinding.ActivityMainBinding
import com.example.assignment.networks.ApiService
import com.example.assignment.repository.PhotoRepository
import com.example.assignment.ui.DetailActivity
import com.example.assignment.utils.PhotoViewModelFactory
import com.example.assignment.viewmodels.PhotoViewModel

class MainActivity : AppCompatActivity() {


    lateinit var viewModelFactory: PhotoViewModelFactory
    private lateinit var viewModel: PhotoViewModel
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PhotoAdapter
    private val apiService = ApiService.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
      /*  (application as MyApplication).appComponent.inject(this)*/
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this, PhotoViewModelFactory(PhotoRepository(apiService))).get(PhotoViewModel::class.java)

        adapter = PhotoAdapter { photo ->
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("photo", photo)
            }
            startActivity(intent)
        }

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        viewModel.photos.observe(this) { photos ->
            adapter.submitList(photos)
        }
    }
}
