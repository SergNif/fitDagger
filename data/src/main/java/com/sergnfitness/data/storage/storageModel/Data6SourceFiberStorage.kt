package com.bignerdranch.android.finnesretrofitmvvm.domain.models.data



import java.time.LocalDateTime
import java.util.*

class Data6SourceFiberStorage(

    var id: Int? = null,
    var zucchini: Boolean = false,
    var tomato: Boolean = false,
    var eggplant: Boolean = false,
    var cauliflower: Boolean = false,
    var cucumbers: Boolean = false,
    var broccoli: Boolean = false,
    var mushrooms: Boolean = false,
    var avocado: Boolean = false,
    var date: String = LocalDateTime.now().toString().split("T")[0],
    var fitness_id:Int? = null,
)