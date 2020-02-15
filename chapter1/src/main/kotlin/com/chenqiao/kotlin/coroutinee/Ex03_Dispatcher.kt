package com.chenqiao.kotlin.coroutinee

import kotlinx.coroutines.*

private val threadPoolDispatcher = newSingleThreadContext("MyThreadPool")

fun main(args: Array<String>) = runBlocking(Dispatchers.Default) {
    log(-1)
    val job = launch(threadPoolDispatcher) {
        log(1)
        delay(1000L)
        log(2)
    }

    log(-2)
    job.join()
    log(-3)
}