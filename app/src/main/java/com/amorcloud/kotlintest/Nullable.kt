package com.amorcloud.kotlintest

/**
 * 类型后加?表示变量可空
 */
class Nullable {
}

fun main() {
    testElvis(5)
    testElvis(null)
    safeForceTransfer(5)
    safeForceTransfer(2)
}

/**
 * 测试空
 */
fun testNull() {
    val testData: List<Int?> = listOf(1, 2,null)
//    var testData: MutableList<Int> = mutableListOf(1, 2,null)
    val filterNotNull: List<Int> = testData.filterNotNull()//将可空集合变为不可空集合
}
/**
 * Elvis ?: 运算符 当?前条件为空时，调用:后面内容
 */
fun testElvis(num:Int?) {
    val name:String? = null
    val len = name?.length ?: -1//下面的操作可用?:简化代码
//    var len = if (name!=null) name?.length else -1

    val number = num ?: -1
    println(number)
}
/**
 * 安全转换 as?
 * ?????
 */
fun safeForceTransfer (value:Int?) {
    val fl :Float?= value as? Float
}

/**
 * 非空断言 !!.
 */
fun notNullTest(dog:String?){
    val length = dog!!.length
}

/**
 *  let 函数
 *  当全局变量可为空时，在函数内调用这个变量，此变量有可能为空
 *  此时可通过let函数
 */
var str:String? = null
fun testLet() {
//    if (str!=null) {
//        // TODO: 将str置为空
//        val length = str.length
//    }
}
fun testLet2() {
    //需通过it调用,通过str调用还是编译不通过
    str?.let {
        if (it.length>10) {
            println(it.length)
        }
    }
//    str?.let {
//        if (str.length>10) {
//        }
//    }

}

/**
 * 提前测试变量是否为空checkNotNull()和requireNotNull()
 * 在先给其他人调用的函数时，提前判断传入的参数
 */
fun preCheck() {
    var a: String? = null
    var b:Boolean = false
//    checkNotNull(a)
//    requireNotNull(a)
    require(b)
}