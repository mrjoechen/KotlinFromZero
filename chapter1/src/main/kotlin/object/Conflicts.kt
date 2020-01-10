package `object`

/**
 * @Classname Conflicts
 * @Description TODO
 * @Date 2020-01-10 14:51
 * @Created by chenqiao
 */


interface AA{
    fun x(): Int = 1

}

interface BB{
    fun x(): Int = 2

}

interface CC{
    fun x(): Int = 3

}


class DD(val t:Int) :AA, BB, CC{

    override fun x(): Int {

//        return super.x()

        if (t == 0) return t

        if (t < -100) return super<AA>.x()

        if (t > 100) return super<BB>.x()

        else return super<CC>.x()
    }

}


fun main() {
    println(DD(1).x())
    println(DD(100).x())
    println(DD(-1000).x())
    println(DD(0).x())
}