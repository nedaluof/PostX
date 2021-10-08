package com.nedaluof.domain.usecase

import com.nedaluof.domain.repository.PostsRepository
import com.nedaluof.domain.usecase.base.SingleRemoteUseCase
import com.nedaluof.entities.Post
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

/**
 * Created by NedaluOf on 10/8/2021.
 */
class PostUseCaseImpl @Inject constructor(
    private val repository: PostsRepository
) : SingleRemoteUseCase<List<Post>>(), PostUseCase {
    override fun loadPosts(
        scope: CoroutineScope,
        onSuccess: (List<Post>) -> Unit,
        onError: (String) -> Unit
    ) {
        invokeApi(
            scope,
            api = { repository.loadPosts() },
            onSuccess,
            onError
        )
    }
}