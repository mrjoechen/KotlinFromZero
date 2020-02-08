package com.chenqiao.kotlin.delegate
import kotlin.reflect.KProperty
import kotlin.reflect.jvm.isAccessible
import kotlin.properties.Delegates

/**
 * @Classname Delegate
 * @Description TODO
 * @Date 2020/2/8 14:56
 * @Created by chenqiao
 */


/**
 * 类委托
 */

// 创建接口
interface Base {
    fun print()
}

// 实现此接口的被委托的类
class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

// 通过关键字 by 建立委托类
class Derived(b: Base) : Base by b

//fun main(args: Array<String>) {
//    val b = BaseImpl(10)
//    Derived(b).print() // 输出 10
//}





/**
 * 属性委托
 */



// 定义包含属性委托的类
class Example {
    var p: String by Delegate()
}

// 委托的类
class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, 这里委托了 ${property.name} 属性"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$thisRef 的 ${property.name} 属性赋值为 $value")
    }
}
//fun main(args: Array<String>) {
//    val e = Example()
//    println(e.p)     // 访问该属性，调用 getValue() 函数
//
//    e.p = "Runoob"   // 调用 setValue() 函数
//    println(e.p)
//}

/**
 * 延迟属性
 */

val lazyValue: String by lazy {
    println("computed!")     // 第一次调用输出，第二次调用不执行
    "Hello"
}

//fun main(args: Array<String>) {
//    println(lazyValue)   // 第一次执行，执行两次输出表达式
//    println(lazyValue)   // 第二次执行，只输出返回值
//}

/**
 * 可观察属性 Observable
 */


class User {
    var name: String by Delegates.observable("初始值") {
        prop, old, new ->
        println("$prop - 旧值：$old -> 新值：$new")
    }
}

fun main(args: Array<String>) {
    val user = User()
    println(user.name)
    user.name = "第一次赋值"
    user.name = "第二次赋值"
}

