package org.example.lesson_1

import java.lang.String.format


fun main(){
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    println("Год полета - $year")
    print("Взлет - " + format("%02d:",hour))
    println(format("%02d",minute))

    hour= 10
    minute = 55

    print("Посадка – " + format("%02d:%02d", hour, minute))
}