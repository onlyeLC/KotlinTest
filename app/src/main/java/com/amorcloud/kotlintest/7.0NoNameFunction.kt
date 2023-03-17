package com.amorcloud.kotlintest

fun main() {
    test()
    test2()
    test3()
    test5()
}

fun test() {
    val count = "Marry".count()
    println(count)
    //根据给定的Boolean条件判断,遍历给定的"Marry"的每一个Char，是否符合函数内表达式
    val count1 = "Marry".count {
        it == 'r'
    }
    println(count1)
}

/**
 * 函数使用，只有一个入参
 */
fun test2() {
    //1.定义函数，函数的输入和输出
    // [val func:()->String]  func:()函数的输入，String为函数的输出，对比函数定义，fun test(){ }
    //有入参不需要参数名
    //2.函数的实现
    val func:(Int)->String = {
        //函数内不需要写return，最后一行默认为函数的返回值
        println(it)
        "$it"
    }
    //Unit即当前函数无返回
//    val func:(a:Int)->Unit = {
//        println(it)
//    }
    //3.调用函数
    func(108)
}

/**
 * 函数使用，多个入参
 */
fun test3() {
    //1.定义函数，函数的输入和输出
    // [val func:()->String]  func:()函数的输入，String为函数的输出，对比函数定义，fun test(){ }
    //有入参不需要参数名
    //2.函数的实现
    val func:(Int,Int,Int)->String = { i, i1, i2 ->
        val b = "1:$i,2:$i1,3:$i2"
        println(b)
        b
    }
    //Unit即当前函数无返回
//    val func:(a:Int)->Unit = {
//        println(it)
//    }
    //3.调用函数    func.invoke(108,100,0)也可以调用函数
    func(108,100,0)
}

fun tes4() {
    //
    val func:(Int)->String = { "$it" }
    //上面的代码等价于下面的代码，所以Kotlin自动给函数的入参增加为it；只有一个入参的情况
    fun func(it:Int):String{return "$it" }

}

/**
 *  函数名:()->Any = { }的方式来定义函数需要制定函数返回类型
 * 函数名={ }，不需要指定函数返回类型
 * ※※※※※※※※此种定义方式即为lambda表达式
 *
 * {参数1:数据类型,参数2:数据类型,... -> 函数体}
 */
fun test5() {
    val func = {a:Int,b:Int ->"a:$a,b:$b"}
    println(func(1,2))
}