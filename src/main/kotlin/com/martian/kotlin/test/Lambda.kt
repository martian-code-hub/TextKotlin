package com.martian.kotlin.test

/**
 * lambda
 */
fun fun8(){
    var sumFun:(Int,Int)->Int = {x,y->x+y}
    println("sum: ${sumFun(1,3)}")

}