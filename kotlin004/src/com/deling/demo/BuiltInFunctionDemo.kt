package com.deling.demo

import kotlin.math.roundToInt

/***
 * 内置函数
 *
 * 1)substring 找到index
 *
 * 2)split 分隔符
 *
 * 3)replace 字符替换
 *
 * 4)字符串的比较
 *   == 比较两个字符串中的字符是否匹配
 *   === 检查两个变量是否指向内存堆上的同一对象，而在Java中== 做引用比较，结构比较用的是equals
 *   需要理解内存的概念
 *
 * 5)字符串遍历
 *
 * 6)数字类型
 *
 * 7)安全转换函数：
 *  kotlin 提供了toDoubleOrNull和toIntOrNull这样的安全转换函数，若果数据不正确转换，
 *    与其触发异常不如干脆返回null值
 *
 */
const val NAME="Jimmy's Friend"
const val NAMES="JACK,jack,jason,caixia"
fun main() {

    var index:Int= NAME.indexOf("\'")
    println(NAME.substring(0 until index))

    var data:List<String> = NAMES.split(",")
    for(str in data){
        println("数据是 $str ")
    }

    var str1="The people's public of China"
  val str2=  str1.replace(Regex("[aeiou]")){
        when(it.value){
            "a" -> "8"
            "e" ->  "9"
            "i" ->  "9"
            "o" ->  "9"
            "u" ->  "9"
            else -> it.value
        }
    }
    println(str2)

    var strtest1="Fangchen"
    var stream2="Fangchen"
    var strtest3="fangchen".replace("f","F")
    println(strtest1==stream2)
    println(strtest1===stream2)
    println(strtest1==strtest3)
    println(strtest1===strtest3)

    "The people's RePublic of China".forEach { it->
        print("$it **")
    }
   println()
   // val number1:Int="9.88".toInt()

    val number2:Int?= "9.88".toIntOrNull()
    println("当前返回值: $number2")
    //double 转int
    println(9.8888.toInt())       //精度损失
    println(9.888.roundToInt())   // 四舍五入

    println("%.2f".format(9.888687))  // 保留两位小数


}