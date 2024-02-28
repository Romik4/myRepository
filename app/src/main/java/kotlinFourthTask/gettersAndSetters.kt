package kotlinFourthTask

/**
 *      Задание 5
 *
 *      В классе Person добавьте custom геттеры и сеттеры для свойств name и age.
 *      Убедитесь, что вы можете управлять доступом к этим свойствам извне класса.
 *      Например, вы можете реализовать проверку возраста в сеттере,
 *      чтобы убедиться, что возраст неотрицательный.
 */

fun main() {
    /**
     * Решил сделать так, чтобы пользователь мог вбить в консоль возраст,
     * после чего в сеттере будет проходить проверка на возраст
     */
    val enterNum = java.util.Scanner(System.`in`)
    val enterAge = enterNum.nextInt()

    val romik = PersonTwo()

    romik.age = enterAge
    println(romik.name)

}

class PersonTwo () {
    var name: String = "Рома"
        get() = "Ромик"

    var age: Int = 24
        set(value: Int) {
            field = value
            if (field > 0) println("возраст положительный: $field")
            // при вводе отрицательного числа оно преобразуется в положительное)
            else println(field * -1)
        }
}

