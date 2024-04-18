package kotlinFifthTask

/**
 *      Задание 7
 *
 *      Создайте класс Car с полями make, model и year.
 *      Создайте коллекцию из нескольких объектов этого класса и используйте
 *      groupBy чтобы сгруппировать машины по году выпуска.
 */

data class Car(val make: String, val model: String, val year: Int)

val cars = mutableListOf<Car>(
    Car("Lada", "Vesta", 2005),
    Car("Volkswagen", "Polo", 2000),
    Car("Kia", "Sportage", 2005),
    Car("BMW", "3 Series", 2000),
    Car("Volkswagen", "Golf", 2007),
    Car("Ford", "Fiesta", 2005),
    Car("Audi", "A3", 2007),
)

val groupedCars = cars.groupBy { it.year }

fun main() {
    println(groupedCars)
}