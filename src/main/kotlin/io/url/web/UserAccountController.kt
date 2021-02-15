package io.url.web

import io.url.model.dto.UserAccountDTO
import io.url.useCase.UserAccountUC
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserAccountController(private val userAccountUC: UserAccountUC) {

    @PostMapping("/user")
    fun create (@RequestBody userAccountDTO: UserAccountDTO) : Long{
        return userAccountUC.create(userAccountDTO)
    }
}