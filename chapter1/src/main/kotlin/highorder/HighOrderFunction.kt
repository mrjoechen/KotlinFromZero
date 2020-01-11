package highorder

/**
 * @Classname HighOrderFunction
 * @Description TODO
 * @Date 2020-01-11 14:52
 * @Created by chenqiao
 */


fun main() {

    val listOf = listOf(1, 2, 4, 3, 6)

    val arrayList = ArrayList<Int>()

    listOf.forEach{
        val i = it * 2 + 3
        arrayList.add(i)
    }

    arrayList.forEach(::println)


    val map = listOf.map {
        it * 2 + 3
    }

    map.forEach(::println)


    listOf.map(Int::toDouble).forEach(::println)


    val listOf1 = listOf(1..4, 2..5, 10..23, 25..88)


    val flatMap = listOf1.flatMap {
        it
    }

    flatMap.forEach(::println)


    val flatMap1 = listOf1.flatMap { it ->
        it.map { it ->
            "NO.$it"
        }
    }

    flatMap1.forEach(::println)


    println(flatMap.reduce { acc, intRange -> acc + intRange })


    println(factorial(5))

    (0..6).map(::factorial).forEach(::println)
}

fun factorial(n: Int): Int{
    if(n == 0) return 1

//    return (1..n).reduce(Int::times)
    return (1..n).reduce{acc, i -> acc * i}
}
