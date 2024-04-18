package kotlinFifthTask

/**
 *      Задание 5
 *
 *      Создайте объект класса Person со свойствами name и age.
 *      Создайте список из нескольких таких объектов.
 *      Используйте filter и map чтобы получить список имен тех людей, которым больше 18 лет.
 */

data class Person(var name: String, val age: Int)

val people = mutableListOf<Person>()
fun save(item: Person) {
    people.add(item)
}

val maturedPeople = people.filter { it.age > 18 }.map { it }

fun main() {
    save(Person("Roma", 24))
    save(Person("Ivan", 15))
    save(Person("Katya", 20))
    save(Person("Petr", 30))
    save(Person("Dima", 10))
    save(Person("Masha", 25))
    save(Person("Sveta", 17))
    save(Person("Kolya", 19))

    println(maturedPeople)
}






