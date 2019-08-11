package function


fun main() {


    val charArrayOf = charArrayOf('a', 'b', 'c', 'd')

    for (a in charArrayOf){
        println(a)
    }

    for ((k, v) in charArrayOf.withIndex()){
        println("$k, $v")
    }

}