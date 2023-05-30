package adapter.examples.users

data class UserDomain (
    var id: Long,
    var username: String,
    var password: String,
    var roles: List<String>,
)