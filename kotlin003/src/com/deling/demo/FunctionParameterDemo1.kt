package com.deling.demo

/***
 *  承接上文基础，掌握 简单写法
 *  如果一个函数的lambda 函数排在最后，或者是唯一的参数，那么括在lambda值参的一对圆括号就可以省略了
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

    //将getDiscountWords 变量直接用函数表示出来
    // showonBoard("家电",getDiscountWords )

    showonBoard("家电",{goodsname:String,hour:Int->
        val currentyear=2023
        "${currentyear}年,双11$goodsname 促销倒计时 $hour 小时"
    } )

    //准备直接简写【很重要】
    showonBoard("电视"){goodsname:String,hour:Int->
        val currentyear=2022
        "${currentyear}年,双11$goodsname 促销倒计时 $hour 小时"
    }



}
//具名函数：特别注意   getDiscountWords 参数的类型：(String,Int)->String  代表的就是一个函数，且告知了参数类型和返回值类型
private fun showonBoard(goodsName:String,getDiscountWords:(String,Int)->String){
    val hour:Int=(1..24).shuffled().last()
    println(getDiscountWords(goodsName,hour))
}