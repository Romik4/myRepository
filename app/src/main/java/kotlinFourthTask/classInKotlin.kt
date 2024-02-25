package kotlinFourthTask

/**
 *      Задание 1
 *      Создайте класс Car с полями model, color, year и методом drive().
 *      Создайте несколько объектов этого класса и вызовите их метод drive().
 */

fun main() {
    val myFriend = Car("Audi", "Black", 1995)
    val me = Car("Alfa Romeo", "White", 1980)
    val myDad = Car("BMW", "Blue", 2000)

    myFriend.drive("my friend")
    me.drive("me")
    myDad.drive("my dad")
}

class Car(var model: String, var color: String, var year: Int) {
    fun drive(person: String = "somebody") {
        println("The car is driven by $person")
    }
}