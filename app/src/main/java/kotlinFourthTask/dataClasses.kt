package kotlinFourthTask

/**
 *      Задание 10
 *
 *      Создайте data class User с двумя свойствами и методом printInfo(),
 *      который выводит информацию о пользователе.
 *      Создайте объект User и вызовите его метод printInfo().
 */

fun main() {
    val user = User("Roma", 123456)

    user.printInfo()
}

data class User(var name: String, val id: Int) {
    fun printInfo() {
        println("User: $name, ID: $id")
    }
}