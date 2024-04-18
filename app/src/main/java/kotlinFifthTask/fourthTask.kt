package kotlinFifthTask

/**
 *      Задание 4
 *
 *      Создайте лямбда-функцию, которая принимает число и возвращает его квадрат.
 *      Используйте эту лямбда-функцию в другой функции, которая принимает число
 *      и возвращает строку, состоящую из числа и его квадрата
 *      (например, “5 и его квадрат равен 25”).
 */

val square: (Int) -> Int = { a -> a * a }

fun stringSquare(a: Int, square: (Int) -> Int = { a * a }): String {
    return "$a и его квадрат равен ${square(a)}"
}

fun main() {
    println(stringSquare(10, square))
}