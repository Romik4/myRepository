package kotlinSixthTask

/**
 *      Задание 3
 *
 *      Вам дан код: var s: String? = null.
 *      Преобразуйте его в ненулевое значение с помощью оператора elvis,
 *      чтобы вместо null было значение "empty".
 */

var s: String? = null

fun main() {
    println(s ?: "empty")
}