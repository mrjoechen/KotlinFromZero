package com.chenqiao.kotlin.reflect

import com.chenqiao.kotlin.currying.println
import com.chenqiao.kotlin.oop.CarDriver
import com.chenqiao.kotlin.oop.Driver
import com.chenqiao.kotlin.oop.Manager
import kotlin.reflect.KClass
import kotlin.reflect.full.functions

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/2/16 09:18
 * @Created by chenqiao
 */

fun main() {


    val kClass = Manager::class
    kClass.functions.forEach {
        it.name.println()
    }


}