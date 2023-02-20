package com.amorcloud.kotlintest

class LateinitAndByLazy {
}

//延迟初始化
lateinit var data: String


fun main() {
    testLateInit()
    //类新建时还未初始化
    val testByLazy = TestByLazy()
    println("新建对象")
    println(testByLazy.man)
    println(testByLazy.man)
}

/**
 * lateinit
 */
fun testLateInit() {
    //直接调用：lateinit property data has not been initialized
    //需要先初始化
    data = "OK"
    println(data)
}

/**
 * by lazy 延迟初始化，只有在第一次调用才初始化
 *    public actual fun <T> lazy(initializer: () -> T): Lazy<T> = SynchronizedLazyImpl(initializer)
 *    lazy是带有同步锁的，当不需要时如下添加,需要确定如下属性初始化都是在同一线程中
 *
 *    val female by lazy(@Link{LazyThreadSafetyMode.NONE}) {
 *              println("初始化")
 *     }
 */
class TestByLazy {
    val man by lazy {
        println("初始化")
        "by lazy init"
    }
    val female by lazy(LazyThreadSafetyMode.NONE) {
        println("初始化")
    }
}




