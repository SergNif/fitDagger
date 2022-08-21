package com.sergnfitness.android.fit.di

import android.content.Context
import com.sergnfitness.cleanarchitect.data.repository.UserRepositoryImpl
import com.sergnfitness.cleanarchitect.data.storage.SharedPresImplStorage
import com.sergnfitness.domain.repository.UserRepository
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideSharedPresImplStorage(context: Context): SharedPresImplStorage {
        return SharedPresImplStorage(context = context)
    }

    @Provides
    fun provideUserRepository(sharedPresInterfaceStorage: SharedPresImplStorage): UserRepository {
        return UserRepositoryImpl(sharedPresInterfaceStorage = sharedPresInterfaceStorage)
    }


//    private val userRepository by lazy(LazyThreadSafetyMode.NONE) {
//        UserRepositoryImpl(sharedPresInterfaceStorage = SharedPresImplStorage(context = context))
//    }

}