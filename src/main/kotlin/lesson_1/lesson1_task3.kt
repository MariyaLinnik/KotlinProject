package org.example.lesson_1

fun main(){
    val year: String = "1961"
    var hour: String = "9".padStart(2, '0')
    var minute: String = "7".padStart(2, '0')

    println("Год полета - $year")
    print("Взлет - $hour:")
    println(minute)

    hour= "10"
    minute = "55"

    print("Посадка – $hour:$minute")
}