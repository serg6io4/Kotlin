package com.serg6io4.androidmaster.sintaxis

//VARIABLES

fun main(){
    //THESE ARE CONSTANT
    //NUMERIC VARIABLES
    //Int -2.147.483.647 a 2.147.483.647
    val age:Int = 30
    //Long
    val ejemplo:Long = 30
    //Float(con float hay que poner una F al final)
    //6 decimales a partir del "."
    val decimales:Float = 4.555556F
    //Double(12 decimales)
    val decGrandes:Double = 20.8908

    //ALPHANUMERIC VARIABLES

    //Char(con comillas simples)
    val charExample:Char = 'e'
    //String
    val stringExample:String = "serg6io4"

    //BOOLEAN VARIABLES
    val siono:Boolean = true

    //print(stringExample)
    //TO VARIABLES ITS VAR
    var anyo:Int = 24

    var stringConcatenado:String = "Hola"
    stringConcatenado = "Hola me llamo $stringExample y tengo $anyo"
    println(stringConcatenado)
    exampleFunction(24)
}
fun exampleFunction(currentAge:Int){
    //To declare function
    print("Hola we " + currentAge.toString())
}