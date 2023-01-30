package com.deling.demo

/**
 *
 * Set创建和元素的获取
 * 不可变set集合：通过setOf创建set集合，使用elementAt函数读取集合中的元素
 * setOf创建
 * elementAt:元素获取
 *
 * 不可变集合：
 * mutableSetof
 *
 * 集合转换：
 * list 转set 去掉重复元素  toSet()
 * set 转 list : toList()
 * list 集合中 快捷函数去重
 *
 */
fun main() {
    val set= setOf("上海","北京","天津","武汉")
    println(set.elementAt(3))

    var setMutable= mutableSetOf("上海","北京","天津","武汉")
    setMutable.add("上海")
    setMutable.forEachIndexed { index, s ->
        print("index $index - $s   ")
    }
    println()
    setMutable.add("深圳")
    setMutable.forEachIndexed { index, s ->
        print("index $index - $s   ")
    }
    setMutable+="黄冈"
    println()
    setMutable.forEachIndexed { index, s ->
        print("index $index - $s   ")
    }
    setMutable-="上海"
    println()
    setMutable.forEachIndexed { index, s ->
        print("index $index - $s   ")
    }

   val list= listOf("上海","北京","北京","天津","武汉","武汉")
   var listnow=list.toSet().toList()

    println()
    listnow.forEachIndexed { index, s ->
        print("index $index - $s   ")
    }

    val listtest= listOf("上海","北京","北京","天津","武汉","武汉").distinct()
    println()
    listtest.forEachIndexed { index, s ->
        print("listtest $index - $s   ")
    }



}