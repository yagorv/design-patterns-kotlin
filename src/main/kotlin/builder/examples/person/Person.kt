package builder.examples.person

data class Person(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val address: String
){
    class Builder {
        private var firstName: String? = null
        private var lastName: String? = null
        private var age: Int? = null
        private var address: String? = null

        fun setFirstName(firstName: String) = apply { this.firstName = firstName }
        fun setLastName(lastName: String) = apply { this.lastName = lastName }
        fun setAge(age: Int) = apply { this.age = age }
        fun setAddress(address: String) = apply { this.address = address }

        fun build() = Person(
            firstName = firstName.orEmpty(),
            lastName = lastName.orEmpty(),
            age = age ?: 0,
            address = address.orEmpty()
        )

    }
}