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


fun main() {
    val crystallineOreWithoutBuff = 7
    val ironOreWithoutBuff = 11
    val percentageBaff = 20

    val bonusCrystallineOre = (crystallineOreWithoutBuff * percentageBaff) / 100
    val bonusIronOre = (percentageBaff * ironOreWithoutBuff) / 100

    println("'Бонусная' кристаллическая руда = $bonusCrystallineOre")
    println("'Бонусная' железная руда = $bonusIronOre")
}