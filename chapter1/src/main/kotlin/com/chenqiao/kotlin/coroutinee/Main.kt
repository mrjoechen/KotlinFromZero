package com.chenqiao.kotlin.coroutinee

import com.chenqiao.kotlin.log
import kotlinx.coroutines.*

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020-01-13 15:34
 * @Created by chenqiao
 */
fun main(args: Array<String>) {



//    log(Thread.currentThread().id)
//    firstCoroutine()
//    test()

//    launch { // 运行在父协程的上下文中，即 runBlocking 主协程
//        log("main runBlocking      : I'm working in thread ${Thread.currentThread().name}")
//    }
//    launch(Dispatchers.Unconfined) { // 不受限的——将工作在主线程中
//        log("Unconfined            : I'm working in thread ${Thread.currentThread().name}")
//    }
//    launch(Dispatchers.Default) { // 将会获取默认调度器
//        log("Default               : I'm working in thread ${Thread.currentThread().name}")
//    }
//    launch(newSingleThreadContext("MyOwnThread")) { // 将使它获得一个新的线程
//        log("newSingleThreadContext: I'm working in thread ${Thread.currentThread().name}")
//    }
}


fun firstCoroutine() {

    GlobalScope.launch {
        val exeDurableTask = exeDurableTask()
        log("Hello," + exeDurableTask)
        log("firstCoroutine launch " + Thread.currentThread().id)

    }
    log("firstCoroutine " + Thread.currentThread().id)
    Thread.sleep(5000L)
}

suspend fun exeDurableTask() = withContext(Dispatchers.Default) {

    delay(3000L)
    log("exeDurableTask " + Thread.currentThread().id)

    return@withContext 1
}


 fun test() = runBlocking { // this: CoroutineScope
    launch {
        delay(200L)
        log("Task from runBlocking")
    }

    coroutineScope { // 创建一个协程作用域
        launch {
            delay(500L)
            log("Task from nested launch")
        }

        delay(100L)
        log("Task from coroutine scope") // 这一行会在内嵌 launch 之前输出
    }

    log("Coroutine scope is over") // 这一行在内嵌 launch 执行完毕后才输出
}


