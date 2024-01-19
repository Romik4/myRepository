package kotlinThirdTask

/**
 *      Блок 3: Функции и рекурсия
 *
 *      Задание 2: Создайте функцию sayHello, которая принимает строковый аргумент name
 *      и возвращает приветственное сообщение. Функция должна иметь параметр по умолчанию "мир".
 *      Затем вызовите функцию дважды: с именем и без имени.
 */
fun main() {
    println(sayHello("Влад"))
    println(sayHello())
}

fun sayHello(name: String = "мир") {
    println("Привет, $name!")
}