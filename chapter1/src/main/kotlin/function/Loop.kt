package function


fun main() {


    val charArrayOf = charArrayOf('a', 'b', 'c', 'd')

    for (a in charArrayOf){
        println(a)
    }
    //a
    //b
    //c
    //d

    for ((k, v) in charArrayOf.withIndex()){
        println("$k, $v")
    }
    //0, a
    //1, b
    //2, c
    //3, d

}