package com.amorcloud.kotlintest

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    list2()
    list3()
    list4()
    list5()
    list6()
    list7()
    transform()
    testDistinct()
}

/**
 * 不可变集合 listOf
 */
fun list1() {
    val list = listOf("1","2")
}

/**
 * 可变集合 mutableListOf
 */

fun list2() {
    val mutableListOf = mutableListOf("1", "2")
    mutableListOf.add("3")
    println(mutableListOf)
}

/**
 * 可变与不可变相互转换
 */

fun list3() {
    val list = listOf("1","2")
    val toMutableList = list.toMutableList()
    toMutableList.add("4")
    println(toMutableList)
    val toList = toMutableList.toList()
//    toList.add
}

/**
 * 获取list中元素不越界
 */
fun list4() {
    val list = listOf("1","2")
    list.getOrElse(1) { "越界了"}
    list.getOrElse(4) { "越界了"}
    println( list.getOrNull(4)?:"越界了")
}

/**
 * list 的mutator
 */
fun list5() {
    val list = mutableListOf("1","2")
    list+="2"
    println(list)
}

/**
 * list removeIf
 */
@RequiresApi(Build.VERSION_CODES.N)
fun list6() {
    val list = mutableListOf("AB","A")
    list.removeIf { it.contains("B") }
    println(list)
}

/**
 * 集合遍历方式
 * for
 * list.forEach{}
 * list.forEachIndexed{index,element->....}
 */
fun list7() {
    val list = mutableListOf("1","2","3")
    for (s in list) {
        println(s)
    }

    list.forEach { println("元素:$it") }
    list.forEachIndexed { index, s ->
        println("element:$s,index:$index---")
    }
}

/**
 * 和list大致相同
 */
fun set1() {
    val set = setOf(1, 2, 3, 3)
}

fun set2() {
    val set = mutableSetOf(1, 2, 3, 3)
    println(set)
}

fun set3() {
    val mutableSetOf = mutableSetOf(1, 2, 3, 3)
    mutableSetOf.elementAt(0)
    mutableSetOf.elementAtOrElse(0) { "越界了"}
    println( mutableSetOf.elementAtOrNull(8)?:"越界了")
    mutableSetOf.add(5)
    mutableSetOf+=667
    mutableSetOf-=3
    mutableSetOf.remove(5)
    println(mutableSetOf)
}

/**
 * list转set再转list，可以去重
 */
fun transform() {
    val list = listOf(1,2,2)
    println(list.toSet().toList())
}

/**
 *list.distinct 去重
 * 和上面等价
 */
fun testDistinct() {
    val list = listOf(1,2,2)
    println(list.distinct())
}
