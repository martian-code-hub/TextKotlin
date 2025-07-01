package com.martian.kotlin.test

/**
 * let
 */
fun funLet(){
    val result = "testLet".let {
        println(it.length)
        1000
    }
    println(result)

}

/**
 * with
 */
fun funWith(){
    val user = User("Kotlin", 1, "1111111")

    val result = with(user) {
        println("my name is $name, I am $age years old, my phone number is $phoneNum")
        1000
    }
    println("result: $result")
}

/**
 * run
 */
fun funRun(){
    val user = User("Kotlin", 1, "1111111")
    val result = user.run{
        println("my name is $name, I am $age years old, my phone number is $phoneNum")
        1000
    }
    println("result: $result")
}

/**
 * apply
 */
fun funApply(){
    val user = User("Kotlin", 1, "1111111")
    val result = user.apply {
        println("my name is $name, I am $age years old, my phone number is $phoneNum")
        1000
    }
    println("result: $result")
}

/**
 * also
 */
fun funAlso(){
    var a = 1
    var b = 2
    a = b.also{
        b = a
    }
    println("result: a is $a , b is $b")
}