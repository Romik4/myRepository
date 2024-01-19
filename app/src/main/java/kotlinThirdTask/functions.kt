package kotlinThirdTask

/**
 *      Блок 3: Функции и рекурсия
 *
 *      Задание 1: Создайте функцию maxOfTwo,
 *      которая принимает два числа в качестве аргументов и возвращает наибольшее число.
 *      Затем, используйте эту функцию для поиска максимального числа из двух разных пар чисел.
 */

fun main() {
    println("Введите первое число")
    var a = readLine()?.toInt()
    println("Введите второе число")
    var b = readLine()?.toInt()

    if (a != null && b != null) {
        println(maxOfTwo(a, b))
    }

}

fun maxOfTwo(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}
