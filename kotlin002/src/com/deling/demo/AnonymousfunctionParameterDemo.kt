package com.deling.demo

/***
 * 函数参数
 * 和具名函数一样，匿名函数可以不带参数，也可以带一个或多个任何类型的参数，需要带参数时：参数的类型放在匿名函数的类型定义中，参数名则放在函数定义中
 *
 * it 参数【关键字】:定义只有一个参数的匿名函数时，可以用it 关键字来表示参数名。当你需要传入两个值参时候，it 关键字就没有作用了
 *
 * 匿名函数类型推断：
 * 1)定义一个变量时，如果先把匿名函数作为变量赋值给它，就不需要显示指明变量类型了【返回值的类型推断】
 * 2)类型推断也支持带参数的匿名函数，但为了帮助编译器更准确地推断变量类型，匿名函数的参数名和参数名称必须有【传入参数的类型推断】
 *
 */
fun main() {

    val blessingFunction:(String)->String={name->
        "$name "
    }
    println(blessingFunction)
    println(blessingFunction("方晨"))

    val blesingsFunction:(String)->String={
        it ->
        "$it hello"
    }
    println(blesingsFunction)
    println(blesingsFunction("Everyt One "))

    //1）匿名函数类型推断：
    val blessFunction: () -> String = {
        val holiday = "Happy New Year"

        "$holiday  EveryOne"
    }
    println(blessFunction)
    println(blessFunction())

    val blesssFunction = {
        val holiday = "Happy New Year"

        "$holiday  EveryOne"
    }
    println(blesssFunction)
    println(blesssFunction())

    //2)匿名函数的类型推断
    val blessFunctions:(String,Int)->String={name,year->
        "$name 今年 $year 岁"
    }
    println(blessFunctions("方晨",18))

    val blessFunctionss={name:String,year:Int->
        "$name 今年 $year 岁"
    }
    println(blessFunctionss("方晨",28))








}