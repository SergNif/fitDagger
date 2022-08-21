package com.sergnfitness.domain.util

typealias SimpleResource = Resource<Unit>

sealed class Resource<T> (val data: T? = null, val message:String? = null){

class Loading<T>(data: T? = null): Resource<T> (data)
class Succes<T>(data: T? = null): Resource<T> (data)
class Error<T>(message: String, data: T? = null): Resource<T> (data, message)
}