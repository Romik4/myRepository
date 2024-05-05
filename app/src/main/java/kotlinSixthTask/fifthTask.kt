package kotlinSixthTask

/**
 *      Задание 5
 *
 *      Создайте пользовательское исключение InvalidUserInputException,
 *      которое выбрасывается, когда пользователь вводит что-то неверное.
 *      Покажите, как его можно перехватить и обработать.
 */

class InvalidUserInputException(message: String) : Exception(message)

fun main() {
    try {
        println("Введите целое число")
        val num: Int? = readlnOrNull()?.toInt()
        println(num)
    } catch (e: Exception) {
        throw InvalidUserInputException("Исключение")
    }
}
