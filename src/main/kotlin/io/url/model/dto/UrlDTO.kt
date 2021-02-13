package io.url.model.dto

data class UrlDTO(
    val id: Long,
    val name: String,
    val url: String,
    val category: CategoryDTO,
    val userAccount: UserAccountDTO
)