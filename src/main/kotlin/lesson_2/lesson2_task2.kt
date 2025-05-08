package org.example.lesson_2

/*В компании работало 50 человек с зарплатой по 30000 рублей.
Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому.
Пишем часть гипотетического софта для бухгалтерии, который будет считать:

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием.
Все значения необходимо вывести в виде целых чисел.*/

fun  main() {
    val employeesCount = 50
    val salaryEmployee = 30000
    val internCount = 30
    val salaryIntern = 20000

    val fixedEmployeeSalaryExpenses: Int = employeesCount * salaryEmployee
    val totalSalaryExpenses: Int = (fixedEmployeeSalaryExpenses + (internCount * salaryIntern))
    val totalEmployeesCount: Int = employeesCount + internCount
    val averageSalaryPerEmployee: Int = totalSalaryExpenses / totalEmployeesCount

    println("Расходы на выплату зарплаты постоянных сотрудников = $fixedEmployeeSalaryExpenses")
    println("Общие расходы по ЗП после прихода стажеров = $totalSalaryExpenses")
    println("Среднюю ЗП одного сотрудника после устройства стажеров = $averageSalaryPerEmployee")
}