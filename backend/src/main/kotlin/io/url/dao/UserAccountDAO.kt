package io.url.dao

import io.url.model.domain.UserAccount

interface UserAccountDAO {
    fun create(user: UserAccount): Long
}