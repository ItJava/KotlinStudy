package com.deling.demo

fun main() {

    doSomeThing(100,"小张")
    doSomeThingDefault("小王")
    //具名参数
    doSomeThingDefault(score = 88, name = "方晨")
}
private fun doSomeThing(score:Int=100,name:String){
    println("$name 得分 $score")
}

private fun doSomeThingDefault(name:String,score:Int=99){
    println("$name 得分 $score")
}