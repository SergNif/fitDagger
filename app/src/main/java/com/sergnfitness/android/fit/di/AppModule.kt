package com.sergnfitness.android.fit.di

import android.content.Context
import com.sergnfitness.android.fit.presentation.activity.MainViewModelFactory
import com.sergnfitness.android.fit.presentation.viewModelPart1.Pg1MaleFemaleViewModelFactory
import com.sergnfitness.domain.usecase.GetUserSharedPreferenceUseCase
import com.sergnfitness.domain.usecase.SaveUserSharedPreferenceUseCase
import dagger.Module
import dagger.Provides

@Module
class AppModule(val context: Context) {
    @Provides
    fun provideContext(): Context {
        return context
    }

    @Provides
    fun provideMainViewModelFactory(
        getUserSharedPreferenceUseCase: GetUserSharedPreferenceUseCase,
        saveUserSharedPreferenceUseCase: SaveUserSharedPreferenceUseCase,
    ): MainViewModelFactory {
        return MainViewModelFactory(
            getUserSharedPreferenceUseCase = getUserSharedPreferenceUseCase,
            saveUserSharedPreferenceUseCase = saveUserSharedPreferenceUseCase,
        )
    }

    @Provides
    fun providePg1MaleFemaleViewModelFactory(
        getUserSharedPreferenceUseCase: GetUserSharedPreferenceUseCase,
        saveUserSharedPreferenceUseCase: SaveUserSharedPreferenceUseCase,
    ): Pg1MaleFemaleViewModelFactory {
        return Pg1MaleFemaleViewModelFactory(
            getUserSharedPreferenceUseCase = getUserSharedPreferenceUseCase,
            saveUserSharedPreferenceUseCase = saveUserSharedPreferenceUseCase,
        )
    }


}