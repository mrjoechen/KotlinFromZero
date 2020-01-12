package closure

import org.omg.PortableInterceptor.INACTIVE

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020-01-11 18:29
 * @Created by chenqiao
 */



val string = "hello"


fun makeFun(): () -> Unit{

    var count = 0

    return fun(){
        println(++count)
    }

}


fun main() {

    val a = makeFun()

    a()
    a()
    a()
    a()
    a()

    val add = add(5)
    println(add(2))



}


fun add(x:Int): (Int)-> Int{
    return fun(y:Int): Int{
        return x + y
    }
}

