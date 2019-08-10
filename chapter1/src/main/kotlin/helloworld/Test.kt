package helloworld

//fun main(args: Array<String>){
//    println("hello world")
//}

/**
 * Boolean
 */
val aBoolean: Boolean = true


/**
 * Number
 *
 * 浮点:  Double 64 bit  Float 32bit
 * 整型： Long 64 bit  Int 32 bit  Short 16 bit
 * 字节： Byte 8 bit
 */

val anInt: Int = 8
val anotherInt: Int = 0xFF //16进制
val moreInt: Int = 0b00000011
val maxInt: Int = Int.MAX_VALUE
val minInt: Int = Int.MIN_VALUE


/**
 * Char
 *  两个字节 表示一个16位的Unicode字符 单引号 'a' '我' '\u000f'
 *
 *  转义字符
 *  \t 制表符
 *  \b 光标回退一个字符
 *  \n 回车
 *  \r 光标回到行首
 *  \' 单引号
 *  \" 双引号
 *  \\反斜杠
 *  \$ 美元符号， Kotlin 以$开头为字符串模板
 */


fun main(args: Array<String>){
    println("hello world")

    println(anotherInt)//255

    println(moreInt)//3

    println(maxInt)//2147483647 (2^31 - 1)
    println(Math.pow(2.0, 31.0) - 1)

    println(minInt)//2147483648 (- 2 ^ 31)
    println(-Math.pow(2.0, 31.0))

    println(Long.MAX_VALUE)
    println(Long.MIN_VALUE)

    println(Float.MAX_VALUE)
    println(Float.MIN_VALUE)

    println(2f)//2.0
    println(1E3f)//1000.0

    println(0f/0f) //NaN 不是数



    println(string == fromChar)//true 比较值 相当于 equals
    println(string === fromChar)//比较对象引用


    val arg1:Int = 1
    val arg2:Int = 2
    println("" + arg1 + " + " +arg2 +" = " + (arg1 + arg2))
    println("$arg1 + $arg2 = ${arg1+arg2}")//简洁

    println("$b1, $b2")

    val rawString: String = """
        
        dfsv
        sdfvd
        \n
        \r
        
    """

    println(rawString)

    println(rawString.length)

    for (i in intRange2){
        print("$i,")
    }

    println(arrayOfChar.joinToString(""))

}


/**
 * 基本类型转换
 *
 * 不可隐式转换, 必须显式转换
 */
val anInttt:Int = 5
val aLong: Long = anInttt.toLong()

/**
 * 字符串
 *
 * 一串 Char
 *
 */

val string: String = "hello"
val fromChar: String = String(charArrayOf('h','e','l','l','o'))

//val aString:String = null
val aString:String?=null
var a:Int? = aString?.length


val intRange1: IntRange = 1..100 // [1, 100]
val intRange2: IntRange = 1 until 100 // [1, 100)
val b1 = 100 in intRange1
val b2 = 100 in intRange2

val arrayOfInt: IntArray = intArrayOf(1, 3, 5)
val arrayOfChar: CharArray = charArrayOf('h', 'e', 'l', 'l', 'o')
val arrayOfString: Array<String> = arrayOf("aaa", "bbb")
