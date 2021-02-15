package io.url.dao.implementation

import io.url.dao.UserAccountDAO
import io.url.dao.implementation.UserAccountDAOImpl.UserAccountTable.id
import io.url.model.domain.UserAccount
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.insert
import org.springframework.stereotype.Component

@Component
class UserAccountDAOImpl : UserAccountDAO {
    override fun create(user: UserAccount) = UserAccountTable.insert {
        it[login] = user.login
        it[password] = user.password
        it[name] = user.name
        it[email] = user.email
    } get id

    object UserAccountTable : Table("user_account") {
        val id: Column<Long> = long("id").autoIncrement()
        val login: Column<String> = varchar("login", 255)
        val password: Column<String> = varchar("password", 255)
        val name: Column<String> = varchar("name", 255)
        val email: Column<String> = varchar("email", 255)
        override val primaryKey = PrimaryKey(id, name = "user_pkey")
    }
}