package com.amorcloud.kotlintest

fun main() {
    testIf(44)
    testWhen1("Tom")
    testWhen1("Jack")
    testWhen1("Mark")
    testWhen1("Mary")
    testWhen2("red")
    testWhen2("blue")
    testWhen3("length")
    testWhen3(2)
    testForIn()
    testList()
}

/**
 *if 判断
 */
fun testIf(age: Int) = if (age > 30) println("old") else println("young")

/**
 * when
 */
//传参when
fun testWhen1(name: String) = when (name) {
    "Tom" -> println("First:$name")
    "Jack" -> println("Second:$name")
    "Mark" -> println("Third:$name")
    else -> println("UnKnow")
}

//不传参数when
fun testWhen2(color: String) = when {
    color == "red" || color == "green" -> println("good color")
    else -> println("bad color")
}

//传任意
fun testWhen3(x: Any) = when (x) {
    is String -> println("x's length：${x.length}")
    else -> println("not String")
}

/**
 * for in
 */
//.. 开区间
//until 半开区间，不包括后面的
//downTo 降序 闭区间，不包括后面的
fun testForIn() {
    for (a in 0..10) {
        println(a)
    }
    for (a in 0 until 10 step 2) println(a)
    for (a in 10 downTo  2 step 2) println(a)
    for (a in listOf("1","2","3")) println(a)
}

fun testList() {
    val list = listOf(1,2,3)
    val filter = list.filter { it > 2 }
    println(filter)
}

class IfWhenForIn {
}