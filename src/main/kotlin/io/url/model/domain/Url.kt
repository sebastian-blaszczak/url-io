package io.url.model.domain

import java.net.URL
import javax.persistence.*

@Entity
data class Url(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val url: URL,
    @OneToOne
    val category: Category,
    @OneToOne
    val userAccount: UserAccount
)