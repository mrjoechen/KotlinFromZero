package com.chenqiao.kotlin.coroutinee

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.swing.JFrame

fun main(args: Array<String>) {
//    val frame = MainWindow()
//    frame.title = "Coroutine@Bennyhuo"
//    frame.setSize(600, 100)
//    frame.isResizable = true
//    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
//    frame.init()
//    frame.isVisible = true
//
//    frame.button.addActionListener {
//        GlobalScope.launch (Dispatchers.Swing) {
//            log(-1)
//            val job = launch {
//                log(1)
//                delay(1000L)
//                log(2)
//            }
//            log(-2)
//            job.join()
//            log(-3)
//        }
//    }
}

//fun androidSupport() {
//    launch(UI) { // Android 的 UI 线程支持
//        log(-1)
//        val job = launch {
//            log(1)
//            delay(1000L)
//            log(2)
//        }
//        log(-2)
//        job.join()
//        log(-3)
//    }
//}