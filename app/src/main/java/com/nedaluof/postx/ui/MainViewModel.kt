package com.nedaluof.postx.ui

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nedaluof.domain.repositories.PostsRepository
import com.nedaluof.entities.Post
import com.nedaluof.entities.ResultWrapper
import kotlinx.coroutines.launch

/**
 * Created by nedaluof on 2/6/2021.
 */
class MainViewModel @ViewModelInject constructor(
    private val postsRepository: PostsRepository
) : ViewModel() {

    val posts = MutableLiveData<List<Post>>()
    val error = MutableLiveData<String>()
    fun getPosts() {
        viewModelScope.launch {
            when (val result = postsRepository.getPosts()) {
                is ResultWrapper.Success -> {
                    Log.d(TAG, "getPosts: Success : ${result.data[0]}")
                    posts.postValue(result.data)
                }
                is ResultWrapper.Error -> {
                    Log.d(TAG, "getPosts: Error: ${result.exception}")
                    error.postValue(result.exception.toString())
                }
            }
        }
    }

    companion object {
        private const val TAG = "MainViewModel"
    }
}