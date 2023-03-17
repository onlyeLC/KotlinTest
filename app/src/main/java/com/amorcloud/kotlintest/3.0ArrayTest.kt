package com.amorcloud.kotlintest

import java.io.File

/**
 * 数组的使用
 */
class ArrayTest {

}

fun main() {
    //最常用是各种数据类型的xxxArrayOf
    arrayTest1()
    arrayTest2()
    arrayTest3()
    arrayTest4()
    arrayTest5()
    arrayTest6()
}

/**
 * Array(2){5}创建集合，两个，每个都是5
 */
fun arrayTest1() {
    val array = Array(2) { 5 }
    array.forEach {
        println("array:$it")
    }
}

/**
 *IntArray(2){2}同上
 */
fun arrayTest2() {
    val array = IntArray(2){5}

    array.forEach {
        println("array:$it")
    }
}

/**
 * arrayOf(2,2)相当于：new Int()[2,2]
 */
fun arrayTest3() {
    val array = arrayOf(2, 2)
    array.forEach {
        println("array:$it")
    }
}

/**
 * intArrayOf(2,2)相当于：new Int()[2,2]
 */
fun arrayTest4() {
    val array = intArrayOf(2,2)
    array.forEach {
        println("array:$it")
    }
}

/**
 * 二维数组
 */
fun arrayTest5() {
    val array = arrayOf(arrayOf(3, 3), arrayOf(4, 4))
    array.forEach {
        it.forEach { println(it) }
    }
}

/**
 * 数组操作函数
 */
fun arrayTest6() {
    //最大，最小
    val array = arrayOf(4, 6, 5, 5, 25, 4, 24, 67)
    val max = array.maxOrNull()
    println(max)
//    val binarySearch = array.binarySearch()
//    println(binarySearch)
}

/**
 *对象类型返回对象数组
 */
fun arrayTest7() {
    val arrayOf = arrayOf<File>(File("2"), File("1"), File("3"),)
}
