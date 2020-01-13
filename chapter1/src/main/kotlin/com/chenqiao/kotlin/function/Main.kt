package com.chenqiao.kotlin.function

fun main() {

    fun1(100)

    println(fun2(1, 2))

    println(fun3("hello"))//hello kotlin.Unit

    println(fun4(1, 1))
    println(fun4.invoke(1, 1))



    fun5//
    println(fun5)//Function0<kotlin.Unit>
    fun5()//hello
    fun5.invoke()//hello


    val charArrayOf = charArrayOf('a', 'b', 'v', 'b', 'q', '!')
    for (i in charArrayOf)
        println(i)

    charArrayOf.forEach { a -> print(a) }

    charArrayOf.forEach { println(it) }

    charArrayOf.forEach (::println)

    println("-------------------------------")

    charArrayOf.forEach FOREACH@{
        if (it == 'q') return@FOREACH//返回 foreach
            println(it)
    }

    charArrayOf.forEach {
        if (it == 'q') return //返回main
            println(it)
    }

    println("The End !")
}

val fun1 = fun(a: Int) {
    println(a.toLong())
}

val fun2 = fun(a: Int, b: Int) = a + b

val fun3 = fun(a: String) = println(a)

//lambda
val fun4 = { a: Int, b: Int -> a + b }

val fun5 = { println("hello")}