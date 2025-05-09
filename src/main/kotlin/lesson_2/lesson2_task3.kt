package org.example.lesson_2

/*Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

– Создай целочисленные переменные и проинициализируй их этими данными;
– Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
– Выведи результат в консоль.*/

private const val SECONDS_PER_MINUTE = 60
private const val HOURS_IN_DAY = 24

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    val totalDepartureMinutes = departureHour * SECONDS_PER_MINUTE + departureMinute
    val totalArrivalMinutes = totalDepartureMinutes + travelTimeMinutes

    val arrivalHour = (totalArrivalMinutes / SECONDS_PER_MINUTE) % HOURS_IN_DAY
    val arrivalMinute = totalArrivalMinutes % SECONDS_PER_MINUTE

    println("Время прибытия поезда: " + "%02d:%02d".format(arrivalHour, arrivalMinute))
}