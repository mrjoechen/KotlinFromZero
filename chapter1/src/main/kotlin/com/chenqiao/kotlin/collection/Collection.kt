package com.chenqiao.kotlin.collection


fun collection(){

    val arrayOf = arrayOf("a", "b", "c")

    val listOf = listOf("a", "b", "c")

    listOf[0]

    listOf.get(0)

    val toMutableList = listOf.toMutableList()
    toMutableList.add("fff")


//    listOf.add

    val mutableListOf = mutableListOf("a", "b", "c")

    mutableListOf.add("d")

    mutableListOf.removeAt(0)

    for (e in mutableListOf){
        print(e)
    }

    val list: List<Any> = listOf




    //set
    val set = setOf("a", "b", "c")

    set.toMutableSet()

    val mutableSetOf = mutableSetOf("a", "b", "c")
    mutableListOf.add("d")



    //map
    val mapOf = mapOf("a" to 1, "b" to 2)

    mapOf.toMutableMap()

    val mutableMapOf = mutableMapOf("a" to 1, "b" to 2)
    mutableMapOf.put("a", 3)

    mutableMapOf.get("a")

    mutableMapOf["a"]

    mutableMapOf["a"] = 2


    //Sequence
    sequenceOf("a", "b")

}