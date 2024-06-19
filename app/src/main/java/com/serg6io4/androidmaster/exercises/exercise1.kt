package com.serg6io4.androidmaster.exercises

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if(numberOfMessages<=100) println("You have $numberOfMessages notifications")
    else println("Your phone is blowing up! You have 99+ notifications")
}