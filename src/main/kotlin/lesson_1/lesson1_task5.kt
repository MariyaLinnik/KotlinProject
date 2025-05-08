package org.example.lesson_1

private const val SECONDS_PER_HOUR = 3600
private const val SECONDS_PER_MINUTE = 60

fun main() {
    val totalSeconds: Int = 6480

    val fullHours: Int = totalSeconds / SECONDS_PER_HOUR
    val fullMinutes: Int = (totalSeconds % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE
    val fullSeconds: Int = totalSeconds % SECONDS_PER_MINUTE

    println("%02d:%02d:%02d".format(fullHours, fullMinutes, fullSeconds))
}