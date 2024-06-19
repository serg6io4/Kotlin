package com.serg6io4.androidmaster.sintaxis

fun main(){
    var name:String? = null
    getTrimestre(3)
    result(true)
}
fun result(value:Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) println("Hola")
    }
}
fun getTrimestre(month:Int){
    when(month){
        in 1..3-> println("Primer Trimestre")
        in 4..6-> println("Segundo Trimestre")
        in 7..9-> println("Tecer Trimestre")
        in 10..12 -> println("Cuarto Trimestre")
        !in 1..12 -> println("No existe")
    }
}
fun getMonth(month:Int){
    //Uso del when
    when(month){
        1-> println("Enero")
        2-> println("Febrero")
        3-> println("Marzo")
        4-> println("Abril")
        5-> println("Mayo")
        6-> println("Junio")
        7-> println("Julio")
        8-> println("Agosto")
        9-> println("Septiembre")
        10-> println("Octubre")
        11-> println("Noviembre")
        12-> println("Diciembre")
        else -> println("No existe")
    }
}
