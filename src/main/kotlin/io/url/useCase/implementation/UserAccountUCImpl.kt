package io.url.useCase.implementation

import io.url.model.dto.UserAccountDTO
import io.url.service.UserAccountService
import io.url.useCase.UserAccountUC
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
@Transactional("springTransactionManager")
class UserAccountUCImpl(private val userAccountService: UserAccountService) : UserAccountUC {
    override fun create(userAccountDTO: UserAccountDTO): Long {
        return userAccountService.create(userAccountDTO)
    }
}