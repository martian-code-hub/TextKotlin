fun main(args: Array<String>) {
    text1()
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
