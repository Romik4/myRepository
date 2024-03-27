package kotlinFourthTask

/**
 *      Задание 14
 *
 *      Создайте обобщенный интерфейс Repository<T>, который содержит
 *      методы для сохранения (save(item: T)), удаления (delete(item: T))
 *      и получения всех элементов (getAll(): List<T>).
 *      Реализуйте этот интерфейс в классе UserRepository для работы с объектами класса User.
 */
interface Repository<T> {
    fun save(item: T)
    fun delete(item: T)
    fun getAll(): List<T>
}

/**
 *      Долго думал, как избежать конфликта с классом User из
 *      10 задания, но потом понял, что можно использовать его
 */
open class UserRepository : Repository<User> {

    val list = mutableListOf<User>()
    override fun save(item: User) {
        list.add(item)
    }

    override fun delete(item: User) {
        list.remove(item)
    }

    override fun getAll(): List<User> {
        return list.toList()
    }

}

fun main() {
    val listOfUsers = UserRepository()

    listOfUsers.save(User("Roma", 123))
    listOfUsers.save(User("Roma", 12))
    listOfUsers.delete(User("Roma", 12))

    println(listOfUsers.getAll())
}