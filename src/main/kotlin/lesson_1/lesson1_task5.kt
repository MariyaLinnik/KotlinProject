package org.example.lesson_1

import java.lang.String.format

fun main() {
    val totalSeconds: Int = 6480

    // Переводим количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные
    val fullHours: Int = totalSeconds / 3600
    val fullMinutes: Int = (totalSeconds % 3600) / 60
    val fullSeconds: Int = totalSeconds % 60

    println(format("%02d:%02d:%02d", fullHours, fullMinutes, fullSeconds))
}
