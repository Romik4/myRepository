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

fun main() {
    save(Person("Roma", 24))
    save(Person("Ivan", 15))
    save(Person("Katya", 20))
    save(Person("Petr", 30))
    save(Person("Dima", 10))
    save(Person("Masha", 25))
    save(Person("Sveta", 18))
    save(Person("Kolya", 19))

    val maturedPeople = people
        .filter { it.age > 18 }
        .map { it.name }

    /**
     * Видимо я вообще не запустил первоначальный код, сейчас перечитал задание и понял,
     * что изначально было сделано не по условию задания. Теперь все работает корректно.
     */
    println(maturedPeople)
}





