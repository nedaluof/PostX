package com.nedaluof.postx.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nedaluof.domain.usecase.PostUseCase
import com.nedaluof.entities.Post
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

/**
 * Created by nedaluof on 2/6/2021.
 */
@HiltViewModel
class MainViewModel @Inject constructor(
    private val useCase: PostUseCase
) : ViewModel() {

    val posts = MutableLiveData(emptyList<Post>())
    val error = MutableStateFlow<String?>(null)

    private fun getPosts() {
        useCase.loadPosts(
            viewModelScope,
            onSuccess = { comingPosts -> posts.value = comingPosts },
            onError = { comingError ->
                Log.d(TAG, "getPosts: Error: $comingError")
                error.value = comingError
            }
        )
    }

    init {
        getPosts()
    }

    companion object {
        private const val TAG = "MainViewModel"
    }
}