package com.chenqiao.kotlin.enums

/**
 * @Classname LogLevel
 * @Description TODO
 * @Date 2020-01-11 09:54
 * @Created by chenqiao
 */


/**
 * 实例可数
 */
enum class LogLevel (val id: Int){

    VERBOSE(0), DEBUG(6), INFO(2), WARN(3), ERROR(4);

    override fun toString(): String{
        return "$name, $ordinal, $id"
    }



}


fun main() {

    LogLevel.values().map { println(it) }

}