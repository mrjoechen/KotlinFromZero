package com.chenqiao.kotlin.coroutinee

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main(args: Array<String>) = runBlocking {
    log(-1)
    val job = launch {
        log(1)
        delay(2000000L)
        log(2)
    }
    log(-2)
    job.cancel()
    job.join()
    log(-3)
}