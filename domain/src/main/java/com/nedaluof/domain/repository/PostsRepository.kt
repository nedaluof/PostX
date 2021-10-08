package com.nedaluof.domain.repository

import com.nedaluof.entities.Post

/**
 * Created by NedaluOf on 10/8/2021.
 */
interface PostsRepository {
    suspend fun loadPosts(): List<Post>
}