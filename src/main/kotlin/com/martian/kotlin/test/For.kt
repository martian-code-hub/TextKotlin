package com.martian.kotlin.test

/**
 * 遍历
 */
fun fun7(){
    loop@ for (i in 1..10) {
        println("result: i is $i")
        for (j in 1..10) {
//         if (i == 2 && j==1) break@loop
            if (i == 2 && j==1) break
//            if (i == 2 && j==1) return
        }

    }
}