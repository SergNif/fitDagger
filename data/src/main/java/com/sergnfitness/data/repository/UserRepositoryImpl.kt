package com.sergnfitness.cleanarchitect.data.repository


import com.sergnfitness.cleanarchitect.data.storage.SharedPresInterfaceStorage

import com.sergnfitness.cleanarchitect.data.storage.storageModel.UserStorage
import com.sergnfitness.domain.models.user.User
import com.sergnfitness.domain.repository.UserRepository


class UserRepositoryImpl(private val sharedPresInterfaceStorage: SharedPresInterfaceStorage) :
    UserRepository {

//
//    override fun saveName(saveparam: SaveUserNameParam): Boolean {
//        val user: UserModelStorage = mapToStorage(saveparam)
//        val result = sharedPresInterfaceStorage.save(user)
//        return result
//    }

    override fun saveUser(saveParam: User): Boolean {
        val user: UserStorage = mapUserToStorage(saveParam)
        val result = sharedPresInterfaceStorage.saveUser(user)
        return result
    }

    override fun getUser(): User {
//        val user: User = mapUserToDomain(getParam)
        val user = sharedPresInterfaceStorage.getUser()
        return mapUserToDomain(getParam = user)
    }

//    override fun getUserSharedPref(): User {
//        val user = sharedPresInterfaceStorage.getUserModelStor()
//        return mapToDomain(user)
//
//    }
//
//    override fun getId(): Int {
//        val idUser: Int = sharedPresInterfaceStorage.getIdUser()
//        return idUser
//    }

    private fun mapUserToStorage(saveParam: User): UserStorage {
        return UserStorage(
            id = saveParam.id,
            fullName = saveParam.fullName,
            email = saveParam.email,
            password = saveParam.password,
            fitness_id = saveParam.fitness_id,)
    }

    private fun mapUserToDomain(getParam: UserStorage): User {
        return User(
            id = getParam.id,
            fullName = getParam.fullName,
            email = getParam.email,
            password = getParam.password,
            fitness_id = getParam.fitness_id,)
    }

//    private fun mapToStorage(saveparam: SaveUserNameParam): UserModelStorage {
//        return UserModelStorage(
//            id = saveparam.idUser,
////            fullName = saveparam.fullName,
//            email = saveparam.email,
////            password = saveparam.password,
////            fitness_id = saveparam.fitness_id,
//        )
//    }
//
//    private fun mapToDomain(userModelStorage: UserModelStorage): User {
//        return User(
//            id = userModelStorage.id,
//            fullName = userModelStorage.fullName,
//            email = userModelStorage.email,
//            password = userModelStorage.password,
//            fitness_id = userModelStorage.fitness_id,
//        )
//    }


}