package org.example.lesson_2

/*
В мобильной стратегии есть бафф (временное усиление какого-либо юнита или процесса),
который дает +20% к добытым материалам. Было добыто 7 кристаллической и 11 железной руды без баффа –
заранее известные данные, объявить и проинициализировать.

Напиши программу, которая будет учитывать действие баффа и
выводить в консоль количество “бонусных” (то есть тех материалов, которые даются “сверху” баффом).
По одной строке на материал с его названием.

Если получается нецелое число, то дробная часть должна отбрасываться.
*/

private const val PERCENTAGE_BUFF = 0.20

fun  main() {
    val crystallineOreWithoutBuff = 7
    val ironOreWithoutBuff= 11

    val bonusCrystallineOre = crystallineOreWithoutBuff * PERCENTAGE_BUFF
    val bonusIronOre = ironOreWithoutBuff * PERCENTAGE_BUFF

    println("'Бонусная' кристаллическая руда = ${bonusCrystallineOre.toInt()}")
    println("'Бонусная' железная руда = ${bonusIronOre.toInt()}")
}