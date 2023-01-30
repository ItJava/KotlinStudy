package com.deling.demo

/***
 * 1)安全调用操作符:
 * ? 操作符
 * kotlin 不报错了，编译器看到安全调用操作符，他知道如何检查null值。如果遇到null,它就跳过函数调用，而不是返回null
 *
 * 2)let 操作符
 * 安全调用允许在可空类型上调用函数，但是如果还想做点额外的事，比如创建新值或判断不为null,就调用其它函数  那么可以试用
 * let函数的安全调用操作符。可以在任何类型上调用let 函数。它的主要作用是让你在指定的作用域内定义一个或多个变量
 *
 * 3)非空断言操作符
 * !!. 又称感叹号操作符，当变量值为null时，会抛出KotlinNullPointerException
 *
 * 4）空合并操作符 举例：   str?:"Jack"   如果String 为空，则Str 默认值就是"Jack"
 */
fun main() {
    var str:String?="butterfly"
   // str=null
    println(str.toString())

    str=""
    str?.let {
        if(it.isNotBlank()){
            it.replaceFirst("b","B")
        }else "hahahha"
    }.also { str = it }

    println(str)

}