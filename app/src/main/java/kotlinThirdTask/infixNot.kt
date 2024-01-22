package kotlinThirdTask

/**
 *      Блок 3: Функции и рекурсия
 *
 *      Задание 3: Создайте инфиксную функцию isGreater , которая принимает два числа
 *      и возвращает true, если первое число больше второго, и false в противном случае.
 *      Затем используйте эту функцию, сравнив две пары чисел.
 */
fun main() {
    infix fun Int.isGreater(other: Int): Boolean {
        return this > other
    }

    println(5 isGreater 7)
}