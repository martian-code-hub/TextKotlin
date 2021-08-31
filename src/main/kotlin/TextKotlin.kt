fun main(args: Array<String>) {
    textHelloWorld()
//    print(sum(1, 3, 6));
//    print(vars(1, 3, 6, 9, 11));
}

//判空
fun text() {
    var name: String? = ""
    name = null
}

//三目运算符
fun text1() {
    var name: String? = null
    var l = name?.length ?: -1
    print(l)
}

fun textHelloWorld() {
    var name: String? = null
    name = "hello world"
    var l = name?.length ?: -1
    print(name)
}


