package `object`

object SingeObject {

    val s = "hello"

    fun printHello() = println(s)
}

open class A{
    open fun method(){

    }
}

interface B{
    fun interfaceMethod()
}

abstract class C{
    abstract fun abstractMethod()
}

object D : A(), B{

    override fun method(){

    }

    override fun interfaceMethod() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}