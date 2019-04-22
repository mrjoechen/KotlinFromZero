package test


fun main(args: Array<String>){
    println("-------------------------------")
    add(1,2)


    //变量
    var a = "hello"
    a = "helloworld"
    println(a)

    //常量
    val b = "nihao"
//    b = "hello"
    println(b)

}


fun add(a: Int, b: Int){
    println(a + b)
}
