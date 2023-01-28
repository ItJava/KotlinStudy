package com.deling.demo

fun main() {
    var number=4
    var strValue="我是"
    if(number in 0..3){
        println(strValue+"小的"+number)
    }else if(number in 4..9){
        println(strValue+"中的"+number)
    }else {
        println(strValue+"大的"+number)
    }
}