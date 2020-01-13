package com.chenqiao.kotlin.function

fun main() {


    val x = 5

    var mode = if (x == 5){
        true
    }else{
        false
    }

    println(mode)

    println(mode)


    when(x){//满足一个就break
        is Int -> println("x is Int = "+ (x is Int))
        in 1..100 -> println("===")
        !in 100..1000 -> println("---")
        5 -> println("x = $x")
        else -> println("-------")
    }


    mode = when{
        x != 5 -> true
        else -> false
    }



}