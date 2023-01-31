package com.deling.demo

import java.util.*

/***
 * field
 * 针对定义的每一个属性，kotlin都会产生一个field,一个getter,一个setter,field用来存储属性数据，不能直接定义field.
 * kotlin 会封装field,保护里面的数据，只会暴漏给getter和setter方法使用。
 *
 * 在需要控制如何读写属性数据的时候，可以自定义他们
 *
 *
 * 防范竞态条件
 *  如果一个类属性即可空又可变，那么引用它之前需要保证它非空，一个办法就是用also函数
 *
 */

class Player{
    var name="jack"
    var sex="nv"
    get()=field.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

        set(value){
        field=value.trim()
    }

    var words:String?="方晨"
    var wordss:String?=null
    fun saySomeThing(){
        words?.also {
            println("Hello ${it}")
        }
    }
   fun saySomeToThing(){
       wordss?.also {
            println("Hello ${it}")
        }
    }


}

fun main() {
    var p=Player()
    println(p.name)
   p.name=" rose "
    println(p.name)
    println(p.sex)

    println(p.saySomeThing())
    println(p.saySomeToThing())

}