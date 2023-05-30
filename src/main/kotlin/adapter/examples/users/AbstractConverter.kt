package adapter.examples.users

interface AbstractConverter<E, D> {

    fun fromDto(dto: D): E

    fun fromEntity(entity: E): D

}