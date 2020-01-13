package compose

import closure.add

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020-01-11 23:52
 * @Created by chenqiao
 */


fun main(args: Array<String>) {
    println(multiplyBy2(add5(8)))


    val function = add5 andThen multiplyBy2 //m(x) = f(g(x))

    val function1 = add5 compose multiplyBy2//m(x) = g(f(x))

    println(function(8))
    println(function1(8))


    ::addd.curried()(1)(2)(3).println()   // 6




}


val add5 = {int: Int -> int + 5}

val multiplyBy2  = {int: Int -> int * 2}



infix fun <P1, P2, R> Function1<P1, P2>.andThen(function: Function1<P2, R>): Function1<P1, R>{
    return fun(p1 : P1): R{
        return function.invoke(this.invoke(p1))
    }
}

infix fun <P1, P2, R> Function1<P2, R>.compose(function: Function1<P1, P2>): Function1<P1, R>{
    return fun(p1: P1): R{
        return this.invoke(function.invoke(p1))
    }
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
