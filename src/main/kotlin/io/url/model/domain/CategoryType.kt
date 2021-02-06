package io.url.model.domain

import javax.persistence.*

@Entity
data class CategoryType(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val global: Boolean,
    @OneToOne
    val author: UserAccount
)
