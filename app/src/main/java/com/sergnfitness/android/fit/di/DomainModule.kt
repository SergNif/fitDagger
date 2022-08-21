package com.sergnfitness.android.fit.di

import com.sergnfitness.domain.repository.UserRepository
import com.sergnfitness.domain.usecase.GetUserSharedPreferenceUseCase
import com.sergnfitness.domain.usecase.SaveUserSharedPreferenceUseCase
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideGetUserSharedPreferenceUseCase(userRepository: UserRepository): GetUserSharedPreferenceUseCase{
        return GetUserSharedPreferenceUseCase(userRepository = userRepository)
    }

    @Provides
    fun provideSaveUserSharedPreferenceUseCase(userRepository: UserRepository): SaveUserSharedPreferenceUseCase{
        return SaveUserSharedPreferenceUseCase(userRepository = userRepository)
    }
//    private val saveUserSharedPreferenceUseCase by lazy(LazyThreadSafetyMode.NONE) {
//        SaveUserSharedPreferenceUseCase(userRepository = userRepository)
//    }
//    private val getUserSharedPreferenceUseCase by lazy(LazyThreadSafetyMode.NONE) {
//        GetUserSharedPreferenceUseCase(userRepository = userRepository)
//    }
}