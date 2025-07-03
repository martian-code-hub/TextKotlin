package com.martian.kotlin.`in`

fun main(args: Array<String>) {
    testIn4()
}

fun testIn() {
    val x = 10
    val y = 9
    if(x in 1 .. y){
        println("fits in range")
    }else{
        println("fits not in range")
    }
}

fun testIn2(){
    val list = listOf("a","b","c")
    val index = -1
    if(index in 0..list.lastIndex ){
        println("index in range")
    }else{
        println("index not in range")
    }
}

fun testIn3(){
    for (x in 0..10){
        print("$x ")
    }
    println()

    for (x in 10 downTo 0){
        print("$x ")
    }
    println()
    for (x in 10 downTo 0 step 3){
        print("$x ")
    }
}

fun testIn4(){
    for(x in 0 until 10 ){
        print("$x ")
    }
}