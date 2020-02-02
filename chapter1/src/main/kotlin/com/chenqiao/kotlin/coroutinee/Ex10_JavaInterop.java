package com.chenqiao.kotlin.coroutinee;



public class Ex10_JavaInterop {
    public static void main(String... args) {
        try {
            LogKt.log(CoroutineInterop.loadString());
            LogKt.log(CoroutineInterop.loadFuture().get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
