package com.amorcloud.kotlintest


fun main() {
    Body().Hand().imple()
}

/**
 * 内部类 inner
 */
class Body {
    val height = 1.85
    inner class Hand {
        val num = 5
        fun doWork() {
            println("干活")
        }
        //不能直接引用外部类,内部类需要用inner修饰
        fun imple(){
            println("身高：$height")
        }
    }
    class Mouth {
        val color = "red"
        fun eat() {
            println("吃饭")
        }
        fun imple(){
        }
    }

    fun use() {
        Hand().doWork()
    }
}