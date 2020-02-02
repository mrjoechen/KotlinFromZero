@file:JvmName("CoroutineInterop")
package com.chenqiao.kotlin.coroutinee

import kotlinx.coroutines.*
import kotlinx.coroutines.future.future

private suspend fun loadAsync(): String {
    delay(1000L)
    return "Hello"
}

fun loadString() = runBlocking {
    withContext(Dispatchers.Default) { loadAsync() }
}

//需要 org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:0.22.5，Android 上面目前仍不方便使用
fun loadFuture() = GlobalScope.future {
    withContext(Dispatchers.Default) { loadAsync() }
}