package com.sergnfitness.android.fit.presentation.viewModelPart1

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sergnfitness.cleanarchitect.data.repository.UserRepositoryImpl
import com.sergnfitness.cleanarchitect.data.storage.SharedPresImplStorage

import com.sergnfitness.domain.usecase.*

//class Pg1MaleFemaleViewModelFactory(context: Context) : ViewModelProvider.Factory {
class Pg1MaleFemaleViewModelFactory(
    val getUserSharedPreferenceUseCase: GetUserSharedPreferenceUseCase,
    val saveUserSharedPreferenceUseCase: SaveUserSharedPreferenceUseCase
    ) : ViewModelProvider.Factory {

//    private val userRepository: UserRepositoryImpl by lazy(LazyThreadSafetyMode.NONE) {
//        UserRepositoryImpl(sharedPresInterfaceStorage = SharedPresImplStorage(context = context))
//    }
//    private val saveUserSharedPreferenceUseCase by lazy (LazyThreadSafetyMode.NONE) {
//        SaveUserSharedPreferenceUseCase(userRepository = userRepository)
//    }
//    private val getUserSharedPreferenceUseCase by lazy (LazyThreadSafetyMode.NONE) {
//        GetUserSharedPreferenceUseCase(userRepository = userRepository)
//    }


        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return Pg1MaleFemaleViewModel(
                getUserSharedPreferenceUseCase = getUserSharedPreferenceUseCase,
                saveUserSharedPreferenceUseCase = saveUserSharedPreferenceUseCase,
//                getUserNameUseCase = getUserNameUseCase,
//                saveUserNameUseCase = saveUserNameUseCase
            ) as T
        }
    }
