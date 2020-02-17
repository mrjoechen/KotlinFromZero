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
        this.age
    }

    testBlock2 {

    }


}

fun findPerson(): Person?{

    return null
}



fun testBlock1(block: Person.() -> Unit){

    val person = Person("", 1)
//    block()
    block(person)
}

fun testBlock2(block: () -> Unit){

    block()
}