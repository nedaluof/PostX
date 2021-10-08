package com.nedaluof.domain.usecase.base

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/**
 * Created by NedaluOf on 10/8/2021.
 */
abstract class SingleRemoteUseCase<T> {

    fun invokeApi(
        scope: CoroutineScope,
        api: suspend () -> T,
        onSuccess: (T) -> Unit,
        onError: (String) -> Unit
    ) {
        scope.launch {
            try {
                val result = api.invoke()
                onSuccess(result)
            } catch (e: Exception) {
                onError(e.message!!)
            }
        }
    }
}