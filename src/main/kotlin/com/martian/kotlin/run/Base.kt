package com.martian.kotlin.run

fun main(args: Array<String>) {
    testRun()
}

fun testRun() {
//    var list  = listOf("a","b","c")
//    var list  = listOf(null,"b","c")
    var list: List<String>? = null

    println(list?.size ?: "empty")

    var printContent = list?.size?: run {
        "list is empty"
    }
    println(printContent)

    println(list?.firstOrNull()?:"first is null")

}