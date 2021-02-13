package io.url.dao.implementation

import io.url.dao.UrlDAO
import io.url.dao.implementation.UrlDAOImpl.UrlTable.id
import io.url.model.domain.Url
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.insert
import org.springframework.stereotype.Repository

@Repository
class UrlDAOImpl : UrlDAO {
    override fun create(newUrl: Url) = UrlTable.insert {
        it[name] = newUrl.name
        it[url] = newUrl.url
        it[categoryId] = newUrl.category.id
        it[userAccountId] = newUrl.userAccount.id
    } get id

    override fun get(id: Long) {
        TODO("Not yet implemented")
    }

    override fun update(url: Url) {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long) {
        TODO("Not yet implemented")
    }

    object UrlTable : Table() {
        val id: Column<Long> = long("id").autoIncrement()
        val name: Column<String> = varchar("name", 255)
        val url: Column<String> = varchar("url", 255)
        val categoryId: Column<Long> = long("category_id")
        val userAccountId: Column<Long> = long("user_account_id")
        override val primaryKey = PrimaryKey(id, name = "url_pkey")
    }

}