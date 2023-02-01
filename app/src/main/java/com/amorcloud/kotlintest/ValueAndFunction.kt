package com.amorcloud.kotlintest

var age = 0
val name = "onlye"
val sex = "男"
fun main() {
    println("name:$name")
    println("age1:${grow1(18)}")
    println("age2:${grow2(28)}")
    grow3()
//    name = ""
}
//原始有返回函数
fun grow1(age:Int) :Int{
    return  age+1
}
//减缩版有返回函数
fun grow2(age: Int) = age+1

//减缩版无返回函数
fun grow3() = println(age+2)


