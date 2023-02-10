package com.amorcloud.kotlintest

import kotlin.math.roundToInt

fun main() {
    testSubstring(NAME)
    testSplit(NAME)
    testReplace(NAME)
    testForEach(NAME)
    testEqual()
    testSafeTransform()
    testToInt()
}

const val NAME = "onlye,is,a,good,person"

/**
 * 测试substring
 */
fun testSubstring(str: String) {
    //等同于java写法
    println(str.substring(0, str.indexOf(",")))
    //kotlin中一般这么写 ，使用until
    println(str.substring(0 until str.indexOf(",")))
}

/**
 * split
 */
fun testSplit(str: String) {
    //等同于java写法
    println(str.split(","))
    //可以使用(a,b,c...)来接收
    val (a,b,c,d,e) = str.split(",")
    println("解构后：a:$a")
}

/**
 * replace
 */
fun testReplace(str: String) {
    //等同于java
    println(str.replace("e","2"))

}

/**
 * forEach
 */
fun testForEach(str: String) {
    str.forEach {
        println(it)
    }
}

/**
 * === 比较的是String的引用
 */
fun testEqual() {
    val name1 = "onlye".capitalize()
    println(name1)
    val name2 = "Onlye"
    println(name1 === name2)
}

/**
 * 类型安全转换
 */
fun testSafeTransform() {
    var num:String = "666"
    val toInt = num.toInt()
    //当类型为double时，无法成功转换，使用toIntOrNull函数。后续涉及到类型转换，都需要使用这个
    num = "999"
    val toIntOrNull:Int? = num.toIntOrNull()
    println(toIntOrNull?:"转换失败")
}

/**
 * roundToInt函数
 * double转int时，是四舍五入效果
 */

fun testToInt() {
    println(66.452.toInt())
    println(66.452.roundToInt())
    println(66.552f.roundToInt())
    println("%.3f".format(65.2398))
}