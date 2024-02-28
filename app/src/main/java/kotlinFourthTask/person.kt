package kotlinFourthTask

/**
 *      Задание 4
 *
 *      Создайте класс Person с приватными свойствами name,
 *      age и публичными методами getName() и getAge().
 *      Проверьте, что прямой доступ к этим свойствам невозможен извне класса.
 */

fun main() {
    val showPerson = Person()

    // Прямой доступ к свойствам класса невозможен из-за приватности свойства

    //showPerson.name
    //showPerson.age


    // Но к свойствам можно обратиться через методы класса getName() и getAge()

    showPerson.getName()
    showPerson.getAge()
}

class Person {
    private var name: String = "Рома"
    private var age: Int = 24

    fun getName() {
        println(name)
    }

    fun getAge() {
        println(age)
    }
}