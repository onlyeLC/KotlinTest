package com.amorcloud.kotlintest

/**
 *  1.给函数添加默认值，参数前面添加val或者var则默认为创建为类中字段,代替多构造函数
    2.继承父类使用 ：,父类加括号，构造函数要写
    3.
 */
class Student(
    name: String = "Jack",
    var age: Int = 16,
    val sex: String,
    father: String = "none",
    mother: String = "none"
) : Person(name,father, mother) {
    fun showDetail() = println("name:$name,age:$age,sex:$sex,father:$father,mother:$mother")
}

fun main() {
    val mary = Student(name = "Mary", 18, "女")
    val jack = Student(sex = "未知",father = "Tom",mother = "Jerry")
    mary.showDetail()
    jack.showDetail()
    jack.teach()
}
