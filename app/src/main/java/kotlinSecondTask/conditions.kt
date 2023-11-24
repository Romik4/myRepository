
/*Задание Условные операторы*/
fun main(){
    val enterNum = java.util.Scanner(System.`in`)


    /**
     * Условие для проверки вводного значения, пользователь вводит число или строку
     */
    if(enterNum.hasNextInt()) {
        var n = enterNum.nextInt()

        /**
         * Условие проверяет, является ли число положительным, отрицательным или нулем
         * Используется if, if-else
         */
        /*if (n > 0) {
            println("Число положительное")
        } else if (n < 0) {
            println("Число отрицательное")
        } else {
            println("Число равно нулю")
        }*/
        /**
         * Используется when
         */
        when {
            n > 0 -> println("Число положительное")
            n < 0 -> println("Число отрицательное")
            else -> println("Число равно нулю")
        }
    } else {
        println("Введите число")
    }
        println(enterNum)

}
