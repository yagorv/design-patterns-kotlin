package adapter.examples.users

class UserConverter : AbstractConverter<UserEntity, UserDomain> {

    override fun fromDto(dto: UserDomain): UserEntity =
        UserEntity(
            id = dto.id,
            username = dto.username,
            password = dto.password,
            roles = dto.roles.map { Role.valueOf(it) }
        )

    override fun fromEntity(entity: UserEntity): UserDomain =
        UserDomain(
            id = entity.id ?: -1,
            username = entity.username.orEmpty(),
            password = entity.password.orEmpty(),
            roles = entity.roles?.map { it.name }.orEmpty()
        )

}