package kotlinThirdTask

/**
 *      Блок 3: Функции и рекурсия
 *
 *      Задание 3: Создайте инфиксную функцию isGreater , которая принимает два числа
 *      и возвращает true, если первое число больше второго, и false в противном случае.
 *      Затем используйте эту функцию, сравнив две пары чисел.
 */
fun main () {
    infix fun Int.isGreater(other: Int): Int {

        if (this > other) {
            println(true)
            return this
        } else {
            println(false)
            return other
        }

    }

    println(1 isGreater 3)
}