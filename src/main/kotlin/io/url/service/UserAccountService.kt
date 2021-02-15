package io.url.service

import io.url.model.dto.UserAccountDTO

interface UserAccountService {

    fun findById(id: Long): UserAccountService

    fun create(userAccountDTO: UserAccountDTO): Long
}