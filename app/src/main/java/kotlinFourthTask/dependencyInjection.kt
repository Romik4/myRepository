package kotlinFourthTask

/**
 *      Задание 13
 *
 *      Создайте классы Engine и Tires. Затем создайте класс Car,
 *      который получает Engine и Tires через конструктор (Dependency Injection).
 */

/**
 *  Если я все правильно понял, то мы можем добавить в интерфейс новый метод,
 *  прописать его в существующем классе и вызвать этот метод через объект существующего класса?
 */
interface Engine {
    fun start()
    fun stop() // Добавил еще один метод
}

class DieselEngine : Engine {
    override fun start() {
        println("Engine starts")
    }

    // Прописал метод в классе
    override fun stop() {
        println("Engine stops")
    }
}

interface Tires {
    fun move()
}

class SummerTires : Tires {
    override fun move() {
        println("Car moves")
    }
}

class MyCar(private val engine: Engine, private val tires: Tires) {
    fun drive() {
        engine.start()
        tires.move()
        engine.stop() //Обратился к методу через существующий класс
        println("The car is stopped")
    }
}

fun main() {
    val myCar = MyCar(DieselEngine(), SummerTires())
    myCar.drive()
}