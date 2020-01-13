package com.chenqiao.kotlin.oop

/**
 * @Classname Manager
 * @Description TODO
 * @Date 2020-01-10 14:43
 * @Created by chenqiao
 */
open class Manager: Driver, Writer {
    override fun drive() {
        print("drive")
    }

    override fun write() {
        print("write")
    }
}

//接口代理
class SeniorManager(val driver: Driver, val writer: Writer): Driver by driver, Writer by writer


class CarDriver: Driver {
    override fun drive() {
        print("CarDriver drive")
    }

}

class PPTWriter: Writer {
    override fun write() {
        print("PPTWriter write")
    }

}

interface Driver{
    fun drive()
}

interface Writer{
    fun write()
}


fun main() {
    SeniorManager(writer = PPTWriter(), driver = CarDriver()).driver.drive()
}