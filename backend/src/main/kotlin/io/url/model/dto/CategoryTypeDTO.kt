package io.url.model.dto

class CategoryTypeDTO(
    val id: Long,
    val name: String,
    val global: Boolean,
    val userAccount: UserAccountDTO
)