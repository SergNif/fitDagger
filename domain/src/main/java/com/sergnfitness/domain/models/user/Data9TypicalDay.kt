package com.sergnfitness.domain.models.user



import java.time.LocalDateTime
import java.util.*

data class Data9TypicalDay(

    var id: Int? = null,
    var workOffice:Boolean=true,
    var regularTraffic:Boolean=false,
    var OnFoot:Boolean=false,
    var InHome:Boolean=false,
    var date: String = LocalDateTime.now().toString().split("T")[0],
    var fitness_id:Int? = null,
)

{ //constructor(id: Int, fitness_id: Int): this(fitness_id = id)
//    init {
//        if (workOffice) {
//            regularTraffic = false
//            OnFoot = false
//            InHome = false
//        }
//
//        if (regularTraffic) {
//            workOffice = false
//            OnFoot = false
//            InHome = false
//        }
//
//        if (OnFoot) {
//            workOffice = false
//            regularTraffic = false
//            InHome = false
//        }
//
//        if (InHome) {
//            workOffice = false
//            regularTraffic = false
//            OnFoot = false
//        }
//
//    }
}