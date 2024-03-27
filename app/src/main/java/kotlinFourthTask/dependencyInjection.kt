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
interface InnerPart {
    fun start()
    fun stop() // Добавил еще один метод
}

class Engine : InnerPart {
    override fun start() {
        println("Engine starts")
    }

    // Прописал метод в классе
    override fun stop() {
        println("Engine stops")
    }
}

interface OuterPart {
    fun move()
}

class Tires : OuterPart {
    override fun move() {
        println("Car moves")
    }
}

class MyCar(private val engine: InnerPart, private val tires: OuterPart) {
    fun drive() {
        engine.start()
        tires.move()
        engine.stop() //Обратился к методу через существующий класс
        println("The car is stopped")
    }
}

fun main() {
    val myCar = MyCar(Engine(), Tires())
    myCar.drive()
}