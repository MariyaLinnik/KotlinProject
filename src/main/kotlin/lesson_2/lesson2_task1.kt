package org.example.lesson_2

/*
Задача на среднее арифметическое. В классе с углубленным изучением английского языка учится 4 человека.
У них следующие баллы по профильному предмету 3, 4, 3, 5.
Пишем часть школьного софта, который посчитает средний балл по английскому для этого класса.

– Написать выражение, которое высчитывает средний балл;
– Распечатать результат в консоль;
– В консоли должно быть выведено дробное число с 2 знаками после запятой.*/

fun main() {
    val subjectScores = intArrayOf(3, 4, 3, 5)
    println(subjectScores.average())
}