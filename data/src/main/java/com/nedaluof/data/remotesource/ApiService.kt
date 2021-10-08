package com.nedaluof.data.remotesource

import com.nedaluof.entities.Post
import retrofit2.http.GET

/**
 * Created by nedaluof on 2/6/2021.
 */
interface ApiService {

    /**
     * Get 100 posts from Api-endPoint
     * */
    @GET("/posts")
    suspend fun getPosts(): List<Post>
}