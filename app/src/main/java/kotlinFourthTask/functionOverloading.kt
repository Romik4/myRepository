package kotlinFourthTask

/**
 *      Задание 7
 *
 *      Создайте класс MathUtils и перегрузите функцию add(),
 *      чтобы она могла принимать два или три целых числа.
 */

fun main() {
    val math = MathUtils()

    println(math.add(2, 2))
    println(math.add(3, 3, 3))
}

class MathUtils {
    fun add(one: Int, two: Int): Int {
        return one + two
    }

    fun add(one: Int, two: Int, three: Int): Int {
        return one + two + three
    }
}
