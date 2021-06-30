package io.url.model.domain

import javax.persistence.*


@Entity
data class Category(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @OneToOne
    val type: CategoryType,
)