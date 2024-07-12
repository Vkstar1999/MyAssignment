package com.example.assignment.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.assignment.R
import com.example.assignment.databinding.ActivityDetailBinding
import com.example.assignment.models.Photo
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)

        val photo = intent.getParcelableExtra<Photo>("photo")
        photo?.let {
            Picasso.get().load(it.url).into(binding.headerImage)
            binding.title.text = it.title
            binding.description.text = "Description for ${it.title}" // Assuming there is a description
        }
    }
}
