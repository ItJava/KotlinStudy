package com.deling.demo

/***
 * 函数类型也是有效的返回类型，也就是说可以定义一个能返回函数的函数
 */
fun main() {

   val value= configDiscountWords()    // 这个configDiscountWords() 其实就是一个返回类型的函数，赋值给变量value
    println(value("啤酒"))
}


/*
val getDiscountWords:(String,Int)->String={goodsname,hour->
        val currentyear=2023
        "${currentyear}年,双11$goodsname 促销倒计时 $hour"
    }
 */

// 从函数configDiscountWords 定义上来看，参数为空，返回类型是一个函数，返回函数参数是String,返回是String
fun configDiscountWords():(String)->String{
  /*  val getDisValue:(goodsName:String)->String={goodsName->
        val currentYear=2023
        val hour:Int=(1..24).shuffled().last()
        "${currentYear}年,双11 ${goodsName}w 促销倒计时:$hour 小时"
    }*/

  /*  val getDisValue:(String)->String={goodsName->
        val currentYear=2023
        val hour:Int=(1..24).shuffled().last()
        "${currentYear}年,双11 ${goodsName}w 促销倒计时:$hour 小时"
    }*/
    return {goodsName:String->
        val currentYear=2023
        val hour:Int=(1..24).shuffled().last()
        "${currentYear}年,双11${goodsName}促销倒计时:$hour 小时"
    }
}

