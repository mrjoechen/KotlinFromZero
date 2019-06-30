package iterater

fun main(vararg aaa: String){
    val arrayListOf = arrayListOf<String>("hello", "chen", "qiao")
    arrayListOf.map(::println)

    println("----------------------------")

    var s = "a_b_c_d_e_f_g_h"
    aaa.flatMap {
        it.split("_")
    }.map {
        print("$it ")
    }
}