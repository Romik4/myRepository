package kotlinFourthTask

/**
 *      Задание 8
 *
 *      Создайте абстрактный класс Shape с абстрактным методом area(),
 *      затем создайте классы Circle и Rectangle, реализующие этот метод.
 *      Создайте объекты Circle и Rectangle и выведите их площадь.
 */

fun main() {
    val circle = Circle()
    val rectangle = Rectangle()

    println(circle.area())
    println(rectangle.area())
}

abstract class Shape {
    abstract fun area(): Number
}

class Circle : Shape() {
    override fun area(): Number {
        return 3.14 * 2 * 2
    }
}

class Rectangle : Shape() {
    override fun area(): Number {
        return 4 * 5 / 2
    }
}