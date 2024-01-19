package kotlinThirdTask

/**
 *      Блок 3: Функции и рекурсия
 *
 *      Задание 5: Создайте список имен и используйте функции let, run, also, apply и with
 *      для выполнения различных операций над этим списком
 *      (например, добавьте имя, удалите имя, переверните список и т. д.).
 */

fun main() {
    val qaDept = mutableListOf<String>("Вася", "Маша", "Аня", "Даша")

    /**
     * Функция let
     */
    qaDept.let {
        println(it)
        it.add("Даша")

    }

    /**
     * Функция run
     */
    qaDept.run {
        println(this)
        add("Саша")
    }

    /**
     * Функция also
     */
    qaDept
        .also { println(it) }
        .reverse()

    /**
     * Функция apply
     */
    qaDept
        .apply { println(this) }
        .add("Влад")

    /**
     * Функция with
     */
    with(qaDept) {
        println(this)
        remove("Влад")
    }

    println(qaDept)
}