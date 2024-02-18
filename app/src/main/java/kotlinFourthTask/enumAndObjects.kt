package kotlinFourthTask

/**
 *      Задание 2
 *
 *      Создайте enum class DayOfWeek, содержащий все дни недели.
 *      Выведите все дни недели, используя свойства values и name этого enum.
 */

fun main() {
    DayOfWeek.printAllDays()
}

/**
 * Пришлось тут покопаться, сначала в классе вписал переменную val name: String,
 * получил ошибку, начал искать почему так, выяснил, что name зарезервинована enum классом
 * и отвечает за название группы значений
 * В моем случае это FIRST и тд.
 */
enum class DayOfWeek(val values: String) {
    FIRST("Monday"),
    SECOND("Tuesday"),
    THIRD("Wednesday"),
    FOURTH("Thursday"),
    FIFTH("Friday"),
    SIXTH("Saturday"),
    SEVENTH("Sunday");

    companion object {
        fun printAllDays() {
            values().forEach {
                println("${it.name} day of the week is ${it.values}")
            }
        }
    }
}



