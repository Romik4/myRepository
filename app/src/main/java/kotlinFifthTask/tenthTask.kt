package kotlinFifthTask

/**
 *      Задание 10
 *
 *      Создайте коллекцию чисел и используйте fold или reduce чтобы посчитать их сумму,
 *      минимальное и максимальное значения.
 */

val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

val reduceNums = nums.reduce { acc, i -> acc + i }

val minNum = nums.reduce { acc, i -> if (i < acc) i else acc }
val maxNum = nums.reduce { acc, i -> if (i > acc) i else acc }

fun main() {
    println("Сумма чисел в коллекции $reduceNums")
    println("Минимальное число в списке: $minNum")
    println("Максимальное число в списке: $maxNum")
}