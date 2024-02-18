package kotlinFourthTask

/**
 *      Задание 3
 *
 *      Создайте объект Singleton с методом printMessage(), который выводит любое сообщение.
 *      Вызовите этот метод.
 */

fun main() {
    Singleton.printMessage()

}

object Singleton {
    fun printMessage() {
        println("Message from Singleton: Hello!")
    }
}