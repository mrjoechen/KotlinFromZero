package com.chenqiao.kotlin.destructuring

/**
 * @Classname Destructuring 解构
 * @Description TODO
 * @Date 2020/2/8 16:39
 * @Created by chenqiao
 *
 *
 *  1、任何对象只要有ComponentN组件函数，都可以用作解构对象放在=号的右边

    2、ComponentN组件函数就是component1、component2等等函数组成的函数，这种函数需要使用operator修饰符来修饰，否则不是组件函数。

    3、=号左边的括号中申明的变量的个数必须少于等于ComponentN组件函数的个数，也就是少于N（因为N代表的是组件函数的个数，从1开始计算）。

    4、=号左边的变量的顺序与componentN的组件函数的顺序是对应的，而默认的component的顺序是属性的声明的顺序。

    5、如果=号左边的变量有未使用到的变量可以使用“_”下划线来代替，这样就不会调用对应的组件函数。

    6、=号左边的变量的值其实就是简单的调用对应component组件函数的返回值。

    7、data类型的类默认会有component函数，其个数就是属性的个数，顺序就是声明的顺序。

 *
 */

 class Weather(val date: String, val temp: Int, val info: String) {
    operator fun component1(): Any {
        return date
    }

    operator fun component2(): Any {
        return "${temp}_C"
    }
}

data class OO(val date: String, val temp: Int, val info: String)


fun main() {
    val tempList = arrayListOf<String>()
    //普通用法
//    val weather = Weather("2017年11月26号，", 20, "多云转晴")
//    tempList.add(weather.temp)

    val weather = Weather("2020年1月26号", 20, "多云转晴")
//    val (d, _,i) = weather
    val (_,t) = weather
//    println(d)
//    println(i)

    println(t)

    val (a, _, c) = OO("aaa", 2, "ccc")
    print(a + c)

}