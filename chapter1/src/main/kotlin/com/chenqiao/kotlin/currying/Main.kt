package com.chenqiao.kotlin.currying

import java.io.OutputStream

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020-01-14 13:37
 * @Created by chenqiao
 */


fun main(args: Array<String>) {

    ::addd.curried()(1)(2)(3).println()   // 6

}


fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.curried()
        = fun(p1: P1) = fun(p2: P2) = fun(p3: P3) = this(p1, p2, p3)

fun <P1, P2, R> Function2<P1, P2, R>.curried()
        = fun(p1: P1) = fun(p2: P2) = this(p1, p2)

fun addd(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun Int.println(){
    println(this)
}



fun log(tag: String, target: OutputStream, message: Any?){
    target.write("[$tag] $message\n".toByteArray())
}

fun log(tag: String)
        = fun (target: OutputStream)
        = fun (message: Any?)
        = target.write("[$tag] $message\n".toByteArray())
