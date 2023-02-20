package com.amorcloud.kotlintest

fun main() {
    println(testCompanion.print())
}

/**
 * 伴生对象companion object 这个对象是静态的，只加载一次
 * 类似于java中static的作用，
 *
 */
class testCompanion {
    companion object {
        const val name:String = "伴生对象"
        fun print() {
            println("$name")
        }
    }
}