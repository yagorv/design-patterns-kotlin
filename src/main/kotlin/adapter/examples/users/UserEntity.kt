package adapter.examples.users

data class UserEntity(
    val id: Long? = null,
    val username: String? = null,
    val password: String? = null,
    val roles: List<Role>? = null,
    val active: Boolean? = null
)