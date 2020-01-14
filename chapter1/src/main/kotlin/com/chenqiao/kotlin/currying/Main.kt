package com.chenqiao.kotlin.currying

import com.sun.org.apache.xpath.internal.functions.Function2Args
import java.io.OutputStream
import java.nio.charset.Charset

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020-01-14 13:37
 * @Created by chenqiao
 */


fun main(args: Array<String>) {

    ::addd.curried()(1)(2)(3).println()   // 6


    log("chenqiao")(System.out)("test")

}


fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.curried()
        = fun(p1: P1) = fun(p2: P2) = fun(p3: P3) = this(p1, p2, p3)

fun <P1, P2, R> Function2<P1, P2, R>.curried()
        = fun(p1: P1) = fun(p2: P2) = this(p1, p2)

fun addd(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun Any.println(){
    println(this)
}



fun log(tag: String, target: OutputStream, message: Any?){
    target.write("[$tag] $message\n".toByteArray())
}

fun log(tag: String)
        = fun (target: OutputStream)
        = fun (message: Any?)
        = target.write("[$tag] $message\n".toByteArray())


/**
 * 偏函数
 */
fun <P1, P2, R> Function2<P1, P2, R>.partial1(p1: P1) = fun(p2: P2) = this(p1, p2)
fun <P1, P2, R> Function2<P1, P2, R>.partial2(p2: P2) = fun(p1: P1) = this(p1, p2)

val makeString = fun(byteArray: ByteArray, charSet: Charset): String{
    return String(byteArray, charSet)
}

val makeStringFromGbkByte = makeString.partial2(charset("GBK"))