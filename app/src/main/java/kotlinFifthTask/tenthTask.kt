package kotlinFifthTask

/**
 *      Задание 10
 *
 *      Создайте коллекцию чисел и используйте fold или reduce чтобы посчитать их сумму,
 *      минимальное и максимальное значения.
 */

val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

val reduceNums = nums.reduce {acc, i -> acc + i}

/**
 * не очень понял, как с помощью reduce или fold найти минимальное и
 * максимальное значения в списке, но вроде мой способ работает
 */
val minNum = nums.fold(-54) {acc, i -> acc + i}
val maxNum = nums.fold(-45) {acc, i -> acc + i}
fun main() {
    println(reduceNums)
    println("Минимальное число в списке: $minNum")
    println("Максимальное число в списке: $maxNum")
}