package com.nedaluof.data.repositoryImpl

import com.nedaluof.data.remotesource.ApiService
import com.nedaluof.domain.repository.PostsRepository
import javax.inject.Inject

/**
 * Created by nedaluof on 2/6/2021.
 */
class PostsRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : PostsRepository {
    override suspend fun loadPosts() = apiService.getPosts()
}