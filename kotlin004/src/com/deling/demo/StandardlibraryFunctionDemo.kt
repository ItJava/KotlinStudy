package com.deling.demo

import java.io.File

/***
 * 标准库函数
 *
 * 1)apply: 可看做一个配置函数，可以传入一个接收者 ，然后调用一系列函数来配置它以方便使用，如果提供lambda给apply函数使用
 *          他会返回配置好的接收者
 *
 * 2)let  【很重要】
 *    函数，能使某个变量作用于其lambda 表达式，让it关键字能引用它。let  与 apply 比较，let会把接收者传递到lambda ，
 *    而apply什么都不会传，匿名函数执行完，apply会返回单签接收者，而let会返回lambda 的最后一行
 *
 * 3）run   【很重要】
 *    a)光看作用域行为，run和apply差不多，但与apply不同，run 函数不返回接收者，run函数不返回接收者，run返回的是lambda结果，也就是true和false
 *    b)run函数也能用来执行函数引用,支持链式调用
 *
 * 4）with
 *    with函数是run的变体，他们的功能行为是一样的，但with的调用方式不同，调用with时 需要 值参作为其第一个参数传入
 *
 * 5）also 【很重要】
 *   also函数和let函数功能相似，和let函数一样，also也是把接收者作为值参传给lambda，但有一点不同：also返回接收者对象，而let 返回lambda结果。因为这个差异，also尤其
 *   适合针对同一原始对象，利用副作用做事，既然also返回的是接收者对象，就可以基于原始接收者对象执行额外的链式调用
 *
 * 6）takeif
 *    和其它标准函数有点不一样，takeif 函数需要判断lambda中提供的条件表达式，给出true 或 false 结果，古国判断结果是true 从takeif函数返回接收者对象，如果是false 则返回null
 *    如果需要判断某个条件是否满足，再决定是否可以赋值变量或执行某项任务，takeif 就非常起作用了。从概念上讲，takeif函数类似于 if 语句，但它的优势是可以直接在对象实例
 *    上调用，避免了零时变量赋值的麻烦
 *
 *  7）takeUnless
 *     takeif 辅助takeUnless,只有判断给定条件为false时候，takeUnless才会返回原始接收者对象
 *
 *
 *
 *
 */

fun main() {
    // apply
    val file=File("/Users/user/wfc/pwd.txt").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(true)
    }
    println(file.length())
    println(file.absolutePath)
    // let
   var firstElement:Int= listOf(8,1,2,3,4,5,6).first().let{it->
        it * it
    }
    println(firstElement)

    println(formatGreeting(null))
    println(formatGreeting("方晨"))



    var file1=File("/Users/user/wfc/pwd.txt").run {
        readText().contains(",")
    }
    println(file1)

    var result="The people's Republic  of China.".run (::isLong)
    var result1="China.".run (::isLong )
    println(result)
    println(result1)



    var result2= with("The people's Republic  of China."){
        length>10
    }
    println("with 方法测试结果："+result2)



    var elementsArray:List<String>
    var file2=File("/Users/user/wfc/pwd.txt").also {
        println("with 表达式 ${it.name}")
    }.also {
        elementsArray=it.readLines()
    }
    for(str in elementsArray){
        print("with 表达式:$str  ")
    }

    println("")
    println(file2)


    var file4=File("/Users/user/wfc/pwd.txt")
        .takeIf { it.exists()&&it.canRead() }
        ?.readText()

    println("takeif：$file4")

}

fun isLong(name:String)=name.length>=10

fun formatGreeting(greetName:String?):String{
    return greetName?.let {
        "Welcome,$it."
    }?:"What's you name"
}