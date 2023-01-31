package com.deling.demo

/***
 * 继承：
 * 类默认都是封闭的，要让某个类开放继承，必须使用open关键字修饰它。
 *
 * 函数重载
 * 如果类中的某个方法需要被重写，那么就用关键字override 子类的重写方法
 *
 * 类型检测
 * kotlin 的 is运算符是个不错的工具，可以用来检查某个对象的类型
 *
 * 类型转换：
 * as 操作符声明，它是一个类型转换。 父类转成子类，调用子类方法
 *
 * ANY 是任何类的超类 【Java中的是Object】
 *
 */

open class Product(var name:String) {

    fun description() {
        "Product $name"
    }

    open fun load()="Nothing"

}

class LuxuryProduct:Product("fagnchen"){
    override fun load()="override load --->$name"
    fun special()="LuxuryProduct special function"
    fun special2()="LuxuryProduct special function"
}


fun main() {
    var p=LuxuryProduct()
    println(p.load())
    println(p is LuxuryProduct)  //true
    println(p is Product)        //true
    println(p is Any)

    var p1:Product=LuxuryProduct()
//    if(p1 is LuxuryProduct){
        p1 as LuxuryProduct
        println( p1.special())
        p1.special2()
//    }




}