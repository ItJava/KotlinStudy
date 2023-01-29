package com.deling.demo

// 函数类型与隐式返回
/***
 * 匿名函数也有类型：
 * 匿名函数可以当做变量赋值给函数类型变量，就像其他变量一样，匿名函数就可以在代码里传递了。变量有类型，变量可以等于函数，函数也会有类型。
 * 函数类型 由 传入的参数和返回值决定的
 * 举例： （）->String  表示是 函数类型，比如：fun test(haha:FuncType){ },但是参数类型是没有一个专门用来表示的函数类型的泛型。
 * 这里的 （）->String 表示FuncType, 代表了两层含义参数类型和返回值   （）里面是没有参数的，那么就是无参数类型，返回值是String 类型
 *
 * 隐式返回： 和具名函数不一样，除了极少数情况外，匿名桉树不需要return 关键字来返回数据，匿名函数会隐式或自动返回函数体最后一行语句的结果。
 *
 * 备注：匿名函数不是函数，实际是对象的
 *
 * ***/
fun main() {

    //变量类型是一个匿名函数，定义一个变量，类型是一个函数
    val blessingFunction: () -> String
    blessingFunction = {
        val holiday = "Happy New Year"

        "$holiday  EveryOne"
    }

    println(blessingFunction)
    println(blessingFunction())
    // 将上面两个定义变量类型和变量赋值函数 写在一起再理解下：

    val blessFunction: () -> String = {
        val holiday = "Happy New Year"

        "$holiday  EveryOne"
    }

    println(blessFunction)
    println(blessFunction())


}





