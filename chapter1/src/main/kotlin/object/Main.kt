package `object`

fun main(aaa: Array<String>) {

    SingeObject.printHello()

    print(SingeObject.s)

    D.method()


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