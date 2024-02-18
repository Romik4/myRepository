package kotlinFourthTask

/**
 *      Задание 1
 *      Создайте класс Car с полями model, color, year и методом drive().
 *      Создайте несколько объектов этого класса и вызовите их метод drive().
 */

fun main() {
    myFriend.drive("my friend")
    me.drive("me")
    myDad.drive("my dad")
}

class Car {
    var model: String = "Lada"
    var color: String = "White"
    var year: Int = 2010
    fun drive(person: String = "somebody") {
        println("The car is driven by $person")
    }
}

val myFriend = Car()
val me = Car()
val myDad = Car()