package com.bignerdranch.android.finnesretrofitmvvm.domain.models.data


import java.time.*
import java.util.*

data class Data7FoodsStorage (

    var id: Int? = null,
    var egg: Boolean = false,
    var cheese: Boolean = false,
    var nuts: Boolean = false,
    var cottage: Boolean = false,
    var kefir: Boolean = false,
    var yogurt: Boolean = false,
    var date: String = LocalDateTime.now().toString().split("T")[0],
    var fitness_id:Int? = null,
)