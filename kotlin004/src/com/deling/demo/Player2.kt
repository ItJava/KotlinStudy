package com.deling.demo

/***
 *
 * 初始化块
 * 初始化块可以设置变量或值，以及执行有效性检查，如检查传给某构造函数的值是否有效。初始化块代码会在构造类实例时执行
 * init{} 块
 *
 *
 * 初始化顺序：
 *     主构造函数里声明的属性
 *     类级别的属性赋值
 *     init初始化块里的属性赋值和函数调用
 *     次构造函数里的属性赋值和函数调用
 *
 * 延迟初始化:lateinit 方案
 *  使用lateinit 关键字相当于做了一个约定：在使用它之前负责初始化
 *  只要无法确认lateinit变量是否完成初始化，可以执行isInitialized检查
 *
 * 惰性初始化
 *  延迟初始化并不是退后初始化的唯一方式，可以暂时不初始化某个变量，直到初次使用它，这个叫做惰性初始化
 *  val config by lzazy {}
 *
 */

class Player2(
    var name: String,
    var age:Int,
    var sex:String
){
    constructor(name:String):this(name,age=10,sex="男"){
       age=18
       sex="女"
       println(" 走了次构造方法 ")
    }

    init {
        require(age>0){ "age must be a posistive value" }
        require(name.isNotBlank()){"name 不能为 null" }
        println("init $name $age $sex")
    }


    lateinit var equment:String

    fun ready(){
        equment="B8"
    }
    fun battle(){
        //println(equment)
        if(::equment.isInitialized) println("battle ${equment}")
    }

    val config by lazy { loading() }


    private fun loading():String {
        println("loading")
        return "xxxx"
     }


}

fun main() {
    var player=Player2("方晨",20,"男")
    println("${player.name}  ${player.age}  ${player.sex}")
    var player2=Player2("张三")
    println("${player2.name}  ${player2.age}  ${player2.sex}")

   player2.ready()
   player2.battle()

    Thread.sleep(3000)
    println(player2.config)





}