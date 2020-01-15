package com.chenqiao.kotlin.oop

import kotlin.properties.Delegates

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
        println("CarDriver drive")
    }

}

class PPTWriter: Writer {
    override fun write() {
        println("PPTWriter write")
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


    val user = User()
    user.name = "第一次赋值"
    user.name = "第二次赋值"
}




class User {
    var name: String by Delegates.observable("初始值") {
        prop, old, new ->
        println("$prop 旧值：$old -> 新值：$new")
    }
}