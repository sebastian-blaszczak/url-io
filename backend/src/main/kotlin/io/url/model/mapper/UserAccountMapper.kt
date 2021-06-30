package io.url.model.mapper

import io.url.model.domain.UserAccount
import io.url.model.dto.UserAccountDTO
import org.mapstruct.Mapper

@Mapper
interface UserAccountMapper {

    fun mapToDto(userAccount: UserAccount): UserAccountDTO

    fun mapToModel(userAccountDTO: UserAccountDTO): UserAccount

}