package com.chenqiao.kotlin

import java.io.File

/**
 * @Classname Statics
 * @Description TODO
 * @Date 2020-01-14 16:41
 * @Created by chenqiao
 */


fun main(args: Array<String>) {
    val hashMap = HashMap<Char, Int>()

    File("gradlew").readText().toCharArray().filterNot(Char::isWhitespace).forEach {
        val i = hashMap[it]

        if (i == null) hashMap[it] = 1
        else hashMap[it] = i + 1
    }

    hashMap.forEach(::println)


    File("gradlew").readText().toCharArray().filterNot(Char::isWhitespace)
            .groupBy {
                it
            }
            .map {
                it.key to it.value.size
            }
            .forEach(::println)
}