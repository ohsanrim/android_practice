package com.example.myapplication

//fun lengthCal(data:String?):Int {
//    return data.length
//}

fun main(){
    var data:String? = "ohsanrim"
    println(data?.length ?: -10)
    data = null
    println(data?.length ?: -10)
}