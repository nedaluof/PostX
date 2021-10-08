package com.nedaluof.data.di

import com.nedaluof.data.repositoryImpl.PostsRepositoryImpl
import com.nedaluof.domain.repository.PostsRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent

/**
 * Created by NedaluOf on 10/8/2021.
 */
@InstallIn(ViewModelComponent::class)
@Module
abstract class RepositoryModule {

    @ViewModelScoped
    @Binds
    abstract fun bindPostsRepository(
        repositoryImpl: PostsRepositoryImpl
    ): PostsRepository
}