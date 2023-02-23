package com.amorcloud.kotlintest

import android.content.Context
import android.content.Intent

/**
 * 泛型的测试
 * 和java中泛型的使用基本一样 符合PECS（Producer extends Consumer super）原则
 * 边界：class MyClass2<T> where T : Animal, T : Food, T : Food2   能有多个边界，多个边界中只有一个类，且放在最前面，用where说明
 *        等同于java class MyClass2 <T extends Animal & Food & Food2>
 * 通配符：out Number 等同于<? extends Number>  用out修饰的变量原则上只允许读取，不允许写
 *         in Number 等同于<？ super Number>   用in修饰的变量原则上只允许写，不允许读
 *         <*> <out Any> 等同于<？> 效果等同于<？> <? extends Object>
 * 多一个泛型实化
 */
fun main() {
    var work1: Work1<People> = Work1(Man("Jack"))

    val genericType1 = getGenericType<Number>()
    val genericType2 = getGenericType<Double>()
    println(genericType1)
    println(genericType2)
}

open class People(val name: String)

class Man(name: String) : People(name)

class Woman(name: String) : People(name)

/**
 * in 修饰 只写
 */
class Work1<in T>(private val people: T) {
    //    fun getWorker(): T {
//        return people
//    }
    fun setWorker(people: T) {
        println(people.toString())
    }

}

/**
 * out 修饰 只读
 */
class Work2<out T>(private val people: T) {
    fun getWorker(): T {
        return people
    }

//    fun setWorker(people: T) {
//        println(people.toString())
//    }

}

/**
 * 泛型实化
 * 通过内联函数和reified 关键字获取泛型
 * 这种方法在java中会被擦除
 */
inline fun <reified T> getGenericType()  = T::class.java

/**
 * 泛型实化应用
 */
class TestActivity
//一般如下写
fun startActivity(mContext:Context) {
    val intent = Intent(mContext,TestActivity::class.java)
    mContext.startActivity(intent)
}
//优化写法，通过inline+reified
inline fun <reified T> startActivity1(mContext:Context) {
    val intent = Intent(mContext,T::class.java)
    mContext.startActivity(intent)
}
//优化写法，通过inline+reified 同时加上需要传递的额参数
inline fun <reified T> startActivity(mContext: Context, block: Intent.() -> Unit){
    val intent = Intent(mContext,T::class.java)
    intent.block()
    mContext.startActivity(intent)
}

fun start(context:Context){
    startActivity(context)
    //更加灵活，跳转时即可将对应activity注明
    startActivity1<TestActivity>(context)
    //更加灵活，跳转时即可将对应activity注明，同时将参数传递
    startActivity<TestActivity>(context){
        putExtra("params1","erdai")
        putExtra("params2","666")
    }
}

