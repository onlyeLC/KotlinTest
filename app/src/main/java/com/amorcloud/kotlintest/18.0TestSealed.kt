package com.amorcloud.kotlintest

/**
 * 密封类
 * 类似于枚举类的用法
 * 密封类只能通过其子类实例化
 * 可以和when一起使用，不需要写else
 */
fun main() {
    Score.Score4(5).getScore()
}

sealed class Score {
    object Score1:Score()
    object Score2:Score()
    object Score3:Score()
    class Score4(num:Int):Score()

    fun getScore() {
        println(1)
    }
}