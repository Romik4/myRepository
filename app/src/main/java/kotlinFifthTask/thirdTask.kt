package kotlinFifthTask

/**
 *      Задание 3
 *
 *      Напишите функцию высшего порядка, которая принимает два параметра:
 *      целое число и функцию, принимающую целое число и возвращающую строку.
 *      Эта функция должна преобразовывать число в строку с помощью переданной функции
 *      и возвращать результат.
 */

fun revertToString(a: Int, operation: (Int) -> String): String {
    return operation(a)
}

val test = { a: Int -> a.toString() }
fun main() {
    /**
     * В консоли явно не выводилась строка, поэтому я создал ссылку на функцию revertToString
     * и написал проверку, что выводится именно строка.
     */
    var isString = revertToString(5, test)

    if (isString is String) {
        println("true")
    }
    println(revertToString(5, test))
}