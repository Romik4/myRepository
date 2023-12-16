package kotlinSecondTask

/*Напишите функцию, которая принимает массив чисел и возвращает сумму только тех чисел,
которые больше 10. Если обнаруживается число меньше 0,
функция должна немедленно прекратить обработку и вернуть текущую сумму (используйте return).*/


fun main() {
    var arr = listOf(-5, -1, 2, 5, 9, 11, 15, 20)
    // var a = returnedSum(arr) - лучше ли обернуть функцию в переменную и вызвать в println?

    /**
     * Функция принимает массив arr
     */
    returnedSum(arr)

    println(returnedSum(arr))
}

/**
 * Функция @returnedSum принимает список чисел
 */
fun returnedSum(arr: List<Int>): Int {
    var sum = 0

    /**
     * Условия выполнения функции
     */
    for (i in arr) {
        if (i < 0){
            return sum
        } else if (i > 10){
            sum += i
        }
    }
    return sum
}
