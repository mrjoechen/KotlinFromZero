package com.chenqiao.kotlin.coroutinee

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

interface Callback {
    fun onSuccess(result: String)
    fun onError(e: Throwable)
}

fun loadAsync(callback: Callback) {
    thread {
        try {
            Thread.sleep(1000)
            if(Math.random() > 0.5f){
                callback.onSuccess("HelloWorld")
            } else {
                throw IllegalStateException("This is a Demonstration Error.")
            }
        } catch (e: Throwable) {
            callback.onError(e)
        }
    }
}

suspend fun load(): String {
    val completableDeferred = CompletableDeferred<String>()
    loadAsync(object : Callback {
        override fun onSuccess(result: String) {
            completableDeferred.complete(result)
        }

        override fun onError(e: Throwable) {
            completableDeferred.completeExceptionally(e)
        }
    })
    return completableDeferred.await()
}

fun main(args: Array<String>) = runBlocking {
    log(-1)
    launch {
        log(1)
        try {
            val result = load()
            log(2.1)
            log(result)
        } catch (e: Exception) {
            log(2.2)
            log(e)
        }
        log(3)
    }.join()
    log(-2)
}