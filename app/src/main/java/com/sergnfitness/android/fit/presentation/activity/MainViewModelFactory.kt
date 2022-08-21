package com.sergnfitness.android.fit.presentation.activity

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sergnfitness.cleanarchitect.data.repository.UserRepositoryImpl
import com.sergnfitness.cleanarchitect.data.storage.SharedPresImplStorage
import com.sergnfitness.domain.usecase.GetUserSharedPreferenceUseCase
import com.sergnfitness.domain.usecase.SaveUserSharedPreferenceUseCase

//class MainViewModelFactory(context: Context) : ViewModelProvider.Factory {
class MainViewModelFactory(
    val getUserSharedPreferenceUseCase: GetUserSharedPreferenceUseCase,
    val saveUserSharedPreferenceUseCase: SaveUserSharedPreferenceUseCase,
) : ViewModelProvider.Factory {

//    private val userRepository by lazy(LazyThreadSafetyMode.NONE) {
//        UserRepositoryImpl(sharedPresInterfaceStorage = SharedPresImplStorage(context = context))
//    }

//    private val saveUserSharedPreferenceUseCase by lazy(LazyThreadSafetyMode.NONE) {
//        SaveUserSharedPreferenceUseCase(userRepository = userRepository)
//    }
//    private val getUserSharedPreferenceUseCase by lazy(LazyThreadSafetyMode.NONE) {
//        GetUserSharedPreferenceUseCase(userRepository = userRepository)
//    }

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(
            getUserSharedPreferenceUseCase = getUserSharedPreferenceUseCase,
            saveUserSharedPreferenceUseCase = saveUserSharedPreferenceUseCase,
        ) as T
    }

}