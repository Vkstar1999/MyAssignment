package com.example.assignment.module.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.assignment.R
import com.example.assignment.databinding.ActivityDetailBinding
import com.example.assignment.models.Photo
import com.example.assignment.utils.Constant
import com.squareup.picasso.Picasso
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)

        val photo = intent.getParcelableExtra<Photo>(Constant.photo)
        photo?.let {
            Picasso.get().load(it.url).into(binding.headerImage)
            binding.title.text = it.title
            binding.description.text = "Description for ${it.title}" // Assuming there is a description
        }
    }
}
