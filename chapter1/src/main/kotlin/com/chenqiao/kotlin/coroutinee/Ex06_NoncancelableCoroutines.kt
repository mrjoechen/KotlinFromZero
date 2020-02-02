package com.chenqiao.kotlin.coroutinee

import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    log(-1)
    val job = launch {
        log(1)
        for (i in 1..10000) {
            if(!isActive) break
            log("In for-loop: $i")
        }
        log(2)
    }
    log(-2)
    job.cancel()
    log(-3)
    job.join()
    log(-4)
}