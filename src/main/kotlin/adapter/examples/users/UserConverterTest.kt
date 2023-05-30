package adapter.examples.users

import org.junit.Test
import org.junit.Assert.*

class UserConverterTest {

    @Test
    fun testFromDto() {
        val userDto = UserDomain(
            id = 1,
            username = "john_doe",
            password = "password123",
            roles = listOf("ADMIN", "GUEST")
        )

        val converter = UserConverter()
        val userEntity = converter.fromDto(userDto)

        assertEquals(userDto.id, userEntity.id)
        assertEquals(userDto.username, userEntity.username)
        assertEquals(userDto.password, userEntity.password)
        assertEquals(userDto.roles.map { Role.valueOf(it) }, userEntity.roles)
    }

    @Test
    fun testFromEntity() {
        val userEntity = UserEntity(
            id = 1,
            username = "john_doe",
            password = "password123",
            roles = listOf(Role.ADMIN, Role.GUEST),
            active = true
        )

        val converter = UserConverter()
        val userDto = converter.fromEntity(userEntity)

        assertEquals(userEntity.id, userDto.id)
        assertEquals(userEntity.username, userDto.username)
        assertEquals(userEntity.password, userDto.password)
        assertEquals(userEntity.roles?.map { it.name }, userDto.roles)
    }

}
