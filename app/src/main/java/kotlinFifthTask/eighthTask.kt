package kotlinFifthTask

/**
 *      Задание 8
 *
 *      Создайте переменную lazyValue типа String, инициализируемую лениво.
 *      Проверьте, что инициализация действительно происходит
 *      только при первом обращении к переменной.
 */

val lazyValue: String by lazy {
    println("Выполнится один раз")
    "Выполнится много раз"
}

fun main() {
    println(lazyValue)
    println(lazyValue)
    println(lazyValue)
    println(lazyValue)
}