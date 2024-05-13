package kotlinSixthTask

/**
 *      Создайте функцию, которая принимает nullable параметр
 *      и использует оператор !! для преобразования его в ненулевое значение.
 *      Что произойдет, если вы вызовете эту функцию с null?
 */


var x: Int? = null

fun source(x: Int?): Int {
    return x!!
}

/**
 *      Если nullable параметр x будет равен null,
 *      то в консоле мы увидим NullPointerException.
 *      Утверждение not-null (!!) должно использоваться только если мы уверены,
 *      что значение не будет равно null
 */
fun main() {
    println(source(x))
}