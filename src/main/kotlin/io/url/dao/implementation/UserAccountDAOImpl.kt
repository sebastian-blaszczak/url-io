package io.url.dao.implementation

import io.url.dao.UserAccountDAO
import io.url.model.domain.UserAccount
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.insert

class UserAccountDAOImpl : UserAccountDAO {
    override fun create(user: UserAccount) = UserAccountTable.insert(user)

    object UserAccountTable : Table() {
        val id: Column<Long> = long("id").autoIncrement()
        val login: Column<String> = varchar("login", 255)
        val password: Column<String> = varchar("password", 255)
        val name: Column<Long> = long("name")
        val email: Column<Long> = long("email")
        override val primaryKey = PrimaryKey(id, name = "user_pkey")
    }
}