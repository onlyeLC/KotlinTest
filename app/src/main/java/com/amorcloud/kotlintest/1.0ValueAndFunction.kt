package com.amorcloud.kotlintest

/**
 * 变量的声明具有类型推导机制
 * 函数的声明更加简化
 */
var age = 0
private val name = "测试"
//只读变量
val sex = "男"
//变量
var status = "帅气"
//常量
const val test : String = ""
fun main() {
    println("姓名:${name},性别：${sex},年龄:${grow1(18)},状态：$status")
//    println("age2:${grow2(28)}")
//    grow3()
//    name = ""
    testVararg("1","2", isTrue = true)
    1 add 2
}
//原始有返回函数
fun grow1(age:Int) :Int{
    return  age+1
}
//减缩版有返回函数
fun grow2(age: Int) = age+1

//减缩版无返回函数
fun grow3() = println(age+2)

/**
 * vararg 可变数量的参数 ，可以传递多个用逗号隔开的参数
 * 需要把vararg修饰的入参写在最前面
 */
fun testVararg(vararg inPut:String,isTrue:Boolean) {

}

/**
 * 中缀函数 infix 定义在成员函数和扩展函数前面，可以省略点和括号
 * 1.add(2),代替为 1 add 2
 */
infix fun Int.add(int: Int){
    println(this+int)
}