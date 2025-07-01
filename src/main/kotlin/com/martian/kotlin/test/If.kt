package com.martian.kotlin.test

fun foo(param: Int) {
    val result = if (param == 1) {
        "one"
    } else if (param == 2) {
        "two"
    } else if (param == 3){
        "three"
    }else{

    }
    println(result)
}

fun fun1(){
//     val list = ['a','b','c','d']
    val list = listOf('a','b','c','d')
    val prin = if ('b' in list) "has" else "no"
    println(prin)
}