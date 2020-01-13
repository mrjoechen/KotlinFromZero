package com.chenqiao.kotlin.function

class Complex(var real: Double, var imaginary: Double) {

    operator fun plus(other: Complex): Complex {
        return Complex(this.real + other.real, this.imaginary + other.imaginary)
    }


    //
    operator fun plus(other: Int): Complex {
        return Complex(this.real + other, this.imaginary)
    }

    operator fun plus(other: Any): Int{
        return real.toInt()
    }

    override fun toString(): String {
        return "$real + $imaginary i"
    }

    operator fun invoke(): Double{
        return Math.hypot(real, imaginary)
    }

}


fun main(args: Array<String>) {

    val complex1 = Complex(1.0, 2.0)
    val complex2 = Complex(3.0, 4.0)

    println(complex1 + complex2)//4.0 + 6.0 i
    println(complex1 + 1)//2.0 + 2.0 i

    println(complex1 + String())//1

    println(complex2)//3.0 + 4.0 i
    println(complex2())//5.0

    if (Book() on Desk()){

    }

    if (".name" in args){

    }

}

class Book{

    infix fun on(any: Any): Boolean{
        return false
    }
}

class Desk