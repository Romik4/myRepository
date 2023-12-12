package kotlinSecondTask

/*Напишите программу, которая просит пользователя ввести целое число.
Если пользователь вводит что-то другое, отлавливайте исключение и выводите сообщение об ошибке.
Блок finally должен выводить сообщение “Конец программы”.*/
fun main() {
    /**
     * Вывод первого задания
     */
    //println(except())

    /**
     * Вывод второго задания
     */
    println("Введите первое число")
    var a = readLine()?.toIntOrNull()
    println("Введите второе число")
    var b = readLine()?.toIntOrNull()
    if (a != null && b != null) {
        numbers(a, b)
    } else if (b == 0) {
        catchErr(b)
    }


}

fun except() {
    try {
        println("Введите целое число")
        val num = readLine()?.toInt()
        println("$num - целое число")
    } catch (e: ArithmeticException) {
        println("$e - Исключение")
    } finally {
        println("Конец программы")
    }
}

/*Создайте ситуацию, где может возникнуть исключение
(например, обращение к несуществующему элементу массива или деление на ноль),
и обработайте это исключение, выводя стек вызовов.*/

fun numbers(a: Int, b: Int) {
    println(a / b)
}

fun catchErr(b: Int) {
    try {
        if (b == 0) {

        }
    } catch (e: ArithmeticException) {
        println("Деление на ноль невозможно")
    }
}