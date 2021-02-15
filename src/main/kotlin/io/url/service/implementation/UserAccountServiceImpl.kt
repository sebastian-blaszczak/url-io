package io.url.service.implementation

import io.url.dao.UserAccountDAO
import io.url.model.dto.UserAccountDTO
import io.url.model.mapper.UrlMapper
import io.url.model.mapper.UserAccountMapper
import io.url.service.UserAccountService
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
@Transactional("springTransactionManager")
class UserAccountServiceImpl(private val userAccountDAO: UserAccountDAO) : UserAccountService {
    override fun findById(id: Long): UserAccountService {
        TODO("Not yet implemented")
    }

    override fun create(userAccountDTO: UserAccountDTO): Long {
        val userAccount = mapper.mapToModel(userAccountDTO)
        return userAccountDAO.create(userAccount)
    }

    private val mapper = Mappers.getMapper(UserAccountMapper::class.java)
}