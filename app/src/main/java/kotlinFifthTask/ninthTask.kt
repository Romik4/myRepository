package kotlinFifthTask

/**
 *      Задание 9
 *
 *      Создайте функцию высшего порядка calculate, которая принимает два целых числа
 *      и функцию операции. Продемонстрируйте использование calculate с разными операциями
 *      (сложение, вычитание, умножение).
 */

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun main() {
    //println(calculate(3, 4, ::sum))
    println(calculate(3, 4) { a, b -> a + b })
    println(calculate(5, 2, ::subtract))
    println(calculate(2, 2, ::multiply))
}