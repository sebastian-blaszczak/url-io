package io.url.model.domain

import javax.persistence.*

@Entity
data class Url(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val url: String,
    @OneToOne
    val category: Category,
    @OneToOne
    val userAccount: UserAccount
)