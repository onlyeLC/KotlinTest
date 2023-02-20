package com.amorcloud.kotlintest
/**
 * 内置函数
 */
fun main() {
    testApply("onlye")
    println()
    testRun("onlye")
    println()
    testWith("onlye")
    println()
    testAlso("onlye")
    println()
    println(testTakeIf("onlye"))
    println(testTakeIf("nlye"))
    println()
    println(testTakeUnless("onlye"))
    println(testTakeUnless("nlye"))
}

/**
 * apply函数
 * apply中this即为调用者本身
 * 返回的也是调用者本身
 * 所以可以统一对一个对象做一批配置：比如针对view做一系列操作
 */
fun testApply(str: String) {
    val apply = str.apply {
        toLowerCase()
        capitalize()
    }
    println(apply)

}

/**
 * run函数
 * this代表调用者
 * 返回的是最后一行内容
 * 所以一般作为链式调用
 */
fun testRun(str: String) {
    val run = str.run {
        true
    }.run {
        46.55f
    }
    println(run)
}

/**
 * with函数
 *将调用者作为参数传入
 * 并将结果返回给调用者
 */
fun testWith(str: String) {
    val with = with(str) {
        toUpperCase()
    }
    println(with)
}

/**
 * also函数
 * it 代表调用者
 * 返回调用者本身，和apply特性一样
 */
fun testAlso(str: String) {
    val also = str.also {
        it.capitalize()
        it.length
        it.toLowerCase()
    }
    println(also)
}

/**
 * take if 函数
 * it 为调用者本身
 * 根据函数体，true 返回调用者本身，false 返回null
 */
fun testTakeIf(str: String): String {
    return str.takeIf {
        it.contains("o")
    } ?: "不包含o"
}

/**
 * take unless 函数
 * it 为调用者本身
 * 根据函数体，true 返回null，false 调用者本身
 */
fun testTakeUnless(str: String): String {
    return str.takeUnless {
        it.contains("o")
    } ?: "不包含o"
}