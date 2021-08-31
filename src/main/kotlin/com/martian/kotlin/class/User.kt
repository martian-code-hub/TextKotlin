package com.martian.kotlin.`class`

/**
 * Create by：Martian
 * on 2021/8/31
 */
class User(name:String){
    var name:String = "martian"
    get() = field
    set(value) {
        field = value
    }
    var age:String = "18"
    get() = field
    set(value) {
        field = value
    }
    init {
        this.name = name
    }

    constructor(name:String,age:String):this(name){
        this.age = age
    }

}