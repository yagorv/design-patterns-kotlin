package builder.examples.person

object Client {

    private val person = Person.Builder()
        .setFirstName("John")
        .setLastName("Doe")
        .setAge(30)
        .setAddress("123 Main St")
        .build()

    @JvmStatic
    fun main(args: Array<String>) {
        println(person.firstName)
        println(person.lastName)
        println(person.age)
        println(person.address)
    }

}
