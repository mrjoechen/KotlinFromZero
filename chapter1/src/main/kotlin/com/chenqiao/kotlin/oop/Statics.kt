package com.chenqiao.kotlin.oop

import java.lang.StringBuilder

/**
 * @Classname Statics
 * @Description TODO
 * @Date 2020-01-10 16:24
 * @Created by chenqiao
 */


fun main() {

    val ofDouble = Latitude.ofDouble(0.1111)

    Latitude.ofLatitude(ofDouble)

    Latitude.TAG

    println("ABC" * 16)


}


operator fun String.times(int: Int): String{
    val stringBuilder = StringBuilder()
    for (i in 0 until int){
        stringBuilder.append(this)
    }

    return stringBuilder.toString()
}


class Latitude private constructor(val value: Double){



    companion object{


        @JvmField
        val TAG: String = "companion"

        @JvmStatic
        fun ofDouble(double: Double): Latitude {
            return Latitude(double)
        }
        @JvmStatic
        fun ofLatitude(latitude: Latitude): Latitude {

            return Latitude(latitude.value)
        }

    }
}