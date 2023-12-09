package kotlinSecondTask


/* Напишите цикл, который выводит числа от 1 до 10,
 но пропускает числа 3 и 7 (используйте continue).*/

fun main(){
    for (i in 1..10){

        /**
         * Получилось сделать красивее
         */
        if (i == 3 || i == 7) {
            continue
        }

        /**
         * Сначала сделал простым методом
         */
        /*
        if (i == 3) {
            continue
        }
        if (i == 7) {
            continue
        }*/
        println(i)
    }
}