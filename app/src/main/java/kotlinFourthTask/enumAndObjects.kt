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
enum class DayOfWeek(val values: String, val secondValues: String) {
    MONDAY("First", "Second"),
    TUESDAY("Second", "Third"),
    WEDNESDAY("Third", "Fourth"),
    THURSDAY("Fourth", "Fifth"),
    FRIDAY("Fifth", "Sixth"),
    SATURDAY("Sixth", "Seventh"),
    SUNDAY("Seventh", "First");

    companion object {
        fun printAllDays() {
            values().forEach {
                println("In European countries ${it.name} is the ${it.values} day of the week")
                println("In America ${it.name} is the ${it.secondValues} day of the week")
            }
        }
    }
}



