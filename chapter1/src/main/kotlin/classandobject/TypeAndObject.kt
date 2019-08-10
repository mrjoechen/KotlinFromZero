package classandobject

class meizhi1 constructor(var temper: String, var apper: String, var voice: String){
    init {
        println("$temper $apper $voice")
    }
}


class shuaige1 constructor(var temper: String, var apper: String, var voice: String){
    init {
        println("$temper $apper $voice")
    }
}



open class ren constructor(var temper: String, var apper: String, var voice: String){
    init {
        println("this is ${this.javaClass} : $temper $apper $voice")
    }
}


class meizhi constructor(temper: String, apper: String, voice: String): ren(temper, apper, voice)


class shuaige constructor(temper: String, apper: String, voice: String): ren(temper, apper, voice)


fun main(){
    val 妹纸 = meizhi("温柔", "甜美", "动人")
    println(妹纸 is ren)
}

