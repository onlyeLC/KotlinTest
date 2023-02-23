package com.amorcloud.kotlintest

fun main() {
    val b = """
        ##question = "$a"
        ##answer = "$c"
    """.trimMargin("##")
    println(b)
    val d = "life is fuck bad = \"$c\""

    println()

    val math = Math("A", "b")
    println(math.area)
    math.area = "5"
    println(math.area)

}

const val a = "life is a question"
const val c = "42"

class Math(val width: String, val height: String) {
    var area: String = ""
        get() = width+height+field
        set(value) {
            field = width.toUpperCase()+height.toUpperCase()+value.toUpperCase()
        }
}
public class Mouth {
    lateinit var tooth:Math
    fun tes() {
        if (::tooth.isInitialized){}
    }
}