package com.nedaluof.entities

/**
 * Created by nedaluof on 2/6/2021.
 */
sealed class ResultWrapper<out R> {
    data class Success<out T>(val data: T) : ResultWrapper<T>()
    data class Error(val exception: Exception) : ResultWrapper<Nothing>()
}