package com.martian.kotlin.test

/**
 * let
 * it
 * return
 */
fun funLet() {
    val result = "testLet".let {
        println(it.length)
        1000
    }
    println(result)
}

/**
 * with
 * this
 * return
 */
fun funWith() {
    val user = User("Kotlin", 1, "1111111")
    val result = with(user) {
        println("my name is $name, I am $age years old, my phone number is $phoneNum")
        1000
    }
    println("result: $result")
}

/**
 * run
 * this
 * return
 */
fun funRun() {
    val user = User("Kotlin", 1, "1111111")
    val result = user.run {
        println("my name is $name, I am $age years old, my phone number is $phoneNum")
        1000
    }
    println("result: $result")
}

/**
 * apply
 * this
 * not return
 */
fun funApply() {
    val user = User("Kotlin", 1, "1111111")
    val result = user.apply {
        println("my name is $name, I am $age years old, my phone number is $phoneNum")
        1000
    }
    println("result: $result")
}

/**
 * also
 * it
 * no return
 */
fun funAlso() {
//    var a = 1
//    var b = 2
//    a = b.also {
//        b = a
//        1000
//    }
//    println("result: a is $a , b is $b")

    val list = mutableListOf(1, 2, 3).also {
        it.add(4)
        println("当前列表状态：$it")
    }
    println("result: list size is ${list.size}")
}

fun main(args: Array<String>) {
    funAlso()
}