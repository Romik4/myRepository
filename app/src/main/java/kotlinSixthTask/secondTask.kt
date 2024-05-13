package kotlinSixthTask

/**
 *      Задание 2
 *
 *      Рассмотрите следующий код:
 *      fun main() {
 *          val nullableList: List<Int?> = listOf(1, 2, null, 4)
 *          val intList: List<Int> = nullableList.filterNotNull()
 *          println(intList)
 *      }
 *
 *      Что будет выведено в результате выполнения этого кода? Почему
 */

/**
 *      Функция filterNotNull() возвращает значения, которые не null,
 *      поэтому результатом println(intList) будет массив [1, 2, 4]
 */