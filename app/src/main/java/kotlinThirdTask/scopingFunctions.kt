package kotlinThirdTask

/**
 *      Блок 3: Функции и рекурсия
 *
 *      Задание 5: Создайте список имен и используйте функции let, run, also, apply и with
 *      для выполнения различных операций над этим списком
 *      (например, добавьте имя, удалите имя, переверните список и т. д.).
 */

fun main() {
    val QADept = mutableListOf<String>("Вася", "Маша", "Аня", "Даша")

    /**
     * Функция let
     */
    QADept.let {
        println(it)
        it.add("Даша")

    }

    /**
     * Функция run
     */
    QADept.run {
        println(this)
        add("Саша")
    }

    /**
     * Функция also
     */
    QADept
        .also { println(it) }
        .reverse()

    /**
     * Функция apply
     */
    QADept
        .apply { println(this) }
        .add("Влад")

    /**
     * Функция with
     */
    with(QADept) {
        println(this)
        remove("Влад")
    }

    println(QADept)
}