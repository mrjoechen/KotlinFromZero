package com.chenqiao.kotlin.collection

import com.chenqiao.kotlin.log


fun collection(){

    val arrayOf = arrayOf("a", "b", "c")

    val listOf = listOf("a", "b", "c")

    listOf[0]

    listOf.get(0)

    val toMutableList = listOf.toMutableList()
    toMutableList.add("fff")


//    listOf.add

    val mutableListOf = mutableListOf("a", "b", "c")

    mutableListOf.add("d")

    mutableListOf.removeAt(0)

    for (e in mutableListOf){
        print(e)
    }

    val list: List<Any> = listOf




    //set
    val set = setOf("a", "b", "c")

    set.toMutableSet()

    val mutableSetOf = mutableSetOf("a", "b", "c")
    mutableListOf.add("d")



    //map
    val mapOf = mapOf("a" to 1, "b" to 2)

    mapOf.toMutableMap()

    val mutableMapOf = mutableMapOf("a" to 1, "b" to 2)
    mutableMapOf.put("a", 3)

    mutableMapOf.get("a")

    mutableMapOf["a"]

    mutableMapOf["a"] = 2


    //Sequence
    sequenceOf("a", "b")

}

//不使用Sequences序列，使用普通的集合操作
fun computeRunTime(action: (() -> Unit)?) {
    val startTime = System.currentTimeMillis()
    action?.invoke()
    println("the code run time is ${System.currentTimeMillis() - startTime}")
}

fun main(args: Array<String>) {
    computeRunTime {
        (0..10000000)
                .map { it + 1 }
                .filter { it % 2 == 0 }
                .count { it < 10 }
                .run {
                    println("by using list way, result is : $this")
                }
    }

    computeRunTime {
        (0..10000000)
                .asSequence()
                .map { it + 1 }
                .filter { it % 2 == 0 }
                .count { it < 10 }
                .run {
                    println("by using sequences way, result is : $this")
                }
    }

    (0..6)
            .asSequence()
            .map {//map返回是Sequence<T>，故它属于中间操作
                println("map: $it")
                return@map it + 1
            }
            .filter {//filter返回是Sequence<T>，故它属于中间操作
                println("filter: $it")
                return@filter it % 2 == 0
            }
            .forEach {
                println(it)
            }


    val seq = sequence {
        for (i in 1..5) {
            // yield a square of i
            yield(i * i)
        }
        // yield a range
        yieldAll(26..28)
    }

    seq.forEach {
        log(""+it)
    }
    // print the sequence
    println(seq.toList())

}

