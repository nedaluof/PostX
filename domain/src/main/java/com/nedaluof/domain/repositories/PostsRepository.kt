package com.nedaluof.domain.repositories

import com.nedaluof.domain.remote.ApiService
import com.nedaluof.entities.Post
import com.nedaluof.entities.ResultWrapper
import javax.inject.Inject

/**
 * Created by nedaluof on 2/6/2021.
 */
class PostsRepository @Inject constructor(
    private val apiService: ApiService
) {

    /**
     *
     * */
    suspend fun getPosts(): ResultWrapper<List<Post>> {
        return try {
            val response = apiService.getPosts()
            if (response.isSuccessful) {
                ResultWrapper.Success(response.body()!!)
            } else {
                val error = response.errorBody().toString()
                ResultWrapper.Error(Exception(error))
            }
        } catch (ex: Exception) {
            ResultWrapper.Error(ex)
        }
    }
}