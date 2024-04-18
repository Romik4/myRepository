package kotlinFifthTask

/**
 *      Задание 2
 *
 *      Создайте список строк [“один”, “два”, “три”, “четыре”, “пять”].
 *      Используйте map чтобы получить длину каждого элемента списка.
 */

val list: List<String> = listOf("один", "два", "три", "четыре", "пять")

val listOfString = list.map { it.length }

fun main() {
    println(listOfString)
}