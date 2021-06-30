package io.url.dao

import io.url.model.domain.Url

interface UrlDAO {
    fun create(newUrl: Url): Long
    fun get(id: Long)
    fun update(url: Url)
    fun delete(id: Long)
}