package classandobject


fun main() {

//    val name: String = null;
    val name: String = "Hello"
    println(name.length)

    val name1: String? = null

    println(name1?.length)

    val name2 = getName()?: return

    val name3: String? = "hello"
    println(name3!!.length)


    val parent: Parent = Child()

    if (parent is Child)
        println(parent.name)


    val string: String? = "hello"

    if (string is String)
        println(string?.length)

    val parent1: Parent = Parent()

    //var child: Child = parent as Child
    var child: Child? = parent as? Child //转换失败返回null
    println(child!!.name)

}

fun getName(): String?{
    return null
}