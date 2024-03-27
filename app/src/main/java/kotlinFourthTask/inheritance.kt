package kotlinFourthTask

/**
 *      Задание 6
 *
 *      Создайте класс Animal с методом makeSound(), затем создайте классы Dog и Cat,
 *      наследующие от Animal, и переопределите метод makeSound().
 *      Создайте объекты Dog и Cat и вызовите их методы makeSound().
 */

fun main() {

    //Объекты классов Dog & Cat

    val myDog = Dog()
    val myCat = Cat()

    myDog.makeSound()
    myCat.makeSound()
}

open class Animal {
    open fun makeSound() {
        println("Animal's sound")
    }
}


//Создадим класс Dog, который наследует класс Animal

class Dog : Animal() {
    // Перезапишем его метод makeSound
    override fun makeSound() {
        println("Dog goes \"woof\"")
    }
}

// Сделаем все тоже самое с классом Cat
class Cat : Animal() {
    override fun makeSound() {
        println("Cat goes \"meow\"")
    }
}