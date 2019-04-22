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

    val aByte: Byte = Byte.MAX_VALUE
    val bByte: Byte = Byte.MIN_VALUE

    println("aInt:"+aByte)
    println("bInt:"+bByte)

    val aInt = 0b1100
    println(aInt)

}


fun add(a: Int, b: Int){
    println(a + b)
}
