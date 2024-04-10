package kotlinFourthTask

/**
 *      Задание 11
 *
 *      Создайте sealed class MathOperation и несколько объектов,
 *      представляющих различные математические операции
 *      (например, Add, Subtract, Multiply, Divide).
 *      Создайте функцию, которая принимает MathOperation и два числа,
 *      и выполняет соответствующую операцию.
 */

fun main() {
    val add = Add
    val divide = Divide
    println(math(add))
    println(math(divide))
}

sealed class MathOperation

object Add : MathOperation()
object Divide : MathOperation()

fun math(result: MathOperation, a: Int = 4, b: Int = 2): Int = when (result) {
    is Add -> a + b
    is Divide -> a / b
}

