package com.amorcloud.kotlintest

class LambdaTest {
}

fun main() {
    //第一种调用
    lambdaTest("B",1,{i, j ->  println("lambdaTest:msg:$i,code:$j")})
    //第二种调用
    lambdaTest("B",1, result = {i, j -> println("lambdaTest:msg:$i,code:$j") })
    //第三种调用,如果lambda表达式是函数的最后一个参数，可以把lambda表达式放在函数的括号外面
    lambdaTest("B",1){i, j -> println("lambdaTest:msg:$i,code:$j") }

    lambdaTest2("B",1){i, j -> println("lambdaTest2:msg:$i,code:$j") }

    //调用lambdaTest需要一个lambda表达式,
    lambdaTest("B",1, ::lambdaTest3)

    val lambdaTest4 = lambdaTest4("B", 1)
    println(lambdaTest4("B",1))
}

/**
 * 定义一个入参为函数的函数
 */
fun lambdaTest(a:String,b : Int,result:(String,Int)->Unit) {
    if (a == "A" && b == 1) result("成功", b) else result("失败",b)
}

/**
 * 定义一个入参为lambda表达式的函数，需要使用内联关键字：inline声明函数
 * 不使用inline修饰，在调用时，会将lambda表达式转换为对象来调用，(造成性能损耗)
 * 使用时则不会，是将函数在调用端实现一遍，相对性能损耗低
 */
inline fun lambdaTest2(a:String,b : Int,result:(String,Int)->Unit) {
    if (a == "A" && b == 1) result("成功", b) else result("失败",b)
}

/**
 * lambda表达式是函数类型的对象
 * 函数的引用，通过::来将函数变为函数类型的对象
 */
fun lambdaTest3(a:String,b: Int) {
    println("lambdaTest3:msg:$a,code:$b")
}

/**
 * 函数返回一个函数类型
 */
fun lambdaTest4(a:String,b: Int) :(String,Int)->String{
    println("lambdaTest4:msg:$a,code:$b")
    return {i:String,j:Int-> "匿名函数:我是$i,我有$j"}
}