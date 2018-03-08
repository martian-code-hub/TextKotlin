package com.martian.kotlin.base

class Text{

    fun multiLine(){
        val text = """
    |多行字符串
    |菜鸟教程
    |多行字符串
    |Runoob
    """.trimMargin()
        println(text)    //
    }
}
