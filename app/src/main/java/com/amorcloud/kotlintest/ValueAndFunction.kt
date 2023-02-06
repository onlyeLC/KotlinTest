package com.amorcloud.kotlintest

var age = 0
private val name = "丁如意"
//只读变量
val sex = "女"
//变量
var status = "美丽"
//常量
const val test : String = ""
fun main() {
    println("姓名:${name},性别：${sex},年龄:${grow1(18)},状态：$status")
//    println("age2:${grow2(28)}")
//    grow3()
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


