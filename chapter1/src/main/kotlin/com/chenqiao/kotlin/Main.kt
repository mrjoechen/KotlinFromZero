package com.chenqiao.kotlin

import java.io.BufferedReader
import java.io.FileReader

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020-01-11 17:23
 * @Created by chenqiao
 */


data class Person(val name: String, val age: Int){
     fun work(){
         println("$name is working...")
     }
}

fun main() {

    findPerson()?.let { person ->
        person.work()
        println(person.name)
        println(person.age)
    }

    val also = findPerson()?.also { person ->
        person.work()
    }

    println(also)

    with(Person("zhangsan", 18)){
        work()
    }

    findPerson()?.run {
        work()
    }


    val apply = findPerson()?.apply {
        work()
        print(name)
    }

    println(apply)



    BufferedReader(FileReader("hello.txt")).use {
        var line: String?
        while (true){
            line = it.readLine()?: break
            println(line)
        }
    }


    testBlock1 {
        println(name)
        println(it)
    }

    testBlock2 {
        println(it)
    }

    testBlock3 { a, b ->
        println(a + b)
    }


    print(listOf<String>("aaaaaaaaaaaaaaaaa", "a").max())

}

fun findPerson(): Person?{

    return null
}



fun testBlock1(block: Person.(String) -> Unit){

    val person = Person("aaaaa", 1)
//    block()
    block(person, "chenqiao1")
}

fun testBlock2(block: (String) -> Unit){

    block("chenqiao2")
}

fun testBlock3(block: (String, String) -> Unit){

    block("chenqiao2", "chenqiao3")
}