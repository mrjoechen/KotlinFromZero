package com.chenqiao.kotlin

import java.text.SimpleDateFormat
import java.util.*

/**
 * @Classname Log
 * @Description TODO
 * @Date 2020/1/16 16:19
 * @Created by chenqiao
 */
val dateFormat = SimpleDateFormat("HH:mm:ss:SSS")

val now = {
    dateFormat.format(Date(System.currentTimeMillis()))
}

fun log(msg: String) = println("${now()} [${Thread.currentThread().name}] $msg")