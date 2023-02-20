package com.amorcloud.kotlintest

/**
 * 通过field 来保存类中的属性值
 */
fun main() {

}
class testField() {
    var num = 1
    //隐式写了
    get() = field
    set(value) { field}
}