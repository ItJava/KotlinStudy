package com.deling.demo

fun main() {
    var personStr="幼儿园1"
    var personCharacter=when(personStr){
        "幼儿园"->"可爱"
        "小学生"->"活泼"
        "中学生"->"青春期"
        "大学生"->"成熟"
        else -> {
            println("没性格")
        }
    }
    println(personCharacter)
}