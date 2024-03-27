package kotlinFourthTask

/**
 *      Задание 12
 *
 *      Создайте два класса: Mammal и CanFly.
 *      В классе Mammal определите метод breastfeed(), а в классе CanFly - метод fly().
 *      Затем создайте класс Bat, который сочетает в себе оба этих поведения (с помощью композиции).
 */

/**
 * Я долго не мог понять композицию и попросил чат объяснить мне,
 * по его примеру сделал это задание, но вижу тут схожесть с DI.
 * Как будто я больше запутался тут.
 */
class Mammal {
    fun breastfeed() {
        println("Can breastfeed")
    }
}

class CanFly {
    fun fly() {
        println("Can fly")
    }
}

/**
 * Если я правильно все понял, мы используем классы Mammal и CanFly
 * в основном конструкторе класса Bat в качестве экземпляров класса
 */
class Bat(private val mammal: Mammal, private val canFly: CanFly) {
    fun breastfeed() {
        mammal.breastfeed()
    }

    fun fly() {
        canFly.fly()
    }
}

/**
 * Затем мы создаем экземпляры классов Mammal и CanFly, передаем их в экземпляр класса Bat
 * и можем обращаться к методам классов Mammal и CanFly.
 */
fun main() {
    val mammal = Mammal()
    val fly = CanFly()
    val bat = Bat(mammal, fly)
    bat.breastfeed()
    bat.fly()

}