package com.amorcloud.kotlintest

/**
 * 运算符重载
 * 通过operator 重写操作符方法
 */
fun main() {
    println(Add(1)+Add(2) )
}

/**
 * + operator fun plus
 */
class Add(private val num:Int) {
    operator fun plus(a:Add) = num+a.num
}

/**
 * 一元操作符
 * +a：a.unaryPlus()
 * -a: a.unaryMinus()
 * !a: a.not()
 * 类似以上，操作符都可以重载
 */