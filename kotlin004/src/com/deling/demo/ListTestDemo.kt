package com.deling.demo

/***
 * 不可变列表：
 * listOF 不可变列表
 *
 * 可变列表：
 * 支持内容修改的列表叫可变列表，于鏊创建可变列表可以试用mutableListOf函数，List还支持试用toList和toMutableList函数
 * 动态的视线只读列表和可变列表的相互装换
 *
 * mutator函数：能修改可变列表的函数有一个统一的名字：mutator函数
 * 遍历：forEach  forEachindexed
 *
 *
 *
 *
 */
fun main() {

    val list= listOf("张三","李四","王五","小强")
    println(list[3])
    println(list.getOrElse(4){"Unknown"})
    println(list.getOrNull(6)?:"UnKnown")

    var mutalbeLists= mutableListOf<String>("北京","上海","广州","深圳","宁波","厦门")
    mutalbeLists.add("重庆")
    mutalbeLists.remove("上海")
    mutalbeLists.forEach(){
        print("城市:$it  ")
    }
    println()
    mutalbeLists+="随州"
    mutalbeLists-="北京"
    println(mutalbeLists.size)
    mutalbeLists.removeIf(){
        it.contains("广州")
    }

    val lists= listOf("张三","李四","王五","小强")
    for(name in lists){
        println("名字：$name")
    }

    lists.forEach { it->
        println("forEach name:$it")
    }

    lists.forEachIndexed { index, s ->
        println("froEachindexed index:$index  name:$s")
    }


}