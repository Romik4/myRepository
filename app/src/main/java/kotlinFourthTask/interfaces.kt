package kotlinFourthTask

/**
 *      Задание 9
 *
 *      Создайте интерфейс Flyable с методом fly() и интерфейс Navigable с методом navigate(),
 *      затем создайте классы Bird и Airplane, реализующие эти интерфейсы.
 *      Создайте объекты Bird и Airplane и вызовите их методы fly() и navigate().
 */

fun main() {
    val bird = Bird()
    val airplane = Airplane()

    bird.fly()
    bird.navigate()
    airplane.navigate()
    airplane.fly()
}

interface Flyable {
    fun fly()
}

interface Navigable {
    fun navigate()
}

class Bird : Flyable, Navigable {
    override fun fly() {
        println("Bird goes tweet and flies")
    }

    override fun navigate() {
        println("Bird is navigable")
    }
}

class Airplane : Navigable, Flyable {
    override fun navigate() {
        println("Pilot navigates an airplane")
    }

    override fun fly() {
        println("Airplane is flying")
    }
}