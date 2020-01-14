package com.chenqiao.kotlin.coroutinee

import kotlinx.coroutines.*
import kotlinx.coroutines.timeunit.TimeUnit

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020-01-13 15:34
 * @Created by chenqiao
 */
fun main(args: Array<String>) {



//    println(Thread.currentThread().id)
//    firstCoroutine()
//    test()


    testJoinCoroutine1()

//    launch { // 运行在父协程的上下文中，即 runBlocking 主协程
//        println("main runBlocking      : I'm working in thread ${Thread.currentThread().name}")
//    }
//    launch(Dispatchers.Unconfined) { // 不受限的——将工作在主线程中
//        println("Unconfined            : I'm working in thread ${Thread.currentThread().name}")
//    }
//    launch(Dispatchers.Default) { // 将会获取默认调度器
//        println("Default               : I'm working in thread ${Thread.currentThread().name}")
//    }
//    launch(newSingleThreadContext("MyOwnThread")) { // 将使它获得一个新的线程
//        println("newSingleThreadContext: I'm working in thread ${Thread.currentThread().name}")
//    }
}


fun firstCoroutine() {

    GlobalScope.launch {
        val exeDurableTask = exeDurableTask()
        println("Hello," + exeDurableTask)
        println("firstCoroutine launch " + Thread.currentThread().id)

    }
    println("firstCoroutine " + Thread.currentThread().id)
    Thread.sleep(5000L)
}

suspend fun exeDurableTask() = withContext(Dispatchers.Default) {

    delay(3000L)
    println("exeDurableTask " + Thread.currentThread().id)

    return@withContext 1
}


 fun test() = runBlocking { // this: CoroutineScope
    launch {
        delay(200L)
        println("Task from runBlocking")
    }

    coroutineScope { // 创建一个协程作用域
        launch {
            delay(500L)
            println("Task from nested launch")
        }

        delay(100L)
        println("Task from coroutine scope") // 这一行会在内嵌 launch 之前输出
    }

    println("Coroutine scope is over") // 这一行在内嵌 launch 执行完毕后才输出
}


fun testJoinCoroutine1()  {
    // Start a coroutine
    val c1 = launch(CommonPool) {
        println("C1 Thread: ${Thread.currentThread()}")
        println("C1 Start")
        delay(3000L)
        println("C1 World! 1")
    }

    val c2 = launch(CommonPool) {
        println("C2 Thread: ${Thread.currentThread()}")
        println("C2 Start")
        delay(5000L)
        println("C2 World! 2")
    }

    println("Main Thread: ${Thread.currentThread()}")
    println("Hello,")
    println("Hi,")
    println("c1 is active: ${c1.isActive}  ${c1.isCompleted}")
    println("c2 is active: ${c2.isActive}  ${c2.isCompleted}")

}

fun testJoinCoroutine() = runBlocking<Unit> {
    // Start a coroutine
    val c1 = launch(CommonPool) {
        println("C1 Thread: ${Thread.currentThread()}")
        println("C1 Start")
        delay(3000L)
        println("C1 World! 1")
    }

    val c2 = launch(CommonPool) {
        println("C2 Thread: ${Thread.currentThread()}")
        println("C2 Start")
        delay(5000L)
        println("C2 World! 2")
    }

    println("Main Thread: ${Thread.currentThread()}")
    println("Hello,")
    println("Hi,")
    println("c1 is active: ${c1.isActive}  ${c1.isCompleted}")
    println("c2 is active: ${c2.isActive}  ${c2.isCompleted}")

}
