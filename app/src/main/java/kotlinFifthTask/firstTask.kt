package kotlinFifthTask

/**
 *      Задание 1
 *
 *      Создайте список чисел от 1 до 10, затем используйте метод filter
 *      чтобы оставить только четные числа. После этого используйте метод map
 *      чтобы умножить каждое число на 2.
 */

val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

val newList = numbers.filter { it % 2 == 0 }.map { it * 2 }

fun main() {
    println(newList)
}