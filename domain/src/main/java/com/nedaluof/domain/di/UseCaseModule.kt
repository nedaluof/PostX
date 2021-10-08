package com.nedaluof.domain.di

import com.nedaluof.domain.usecase.PostUseCase
import com.nedaluof.domain.usecase.PostUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

/**
 * Created by NedaluOf on 10/8/2021.
 */
@InstallIn(ViewModelComponent::class)
@Module
abstract class UseCaseModule {
    @ViewModelScoped
    @Binds
    abstract fun bindPostUseCase(
        useCase: PostUseCaseImpl
    ): PostUseCase
}