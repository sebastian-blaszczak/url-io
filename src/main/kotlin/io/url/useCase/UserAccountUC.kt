package io.url.useCase

import io.url.model.dto.UserAccountDTO

interface UserAccountUC {
    fun create(userAccountDTO: UserAccountDTO): Long
}