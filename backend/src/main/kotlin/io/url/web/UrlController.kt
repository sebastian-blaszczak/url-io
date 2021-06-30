package io.url.web

import io.url.model.dto.UrlDTO
import io.url.useCase.UrlUC
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UrlController(val urlUC: UrlUC) {

    @PostMapping("/url")
    fun create(@RequestBody urlDTO: UrlDTO): Long {
        return urlUC.create(urlDTO)
    }
}