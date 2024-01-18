package kotlinThirdTask

/**
 *      Блок 3: Функции и рекурсия
 *
 *      Задание 4: Создайте рекурсивную функцию generateSequence,
 *      которая принимает целое число n и генерирует последовательность чисел от 1 до n.
 *      Используйте аннотацию tailrec для оптимизации.
 */

fun main() {
    /**
     * Рекурсивная функция, которая выводит числа от 1 до 6
     */
    fun generateSequence(n: Int): List<Int> {
        return if (n < 1) emptyList() else generateSequence(n - 1) + n
    }
    println(generateSequence(6))

    /**
     * Хвостово рекурсивная функция, которая выводит числа от 6 до 1
     *
     */
    tailrec fun generateSeq(n: Int, arr: List<Int> = emptyList()): List<Int> {
        return if (n < 1) arr else generateSeq(n - 1, arr + n)
    }
    println(generateSeq(6))
}

