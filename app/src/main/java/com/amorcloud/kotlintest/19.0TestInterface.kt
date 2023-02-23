package com.amorcloud.kotlintest

fun main() {
    val mouse = Mouse("雷蛇")
    mouse.insert()
    mouse.pullOut()
}

/**
 * 接口中函数可以有默认实现
 */
interface Usb {

    fun insert()
    fun pullOut(){
        println("拔出USB")
    }
}
class Mouse(private val brand:String) : Usb {
    override fun insert() {
        println("插入$brand")
    }

    override fun pullOut() {
        super.pullOut()
        println("拔出了$brand")
    }

}