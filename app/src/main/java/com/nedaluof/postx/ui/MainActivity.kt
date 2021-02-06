package com.nedaluof.postx.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.nedaluof.postx.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        initBindingValues()
    }


    private fun initRecyclerView() {
        binding.recyclerView.adapter = MainAdapter()
    }

    private fun initBindingValues() {
        viewModel.getPosts()
        binding.run {
            viewmodel = viewModel
            lifecycleOwner = this@MainActivity
            executePendingBindings()
        }
    }
}