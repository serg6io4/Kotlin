package com.serg6io4.androidmaster.sintaxis

fun main(){
    var name:String = "Serg6io4"
    var weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    println(weekDays[2])
    //Tamaños
    println(weekDays.size)

    //Bucless para array
    for(position in weekDays.indices){
        println("He pasado por "+ (weekDays[position]))
    }
    for((position, value) in weekDays.withIndex()){
        println("La posición: $position, se encuentra: $value")
    }
    for(dias in weekDays){
        println(dias)
    }
}
