package com.deling.demo

fun main() {

    val total:Int="Mississippi".count()

    val totalS:Int="Mississippi".count { letter ->
        letter == 's'
    }



    //println(total)
    println(totalS)

}