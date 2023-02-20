package com.amorcloud.kotlintest

class MapTest {
}

fun main() {
    testMap2()
    testMap3()
}

/**
 * 创建Map
 */
fun testMap1() {
    //1
    val map = mapOf("A" to 1, "B" to 2)
    //2
    mapOf(Pair("A", 1), Pair("B", 2))
    //3 可变
    val mutableMap = mutableMapOf("A" to 1, "B" to 2)

}

/**
 * map 的遍历
 */
fun testMap2() {
    val map = mapOf("A" to 1, "B" to 2)

    //1.
    map.forEach {
        println("key:${it.key},value:${it.value}")
    }

    //2.
    map.forEach { (t, u) -> println("key:$t,value:$u") }
}

/**
 * map 方法
 */
fun testMap3() {
    //getOrDefault
    val mutableMap = mutableMapOf("A" to 1, "B" to 2)
    println(mutableMap.getOrDefault("A",-1))
    //getOrPut
    mutableMap.getOrPut("C"){3}
    println(mutableMap)
}