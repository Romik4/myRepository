package kotlinSixthTask

/**
 *      Задание 5
 *
 *      Создайте пользовательское исключение InvalidUserInputException,
 *      которое выбрасывается, когда пользователь вводит что-то неверное.
 *      Покажите, как его можно перехватить и обработать.
 */

class InvalidUserInputException(message: String) : Exception(message)

/**
 *  Чат подсказал использовать регулярное выражение для проверки вводимого числа,
 *  когда я пытался прописать какие-то условие, у меня постоянно были либо ошибки,
 *  либо пользовательское исключение просто не работало.
 *  Самому логику работы я понял, нам необходимо кинуть исключение в блоке try,
 *  после чего поймать его и обработать.
 */
fun isNum(input: String) {
    if (!input.matches("\\d+".toRegex())) {
        throw InvalidUserInputException("Исключение")
    } else {
        println(input)
    }
}

fun main() {
    try {
        println("Введите целое число")
        val input = readlnOrNull() ?: ""
        isNum(input)
    } catch (e: InvalidUserInputException) {
        println(e.message)
    }
}