package org.example.lesson_1

import java.lang.String.format

private const val SECONDS_PER_HOUR = 3600
private const val SECONDS_PER_MINUTE = 60

fun main() {
    val totalSeconds: Int = 6480

    // Переводим количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные
    val fullHours: Int = totalSeconds / SECONDS_PER_HOUR
    val fullMinutes: Int = (totalSeconds % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE
    val fullSeconds: Int = totalSeconds % SECONDS_PER_MINUTE

    println(format("%02d:%02d:%02d", fullHours, fullMinutes, fullSeconds))
}