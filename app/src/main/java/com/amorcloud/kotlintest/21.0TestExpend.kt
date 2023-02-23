package com.amorcloud.kotlintest

/**
 * 扩展函数
 */
fun main() {
    val a = A()
    a.a()
    a.a1()
    println(a.length)
    B().b1(A())
}

class A {
    companion object {

    }
    fun a() {
        println("A")
    }
}

class B (){
    fun b() {
        println("B")
    }
    fun b1(a:A) {
        /**
         * 调用A的扩展函数
         */
        a.ab()
    }
    /**
     * 其他类中定义的扩展函数
     */
    fun A.ab() {
        /**
         * 可以在这调用A中函数和扩展函数
         */
        a()
        a1()
        /**
         * 可以调用声明类中的函数
         */
        b()
        println("B中A的扩展函数")
    }
}
/**
 * 扩展函数
 */
fun A.a1() {
    println("A的普通函数扩展")
}

/**
 * 可空接收者的扩展函数
 * 通过this指代接收者
 */

fun A?.a2() {
    if (this == null) println("空的") else println("不空")
}

/**
 * 扩展属性，只能通过get、set方法显示调用，不能直接初始化
 */
val A.length:String
    get() = "A的扩展属性"

/**
 * 伴生对象的扩展
 */
fun A.Companion.c() {
    println("A中的伴生对象扩展")
}

