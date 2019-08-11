import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException

fun main(args: Array<String>) {


    while (true){


        try {
            println("请输入算式：ex 3 + 4")

            val readLine = readLine()?:break
            if (readLine != null){

                val split = readLine.trim().split(" ")

                if (split.size != 3){
                    throw IllegalArgumentException("格式异常")
                }

                val left = split[0].toDouble()
                val op = split[1]
                val right = split[2].toDouble()

                println("$left $op $right = ${Operator(op).apply(left, right)}")

            }
        }catch (e: NumberFormatException){
            println("数字格式异常！")
        }catch (e: UnsupportedOperationException){
            println("运算符错误！")
        }catch (e:IllegalArgumentException){
            println("算式格式异常！")
        }



        println("继续？ [y] or [n]")

        val readLine1 = readLine()
        if (readLine1 == null || readLine1.toLowerCase() == "n" || readLine1.toLowerCase() != "y"){
            break
        }

    }


}

class Operator(val op: String){

    val opFun: (left: Double, right: Double) -> Double


    init {
        opFun = when(op){
            "+" -> {l, r -> l + r}
            "-" -> {l, r -> l - r}
            "*" -> {l, r -> l * r}
            "/" -> {l, r -> l / r}
            "%" -> {l, r -> l % r}
            else -> throw UnsupportedOperationException(op)
        }
    }

    fun apply(left: Double, right: Double):Double{
        return opFun(left, right)
    }

}