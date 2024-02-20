package kotlinFourthTask

/**
 *      Задание 9
 *
 *      Создайте интерфейс Flyable с методом fly() и интерфейс Navigable с методом navigate(),
 *      затем создайте классы Bird и Airplane, реализующие эти интерфейсы.
 *      Создайте объекты Bird и Airplane и вызовите их методы fly() и navigate().
 */

fun main() {
    bird.fly()
    airplane.navigate()
}

interface Flyable {
    fun fly()
}

interface Navigable {
    fun navigate()
}

class Bird: Flyable {
    override fun fly() {
        println("Bird goes tweet and flies")
    }
}

class Airplane: Navigable {
    override fun navigate() {
        println("Pilot navigates an airplane")
    }
}

var bird = Bird()
var airplane = Airplane()