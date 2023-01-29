package com.deling.demo

/***
 *  承接上文基础，掌握 函数引用
 *  要把函数作为参数传给其它函数使用，除了传递lambda表达式，kotlin还提供了其它方法，传递函数引用，
 *  函数引用可以吧一个具名函数转换成一个值参。
 *  重点理解；使用lambda 表达式的地方，都可以使用函数引用   ::具名函数名
 *
 */
fun main() {

    fun getDiscountWords(goodsname:String,hour:Int):String{
        val currentyear=2023
        return "${currentyear}年,双11$goodsname 促销倒计时 $hour"
    }

    showonBoard("家电",::getDiscountWords)

}
//具名函数：特别注意   getDiscountWords 参数的类型：(String,Int)->String  代表的就是一个函数，且告知了参数类型和返回值类型
private fun showonBoard(goodsName:String,getDiscountWords:(String,Int)->String){
    val hour:Int=(1..24).shuffled().last()
    println(getDiscountWords(goodsName,hour))
}