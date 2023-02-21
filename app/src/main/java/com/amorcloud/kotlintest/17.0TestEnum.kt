package com.amorcloud.kotlintest

/**
 * 枚举类
 * * 可以和when一起使用，不需要写else
 */
fun main() {
    println(Color.values().joinToString {
        it.toString()
    })
    println(Color.GREEN)
    Color.values().forEach {
        it.showExplain()
    }
}

/**
 * 枚举类中可以增加构造函数
 */
enum class Color(private val explain: String) {
    RED("红"),
    GREEN("绿"),
    BLUE("蓝");

    fun showExplain() {
        println(explain)
    }
}