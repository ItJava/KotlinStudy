package com.deling.demo

/***
 * Map的创建
 * to 看上去像关键字，其实它只是省略了点号和参数的特殊函数，to函数 将它的左边和右边的值转换成一对pair
 *
 * map 的读取
 * [] 取值运算符，读取键对应的值，如果键不存在就返回null
 * getValue     读取键对应的值，如果键不存在就抛异常
 * getOrElse    读取键对应的值，或者使用匿名函数返回默认值
 * getOrDefault 读取键对应的值，或者返回默认值
 *
 * map 遍历：forEach
 *
 * 可变的集合
 * 通过mutalbeMapOf创建可变的Map
 * getOrput 键值不存在就添加并返回结果，否则就返回已有键对应的值
 *
 *
 */
fun main() {

    var map= mapOf("Jact" to 20,"Json" to 88,"fangchen" to 99)
    println(map)
    map.forEach { t, u ->
        print("key:$t value:$u   ")
    }
   println()
    var map2= mapOf(Pair("Jack",99),Pair("caixia",33))
    map2.forEach { t, u ->
        print("key:$t value:$u   ")
    }
    println()
    println(map2["caixia"])
    println(map2.get("Jack"))
    println(map2.getOrElse("Jackt"){"UnKnow"})
    println(map2.getOrDefault("Jackkk",3))

    val mutableMap= mutableMapOf("Jact" to 20,"Json" to 88,"fangchen" to 99)
    mutableMap+="武汉" to 28
    mutableMap.put("深圳",9999)

    println(mutableMap.getOrDefault("深圳",100))
    println(mutableMap.getOrDefault("广州",90))


}
