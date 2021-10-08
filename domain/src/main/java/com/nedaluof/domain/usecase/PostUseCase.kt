package com.nedaluof.domain.usecase

import com.nedaluof.entities.Post
import kotlinx.coroutines.CoroutineScope

/**
 * Created by NedaluOf on 10/8/2021.
 */
interface PostUseCase {
    fun loadPosts(
        scope: CoroutineScope,
        onSuccess: (List<Post>) -> Unit,
        onError: (String) -> Unit
    )
}