package com.serg6io4.androidmaster.sintaxis

fun main(){
    //inmutableList()
    mutableList()
}

fun mutableList() {
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    println(weekDays)

    weekDays.add(0, "SergioDay")
    println(weekDays)
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    println(readOnly)
    println(readOnly.size)
    println(readOnly[0])
    //Dame el último valor de la lista
    println(readOnly.last())
    //Dame el primer valor de la lista
    println(readOnly.first())

    //filtrar listas
    val example = readOnly.filter { it.contains("a") }
    println(example)

    readOnly.forEach{ weekDay -> println(weekDay)}
}