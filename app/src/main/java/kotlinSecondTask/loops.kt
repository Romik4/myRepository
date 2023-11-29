package kotlinSecondTask
/*Циклы:
a) Создайте массив из 10 чисел.
Напишите цикл for, который будет выводить каждое число и его квадрат.
После этого напишите цикл while, который будет выводить каждое число и его куб.

b) Используйте функцию repeat для вывода строки “Привет, мир!” 10 раз.*/

        // Задание а)
fun main() {
    var arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Вывод чисел и их квадратов через цикл for
    for (i in arr) {
        var squared = i * i
        println("Число $i")
        println("Квадрат числа $i = $squared")
    }

    // Вывод чисел и их квадратов через цикл for
    var n = 1
    while (n <= 10) {
        var cubed = n * n * n
        println("Число $n")
        println("Куб числа $n = $cubed")
        n++
    }

        // Задание b)
    repeat(5){
        println("Hello, World!")
    }
}

