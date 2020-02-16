package com.chenqiao.kotlin.coroutinee
import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {
    log(1)
    val job = launch(Dispatchers.IO) {
        log(-1)
        delay(1000L)
        log(-2)
    }
    log(2)
    job.join()
    log(3)
}