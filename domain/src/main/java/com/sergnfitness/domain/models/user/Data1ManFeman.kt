package com.sergnfitness.domain.models.user


data class Data1ManFeman(
//    val gender: String?,
//    var woman:String = "woman",
//    var man:String = "man",

    var id: Int? = null,
    var woman:Boolean = true,
    var man:Boolean = false,
    var fitness_id:Int? = null
){


    //    var woman:Boolean = true
//    var man:Boolean = false
init {
    if(woman) {  man=false}
    if(man) { woman=false}
}
}
//class Person(var firstName: String, var lastName: String) {
//    var age: Int? = null
//
//    // Secondary Constructor
//    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)  {
//        this.age = if(age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
//    }
//}