package com.martian.kotlin.`class`

/**
 * Create by：Martian
 * on 2021/8/31
 */
fun main(args: Array<String>) {
    var runoob = Runoob()
    println(runoob.max(2,3))
    testGetAndSet()
}

/**
 * get set
 */
fun testGetAndSet(){
    val user = User("martian3")
    println(user.name+":"+user.age)
    user.name = "martian5"
    user.age = "20"
    println(user.name+":"+user.age)

    val user2 = User("apple","20")
    println(user2.name+":"+user2.age)
}