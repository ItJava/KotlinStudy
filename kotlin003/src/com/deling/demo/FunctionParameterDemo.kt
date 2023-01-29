package com.deling.demo

/***
 * 定义参数是函数的函数：函数的参数是另外一个函数
 *
 */
fun main() {

   /* val getDiscountWords:(String,Int)->String={goodsname,hour->
        val currentyear=2023
        "${currentyear}年,双11$goodsname 促销倒计时 $hour"
    }*/

    val getDiscountWords={goodsname:String,hour:Int->
        val currentyear=2023
        "${currentyear}年,双11$goodsname 促销倒计时 $hour 小时"
    }

     showonBoard("家电",getDiscountWords )
}
//具名函数：特别注意   getDiscountWords 参数的类型：(String,Int)->String  代表的就是一个函数，且告知了参数类型和返回值类型
private fun showonBoard(goodsName:String,getDiscountWords:(String,Int)->String){
    val hour:Int=(1..24).shuffled().last()
    println(getDiscountWords(goodsName,hour))
}