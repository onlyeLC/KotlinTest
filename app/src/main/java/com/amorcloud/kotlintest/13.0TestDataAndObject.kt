package com.amorcloud.kotlintest

/**
 * 数据类
 */
data class DataBean(val name:String) {

}

/**
 * 单例类
 */
object TestObject {
    fun test() {
        println("onject:test")
    }
}

fun main() {
    println(DataBean("A").toString())
    TestObject.test()
}