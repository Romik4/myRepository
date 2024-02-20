package kotlinFourthTask

/**
 *      Задание 8
 *
 *      Создайте абстрактный класс Shape с абстрактным методом area(),
 *      затем создайте классы Circle и Rectangle, реализующие этот метод.
 *      Создайте объекты Circle и Rectangle и выведите их площадь.
 */

fun main() {
    circle.area()
    rectangle.area()

//    println(circle.area())
//    println(rectangle.area())
}

abstract class Shape {
    abstract fun area()//: Double
}

/**
 * Оказалось, что если у абстрактного метода указать возвращаемый тип данных,
 * то мы не сможем его переписать, как минимум я пока не знаю, как это сделать.
 */
//class Circle: Shape() {
//    override fun area(): Double {
//        return 3.14 * 2 * 2
//    }
//}
//
//class Rectangle: Shape() {
//    override fun area(): Double {
//        return 4.15 * 5.20 / 2
//    }
//}
/**
 * А потом я догадался сделать задачу без указания возвращаемого типа данных :)
 */
class Circle : Shape() {
    override fun area() {
        println(3.14 * 2 * 2)
    }
}

class Rectangle : Shape() {
    override fun area() {
        println(10 * 12 / 2)
    }
}

var circle = Circle()
var rectangle = Rectangle()