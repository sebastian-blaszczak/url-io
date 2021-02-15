package io.url.dao

import io.url.model.domain.UserAccount
import io.url.model.dto.UserAccountDTO

interface UserAccountDAO {
    fun create(user: UserAccount): Long
}